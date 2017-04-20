package sprout;

import domain.Customer;

public class ReportHeaderBuilder {
    public String buildHeader(Customer customer) {
        return "<h1 > Rental Record for <em > " + customer.getName() + "</em ></h1 >\n";
    }
}
