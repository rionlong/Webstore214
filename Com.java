package com;

import java.util.ArrayList;
import java.util.*;

public class Com extends Item {

	public Com() {
		// TODO Auto-generated constructor stub
	}
	//Recursion that counts the total. Set as static 
	//USE ONLY THIS METHOD
	public static double total(ArrayList<Item> selectedItems, int amount) {
		int tempAmount = amount - 1;
		double random = 0;
		if(tempAmount > 0) {
			double temp = selectedItems.get(tempAmount).getPrice() + total(selectedItems, tempAmount);
			return temp;
		}
		//Will not accept without this
		return random;
	}
	//METHOD ENDS HERE

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
