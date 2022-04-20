package model.services;

public interface PaymentServiceWeb {
	
	double paymentFee(Double amount);
	
	double interest(Double amount, Integer months);
}
