package lp1a3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Collections {

	private static List<String> lista1 = new ArrayList<>();
	private static List<String> lista2 = new ArrayList<>();
	private static List<String> lista3 = new LinkedList<>();
	
	private static Scanner sc = new Scanner(System.in);
	
	private static String[] strings = new String[6];
	
	public static void main(String[] args) {
		System.out.println("list1 value 1");
		strings[0] = sc.next();
		sc.nextLine();
		System.out.println("list1 value 2");
		strings[1] = sc.next();
		sc.nextLine();
		
		for(int i=0; i<2; i++) {
			adicionar(lista1, strings[i]);
		}
		
		System.out.println("list2 value 1");
		strings[2] = sc.next();
		sc.nextLine();
		System.out.println("list2 value 2");
		strings[3] = sc.next();
		sc.nextLine();
		
		for(int i=2; i<4; i++) {
			adicionar(lista2, strings[i]);
		}
		
		System.out.println("list3 value 1");
		strings[4] = sc.next();
		sc.nextLine();
		System.out.println("list3 value 2");
		strings[5] = sc.next();
		sc.nextLine();
		
		for(int i=4; i<6; i++) {
			adicionar(lista3, strings[i]);
		}
		
		//----------------------------------------------
		for(String s : lista2) {
			adicionar(lista1, s);
		}
		for(String s : lista3) {
			adicionar(lista1, s);
		}
		//----------------------------------------------
		for(String s : lista2) {
			System.out.print(s + " : ");
			if(lista1.contains(s)) {
				System.out.println("contained in list1");
			}else {
				System.out.println("doesnt contain in list1");
			}
		}
		//----------------------------------------------
		if(lista1.contains(lista3.get(0)) == true && lista1.contains(lista3.get(1)) == true) {
			System.out.println("all elements are contained in list1");
		}
		//----------------------------------------------
		if(lista1.equals(lista2)) {
			System.out.println("list1 == list2");
		}else {
			System.out.println("list1 != list2");
		}
		//----------------------------------------------
		System.out.println("list1 : " + lista1.get(1));
		System.out.println("list2 : " + lista1.get(1));
		System.out.println("list3 : " + lista1.get(1));
		//----------------------------------------------
		for(String s : lista1) {
			if(lista3.contains(s)) {
				lista1.remove(s);
			}
		}
		//----------------------------------------------
		System.out.println(lista1.size());
		//----------------------------------------------
		lista3.removeAll(lista3);
		//----------------------------------------------n
		if(lista3.isEmpty()) {
			System.out.println("list 3 is empty");
		}else {
			System.out.println("list 2 isnt empty");
		}
		//----------------------------------------------
		for(String s : lista1) {
			System.out.println(s);
		}
		//----------------------------------------------
		
		sc.close();
	}
	
	public static void adicionar(List<String> lista, String valor) {
		lista.add(valor);
	}

}
