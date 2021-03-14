package ListTest;

import org.junit.Test;

import java.util.ArrayList;

public class ListTest {


    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(567);
        list.add("ddd");
        list.add("qop");
        list.add(567);//可以存放相同数据
    }

}
