package in.foodplaza.test;

import java.util.List;
import java.util.Scanner;

import in.foodplaza.dao.FoodDaoImpl;
import in.foodplaza.pojo.Food;

public class FoodTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int foodId;
		String foodName;
		String foodType;
		String foodCategory;
		double foodPrice;
		Food food = null;
		FoodDaoImpl fdi = new FoodDaoImpl();
		int choice;
		char ch;
		boolean result;
		do {
			System.out.println(" ******* fooddplaza");
			System.out.println("1.add food");
			System.out.println("2. update food");
			System.out.println("3.Delete food");
			System.out.println("4.Show Food list");
			System.out.println("5.Search food by food Id");
			System.out.println("6.Search food by name");
			System.out.println("7.search food by Category");
			System.out.println("8.search food by type");
			System.out.println("---------------");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			System.out.println("--------------");

			switch (choice) {
			case 1:
				System.out.println("Food Adding process");
				System.out.println("----------------");
				System.out.println("Enter food name");
				foodName = sc.next();
				System.out.println("enter food type");
				foodType = sc.next();
				System.out.println("Enter food category");
				foodCategory = sc.next();
				System.out.println("Enter food price");
				foodPrice = sc.nextDouble();
				food = new Food(foodName, foodType, foodCategory, foodPrice);
				result = fdi.addFood(food);
				if (result)
					System.out.println("food inserted successfully");
				else
					System.out.println("Food not inserted");

				break;

			case 2:
				System.out.println("*********update food******");
				System.out.println("enter food id which you want to enter");
				foodId=sc.nextInt();
				System.out.println("Enter food name");
				foodName = sc.next();
				System.out.println("enter food type");
				foodType = sc.next();
				System.out.println("Enter food category");
				foodCategory = sc.next();
				System.out.println("Enter food price");
				foodPrice = sc.nextDouble();
				food= new Food(foodId, foodName, foodType, foodCategory, foodPrice);
				result = fdi.updateFood(food);
				if(result) {
					System.out.println("Food updated successfully");
				
				}
				else {
					System.out.println("Food not updated");
				}
				
				break;
			case 3:
				System.out.println("Delete food by Id");
				System.out.println("--------------");
				System.out.println("Enter foodId ");
				foodId = sc.nextInt();
				result = fdi.deleteFood(foodId);
				if (result) {
					System.out.println("food deleted successfully");

				} else {
					System.out.println("food not found");
				}
				break;
			case 4:
				System.out.println("**********Food List******");
				System.out.println("----------------");
				List<Food> foodlist = fdi.ShowFoodList();
				if (!foodlist.isEmpty()) {
					for (Food f : foodlist) {
						System.out.println(f);
					}
				} else {
					System.out.println("Food list is empty");
				}
				break;
			case 5:
				System.out.println("Search food by id");
				System.out.println("----------------------");
				System.out.println("Enter food id");
				foodId=sc.nextInt();
				food=fdi.SearchFoodByFoodid(foodId);
				if(food!=null) {
					System.out.println(food);
				}else {
					System.out.println("food is not available");
				}
				

				break;
			case 6:
				System.out.println("**********Showing food by name******");
				System.out.println("----------------");
				foodName = sc.next();
				List<Food> foodname = fdi.SearchFoodByFoodName(foodName);
				if (!foodname.isEmpty()) {
					for (Food f : foodname) {
						System.out.println(f);
					}
				} else {
					System.out.println("Food list is empty");
				}
				break;
			case 7:

				System.out.println("**********Showing Food By Category******");
				System.out.println("----------------");
				foodCategory = sc.next();
				List<Food> foodcat = fdi.SearchFoodByCategory(foodCategory);
				if (!foodcat.isEmpty()) {
					for (Food f : foodcat) {
						System.out.println(f);
					}
				} else {
					System.out.println("Food list is empty");
				}
				break;
			case 8:
				System.out.println("**********Showing food by  Type******");
				System.out.println("----------------");
				foodType = sc.next();
				List<Food> foodtype = fdi.SearchFoodByType(foodType);
				if (!foodtype.isEmpty()) {
					for (Food f : foodtype) {
						System.out.println(f);
					}
				} else {
					System.out.println("Food list is empty");
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
