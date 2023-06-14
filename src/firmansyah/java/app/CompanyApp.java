package firmansyah.java.app;

import firmansyah.java.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT Maju");

        Company.Employee employee = company.new Employee();
        employee.setName("Fadhil");

        Company company2 = new Company();
        company2.setName("PT Forward");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Firmansyah");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());
        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
