package com.annmary;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Plant plant = new Plant();
        plant.grow();

        Tree tree = new Tree();
        tree.grow();

        // applying polymorphism
        Plant plant1 = tree;
        plant1.grow();

        tree.shedLeaves();

        // but you can't call plant1.shedLeaves() because it is referencing Plant and Plant doesn't have the shedLeaves method
//        plant1.shedLeaves();

        // you can pass the child class tree to this function
        doGrow(tree);
    }

    public static void doGrow(Plant plant){
        plant.grow();
    }
}
