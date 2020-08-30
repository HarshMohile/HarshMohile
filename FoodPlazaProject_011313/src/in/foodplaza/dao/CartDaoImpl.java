package in.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.foodplaza.pojo.Cart;
import in.foodplaza.utility.DBConnection;

public class CartDaoImpl implements CartDao {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query;
	int ans;

	@Override
	public boolean addToCart(Cart cart) {
		try {
			conn = DBConnection.getConnection();
			query = "insert into cart_011313(foodid,custemail,foodquantity) values(?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setInt(1, cart.getFoodId());
			ps.setString(2, cart.getCustEmail());
			ps.setInt(3, 1);
			ans = ps.executeUpdate();
			if (ans > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deletefromCart(int cartId) {
		try {
			conn = DBConnection.getConnection();
			query = "delete from cart_011313 where cartid=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, cartId);
			ans = ps.executeUpdate();
			if (ans > 0) {
				return true;
			} else {
				System.out.println("Not deleted or not found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean updateMyCart(int foodQuantity, int cartId) {

		try {
			conn = DBConnection.getConnection();
			query = "update cart_011313 set foodquantity=?  where cartid=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, foodQuantity);
			ps.setInt(2, cartId);
			ans = ps.executeUpdate();
			if (ans > 0) {
				return true;
			} else {
				System.out.println("Not deleted or not found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	@Override
	public List<Cart> showMycart(String custEmail) {
		List<Cart> cartlist = new ArrayList<Cart>();
		try {
			conn = DBConnection.getConnection();
			query = "select cartid,foodname,foodtype,foodcategory,foodprice,foodquantity "
					+ "from food_011313 f inner join cart_011313 c" + " on f.foodid=c.foodid " + "where custemail=? ";
			// System.out.println(query);
			ps = conn.prepareStatement(query);
			ps.setString(1, custEmail);
			System.out.println(ps);
			rs = ps.executeQuery();
			while (rs.next()) {

				Cart cart = new Cart();
				cart.setCartId(rs.getInt(1));
				cart.setFoodName(rs.getString(2));
				cart.setFoodType(rs.getString(3));
				cart.setFoodCategory(rs.getString(4));
				cart.setFoodPrice(rs.getDouble(5));
				cart.setFoodQuantity(rs.getInt(6));

				cartlist.add(cart);

			}
		} catch (Exception e) {

		}

		return cartlist;
	}

	@Override
	public List<Cart> showCartList() {

		List<Cart> cartlist = new ArrayList<Cart>();
		try {
			conn = DBConnection.getConnection();
			query = "select cartid,custemail,foodname,foodtype,foodcategory,foodprice,foodquantity "
					+ "from food_011313 f inner join cart_011313 c" + " on f.foodid=c.foodid ";

			ps = conn.prepareStatement(query);
			System.out.println(ps);
			rs = ps.executeQuery();
			while (rs.next()) {

				Cart cart = new Cart();
				cart.setCartId(rs.getInt(1));
				cart.setCustEmail(rs.getString(2));
				cart.setFoodName(rs.getString(3));
				cart.setFoodType(rs.getString(4));
				cart.setFoodCategory(rs.getString(5));
				cart.setFoodPrice(rs.getDouble(6));
				cart.setFoodQuantity(rs.getInt(7));

				cartlist.add(cart);

			}
		} catch (Exception e) {

		}

		return cartlist;

	}

	@Override
	public Cart searchCartById(int cartId) {
		Cart cart = null;
		try {
			System.out.println("inside cart by id");
			conn = DBConnection.getConnection();
			query = "select cartid,foodname,foodtype,foodcategory,foodprice,foodquantity "
					+ "from food_011313 f inner join cart_011313 c" + " on f.foodid=c.foodid " + "where cartid=? ";
			ps = conn.prepareStatement(query);
			ps.setInt(1, cartId);
			rs = ps.executeQuery();
			while (rs.next()) {
				cart = new Cart();
				cart.setCartId(rs.getInt(1));
				cart.setFoodName(rs.getString(2));
				cart.setFoodType(rs.getString(3));
				cart.setFoodCategory(rs.getString(4));
				cart.setFoodPrice(rs.getDouble(5));
				cart.setFoodQuantity(rs.getInt(6));
			}
			return cart;

		} catch (Exception e) {
			System.out.println(e);
		}

		return cart;
	}

}
