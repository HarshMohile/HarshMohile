package in.foodplaza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import in.foodplaza.pojo.Order;
import in.foodplaza.utility.DBConnection;

public class OrderDaoImpl  implements OrderDao{
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query;
	int ans;

	@Override
	public Order placeOrder(String custEmail) {
			Order o =null;
		try {
			double total=0;
			conn= DBConnection.getConnection();
			query="select sum(foodprice*foodquantity) "
					+ "as total from food_011313 f inner join "
					+ "cart_011313 c  on "
					+ "f.foodid=c.foodid "
					+ "where custemail=?";
			ps=conn.prepareStatement(query);
			ps.setString(1, custEmail);
			rs=ps.executeQuery();
			if(rs.next()) {
				total=rs.getDouble(1);
				System.out.println("total  :::"+total);
			}
			String orderdate = new Date().toString();
			query="insert into order_011313(custemail,orderdate,totalbill) values(?,?,?)";
			ps =conn.prepareStatement(query);
			ps.setString(1, custEmail);
			ps.setString(2, orderdate);
			ps.setDouble(3, total);
			ans=ps.executeUpdate();
			if(ans>0) {
				query="select * from order_011313 where custemail=? and orderdate=?";
				ps =conn.prepareStatement(query);
				ps.setString(1, custEmail);
				ps.setString(2, orderdate);
				rs=ps.executeQuery();
				if(rs.next()) {
					o=new Order();
					o.setOrderId(rs.getInt(1));
					o.setCustEmail(rs.getString(2));
					o.setOrderStatus(rs.getString(3));
					o.setOrderDate(rs.getString(4));
					o.setTotalBill(rs.getDouble(5));
				}
				return o;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return o;
	}

	@Override
	public List<Order> showMyOrder(String custEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> showAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
