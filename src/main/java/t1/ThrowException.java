package t1;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_异常处理类
 * Package(包名): t1
 * Class(类名): ThrowException
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/21
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)：
 * 利用throw关键字声明输入可能出现的异常。
 * 如果输入的ID格式正确，则输出ID格式正确：+ ID内容；反之输出ID长度应为7。
 * 测试说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 测试输入：1234567
 * 测试输出：ID格式正确：1234567
 * <p>
 * 测试输入：vddft56657
 * 测试输出：ID长度应为7
 */

public class ThrowException
{
    public static void function(String id)
    {  //利用throws关键字声明该方法可能出现异常IllegalArgumentException
        /********** Begin *********/
        if (id.length() == 7)
        {
            //输出ID合法时的语句
            System.out.println("ID格式正确：" + id);
        }
        else
        {
            //利用throw关键字抛出异常IllegalArgumentException
            throw new IllegalArgumentException();
        }
        /********** End *********/
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        try
        {
            function(id);
        }
        catch (IllegalArgumentException e)
        {
            /********** Begin *********/
            //输出ID不合法时的语句
            System.out.println("ID长度应为7");

            /********** End *********/
        }
    }
}
