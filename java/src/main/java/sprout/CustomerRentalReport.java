package sprout;

import domain.Customer;
import domain.Movie;

import java.util.List;

public class CustomerRentalReport {
    private final ReportHeaderBuilder _headerBuilder;

    public CustomerRentalReport(ReportHeaderBuilder headerBuilder) {
        this._headerBuilder = headerBuilder;
    }

    public String htmlStatement(Customer customer, List<Movie> movies) {
        // Get report data

        StringBuilder result = new StringBuilder();
        result.append("<table>\n");

        //String header = "<h1>Rental Record for <em>" + customer.getName() + "</em></h1>\n";
        String header = this._headerBuilder.buildHeader(customer);

        result.append("<table>\n");

        // Iterate movies, build report body

        return result.toString();
    }
}

