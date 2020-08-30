package in.foodplaza.test;

import java.util.List;
import java.util.Scanner;



import in.foodplaza.dao.OrderDaoImpl;
import in.foodplaza.pojo.Food;
import in.foodplaza.pojo.Order;

public class OrderTest {

	public static void main(String[] args) {

		int orderId;
		String custEmail;
		String orderStatus;
		String orderDate;
		double totalBill;
		Order o = null;
		OrderDaoImpl odi = new OrderDaoImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		boolean result;
		do {
			System.out.println("********* Your Orders*********");
			System.out.println("Enter your choice ");
			System.out.println("1. place your order");
			System.out.println("2/ show my orders");
			System.out.println("3. show all orders");
			choice = sc.nextInt();
			System.out.println("--------------");

			switch (choice) {
			
			case 1 :
					System.out.println("***********Place Order************");
					System.out.println("---------------------------------");
					System.out.println("Enter your email");
					custEmail = sc.next();
					o =odi.placeOrder(custEmail);
					if(o!=null) {
						System.out.println("Order placed");
						System.out.println(o);
					}
						else {
							System.out.println("Not placed");
						}

				break;
	
			default:
				System.out.println("Enter correct case ");
			}// end switch
			System.out.println("Do u want to continue y or n");
			ch = sc.next().charAt(0);
		}while(ch=='y');

}

}
