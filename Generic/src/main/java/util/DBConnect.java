package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by a on 9/15/2016.
 */
public class DBConnect {
    private Connection connect=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    private ResultSet resultset=null;
    List<String> list=new ArrayList<String>();

    public static Properties loadPropertiesFile() throws Exception{
        Properties prop=new Properties();
        InputStream ism=new FileInputStream("C:\\Users\\a\\udemyAutomation\\Automation\\Generic\\lib\\MySQL.properties");
        prop.load(ism);
        ism.close();

        return prop;
    }

    //connect to Database
    public void connectToDataBase() throws Exception{
        Properties prop=loadPropertiesFile();
        String driverClass=prop.getProperty("MYSQLJDBC.driver");
        String url=prop.getProperty("MYSQLJDBC.url");
        String userName=prop.getProperty("MYSQLJDBC.userName");
        String passWord=prop.getProperty("MYSQLJDBC.passWord");
        Class.forName(driverClass);
        connect= DriverManager.getConnection(url,userName,passWord);
        System.out.println("Database Connected");


    }
    /*

    public List<String > readDataBase() throws Exception{
        try{
            connectToDataBase();
            statement=connect.createStatement();
            resultset=statement.executeQuery("Select*fromCnnnewsVertical");

        }
    }*/
}
