import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*

class Test{

    public static void main(String[] args) {
        class.forName(com.mysql.jdbc.Driver);

        Connection con = DriverManager.getConnection("jdbc: mysql://localhost:3306/test,"User","password"");
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery("Select * from emp");
        System.out.println("ID \t Name \t Address");
        while(rs.next()){

            System.out.println(rs.getString('id')+"\t"+ rs.getString("name")+ "\t"+rs.getString("add"));
        }
        con.close();
    }

    private static void forName() {
    }
}
*/
