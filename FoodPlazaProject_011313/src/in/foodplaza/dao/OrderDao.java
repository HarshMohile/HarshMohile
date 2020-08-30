package in.foodplaza.dao;

import java.util.List;

import in.foodplaza.pojo.Order;

public interface OrderDao {

	Order placeOrder(String custEmail);
	List <Order> showMyOrder(String  custEmail);
	List<Order> showAllOrders();
	
}
