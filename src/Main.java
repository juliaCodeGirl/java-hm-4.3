public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long creditPayment = service.calculate(1_000_000,  12);
        //в переменной termCredit указывается срок кредита в месяцах
        //по условия 12, 24, 36 месяцев

        System.out.println("Сумма ежемесечного платежа: " + creditPayment + " рублей");

    }
}
