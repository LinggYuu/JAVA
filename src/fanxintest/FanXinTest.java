package fanxintest;

/*
Java泛型设计原则：只要在编译时期没有出现警告，那么运行时期就不会出现ClassCastException异常.

泛型：把类型明确的工作推迟到创建对象或调用方法的时候才去明确的特殊的类型

参数化类型:

把类型当作是参数一样传递
<数据类型> 只能是引用类型
相关术语：

ArrayList<E>中的E称为类型参数变量
ArrayList<Integer>中的Integer称为实际类型参数
整个称为ArrayList<E>泛型类型
整个ArrayList<Integer>称为参数化的类型ParameterizedType
有了泛型以后：

代码更加简洁【不用强制转换】
程序更加健壮【只要编译时期没有警告，那么运行时期就不会出现ClassCastException异常】
可读性和稳定性【在编写集合的时候，就限定了类型】

用户想要使用哪种类型，就在创建的时候指定类型。使用的时候，该类就会自动转换成用户想要使用的类型了。
    ObjectTool<String> tool = new ObjectTool<>();
    tool.setObj(new String("ling"));

 */