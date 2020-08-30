package in.foodplaza.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import in.foodplaza.pojo.Customer;
import in.foodplaza.pojo.Food;
import in.foodplaza.utility.DBConnection;

public class CustomerDaoImpl  implements CustomerDao{

	 Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String query;
	int ans;

//	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
//		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_011313", "root", "root");
//		return conn;
//	}


	@Override
	public boolean addCustomer(Customer customer) {
		try {
			System.out.println("Inside  insert customer in daoimpl");
			conn = DBConnection.getConnection();
			query = "insert into customer_011313(custname,custemail,custcontact,custaddress,custpassword,custconfirmpassword) value(?,?,?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, customer.getCustName());
			ps.setString(2, customer.getCustEmail());
			ps.setString(3, customer.getCustContact());
			ps.setString(4, customer.getCustAddress());
			ps.setString(5,customer.getCustPassword());
			ps.setString(6, customer.getCustConfirmPassword());
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
	public boolean updateCustomer(Customer customer) {
		System.out.println("Inside update Customer in custdaiimpl");
		try {
			conn = DBConnection.getConnection();
			query="update customer_011313 set custname=?,custemail=?,custcontact=?,custaddress=?,custpassword=?,custconfirmpassword=? values(?,?,?,?,?,?)";
			ps.setString(1, customer.getCustName());
			ps.setString(2, customer.getCustEmail());
			ps.setString(3, customer.getCustContact());
			ps.setString(4,customer.getCustAddress());
			ps.setString(5, customer.getCustPassword());
			ps.setString(6, customer.getCustConfirmPassword());
			ans=ps.executeUpdate();
			System.out.println("ans==>"+ans);
			if(ans >0) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
			return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		try {
			System.out.println("inside delete from daiimpl");
			conn= DBConnection.getConnection();
			query= "delete from customer_011313 where custid=?";
			ps=conn.prepareStatement(query);
			ps.setInt(1,custId);
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
	public List<Customer> ShowCustomerList() {
		List<Customer> custlist = new ArrayList<Customer>();

		try {
			System.out.println("Inside foodlist in daoimpl");
			conn = DBConnection.getConnection();
			query = "select * from customer_011313";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustId(rs.getInt(1));
				customer.setCustName(rs.getString(2));
				customer.setCustEmail(rs.getString(3));
				customer.setCustContact(rs.getString(4));
				customer.setCustAddress(rs.getString(5));
				customer.setCustPassword(rs.getString(6));
				customer.setCustConfirmPassword(rs.getString(7));
			

				custlist.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return custlist;

		
	}

	@Override
	public Customer searchCustomerById(int custId) {
		
		Customer customer = null;
		try {
			
			System.out.println("Inside foodlist in daoimpl");
			conn = DBConnection.getConnection();
			query = "select * from customer_011313 where custid=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, custId);
			rs = ps.executeQuery();
			while (rs.next()) {
				customer =new Customer();
				customer.setCustId(rs.getInt(1));
				customer.setCustName(rs.getString(2));
				customer.setCustEmail(rs.getString(3));
				customer.setCustContact(rs.getString(4));
				customer.setCustAddress(rs.getString(5));
				customer.setCustPassword(rs.getString(6));
				customer.setCustConfirmPassword(rs.getString(7));
				
			}
			return customer;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;

		
	}

	@Override
	public Customer searchCustomerByEmail(String custEmail) {
		
		Customer customer = null;
		try {
			
			System.out.println("Inside custlist in daoimpl");
			conn = DBConnection.getConnection();
			query = "select * from customer_011313 where custemail=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, custEmail);
			rs = ps.executeQuery();
			while (rs.next()) {
				customer= new Customer();
				customer.setCustId(rs.getInt(1));
				customer.setCustName(rs.getString(2));
				customer.setCustEmail(rs.getString(3));
				customer.setCustContact(rs.getString(4));
				customer.setCustAddress(rs.getString(5));
				customer.setCustPassword(rs.getString(6));
				customer.setCustConfirmPassword(rs.getString(7));
				
			}
			return customer;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;

		
	}

		
		
	}


