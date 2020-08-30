package in.foodplaza.test;

import java.util.List;
import java.util.Scanner;

import in.foodplaza.dao.CustomerDaoImpl;
import in.foodplaza.pojo.Customer;
import in.foodplaza.pojo.Food;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int custId;
		String custName;
		String custEmail;
		String custContact;
		String custAddress;
		String custPassword;
		String custConfirmPassword;

		Customer customer = null;
		CustomerDaoImpl cdi = new CustomerDaoImpl();

		int choice;
		char ch;

		boolean result;
		do {
			System.out.println(" ******* Customer Data********");
			System.out.println("1.add customer");
			System.out.println("2. update customer");
			System.out.println("3.Delete customer");
			System.out.println("4.Show customer list");
			System.out.println("5.Search customer by customer  Id");
			System.out.println("6.Search customer by email");
			System.out.println("*************************************");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			System.out.println("--------------");

			switch (choice) {
			case 1: /// Add customer
				System.out.println("Customer  Adding process");
				System.out.println("----------------");
				System.out.println("Enter customer name");
				custName = sc.next();
				System.out.println("enter food Email");
				custEmail = sc.next();
				System.out.println("Enter customer  contact");
				custContact = sc.next();
				System.out.println("Enter customer address");
				custAddress = sc.next();
				System.out.println("Enter customer password");
				custPassword = sc.next();
				System.out.println("re enter customer password");
				custConfirmPassword = sc.next();

				if (custPassword.equals(custConfirmPassword)) {
					customer = new Customer(custName, custEmail, custContact, custAddress, custPassword,
							custConfirmPassword);
					result = cdi.addCustomer(customer);
					if (result)
						System.out.println("food inserted successfully");
					else
						System.out.println("Food not inserted");

				} else {
					System.out.println("Password and Confirm password fields do not match");
				}

				break;

			case 2: /// update customer
				System.out.println("*********update customer******");
				System.out.println("enter customer id which you want to enter");
				custId = sc.nextInt();
				System.out.println("Enter customer name");
				custName = sc.next();
				System.out.println("enter food Email");
				custEmail = sc.next();
				
				System.out.println("Enter customer  contact");
				custContact = sc.next();
				
				System.out.println("Enter customer address");
				custAddress = sc.next();
				
				System.out.println("Enter customer password");
				custPassword = sc.next();
				System.out.println("re enter customer password");
				custConfirmPassword = sc.next();

				customer = new Customer(custId, custName, custEmail, custContact, custAddress, custPassword,
						custConfirmPassword);
				result = cdi.updateCustomer(customer);
				if (result) {
					System.out.println("Customer updated successfully");

				} else {
					System.out.println("Customer not updated");
				}

				break;

			// DELETE CUSTOMER
			case 3:
				System.out.println("Delete Customer by Id");
				System.out.println("--------------");
				System.out.println("Enter custId ");
				custId = sc.nextInt();
				result = cdi.deleteCustomer(custId);
				if (result) {
					System.out.println("Customer deleted successfully");

				} else {
					System.out.println("Customer not found");
				}

				break;

			case 4: // show customer list
				System.out.println("**********Customer List******");
				System.out.println("----------------");
				List<Customer> custlist = cdi.ShowCustomerList();
				if (!custlist.isEmpty()) {
					for (Customer c : custlist) {
						System.out.println(c);
					}
				} else {
					System.out.println("Food list is empty");
				}

				break;

			case 5: // show customer by ID
				System.out.println("Search Customer by id");
				System.out.println("----------------------");
				System.out.println("Enter customer id");
				custId = sc.nextInt();
				customer = cdi.searchCustomerById(custId);
				if (customer != null) {
					System.out.println(customer);
				} else {
					System.out.println("food is not available");
				}

				break;

			case 6: // Show Customer By Email

				System.out.println("Search Customer by  Emailid");
				System.out.println("----------------------");
				System.out.println("Enter customer  Emailid");
				custEmail = sc.next();
				customer = cdi.searchCustomerByEmail(custEmail);
				if (customer != null) {
					System.out.println(customer);
				} else {
					System.out.println("food is not available");
				}

				break;

			default:
				System.out.println("Enter correct case ");
			}// end switch
			System.out.println("Do u want to continue y or n");
			ch = sc.next().charAt(0);
		} while (ch == 'y');

	}

}
