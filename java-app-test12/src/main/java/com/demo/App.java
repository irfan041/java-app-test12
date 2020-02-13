package com.demo;

public class App {

	public String process(String str) {
		if (str == null) {
			return null;
		}
		if (str.length() == 0) {
			return "";
		}
		return str.toUpperCase();

	}

	public static void main(String[] args) {
		System.out.println("Test Class");

	}

}
