package com.ochoscar.internalClasses;

public class ClasesInternas {
	
	public class Interna1 {
		
		public String str;
		
		public class Interna6 {
			
		}
		
		public ClasesInternas test() {
			return ClasesInternas.this;
			
			
			
		}
		
	}
	
	public static class inter1 {
		
	}
	
	private class Interna4 extends ClasesInternas {
		
		public String str;
		
		
		
	}
	
	protected static int i;
	
	public static void main(String[] args) {
		//Interna1 i1 = new Interna1();
		
		
	}
	
	public Interna1 method() {
		Interna1 i1 = new Interna1();
		Interna2 i2 = new Interna2();
		return i1;
	}
	
	
	
	

}

class Interna2 extends ClasesInternas {
	public String str;
}

class Interna3 {
	public String str;
}