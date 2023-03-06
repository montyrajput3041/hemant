package com.rays.basic;

public class SwitchClass {
	public static void main(String[] args) {
		int  gh = args.length;
		switch (gh) {
		case 0:
			System.out.println("monty   ");
			break;
		case 1:
		System.out.println("Hello " + args[0]);
		    break;
		default :
			for(int i=0; i<gh; i++) {
				System.out.println(i+"=Hello  "+args[i]);
			}
		}
	}

}
