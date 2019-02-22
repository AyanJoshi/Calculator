/*
Name: Ayan Joshi
Class ID: 429
Description: This is a calculator class with functions to
	 		 to perform basic mathematical functions.
 */
package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}	
	
	/**
	 * The getTotal method returns the total value
	 * <p>
	 */
	public int getTotal () {
		return total;						//updating history
	}
	
	/**
	 * The add method adds the parameter to the total value
	 * <p>
	 * @param  value 	Element to be added to total
	 */
	public void add (int value) {
		total+= value;						//adding to the total
		history = history + " + " + value;	//updating history
	}
	
	/**
	 * The subtract method subtracts the parameter from the total 
	 * <p>
	 * @param  value 	Element to be subtracted from total
	 */
	public void subtract (int value) {
		total-= value;						//subtracting from total
		history = history + " - " + value;	//updating history
	}
	
	/**
	 * The multiply method multiplies the parameter with the total
	 * <p>
	 * @param  value 	Element to be multiplied with total
	 */
	public void multiply (int value) {
		total*= value;						//multiplying with total
		history = history + " * " + value;	//updating history
	}
	
	/**
	 * The divide method divides the parameter from the total value
	 * If the parameter is 0 then the total is set to 0
	 * <p>
	 * @param  value 	Divide total by this element
	 */
	public void divide (int value) {
		if(value == 0)				//checking if parameter is 0
			total = 0;				//setting total to 0
		else
			total = total/value;	//dividing by parameter
		history = history + " / " + value;	//updating history
	}
	
	/**
	 * The getHistory method returns the history
	 * <p>
	 */
	public String getHistory () {
		return history;				//return history
	}
}