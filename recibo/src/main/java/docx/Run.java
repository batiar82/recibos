package docx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Run {

	public static void main(String[] args) throws Exception {
		System.out.println("Hola68");
		Connection conn=DriverManager.getConnection("jdbc:ucanaccess://src/main/resources/ascF1B3.mdb;memory=true");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM [Recibo_apaisado]");
		while (rs.next()) {
			for(int i=1;i<69;i++)
				System.out.print(rs.getString(i)+" ");
			System.out.println();
		}
		//Lo paso a la salida con otro apellido
		Connection conn2=DriverManager.getConnection("jdbc:ucanaccess://src/main/resources/salida.mdb;memory=true");
		Statement s2 = conn.createStatement();
		
		
	}

}
