package collectiontest;

/*
集合元素的遍历操作，使用Iterator接口

 */


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void  test(){
        Collection co =new ArrayList();
        co.add(123);
        co.add(456);
        co.add(new String("tom"));
        co.add(false);
        Iterator it = co.iterator();
        //最初指向的是当前第一个元素的前一个元素
        //next后指向后一个元素
        System.out.println(it.next());

        //方式2，用for循环加 co.size(),不推荐

        //方式3：推荐方式
        //      while(iterator.hasNext)
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //使用remove移除元素
        while(it.hasNext()){
            Object obj =it.next();
            if("tom".equals(obj)){
                it.remove();
            }
        }


    }

}
