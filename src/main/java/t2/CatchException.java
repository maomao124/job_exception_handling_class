package t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project name(项目名称)：作业_异常处理类
 * Package(包名): t2
 * Class(类名): CatchException
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/21
 * Time(创建时间)： 21:41
 * Version(版本): 1.0
 * Description(描述)：
 * 从命令行输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 输出格式参见测试样例。
 * 测试说明
 * 平台将自动编译补全后的代码，并生成若干组测试数据，接着根据程序的输出判断程序是否正确。
 * <p>
 * 以下是测试样例：
 * <p>
 * 测试输入：abc123###
 * 测试输出：letter=3,space=0,number=3,other=3
 * <p>
 * 测试输入：777783 34 @ %( sds
 * 测试输出：letter=3,space=4,number=8,other=3
 */

public class CatchException
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        /********** Begin *********/
        //补全try/catch块，异常类型为IOException
        try
        {
            str = reader.readLine();
            char c;
            int letter = 0;
            int space = 0;
            int number = 0;
            int other = 0;
            for (int i = 0; i < str.length(); i++)
            {
                c = str.charAt(i);
                if (Character.isLetter(c))
                {
                    letter++;
                }
                else if (Character.isSpaceChar(c))
                {
                    space++;
                }
                else if (Character.isDigit(c))
                {
                    number++;
                }
                else
                {
                    other++;
                }
            }
            System.out.println("letter=" + letter + ",space=" + space + ",number=" + number + ",other=" + other);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        /********** End *********/
    }
}
