package com.test;

@FunctionalInterface
public interface Test {

	void letsDoSomething();

	//void letsGo();

	public String toString();
	
	public int hashCode();

	public boolean equals(Object o);

	public static int sum(int a, int b) {
		return a + b;
	}

	public default int sub(int a, int b) {
		return a - b;
	}
}
