public class CreditPaymentService {
    public long calculate(long amountCredit , long termCredit) {
        double monthlyRate = 9.99 / 12 / 100 ;
        double index = monthlyRate * Math.pow(1 + monthlyRate, termCredit) / ( Math.pow(1 + monthlyRate , termCredit) - 1);
        long creditPayment = (long) (index * amountCredit);

        return creditPayment;


    }
}
