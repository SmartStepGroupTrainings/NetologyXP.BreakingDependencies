package wrap;

import java.util.List;

public class LoggingEmployee extends Employee {

    private Employee employee;

    @Override
    public void pay(List<TimeEntry> timeEntries, PaymentService paymentService) {
        logPayment();

        employee.pay(timeEntries, paymentService);

        logPayment();
    }

    private void logPayment() {

    }
}