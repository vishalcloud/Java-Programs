/* WAP to calculate Total Dispensed change amount in lowest US Currency penny 
	using conventions Dollar = 100 P, Quarter = 25P, Dime =10p ,Nickel = 5 P

*/
package org.TDD;


public class Change {
	
	private int dollars, quarters, dimes, nickels, pennies = 0;
	
	public Change(int dollars, int quarters, int dimes, int nickels,
			int pennies) {
		super();
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes   = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}
	
	public Change() {
		super();
	}
	
	public int getTotalChange(){
		if ((dollars*100 + quarters*25 + dimes*10 + nickels*5 + pennies) < 0)
		return 0;
		
		return (dollars*100 + quarters*25 + dimes*10 + nickels*5 + pennies);
	}


	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getQuarter() {
		return quarters;
	}

	public void setQuarter(int quarters) {
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

}