package settest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    /*
    Set：存储无序的，不可重复的数据
    以HashSet为例说明:
    1.无序性:不等于随机性
        添加元素的时候是无序的
        存储的数据在底层数组中并非按照数组索引的顺序添加
        而是根据数据的hash值确定
        无序指存放位置无序


    2.不可重复性
        保证添加的元素按照equals()判断时，不能返回true
            即相同的元素只能有一个

    添加元素的过程:以HashSet为例:  用Hash加拉链法
    HashSet底层是一个数组
        我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，计算a的哈希值
        此哈希值接着通过某种算法计算出该元素在HashSet底层数组中的存放位置（即为:索引位置
        数组此位置上是否已经有元素，如果此位置没有其他元素，则a添加成功
        如果此位置上有其他元素b(或以链表形式存在多个元素)则比较元素a与其他元素的hash值
            如果hash值不同，则a添加成功
            如果hash值相同，则调用元素a所在类的equals方法
                equals方法返回true，元素a添加失败
                equals方法返回false，则元素a添加成功

            第一个元素，调用HashCode计算Hash值，这个Hash值决定了在数组中的存放位置
            第二个元素，调用HashCode计算Hash值，这个Hash值决定了在数组中的存放位置
            第三个元素，。。。类似
            第四个元素，算Hash值根据该值算出的位置发现和前面某元素一样，通过拉链法处理Hash表冲突
            第五个元素，算Hash值跟前面某元素一样，通过equals

           HashSet底层:数组+链表结构

           要求:向Set中添加的数据，其所在类一定要重写hashCode()和equals()
           要求:重写的hashCode和equals尽可能要保持一致性
                    即相等的对象一定要有相等的散列码
                重写小技巧，对象中用作equals方法比较的Field，都应该用来计算hashCode

     */


    @Test
    public void test(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("abc");
        set.add("AAA");
        set.add("CC");
        set.add(456);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add("abc");
        set.add("AAA");
        set.add("CC");
        set.add(456);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
