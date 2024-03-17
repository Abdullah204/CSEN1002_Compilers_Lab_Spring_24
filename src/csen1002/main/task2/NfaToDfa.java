package csen1002.main.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write your info here
 * 
 * @name Abdullah Ahmad Fouad
 * @id 49-2554
 * @labNumber 16
 */

public class NfaToDfa {
	ArrayList<Integer> states;
	ArrayList<Character> alphabet;
	ArrayList<Transition> transitions;
	int startState;
	ArrayList<Integer> finalStates;
	Closure[] epsilonClosures;
	DFAState dfaStartState;
	ArrayList<DFAState> dfaFinalStates;
	ArrayList<DFAState> dfaStates;
	ArrayList<DFATransition> dfaTransitions;
	DFAState deadState;

	public NfaToDfa(String input) {
		initialize(input);
		generateEpsilonClosures();
		generateDFA();
	}

	private ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {

		List<Integer> result = new ArrayList<>(a);
		result.addAll(b);
		return result.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));
	}

	private void generateDFA() {
		dfaStates = new ArrayList<>();
		dfaTransitions = new ArrayList<>();
		dfaStartState = (DFAState) (epsilonClosures[startState]);
		generateTransitions(dfaStartState);
	}

	private void generateTransitions(DFAState fromState) {

		if (dfaStates.contains(fromState))
			return;
		dfaStates.add(fromState);
		int fromSize = fromState.states.size();
		for (int i = 0; i < fromSize; i++) {
			if (finalStates.contains(fromState.states.get(i))) {
				if (!dfaFinalStates.contains(fromState))
					dfaFinalStates.add(fromState);
				break;
			}
		}

		for (char symbol : alphabet) {
			ArrayList<Integer> toClosure = new ArrayList<>();
			for (int s : fromState.states) {
				for (Transition transition : transitions) {
					if (transition.from == s && transition.symbol == symbol) {
						toClosure = union(toClosure, epsilonClosures[transition.to].states);
					}
				}
			}
			if (toClosure.isEmpty()) {
				if (deadState == null)
					createDeadState();
				dfaTransitions.add(new DFATransition(fromState, symbol, deadState));

			} else {

				DFAState toState = new DFAState(toClosure);
				DFATransition dfaTransition = new DFATransition(fromState, symbol, toState);

				dfaTransitions.add(dfaTransition);
				generateTransitions(toState);
			}
		}

	}

	public void createDeadState() {
		deadState = new DFAState(new ArrayList<>(Arrays.asList(-1)));
		dfaStates.add(deadState);
		for (char x : alphabet)
			dfaTransitions.add(new DFATransition(deadState, x, deadState));
	}

	public void generateEpsilonClosures() {
		int i = 0;
		epsilonClosures = new Closure[states.size()];
		for (i = 0; i < states.size(); i++)
			epsilonClosures[i] = new Closure(new ArrayList<>(Arrays.asList(states.get(i))));

		boolean change = false;
		while (true) {
			change = false;
			for (Closure closure : epsilonClosures) {
				int size = closure.states.size();
				for (int j = 0; j < size; j++) {
					for (Transition transition : transitions) {
						if (transition.from == closure.states.get(j) && transition.symbol == 'e') {
							for (int to : epsilonClosures[transition.to].states) {
								if (!closure.states.contains(to)) {
									closure.states.add(to);
									change = true;
								}
							}
						}
					}
				}
			}
			if (!change)
				break;
		}

	}

	public void initialize(String input) {
		states = (ArrayList<Integer>) Arrays.stream(input.split("#")[0].split(";"))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		alphabet = (ArrayList<Character>) Arrays.stream(input.split("#")[1].split(";"))
				.map(s -> s.charAt(0))
				.collect(Collectors.toList());
		transitions = (ArrayList<Transition>) Arrays.stream(input.split("#")[2].split(";"))
				.map(s -> new Transition(Integer.parseInt(s.split(",")[0]), s.split(",")[1].charAt(0),
						Integer.parseInt(s.split(",")[2])))
				.collect(Collectors.toList());
		startState = Integer.parseInt(input.split("#")[3]);
		finalStates = (ArrayList<Integer>) Arrays.stream(input.split("#")[4].split(";"))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		dfaFinalStates = new ArrayList<>();
	}

	@Override
	public String toString() {
		return statesToString(dfaStates) + "#" + alphabetToString(alphabet) + "#" + transitionsToString(dfaTransitions)
				+ "#" + dfaStartState
				+ "#"
				+ statesToString(dfaFinalStates);
	}

	public String alphabetToString(ArrayList<Character> elements) {
		return elements.stream().sorted().map(Object::toString).collect(Collectors.joining(";"));
	}

	public String statesToString(ArrayList<DFAState> elements) {
		return elements.stream().sorted().map(Object::toString).collect(Collectors.joining(";"));
	}

	public String transitionsToString(ArrayList<DFATransition> elements) {
		return elements.stream().sorted().map(Object::toString).collect(Collectors.joining(";"));
	}

	public class Transition implements Comparable<Transition> {
		int from;
		char symbol;
		int to;

		public Transition(int from, char symbol, int to) {
			this.to = to;
			this.from = from;
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

	public class DFATransition implements Comparable<DFATransition> {
		DFAState from;
		char symbol;
		DFAState to;

		public DFATransition(DFAState from, char symbol, DFAState to) {
			this.to = to;
			this.from = from;
			this.symbol = symbol;
		}

		@Override
		public String toString() {
			return from + "," + symbol + "," + to;
		}

		@Override
		public int compareTo(DFATransition other) {
			if (this.from != other.from) {
				return this.from.compareTo(other.from);
			} else if (this.symbol != other.symbol) {
				return Character.compare(this.symbol, other.symbol);
			} else {
				return this.to.compareTo(other.to);
			}
		}

	}

	public class DFAState implements Comparable<DFAState> {
		ArrayList<Integer> states;

		public DFAState(ArrayList<Integer> states) {
			this.states = states;
		}

		@Override
		public String toString() {
			return states.stream().sorted()
					.map(Object::toString)
					.collect(Collectors.joining("/"));
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof DFAState) {
				DFAState other = (DFAState) obj;
				return this.states.equals(other.states);
			}
			return false;

		}

		@Override
		public int compareTo(DFAState other) {
			Collections.sort(this.states);
			Collections.sort(other.states);
			for (int i = 0; i < Math.min(this.states.size(), other.states.size()); i++) {
				if (this.states.get(i) != other.states.get(i)) {
					return Integer.compare(this.states.get(i), other.states.get(i));
				}
			}
			return Integer.compare(this.states.size(), other.states.size());
		}
	}

	public class Closure extends DFAState {

		public Closure(ArrayList<Integer> states) {
			super(states);
		}
	}

}
