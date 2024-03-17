package csen1002.main.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write your info here
 * 
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

public class CfgLeftRecElim {

	ArrayList<String> terminals;
	ArrayList<String> variables;
	ArrayList<Rule> rules;
	Character startVariable;

	public CfgLeftRecElim(String cfg) {
		initializeTerminals(cfg);
		initializeVariables(cfg);
		initializeRules(cfg);
		initializeStartVariable(cfg);
	}

	public void eliminateLeftRecursion() {
		int k = rules.size();
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < i; j++)
				elim(rules.get(i), rules.get(j));
			elimImmediate(rules.get(i));
		}

	}

	private void elimImmediate(Rule rule) {
		ArrayList<String> alphas = getAlphas(rule.right, rule.left);
		alphas = removeFirstChar(alphas);
		alphas.removeIf(s -> s.equals(""));
		if (alphas.size() == 0)
			return;
		removeAlphas(rule, alphas);
		appendBetas(rule);
		addDashRule(rule, alphas);
	}

	private ArrayList<String> removeFirstChar(ArrayList<String> alphas) {
		ArrayList<String> res = new ArrayList<String>();
		for (String s : alphas)
			res.add(s.substring(1));
		return res;
	}

	private void elim(Rule Ai, Rule Aj) {
		ArrayList<String> alphas = getAlphas(Ai.right, Aj.left);
		if (alphas.size() == 0)
			return;
		appendAi(alphas, Ai, Aj);

	}

	private void appendAi(ArrayList<String> alphas, Rule Ai, Rule Aj) {

		for (String alpha : alphas) {
			int idx = Ai.right.indexOf(alpha);
			if (idx == -1)
				continue;
			for (String s : Aj.right)
				if (!Ai.right.contains(s + alpha))
					Ai.right.add(idx++, s + alpha.substring(1));
			Ai.right.remove(alpha);
		}
	}

	private void addDashRule(Rule rule, ArrayList<String> alphas) {
		Rule dashRule = new Rule(rule.left + "'", new ArrayList<String>());
		for (String alpha : alphas) {
			dashRule.right.add(alpha + rule.left + "'");
		}
		dashRule.right.add("e");
		rules.add(dashRule);
		variables.add(rule.left + "'");
	}

	private void appendBetas(Rule rule) {
		ArrayList<String> newRight = new ArrayList<String>();
		for (String s : rule.right) {
			if (s.charAt(0) != rule.left.charAt(0)) {
				newRight.add(s + rule.left + "'");
			} else
				newRight.add(s);

		}
		rule.right = newRight;
	}

	private void removeAlphas(Rule rule, ArrayList<String> alphas) {
		rule.right.removeIf(s -> alphas.contains(s.substring(1)));
	}

	private ArrayList<String> getAlphas(ArrayList<String> right, String left) {
		ArrayList<String> alphas = new ArrayList<String>();
		for (String s : right)
			if (s.charAt(0) == left.charAt(0) && s.length() != 1)
				alphas.add(s);

		return alphas;
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

}
