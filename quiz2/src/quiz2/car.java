package quiz2;
import java.util.Scanner;

public class car{
	double CarCost;
	double DownPayment;
	int LengthOfLoan;
	double InterestRate;

	public car(double car_price, double down_payment, int loan_length, double interest) {
		this.CarCost = car_price;
		this.DownPayment = down_payment;
		this.LengthOfLoan = loan_length;
		this.InterestRate = interest/100;

	}

	public double ip() {
		double temp = (this.InterestRate/12)* this.CarCost;
		temp = temp/(1-Math.pow((1+(this.InterestRate/12)), - this.LengthOfLoan));
		return (this.LengthOfLoan * temp) - this.CarCost;
	}

	public double payment() {
		double temp = (this.InterestRate/12)* this.CarCost;
		temp = temp/(1-Math.pow((1+(this.InterestRate/12)), - this.LengthOfLoan));
		return temp;
	}

}
