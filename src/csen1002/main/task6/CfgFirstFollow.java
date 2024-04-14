package csen1002.main.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Write your info here
 * 
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

public class CfgFirstFollow {
	ArrayList<String> terminals;
	ArrayList<String> variables;
	ArrayList<Rule> rules;
	Character startVariable;
	ArrayList<FF> firsts;
	ArrayList<FF> follows;

	public CfgFirstFollow(String cfg) {
		initializeTerminals(cfg);
		initializeVariables(cfg);
		initializeRules(cfg);
		initializeStartVariable(cfg);
		initializeFirsts();
		initializeFollows();
	}

	public String first() {
		boolean change = true;
		while (change) {

			change = false;
			for (Rule r : rules) {
				FF first = getFirst(r.left);
				ArrayList<String> right = r.right;
				for (String prod : right) {
					boolean allEpsilon = true;
					for (int i = 0; i < prod.length(); i++) {
						if (prod.charAt(i) >= 'a' && prod.charAt(i) <= 'z') {
							allEpsilon = false;
							break;
						}
						String var = prod.charAt(i) + "";
						FF bkfirst = getFirst(var);
						allEpsilon &= containsEpsilon(bkfirst);

					}
					if (allEpsilon) {
						change |= addEpsilon(first);
					}
				}
				for (String prod : right) {
					for (int i = 0; i < prod.length(); i++) {
						boolean allEpsilon = true;
						for (int j = 0; j < i; j++) {
							if (prod.charAt(j) >= 'a' && prod.charAt(j) <= 'z') {
								allEpsilon = false;
								break;
							}
							String var = prod.charAt(j) + "";
							FF bkfirst = getFirst(var);
							allEpsilon &= containsEpsilon(bkfirst);
						}
						if (allEpsilon) {
							if (prod.charAt(i) >= 'a' && prod.charAt(i) <= 'z') {
								change |= addToFF(first, prod.charAt(i) + "");
								continue;
							}
							FF firstI = getFirst(prod.charAt(i) + "");
							change |= first.union(firstI);
						}

					}
				}

			}

		}
		return firsts.stream().map(FF::toString).collect(Collectors.joining(";"));
	}

	private FF getFirst(String var) {
		for (FF ff : firsts)
			if (ff.left.equals(var))
				return ff;

		return null;
	}

	private FF getFollow(String left) {
		for (FF ff : follows) {
			if (ff.left.equals(left))
				return ff;
		}
		return null;
	}

	private boolean containsEpsilon(Rule r) {
		return r.right.contains("e");
	}

	private boolean addEpsilon(FF ff) {
		if (!ff.right.contains("e")) {
			ff.right.add("e");
			return true;
		}
		return false;
	}

	public String follow() {
		first();
		boolean change = true;
		while (change) {
			change = false;
			for (Rule r : rules) {
				ArrayList<String> right = r.right;
				for (String prod : right) {
					for (int i = 0; i < prod.length() - 1; i++) {
						if (prod.charAt(i) >= 'a' && prod.charAt(i) <= 'z')
							continue;
						String B = prod.charAt(i) + "";
						String beta = prod.charAt(i + 1) + "";
						FF bFollow = getFollow(B);
						if (beta.charAt(0) >= 'a' && beta.charAt(0) <= 'z') {
							change |= addToFF(bFollow, beta);
							continue;
						}
						FF firstBeta = getFirst(beta);
						change |= bFollow.union(firstBeta);
						if (firstBeta.right.contains("e") && i == prod.length() - 2) {
							change |= bFollow.union2(getFollow(r.left));
						}

					}
					if (prod.charAt(prod.length() - 1) >= 'A' && prod.charAt(prod.length() - 1) <= 'Z') {
						change |= getFollow(prod.charAt(prod.length() - 1) + "").union2(getFollow(r.left));
					}
				}
			}
		}
		return follows.stream().map(FF::toString).collect(Collectors.joining(";"));
	}

	@Override
	public String toString() {
		return variables.stream().collect(Collectors.joining(";")) + "#"
				+ terminals.stream().collect(Collectors.joining(";"))
				+ "#" + rules.stream().map(Rule::toString).collect(Collectors.joining(";"));
	}

	private void initializeTerminals(String cfg) {
		terminals = new ArrayList<String>(Arrays.asList(cfg.split("#")[1].split(";")));
	}

	private void initializeVariables(String cfg) {
		variables = new ArrayList<String>(Arrays.asList(cfg.split("#")[0].split(";")));
	}

	private void initializeRules(String cfg) {
		rules = new ArrayList<Rule>(Arrays.stream(cfg.split("#")[2].split(";"))
				.map(ruleStr -> new Rule(ruleStr.split("/")[0],
						new ArrayList<String>(Arrays.asList(ruleStr.split("/")[1].split(",")))))
				.toList());
	}

	private void initializeStartVariable(String cfg) {
		startVariable = cfg.charAt(0);
	}

	private void initializeFirsts() {
		firsts = new ArrayList<FF>();
		for (Rule r : rules) {
			FF ff = new FF(r.left, new ArrayList<String>());
			addTerminals(ff, r.right);
			firsts.add(ff);
		}

	}

	private boolean addTerminals(FF ff, ArrayList<String> right) {
		boolean flag = false;
		for (String s : right) {
			if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
				flag |= addToFF(ff, s.charAt(0) + "");
			}
		}
		return flag;
	}

	private boolean addToFF(FF ff, String string) {
		if (!ff.right.contains(string)) {
			ff.right.add(string);
			return true;
		}
		return false;
	}

	private void initializeFollows() {
		follows = new ArrayList<FF>();
		for (Rule r : rules) {
			FF ff = new FF(r.left, new ArrayList<String>());
			if (r.left.equals(startVariable + "")) {
				ff.hasDollar = true;
			}
			follows.add(ff);
		}
	}

	public class Rule {
		public String left;
		public ArrayList<String> right;

		public Rule(String left, ArrayList<String> right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			right.removeIf(s -> s.equals(""));
			return left + "/" + right.stream().collect(Collectors.joining(","));
		}
	}

	public class FF extends Rule {
		boolean hasDollar;

		public FF(String left, ArrayList<String> right) {
			super(left, right);
		}

		public boolean addDollar(FF left) {
			System.out.println("Adding dollar to " + this + " from " + left);
			if (left.hasDollar && !this.hasDollar) {
				this.hasDollar = true;
				return true;
			}
			return false;
		}

		@Override
		public String toString() {
			right.removeIf(s -> s.equals(""));
			String dollar = hasDollar ? "$" : "";
			Collections.sort(right);
			return left + "/" + dollar + right.stream().collect(Collectors.joining(""));
		}

		public boolean union(FF firstI) {
			ArrayList<String> other = firstI.right;
			boolean ret = false;
			for (String s : other) {
				if (!right.contains(s) && !s.equals("e")) {
					right.add(s);
					ret = true;
				}
			}
			if (firstI.hasDollar && !hasDollar) {
				hasDollar = true;
				ret = true;
			}

			return ret;
		}

		public boolean union2(FF firstI) {
			ArrayList<String> other = firstI.right;
			boolean ret = false;
			for (String s : other) {
				if (!right.contains(s)) {
					right.add(s);
					ret = true;
				}
			}
			if (firstI.hasDollar && !hasDollar) {
				hasDollar = true;
				ret = true;
			}

			return ret;
		}

	}

}
