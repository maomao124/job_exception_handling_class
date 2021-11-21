import t1.ThrowException;
import t2.CatchException;
import t3.MyExceptionTest;

/**
 * Project name(项目名称)：作业_异常处理类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/21
 * Time(创建时间)： 21:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        System.out.println("t1:");
        ThrowException.main(null);
        System.out.println();
        System.out.println("t2:");
        CatchException.main(null);
        System.out.println();
        System.out.println("t3:");
        MyExceptionTest.main(null);
    }
}
