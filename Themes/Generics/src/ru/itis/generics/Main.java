package ru.itis.generics;

public class Main {

    public static void main(String[] args) {
	    Box<Integer> box1 = new Box<>();
	    box1.put(155);

	    Box<String> box2 = new Box<>();
	    box2.put("Привет!");

        System.out.println(box2.get());
    }
}
