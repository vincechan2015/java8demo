package com.vince;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashmap {
	public static void main(String[] args){
		Map<A, A> a = new HashMap<A, A>();
		
		A obj1 = new A(10);
		A obj2 = new A(20);
		
		a.put(obj1, obj1);
		a.put(obj2, obj2);
		
		System.out.println(a.get(obj1).getA());
		System.out.println(a.get(obj2).getA());
		
		Iterator<Entry<A, A>> i = a.entrySet().iterator();
		while (i.hasNext()){
			System.out.println(i.next().getValue().getA());
		}
	
	}
}

class A{
	
	private int a;

	public A(int a){
		this.a = a;
	}
	
	public int getA(){
		return a;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return a; // Same hash code
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof A){
			if (((A) obj).getA() == this.a){
				return true;
			}
		}
		
		return false; // Always equals true;
	}
	
	
	
}