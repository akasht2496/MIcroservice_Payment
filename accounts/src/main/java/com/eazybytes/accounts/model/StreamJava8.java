package com.eazybytes.accounts.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import java.util.*;

public class StreamJava8 {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "Aakash Rahul", 9090909.00));
		employee.add(new Employee(1, "Alok Ramesh", 1010101.00));
		employee.add(new Employee(1, "Amit Kumar", 90912121.12));
		employee.add(new Employee(1, "Anish Araya", 9090921.31));
		employee.stream().filter(e -> e.getName().contains("y")).
		map(e -> e.getName()).forEach(System.out::println);
		
//		employee.stream().sorted((e1,e2)->(e1.getName()-e2.getName()).forEach(System.out::println);
		ArrayList<String> empList=  (ArrayList<String>) employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.map(e->e.getName()+ " "+e.getSalary()).collect(Collectors.toList());	
			System.out.println(empList);
			
		List<Integer> list=  Arrays.asList(10,23,12,101,12,12,12,12,34,34,34,65);
		int sum=0;
		for(int i: list) {
			
			sum+=i;
		}
		
		Optional<Integer> sum2 = list.stream().filter(q ->q%2==0).peek(System.out::println).reduce((e1,e2)->e1+e2);
		System.out.println(sum2+" sum2 ");
		
		System.out.println(sum+" iii ");
		
		System.out.println(list);
		Optional<Integer> total =list.stream().reduce((l1,l2)->l1+l2);
		System.out.println(total);
//		Optional<Integer> totaleven =	list.stream().filter(w->w%2==0).peek(System.out::println).reduce((l1,l2)->l1+l2);
//		System.out.println(totaleven);
		
		
	}

}
