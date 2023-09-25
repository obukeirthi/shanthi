package com.demo_oops;

public class Encapsulation {
	
	public static void main(String[] args) {
		Encapsulation b = new Encapsulation();
		b.bank_name();
		b.bank_accountnumber();
		b.bank_branchname();
		b.bank_ifsc();
		b.bank_state();
		b.bank_mobilenumber();
		
	}


public void bank_name() {
	System.out.println("naveen");
}
private void bank_accountnumber() {
	System.out.println("236684446445");
}
protected void bank_ifsc() {
	System.out.println("frhj23356565");
}
void bank_branchname() {
	System.out.println("seelanaickenpatty");
}
public void bank_mobilenumber() {
	System.out.println("345873469");
}
public void bank_state() {
	System.out.println("tamilnadu");
}

}