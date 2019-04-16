package com.app.java;

public class Sample {

	void m1() {
		System.out.println("vaagdevi engineering college");
	}

	void m2() {
		m1();
		System.out.println("jayamukhi engineering college");
	}

	void m3() {
		System.out.println("ganapathy engineering college");
		System.out.println("shivani engineering college");
	}

	void m4() {
		m3();
		System.out.println("sr engineering college");
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m2();
	}
}
