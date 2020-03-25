/*
 * @Author: CSY
 * @Date: 2020-03-11 21:40:20
 * @LastEditors: CSY
 * @LastEditTime: 2020-03-11 23:00:53
 */
// 单行注释
/*多
行
注
释*/

// 公共类HelloWorld
public class HelloWorld{
    // 程序的入口main方法
    public static void main(String[] args){
        // 输出语句
        System.out.println("Hello World.");

        // public，class，static等都是系统自带关键字

        // 字符串常量
        System.out.println("陈书勇");
        // 整型常量
        System.out.println(28);
        // 小数常量
        System.out.println(1993.10);
        // 字符常量
        System.out.println('c');
        // 布尔常量true，false
        System.out.println(true);
        // 空常量，无法直接输出
        // System.out.println(null);

        // 数据类型
        // 整型：byte，1个字节，-128到127。short，2。int，4，默认。long，8.
        // 浮点型：float，4。double，8，默认。
        // 字符型：char，2,0到65535。
        // 布尔型:boolean,1.

        // 变量
        int a = 10;
        System.out.println(a);
        a=20;
        System.out.println(a);

        // 变量注意事项
        // 整型过大需要在后面加L确认为long整型
        // long l=100000000000;
        long l=100000000000L;
        System.out.println(l);
        // 浮点型需要在后面加F
        // float f=13.14;
        float f=13.14F;
        System.out.println(f);
        // 变量不赋值不可用
        // boolean b;
        // System.out.println(b);

        // 标识符规则
        // 数字，字母，下划线和美元符号组成
        // 不能数字开头
        // 不能是关键字
        // 区分大小写

        // 小驼峰命名规则
        // 单一字母全小写：name
        // 多个单词首单词全小写，后面首字母大写：userName

        // 自动类型转换
        // 把范围小的数值给大的，把整型给浮点型
        float f2=10;
        System.out.println(f2);

        // 强制类型转换
        double d=(int)6.6;
        System.out.println(d);

    }
}