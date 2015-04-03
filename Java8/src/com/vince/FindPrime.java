package com.vince;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {

	public static void main(String[] args){
		new FindPrime().doNow();
			
		
	}
	
	public void doNow(){
		Runnable r1 = () -> System.out.println("r1: " + this.getClass());
		 
		Runnable r2 = new Runnable(){
		    public void run(){
			System.out.println("r2: " + this.getClass());
		    }
		};
		 
		new Thread(r1).start();
		new Thread(r2).start();
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("5");
		list.add("4");
		list.stream().filter(s -> Integer.valueOf(s) < 3).forEach(s -> System.out.print(s));
	}
	
	
	public void function1(int x, int y) {
		 
    }
	
	 public int function2(int x) {
			return x + 1;
	 }
	
}
