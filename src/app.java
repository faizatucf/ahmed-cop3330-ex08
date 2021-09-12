/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class pizza {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numppl, pizzas, slices, total_slices,leftovers;
        float each_person;
        System.out.println("How many people?");
        numppl = sc.nextInt();
        System.out.println("How many pizzas do you have?");
        pizzas = sc.nextInt();
        System.out.println("How many slices per pizza?");
        slices = sc.nextInt();
        total_slices = pizzas * slices;
        each_person = total_slices / numppl;
        leftovers = total_slices - (numppl * (int)each_person);
        System.out.println(String.format("%d people with %d pizzas (%d slices)\nEach person gets %.0f pieces of pizza.\nThere are %d leftover pieces.",
        numppl,pizzas,total_slices,each_person,leftovers));
    }
}
