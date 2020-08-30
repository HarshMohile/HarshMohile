package in.foodplaza.test;

import java.util.List;
import java.util.Scanner;

import in.foodplaza.dao.CartDaoImpl;
import in.foodplaza.dao.FoodDaoImpl;
import in.foodplaza.pojo.Cart;
import in.foodplaza.pojo.Food;

public class CartTest {

	public static void main(String args[]) {
		int cartId;
		int foodId;
		String custEmail;
		int foodQuantity;
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean result;
		char ch;
		Cart cart = null;
		CartDaoImpl crdi = new CartDaoImpl();

		do {
			System.out.println("Enter choices for your cart");
			System.out.println("1. add to cart");
			System.out.println("2. update from cart");
			System.out.println("3. delete from cart ");
			System.out.println("4.show  my cart");
			System.out.println("5.show cart list");
			System.out.println("6. Search from cart id");

			// choices

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("//////Add to cart//////");
				List<Food> foodlist = new FoodDaoImpl().ShowFoodList();
				System.out.println(foodlist);
				System.out.println("------------------------");
				System.out.println("Enter Cust email id");
				custEmail = sc.next();
				System.out.println("Enter food id");
				foodId = sc.nextInt();
				cart = new Cart(foodId, custEmail);
				result = crdi.addToCart(cart);
				if (result) {
					System.out.println("food added successfully in cart");

				} else {
					System.out.println("enter proper choice");
				}
				break;
			case 2:
				System.out.println(" ***********Update  cart*******");
				System.out.println("Enter cart id");
				cartId = sc.nextInt();
				System.out.println("Enter food quantity");
				foodQuantity = sc.nextInt();
				result = crdi.updateMyCart(foodQuantity, cartId);
				if (result) {
					System.out.println("Cart updated");
				} else {
					System.out.println("Not updated");
				}
				break;
			case 3:
				System.out.println("******delete from cart by ID ****");
				System.out.println("-------------------------");
				System.out.println("Enter cart ID");
				cartId = sc.nextInt();
				result = crdi.deletefromCart(cartId);
				if (result) {
					System.out.println("Deleted from Cart");
				} else {
					System.out.println("Not deleted");
				}

				break;

			case 4: // show my cart
				System.out.println("show my cart");
				System.out.println("-------------------");
				System.out.println("Enter your email id");
				custEmail = sc.next();
				List<Cart> cartlist = crdi.showMycart(custEmail);
				if (!cartlist.isEmpty())
					for (Cart c : cartlist) {
						System.out.println(c);
					}
				else {
					System.out.println("Your cart is empty");
				}
				break;

			case 5:
				System.out.println("*********Show cartlist*****");
				System.out.println("------------------------------");
				List<Cart> clist = crdi.showCartList();
				if (!clist.isEmpty()) {
					for (Cart c : clist) {
						System.out.println(c);
					}
				} else {
					System.out.println(" Cart list is empty");
				}
				break;

			case 6:
				System.out.println("Show cart by Id");
				System.out.println("------------------");
				System.out.println("Enter cart Id");
				cartId = sc.nextInt();
				cart = crdi.searchCartById(cartId);
				if (cart != null) {
					System.out.println(cart);
				} else {
					System.out.println(" Not available in cart");
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
