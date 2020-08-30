package in.foodplaza.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import in.foodplaza.pojo.Food;

public class FoodDaoImpl implements FoodDao {

	static Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query;
	int ans;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplaza_011313", "root", "root");
		return conn;
	}

	@Override
	public boolean addFood(Food food) {
		try {
			System.out.println("Inside food insert food in daoimpl");
			conn = getConnection();
			query = "insert into food_011313(foodname,foodcategory,foodtype,foodprice) value(?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, food.getFoodName());
			ps.setString(2, food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			ans = ps.executeUpdate();
			System.out.println("ans -->:" + ans);
			if (ans > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateFood(Food food) {
		try {
			System.out.println("inside update food in dao impl");
			conn =getConnection();
			query ="update food_011313 set foodname=?,foodcategory=?,foodtype=?,foodprice=? where foodid=?";
			ps=conn.prepareStatement(query);
			ps.setInt(5, food.getFoodId());
			ps.setString(1,food.getFoodName());
			ps.setString(2,food.getFoodCategory());
			ps.setString(3, food.getFoodType());
			ps.setDouble(4, food.getFoodPrice());
			ans=ps.executeUpdate();
			System.out.println("ans ==>"+ans);
			if(ans>0)
				return true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteFood(int foodId) {
		try {
			System.out.println("inside delete from daiimpl");
			conn= getConnection();
			query= "delete from food_011313 where foodid=?";
			ps=conn.prepareStatement(query);
			ps.setInt(1,foodId);
			ans=ps.executeUpdate();
			System.out.println("ans-->"+ans);
			if(ans>0)
				return true;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public List<Food> ShowFoodList() {
		List<Food> foodlist = new ArrayList<Food>();

		try {
			System.out.println("Inside foodlist in daoimpl");
			conn = getConnection();
			query = "select * from food_011313";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setFoodId(rs.getInt(1));
				food.setFoodName(rs.getString(2));
				food.setFoodType(rs.getString(3));
				food.setFoodCategory(rs.getString(4));
				food.setFoodPrice(rs.getDouble(5));

				foodlist.add(food);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foodlist;
	}

	@Override
	public Food SearchFoodByFoodid(int foodId) {
			Food food = null;
		try {
			
			System.out.println("Inside foodlist in daoimpl");
			conn = getConnection();
			query = "select * from food_011313 where foodid=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, foodId);
			rs = ps.executeQuery();
			while (rs.next()) {
				food = new Food();
				food.setFoodId(rs.getInt(1));
				food.setFoodName(rs.getString(2));
				food.setFoodType(rs.getString(3));
				food.setFoodCategory(rs.getString(4));
				food.setFoodPrice(rs.getDouble(5));

				
			}
			return food;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return food;


		
	}

	@Override
	public List<Food> SearchFoodByFoodName(String foodName) { ////// By Food Name

		List<Food> foodlist = new ArrayList<Food>();

		try {
			System.out.println("Inside foodName in daoimpl");
			conn = getConnection();
			query = "select * from food_011313 where foodname=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, foodName);
			rs = ps.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setFoodId(rs.getInt(1));
				food.setFoodName(rs.getString(2));
				food.setFoodType(rs.getString(3));
				food.setFoodCategory(rs.getString(4));
				food.setFoodPrice(rs.getDouble(5));

				foodlist.add(food);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foodlist;
	}

	@Override
	public List<Food> SearchFoodByType(String foodType) {
		
		List<Food> foodlist = new ArrayList<Food>();

		try {
			System.out.println("Inside foodName in daoimpl");
			conn = getConnection();
			query = "select * from food_011313 where foodtype=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, foodType);
			rs = ps.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setFoodId(rs.getInt(1));
				food.setFoodName(rs.getString(2));
				food.setFoodType(rs.getString(3));
				food.setFoodCategory(rs.getString(4));
				food.setFoodPrice(rs.getDouble(5));

				foodlist.add(food);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foodlist;

	}

	@Override
	public List<Food> SearchFoodByCategory(String foodCategory) {
		
		List<Food> foodlist = new ArrayList<Food>();

		try {
			System.out.println("Inside foodName in daoimpl");
			conn = getConnection();
			query = "select * from food_011313 where foodcategory=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, foodCategory);
			rs = ps.executeQuery();
			while (rs.next()) {
				Food food = new Food();
				food.setFoodId(rs.getInt(1));
				food.setFoodName(rs.getString(2));
				food.setFoodType(rs.getString(3));
				food.setFoodCategory(rs.getString(4));
				food.setFoodPrice(rs.getDouble(5));

				foodlist.add(food);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foodlist;

	}

}
