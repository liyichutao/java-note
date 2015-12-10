double a = 3;
System.out.println("a = " + a);

基本类型
byte short long float char(16) boolean int double

import java.util.Scanner;
next[Byte,Short,Int,Long,Float,Double]();
next();
nextLine();

final double PI = 3.14;

System.currentTimeMillis();//GMT时间戳

Math.pow(a,b); a的b次方

import javax.swing.JOptionPane;
JOptionPane.showMessageDialog(null, "content", "title", JOptionPane.INFORMATION_MESSAGE);

String input = JOptionPane.showInputDialog("Enter an input");
String input = JOptionPane.showInputDialog(null,"content", "title", JOptionPane.QUESTION_MESSAGE);

int value = Integer.parseInt("30");
double value = Double.parseDouble("123.456");

System.out.printf("format", item1, item2, ..., itemK);
%b, %c, %d, %f, %e, %s  支持%N.Mf

int option = JOptionPane.showConfirmDialog(null, "continue");
yes = JOptionPane.YES_OPTION(0);
no = JOptionPane.NO_OPTION(1);
cancle = JOptionPane.CANCLE_OPTION(2);

输入输出重定向
java Test < input.txt
java Test > output.txt


数组
double[] mylist = new double[10]; //数组数据有默认值
int length = mylist.length; //数组长度
double[] mylist = {1.1, 2.2, 3.3}; //直接初始化
char[] city = {'D', 'a', 'l'}; //System.out.println(city); char[]可以直接打印

增强for循环
for(double u : mylist){
	System.out.println(u);
}

数组复制
mylist2 = mylist1; //mylist2赋值前指向的数组被自动回收

double[] targetArray = new double[10]; //targetArray需先手动分配内存
System.arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);

public static void swapArray(int[] array)//数组作形参
public static int[] copy(int[] list); //返回数组
int[] list2 = copy(list1);

可变长参数列表（类型相同，数量可变, 必须是最后一个参数，numbers可当作数组来用，长度可为0）
public static void printMax(String a, double... numbers);

import java.util.Arrays;
java.util.Arrays.sort(list);
java.util.Arrays.sort(list,n,m); //排序n到m-1;
java.util.Arrays.binarySearch(list, 3);

二维数组
int[][] ar = new int[5][5]; //必须指定第一个维度

锯齿数组,ar[0],ar[1],ar[2]长度各不一样
int[][] ar = {
	{1,2,3},
	{1,2},
	{1}
};


类
可以把两个类放在用一文件中，但文件中只能有一个类是公共的，此外，公共类必须与文件同名
数据类内可以直接初始化，没初始化也都有默认值，引用类型默认值是null，方法内局部变量没有默认值，
直接使用会编译错误

java.util.Date
+Date()
+Date(elapseTime: long)
+toString(): String
+getTime(): long
+setTime(elapseTime: long) : void

java.util.Random
+Random()
+Random(seed: long)
+nextInt():int
+nextInt(n:int):int
+nextLong():long
+nextDouble():double
+nextFloat():float
+nextBoolean():boolean


GUI组件 (page:220)
import javax.swing.JFrame;

类中静态常量
final static double PI = 3.1425926;








