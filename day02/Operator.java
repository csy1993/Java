/*
 * @Author: CSY
 * @Date: 2020-03-23 20:41:55
 * @LastEditors: CSY
 * @LastEditTime: 2020-03-25 22:00:43
 */
public class Operator{
    public static void main(String[] args) {
        System.out.println("算数运算符------");
        int a=1;
        int b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //取商
        System.out.println(a%b); //取余
        // 要取小数点用浮点型
        System.out.println(6.0/4);

        System.out.println("字符+操作------");
        // a:97,A:65,0:48
        // 可以通过使用字符与整数做算术运算，得出字符对应的数值是多少
        char ch1='a';
        System.out.println(ch1+1);

        System.out.println("字符串+操作------");
        System.out.println("csy"+1993);

        System.out.println("赋值运算符------");
        int i=10;
        i+=10;
        System.out.println(i);
        // 隐藏了强制类型转换
        short s=10;
        s+=20;
        System.out.println(s);

        System.out.println("自增运算符------");
        int i2=30;
        i2++;
        System.out.println(i2);
        ++i2;
        System.out.println(i2);
        // 后赋值
        // int j=i++;
        // 先计算再赋值
        int j=++i;
        System.out.println(i);
        System.out.println(j);

        System.out.println("关系运算符------");
        int x=5;
        int y=10;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x>y);

        System.out.println("逻辑运算符------");
        int x2=5;
        int y2=10;
        int z2=20;
        // 与&，同真为真
        System.out.println((x2<y2)&(y2<z2));
        System.out.println((x2>y2)&(y2<z2));
        System.out.println((x2<y2)&(y2>z2));
        System.out.println((x2>y2)&(y2>z2));
        // 或|，同假为假
        System.out.println((x2<y2)|(y2<z2));
        System.out.println((x2>y2)|(y2<z2));
        System.out.println((x2<y2)|(y2>z2));
        System.out.println((x2>y2)|(y2>z2));
        // 异或，相同为假
        System.out.println((x2<y2)^(y2<z2));
        System.out.println((x2>y2)^(y2<z2));
        System.out.println((x2<y2)^(y2>z2));
        System.out.println((x2>y2)^(y2>z2));
        // 非!
        System.out.println(x2>y2);
        System.out.println(!(x2>y2));

        System.out.println("短路逻辑运算符------");
        // 短路与&&，同真为真
        System.out.println((x2<y2)&&(y2<z2));
        System.out.println((x2>y2)&&(y2<z2));
        System.out.println((x2<y2)&&(y2>z2));
        System.out.println((x2>y2)&&(y2>z2));
        // 短路或，同假为假
        System.out.println((x2<y2)||(y2<z2));
        System.out.println((x2>y2)||(y2<z2));
        System.out.println((x2<y2)||(y2>z2));
        System.out.println((x2>y2)||(y2>z2));
        // 左边可判断结果则不执行右边
        System.out.println((x2++<y2)&&(y2++>z2));
        System.out.println(y2);
        System.out.println((x2++>y2)&&(y2++>z2));
        System.out.println(y2);
        System.out.println((x2++>y2)||(y2++<z2));
        System.out.println(y2);
        System.out.println((x2++<y2)||(y2++<z2));
        System.out.println(y2);

        System.out.println("三元运算符------");
        int x3=5;
        int y3=10;
        System.out.println(x3>y3?x3:y3);
    }
}