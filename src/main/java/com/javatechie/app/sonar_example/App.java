package com.javatechie.app.sonar_example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	public App() {
	}

	public void m1() {
		//String s = "";
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		Object obj = getData();
		if(obj!=null) {
		System.out.println(obj.toString());
		}
	}

	public void m2(){
		Object o = getData();
		System.out.println(o.toString() == "string");
	}

	public void m3(){
	}


	public void m4(){
		Object o = getData();
		System.out.println(o.toString() == "string");
	}

	public boolean shouldBeEqual(int i, int j){
		return i == j;
	}

	public Object getData() {
		return null;
	}

	public static void main(String[] args) {
		App app = new App();
		app.m1();
		app.m2();
	}
}
