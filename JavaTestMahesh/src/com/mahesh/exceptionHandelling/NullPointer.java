package com.mahesh.exceptionHandelling;

public class NullPointer {
	public static void main(String args[]) {
			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}