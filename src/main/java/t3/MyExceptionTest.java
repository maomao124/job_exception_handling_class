package t3;

import java.util.Scanner;

/**
 * Project name(项目名称)：作业_异常处理类
 * Package(包名): t3
 * Class(类名): MyException
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/21
 * Time(创建时间)： 21:53
 * Version(版本): 1.0
 * Description(描述)：
 * num变量为命令行输入的int型数据，若num为正数，输出The number you entered is： + num；反之捕获该异常。
 * 测试说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 样例输入：-60
 * 样例输出：chapter8.step3.MyException: Number cannot be negative!
 * <p>
 * 样例输入：60
 * 样例输出：The number you entered is: 60
 */

class MyException extends Exception
{
    public MyException(String m)
    {
        super(m);
    }
}

public class MyExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            /********** Begin *********/
            if (num > 0)
            {
                System.out.println("The number you entered is: " + num);
            }
            else
            {
                throw new MyException("Number cannot be negative!");
            }

            /********** End *********/
        }
        catch (MyException e)
        {
            System.out.print(e);
        }
    }
}