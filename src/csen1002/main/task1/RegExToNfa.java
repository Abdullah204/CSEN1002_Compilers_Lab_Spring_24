package csen1002.main.task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber P016
 */

public class RegExToNfa {
	Stack<Integer> start;
	Stack<Integer> end;
	Set<Integer> states;
	List<Character> alphabet;
	PriorityQueue<Transition> transitions;
	int initialState;
	int finalState;
	int stateCount;

	public RegExToNfa(String input) {
		alphabet = Arrays.stream(input.split("#")[0].split(";"))
				.map(s -> s.charAt(0))
				.collect(Collectors.toList());
		String regex = input.split("#")[1];
		start = new Stack<>();
		end = new Stack<>();
		states = new HashSet<>();
		transitions = new PriorityQueue<Transition>();
		initialState = 0;
		stateCount = 0;
		for (char i : regex.toCharArray()) {

			if (i == '*') {
				star();
				continue;
			}
			if (i == '|') {
				union();
				continue;
			}
			if (i == '.') {
				concat();
				continue;
			}
			addSymbol(i);

		}
		initialState = start.pop();
		finalState = end.pop();
	}

	@Override
	public String toString() {
		Collections.sort(alphabet);
		String alphabetString = alphabet.stream().map(Object::toString).collect(Collectors.joining(";"));
		return setToString(states) + "#" +
				alphabetString + "#" +
				queueToString(transitions) + "#"
				+ initialState + "#"
				+ finalState;
	}

	public void addSymbol(char symbol) {
		states.add(stateCount);
		start.push(stateCount);
		states.add(stateCount + 1);
		end.push(stateCount + 1);
		transitions.add(new Transition(stateCount, stateCount + 1, symbol));
		stateCount += 2;
	}

	public void union() {
		states.add(stateCount);
		states.add(stateCount + 1);
		int from1 = start.pop();
		int from2 = start.pop();
		int to1 = end.pop();
		int to2 = end.pop();
		transitions.add(new Transition(stateCount, from1, 'e'));
		transitions.add(new Transition(stateCount, from2, 'e'));
		transitions.add(new Transition(to1, stateCount + 1, 'e'));
		transitions.add(new Transition(to2, stateCount + 1, 'e'));
		start.push(stateCount);
		end.push(stateCount + 1);
		stateCount += 2;
	}

	public void concat() {
		int fromright = start.pop();
		int fromleft = start.pop();
		int toright = end.pop();
		int toleft = end.pop();
		start.push(fromleft);
		end.push(toright);
		ArrayList<Transition> oldTransitions = getTransitionsByFrom(fromright);
		for (Transition t : oldTransitions) {
			transitions.add(new Transition(toleft, t.to, t.symbol));
			transitions.remove(t);
		}
		states.remove(fromright);

	}

	public ArrayList<Transition> getTransitionsByFrom(int from) {
		return (ArrayList<Transition>) transitions.stream().filter(t -> t.from == from).collect(Collectors.toList());
	}

	public void star() {
		int from = start.pop();
		int to = end.pop();
		int newfrom = stateCount;
		int newto = stateCount + 1;
		transitions.add(new Transition(newfrom, newto, 'e'));
		transitions.add(new Transition(newfrom, from, 'e'));
		transitions.add(new Transition(to, newto, 'e'));
		transitions.add(new Transition(to, from, 'e'));
		states.add(newfrom);
		states.add(newto);
		start.push(newfrom);
		end.push(newto);
		stateCount += 2;
	}

	public static String setToString(Set<Integer> set) {
		return set.stream().sorted().map(Object::toString).collect(Collectors.joining(";"));
	}

	public static String queueToString(PriorityQueue<Transition> q) {
		return q.stream().sorted().map(Object::toString).collect(Collectors.joining(";"));
	}

}

class Transition implements Comparable<Transition> {
	int from;
	int to;
	char symbol;

	public Transition(int from, int to, char symbol) {
		this.from = from;
		this.to = to;
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return from + "," + symbol + "," + to;
	}

	@Override
	public int compareTo(Transition other) {
		if (this.from != other.from) {
			return Integer.compare(this.from, other.from);
		} else if (this.symbol != other.symbol) {
			return Character.compare(this.symbol, other.symbol);
		} else {
			return Integer.compare(this.to, other.to);
		}
	}
}
