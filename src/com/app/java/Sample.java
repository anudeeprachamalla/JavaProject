package com.app.java;

public class Sample {

	void m1() {
		System.out.println("vaagdevi engineering college");
	}

	void m2() {
		m1();
		System.out.println("jayamukhi engineering college");
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m2();
	}
}
