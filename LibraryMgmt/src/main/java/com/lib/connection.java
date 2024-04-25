package com.lib;
import java.sql.*;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import libpojo.book;

public class connection {
	
	
	
//	static Connection con;
	
//	protected static Connection initializeDatabase() throws ClassNotFoundException, SQLException{
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver class established");
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","secure");
//		System.out.println("Driver class established");
//		
//		
//		return con;
//	}


	public static int insert(book b) {
		int status=0;
		
		try {
//			Connection con = connection.initializeDatabase();
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
//			b = new book();
			
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(b);
			session.getTransaction().commit();
			session.close();
			

//			 PreparedStatement st = con 
//	                   .prepareStatement("insert into books values(default,?, ?, ?)"); 
	  
	            // For the first parameter, 
	            // get the data using request object 
	            // sets the data to st pointer 
//	            st.setInt(1, b.getId()); 
			
	  
	            // Same for second parameter 
//	            st.setString(1, b.getBookname()); 
//	            System.out.println(b.getBookname());
//	            st.setInt(2, b.getBookamount()); 
//	            System.out.println(b.getBookamount());
//	            st.setString(3, b.getAuthor()); 
//	            System.out.println(b.getAuthor());
	  
	            // Execute the insert command using executeUpdate() 
	            // to make changes in database 
//	            st.executeUpdate();
	            
	            
	  
	            // Close all the connections 
//	            st.close(); 
//	            con.close(); 
			status=1;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	
	
	public static List display() {
		 
//		 ResultSet rs = null;
		List dlist = null;
		try {
//			Connection con = connection.initializeDatabase();
//			Statement stmt = con.createStatement(); 
//           rs = stmt.executeQuery("select * from books");
            
//           stmt.close(); 
//           con.close(); 
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
			Session session = factory.openSession();
			session.beginTransaction();
			
			dlist = session.createQuery("From book").list();
			
			session.getTransaction().commit();
			session.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dlist;
	}
	
	public static boolean delete(book b) {
		 
		boolean rowDeleted = false;
        try {
        	
            
//    		Connection con = connection.initializeDatabase();
//    		String sql = "DELETE FROM books where id = ?";
//            PreparedStatement stmt = con.prepareStatement(sql);
//			stmt.setInt(1, b.getId());
//			  rowDeleted = stmt.executeUpdate() > 0;
//		        stmt.close();
//		        con.close();
SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
//			b = new book();
			
			Session session = factory.openSession();
			session.beginTransaction();
			session.delete(b);
			session.getTransaction().commit();
			session.close();
			 rowDeleted = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
      
        return rowDeleted;
	}
	
	
	
	public static int update (book b){	

		int status=0;

	try{
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
//		b = new book();
		
		Session session = factory.openSession();
		session.beginTransaction();
		book b1 = session.get(book.class, b.getId());
		b1.setBookname(b.getBookname());
		b1.setBookamount(b.getBookamount());
		b1.setAuthor(b.getAuthor());
		session.save(b1);
		session.getTransaction().commit();
		session.close();

//		Connection con = connection.initializeDatabase(); //connect to database
//
//		String sql="UPDATE books SET BOOKNAME =?,bookamount = ?,authorname=? WHERE ID=?";
//
//				
//
//		 PreparedStatement stmt = con.prepareStatement(sql);
//
//	//	 PreparedStatement pstmt = connection.prepareStatement("UPDATE library SET BOOKNAME =?,AUTHORNAME = ?,BOOKAMOUNT=?, WHERE ID=?");
//
//	
//		stmt.setString(1, b.getBookname());
//		stmt.setInt(2, b.getBookamount());
//		stmt.setString(3, b.getAuthor());
//		stmt.setInt(4,b.getId());
//
//
//		int st= stmt.executeUpdate();

	    status=1;

	    

	} 

	catch (Exception e) {

	    e.printStackTrace();

	}

	return status;

	}
	
	
	
	
	public static book getEmpById(int id) {
		 
		 ResultSet rs = null;
		 book b=null;
		try {
//			Connection con = connection.initializeDatabase();
//			
//			
//			 PreparedStatement st = con 
//	                   .prepareStatement("select * from books where id=?"); 
//			 
//			 st.setInt(1, id);
//			 rs = st.executeQuery();
SessionFactory factory = new Configuration().configure().buildSessionFactory();
			
//			b = new book();
			
			Session session = factory.openSession();
			session.beginTransaction();
			 b = session.get(book.class, id);
			
			 session.getTransaction().commit();
				session.close();

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	

}
