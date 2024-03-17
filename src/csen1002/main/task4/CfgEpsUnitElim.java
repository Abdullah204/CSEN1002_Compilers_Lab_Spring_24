package csen1002.main.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Write your info here
 * 
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

public class CfgEpsUnitElim {
	ArrayList<String> terminals;
	ArrayList<String> variables;
	ArrayList<Rule> rules;
	Character startVariable;
	HashSet<String> removedEpsilons;
	HashSet<String> removedUnitRules;

	public CfgEpsUnitElim(String cfg) {
		initialize(cfg);
	}

	@Override
	public String toString() {
		return variables.stream().collect(Collectors.joining(";")) + "#"
				+ terminals.stream().collect(Collectors.joining(";"))
				+ "#" + rules.stream().map(Rule::toString).collect(Collectors.joining(";"));
	}

	public void eliminateEpsilonRules() {
		for (int i = 0; i < rules.size(); i++) {
			Rule rule = rules.get(i);
			if (rule.left.charAt(0) == startVariable)
				continue;
			if (rule.right.contains("e")) {
				removeEpsilon(rule);
				removeAFromOtherRules(rule);
				addNewEpsilons(rule.left);
				i = 0;
			}
		}

	}

	private void addNewEpsilons(String left) {
		for (int i = 0; i < rules.size(); i++) {
			ArrayList<String> right = rules.get(i).right;
			if (rules.get(i).left.equals("X") && left.equals("G")) {
				System.out.println(right.contains(left));
				System.out.println(!removedEpsilons.contains(rules.get(i).left));
				System.out.println(!right.contains("e"));

			}
			if (right.contains(left) && !removedEpsilons.contains(rules.get(i).left) && !right.contains("e")) {
				rules.get(i).right.add("e");
			}
		}
	}

	private void removeAFromOtherRules(Rule rule) {
		for (int i = 0; i < rules.size(); i++)
			generateAllPossibleRules(rules.get(i).right, rule.left.charAt(0));
	}

	private ArrayList<String> generateAllPossibleRules(ArrayList<String> right, char symbol) {
		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < right.size(); i++) {
			String curr = right.get(i);
			for (int j = 0; j < curr.length(); j++) {
				if (curr.charAt(j) == symbol && !curr.equals(symbol + "")) {
					right.add(curr.substring(0, j) + curr.substring(j + 1));
				}
			}

		}
		return result;
	}

	public boolean removeEpsilon(Rule rule) {
		rule.right.remove("e");
		if (rule.right.size() == 0) {
			rules.remove(rule);
			return true;
		}
		removedEpsilons.add(rule.left);
		return false;
	}

	public void eliminateUnitRules() {
		for (int i = 0; i < rules.size(); i++) {
			Rule rule = rules.get(i);
			for (int j = 0; j < rule.right.size(); j++) {
				String variable = rule.right.get(j);
				if (variables.contains(variable)) {
					if (removeUnitRule(rule.left, rule.right, j)) {
						transitTerminals(rule.right, variable);
						transitVariables(rule.right, variable);
						i--;
						break;
					}
				}
			}
		}
		removeResidualUnitVariables();
	}

	private void removeResidualUnitVariables() {
		for (Rule rule : rules) {
			int i = 0;
			while (i < rule.right.size()) {
				if (variables.contains(rule.right.get(i)))
					rule.right.remove(i);
				else
					i++;

			}
		}
	}

	private void transitVariables(ArrayList<String> right, String variable) {
		Rule rule = getRuleOfVariable(variable);
		int i = 0;
		while (i < rule.right.size()) {
			String term = rule.right.get(i);
			if (!terminals.contains(term) && !removedUnitRules.contains(term) && !right.contains(term))
				right.add(term);
			i++;
		}

	}

	private void transitTerminals(ArrayList<String> right, String variable) {
		Rule rule = getRuleOfVariable(variable);
		int i = 0;
		while (i < rule.right.size()) {
			String term = rule.right.get(i);
			if (terminals.contains(term) && !right.contains(term))
				right.add(term);
			i++;
		}

	}

	private Rule getRuleOfVariable(String variable) {
		for (Rule rule : rules)
			if (rule.left.equals(variable))
				return rule;
		return null;
	}

	private boolean removeUnitRule(String left, ArrayList<String> right, int j) {
		if (removedUnitRules.contains(left + "/" + right.get(j)))
			return false;
		removedUnitRules.add(left + "/" + right.remove(j));
		return true;
	}

	public void initialize(String cfg) {
		removedEpsilons = new HashSet<String>();
		removedUnitRules = new HashSet<String>();
		initializeTerminals(cfg);
		initializeVariables(cfg);
		initializeRules(cfg);
		initializeStartVariable(cfg);

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
			right = new ArrayList<String>(new HashSet<String>(right));
			return left + "/" + right.stream().sorted().collect(Collectors.joining(","));
		}
	}

}
