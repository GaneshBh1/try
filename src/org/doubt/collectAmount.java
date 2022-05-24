package org.doubt;



public class collectAmount {
	String collectedAmount="name";
	private String collectAmountGivenToMe() {
System.out.println("Dady have collected rupess"+collectedAmount);
return collectedAmount;
	}

	 public static void main(String[] args) {
		collectAmount myson=new collectAmount();
		String collectAmountGivenToMe = myson.collectAmountGivenToMe();
		System.out.println(collectAmountGivenToMe);
	}
}


