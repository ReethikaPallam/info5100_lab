/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author HP USER
 */
public class DatabaseConnector {
    private static final String DB_URL="jdbc:mysql://localhost:3305/medicaldb?useSSL=false";
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD="my-secret-pw";
    
    // CRUD Operations on Database
    
    //C- Create: Inserting data into the database
    public static void addPatient(Patient p1) throws SQLException{
        
        String query="INSERT into patient(fname,lname,age,email,message,gender,patient_type) values (?,?,?,?,?,?,?);";
        
        try{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(query);
        System.out.println("Inserting Patient: " + p1.getFname() + " " + p1.getLname());
        stmt.setString(1, p1.getFname());
        stmt.setString(2, p1.getLname());
        stmt.setInt(3, p1.getAge());
        stmt.setString(4, p1.getEmail());
        stmt.setString(5, p1.getMessage());
        stmt.setString(6, p1.getGender());
        stmt.setString(7, p1.getPatientType());
        
        int rows = stmt.executeUpdate();
        System.out.println("Rows Inserted: " + rows);

        
        conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        } 
        
    }
    
    //R-Read
    public static ArrayList<Patient> getPatients(){
        ArrayList <Patient> patients = new ArrayList();
        String query = "Select * from patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFname(rs.getString("fname"));
                p1.setLname(rs.getString("lname"));
                p1.setAge(rs.getInt("age"));
                p1.setEmail(rs.getString("email"));
                p1.setMessage(rs.getString("message"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patient_type"));
                
                patients.add(p1);
                
            }
            rs.close();
            conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
        return patients;
    }
    //U-Update
    public static void updatePatient(Patient oldPatient, Patient updatedPatient){
        String query ="UPDATE patient SET fname = ?, lname = ?, age = ?, email = ?, message = ?, gender = ?, patient_type = ? where id=?";
        
        try{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, updatedPatient.getFname());
        stmt.setString(2, updatedPatient.getLname());
        stmt.setInt(3, updatedPatient.getAge());
        stmt.setString(4, updatedPatient.getEmail());
        stmt.setString(5, updatedPatient.getMessage());
        stmt.setString(6, updatedPatient.getGender());
        stmt.setString(7, updatedPatient.getPatientType());
        stmt.setInt(8, oldPatient.getId());
        
        int rows = stmt.executeUpdate();
        System.out.println("Rows Updated: " + rows);
        
        conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        } 
    }
    
    //D-Delete
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM patient WHERE id = ?";
        try{
            Connection conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows Deleted: "+rows);
            conn.close();
            
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
}