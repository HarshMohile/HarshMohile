package in.foodplaza.dao;

import java.util.List;

import in.foodplaza.pojo.Cart;

public interface CartDao {
	
	boolean addToCart( Cart cart);
	boolean deletefromCart( int cartId);
	boolean updateMyCart(int foodQuantity,int cartId);
	List<Cart> showMycart(String custEmail);
	List<Cart> showCartList();
	Cart searchCartById(int cartId);
}
