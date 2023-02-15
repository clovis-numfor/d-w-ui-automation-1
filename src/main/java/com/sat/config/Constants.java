package com.sat.config;

import com.sat.driver.BrowserType;
import java.io.File;

public final class Constants {

    //Prevent Init
    private Constants() {};

    /**
     * Change the value to switch between browsers
     */
    public static final String BROWSER_TYPE = "chrome";

    /**
     * Javafaker locale
     */
    public static String Faker_Locale = "us";

    /**
     * Global test timeout
     */
    public static int Timeout = 20;

    public static String Grid_Url = "";

    /**
     * Initial URL
     */
    public static String Url_Base = "http://eliasnogueira.com/external/selenium-java-architecture/";
    public static String Url_Base2 = "https://the-internet.herokuapp.com/";
    public static String Url_Base3 = "https://bantheme.xyz/hathanhauto/";
    public static String Url_Base4 = "http://localhost/fashition/public/";
    public static String Url_Base5 = "https://tiki.vn/";
    public static String Url_Base6 = "http://localhost:8000/";
    public static String Url_Base7 = "https://demo.gondolatest.com/";
    public static String Url_Base8 = "https://icehrm-open.gamonoid.com/login.php";
    /**
     * Link Satteam
     */
    public static String Url_Base6_Services = "http://localhost:8000/services/";
    public static String Url_Base6_Blogs = "http://localhost:8000/blogs/";
    public static String Url_Base6_ContactUs = "http://localhost:8000/contact_us/";
    public static String Url_Base6_Admin = "http://localhost:8000/admin/";
    /**
     * Credentials
     */
    public static String Username = "itsnhim.30042004@gmail.com";
    public static String Password = "Qwertyuiop1234567890?";

    public static String Username4 = "admin@admin.com";
    public static String Password4 = "123456";

    public static String Username4_v2= "itsnhim.30042004@gmail.com";
    public static String Password4_v2 = "123456";

    public static String Username5= "0981405812";
    public static String Password5 = "xxx ";

    public static String Username5_v2= "satauth2022@gmail.com";
    public static String Password5_2 = "satteam2022";
    
    public static String Username5_v3= "0989240756";

    public static String Username6= "satteamsatteamsatteam2022@gmail.com";
    public static String Password6 = "123456";

    public static String Username6_v1 = "admin@admin.com";
    public static String Password6_v1 = "12";

    public static String Username6_v2 = "admin@admin.com";
    public static String Password6_v2 = "123";

    public static String Username6_v3 = "admin@admin.com";
    public static String Password6_v3 = "chao mung ban den voi sat teammmm";

    public static final String Path_TestData6 = System.getProperty("user.dir")+ File.separator + "src/test/resources/testdata/fashititon/";
    public static final String File_TestData6 = "TestData.xlsx";

    public static final String Path_TestData7 = System.getProperty("user.dir")+ File.separator + "src/test/resources/testdata/Novi/";
    public static final String File_TestData7 = "FileThongKe.pdf";


}