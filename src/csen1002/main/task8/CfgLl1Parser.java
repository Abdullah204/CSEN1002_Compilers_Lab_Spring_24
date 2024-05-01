package csen1002.main.task8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */
public class CfgLl1Parser {
	static final String ERROR = "ERROR";
	List<String> terminals;
	List<String> variables;
	List<Rule> rules;
	List<Rule> firsts;
	List<Rule> follows;
	HashMap<TableCell, String> parseTable;

	public CfgLl1Parser(String input) {
		initialize(input);

	}

	public String parse(String input) {
		ArrayList<String> res = new ArrayList<String>();
		res.add("S");
		while (true) {

			String next = "";
			int i = 0;
			// get Last string created
			String last = res.getLast();
			// get the next variable to be replaced
			while (i < last.length()
					&& i < input.length()
					&& last.charAt(i) == input.charAt(i))
				next += last.charAt(i++);
			// if all the string is matched and they are equal break
			if (i == last.length() && i == input.length())
				break;
			// there is a terminal that cant be matched
			if (i >= last.length()) {
				res.add(ERROR);
				break;
			}
			String nextVariable = last.charAt(i) + "";
			// no more input either check if variable can be replaced with epsilon or error
			if (i >= input.length()) {
				String rule = parseTable.get(new TableCell(nextVariable, "$"));
				if (rule == null || !rule.equals("e")) {
					res.add(ERROR);
					break;
				}
				next += rule;
				next += last.substring(i + 1);
				res.add(next);
			}
			String nextTerminal = input.charAt(i) + "";
			String rule = parseTable.get(new TableCell(nextVariable, nextTerminal));

			// get the rule to replace the variable
			if (rule == null) {
				res.add(ERROR);
				break;
			}
			// replace the variable with the rule
			if (i < last.length() && last.charAt(i) >= 'a' && last.charAt(i) <= 'z') {
				if (!rule.equals("e")) {
					res.add(ERROR);
					break;
				}
			}
			if (!rule.equals("e"))
				next += rule;
			// add remaining of last to next
			next += last.substring(i + 1);
			res.add(next);
		}
		return res.stream().collect(Collectors.joining(";"));
	}

	private void initialize(String input) {
		initializeTerminals(input);
		initializeVariables(input);
		initializeRules(input);
		initializeFirsts(input);
		initializeFollows(input);
		buildParseTable();
	}

	private void initializeFollows(String input) {
		follows = new ArrayList<Rule>(Arrays.stream(input.split("#")[4].split(";"))
				.map(ruleStr -> new Rule(ruleStr.split("/")[0],
						new ArrayList<String>(Arrays.asList(ruleStr.split("/")[1].split("")))))
				.toList());
	}

	private void initializeFirsts(String input) {
		firsts = new ArrayList<Rule>(Arrays.stream(input.split("#")[3].split(";"))
				.map(ruleStr -> new Rule(ruleStr.split("/")[0],
						new ArrayList<String>(Arrays.asList(ruleStr.split("/")[1].replaceAll(",",
								"").split("")))))
				.toList());

	}

	private void initializeRules(String input) {
		rules = new ArrayList<Rule>(Arrays.stream(input.split("#")[2].split(";"))
				.map(ruleStr -> new Rule(ruleStr.split("/")[0],
						new ArrayList<String>(Arrays.asList(ruleStr.split("/")[1].split(",")))))
				.toList());

	}

	private void initializeVariables(String input) {
		variables = Arrays.asList(input.split("#")[0].split(";"));
	}

	private void initializeTerminals(String input) {
		terminals = Arrays.asList(input.split("#")[1].split(";"));
	}

	private void buildParseTable() {
		parseTable = new HashMap<TableCell, String>();
		for (Rule rule : rules) {
			String left = rule.left;
			ArrayList<String> right = rule.right;
			for (String prod : right) {
				ArrayList<String> first = first(prod);

				for (String terminal : first) {
					if (terminal.equals("e"))
						continue;

					parseTable.put(new TableCell(left, terminal), prod);
				}
				if (first.contains("e")) {
					ArrayList<String> follow = follow(left);
					for (String terminal : follow) {
						parseTable.put(new TableCell(left, terminal), "e");
					}
				}
			}
		}
	}

	ArrayList<String> first(String prod) {
		ArrayList<String> res = new ArrayList<String>();
		if (prod.charAt(0) >= 'a' && prod.charAt(0) <= 'z') {
			res.add(prod.charAt(0) + "");
			return res;
		}
		String variable = prod.charAt(0) + "";
		for (Rule rule : firsts) {
			if (rule.left.equals(variable)) {
				res.addAll(rule.right);
			}
		}

		return res;
	}

	ArrayList<String> follow(String variable) {
		ArrayList<String> res = new ArrayList<String>();
		for (Rule rule : follows) {
			if (rule.left.equals(variable)) {
				res.addAll(rule.right);
				break;
			}
		}
		return res;
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

	public class TableCell {
		String row;
		String column;

		public TableCell(String row, String column) {
			this.row = row;
			this.column = column;
		}

		@Override
		public String toString() {
			return row + "," + column;
		}

		@Override
		public boolean equals(Object obj) {
			TableCell other = (TableCell) obj;
			return row.equals(other.row) && column.equals(other.column);
		}

		@Override
		public int hashCode() {
			return Objects.hash(row, column);
		}

	}

}
