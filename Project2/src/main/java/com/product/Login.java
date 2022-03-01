package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String uname="root";
		String pass="12345678";
		
		response.setContentType("text/html");
		
		String pId = request.getParameter("ID");
	
		PrintWriter out = response.getWriter();
		
		String query="select * from eproduct where ID=?";
		out.print("<h1>Displaying the Product Details...</h1>");
		out.print("<table border='2' width='300'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>");
		
		try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection dbCon = DriverManager.getConnection(url, uname, pass);
	      PreparedStatement st=  dbCon.prepareStatement(query);
	      
	      st.setString(1, pId);
	      
	      ResultSet rs =st.executeQuery();
	      
	      while(rs.next()) {
	    	  
	    	  out.print("<tr><td>");
	    	  out.println(rs.getString(1));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(2));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString(3));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getDate(4));
	    	  out.print("</td>");
	    	  out.print("</tr>");
	    
	    	  
			}
	      
		}
		catch(Exception e){
			
			System.out.println("Some Issue : "+ e.getMessage());
			
			
		}
		
		out.print("</table>");
		
	}

}/*String url=" jdbc:mysql://localhost:3306/market";
String username="root";
String password="root";
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String product_id=request.getParameter("ID");
int ID=Integer.valueOf(product_id);
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection(url,username,password);
PreparedStatement ps=conn.prepareStatement("select *from product where product_id=?");
ps.setInt(1, ID);
ResultSet rs=ps.executeQuery();
//ResultSetMetaData rsmd=rs.getMetaData();
//int total=rsmd.getColumnCount();
//	for(int i=1;i<=total;i++){
//	out.print("<th>"+rsmd.getColumnClassName(i)+"</th>");
//	}
while(rs.next()){
	out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td></tr>");
	}
}catch(Exception e){
e.printStackTrace();
}
finally{
out.close();
}
*/