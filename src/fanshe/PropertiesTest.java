package fanshe;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test() throws Exception {
        Properties pro = new Properties();

        //方式一
        //配置文件默认在当前的module下，module的上一层
         FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc.properties");
        //这么写的话等于 在module下src下的jdbc.properties
         pro.load(fis);

        //方式二
        //配置文件默认识别为当前module的src下
//        ClassLoader classLoader = PropertiesTest.class.getClassLoader();
//        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
//        //上面的properties在src中
        pro.load(fis);


        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        System.out.println(user+" "+password);
    }

}
