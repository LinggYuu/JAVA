package collectiontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {

    @Test
    public void test1(){
        Collection co =new ArrayList();
        co.add(123);
        co.add(456);
        co.add(new String("tom"));
        co.add(false);
        co.add(456);
        Person ly = new Person("ly", 12);
        co.add(ly);
        co.add(new Person("lisa",23));
        //contains(Object obj);//判断当前集合中是否包含obj
        System.out.println(co.contains(456));
        System.out.println(co.contains(new String("tom")));
        System.out.println(co.contains(ly));
        /*
        判断的是内容而不是地址，也就是用equals方法
         */
        System.out.println(co.contains(new Person("lisa",23)));
        /*
        这里是false，因为equals还没有重写用的是object类中的额queals,
        只要在Person类中重写了equals,就可以是true
        调用contains，在判断时会调用obj对象所在类的equals方法
         */
        /*containsAll(Collection c)；
        判断形参c中的所有元素是否都存在于当前集合中

         */
        System.out.println("------------------------------------------------------------------");
        Collection cc = Arrays.asList(123,456);
        co.containsAll(cc);
        System.out.println(co.containsAll(cc));


        /*
            remove(Object obj):移除集合中的obj类，
            在移除前需要判断是否obj在集合中
         */
        co.remove(123);

        /*
        removeAll(Collection co1):
            从当前集合中移除co1中的所有元素(共有的元素)

        remove相关方法都会调用参数对象中的equals方法

         */
    }

    @Test
    public void test2(){
        Collection co =new ArrayList();
        co.add(123);
        co.add(456);
        co.add(new String("tom"));
        co.add(false);

        Collection cc = Arrays.asList(123,456,789);

        /*
        retain(Collection c)：
            取和c的交集
            会把集合进行修改
         */
//        co.retainAll(cc);
//        System.out.println(co);

        /*equals(Object obj):
            比较两个集合内容是否一样
            要想返回true，需要当前集合和形参集合的元素都相同，
            关于有没有序要看对象是什么类型的，如果ArrayList则要有序
         */
        Collection co1 =new ArrayList();
        co1.add(456);
        co1.add(123);
        //顺序不同，就不一样了
        //因为ArrayList是有序的
        co1.add(new String("tom"));
        co1.add(false);
        System.out.println(co.equals(co1));
    }

    @Test
    public void test3(){
        Collection co =new ArrayList();
        co.add(123);
        co.add(456);
        co.add(new String("tom"));
        co.add(false);

        /*
        hashCode():
            返回当前对象的hash值
         */
        System.out.println(co.hashCode());
        /*
        集合转换为数组
        toArray()
         */
        Object[] arr = co.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
/*
        数组转化为集合
        调用Arrays类的静态方法asList()
        Arrays.asList()
 */
        List<String> list = Arrays.asList(new String[]{"A", "B", "C"});
        System.out.println(list);
        List<Integer> list1 = Arrays.asList(123, 456);
        System.out.println(list1);
        List<int[]> list2 = Arrays.asList(new int[]{123, 456});
        System.out.println(list2);
        //new int[]{}生成的会把这个数组当成一个元素
        //可以写成包装类Integer的，就正常了
        List<Integer> list3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(list3);
    }

/*
 iterator():
            返回Iterator接口的实例，用于遍历集合元素
 */

}
