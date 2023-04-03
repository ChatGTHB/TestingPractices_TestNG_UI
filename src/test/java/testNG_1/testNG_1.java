package testNG_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNG_1 {
    @Test
    public void WebStudentLogin()
    {
        System.out.println("Student login through web");
    }

    @Test
    public void MobileStudentLogin()
    {
        System.out.println("Student login through mobile");
    }

    // depends onmethods
    @Test(dependsOnMethods= {"testcase2","testcase3"})
    public void testcase1()
    {
        System.out.println("This is test case1");
    }

    @Test
    public void testcase2()
    {
        System.out.println("This is test case2");
    }

    @Test
    public void testcase3()

    {
        System.out.println("This is test case3");
    }


    //priority
    @Test
    public void mango()
    {
        System.out.println("I am Mango");
    }

    @Test(priority=2)
    public void apple()

    {
        System.out.println("I am Apple");
    }
    @Test(priority=1)
    public void watermelon()

    {
        System.out.println("I am Watermelon");
    }


    // enabled

    @Test
    public void c_language()
    {
        System.out.println("C language");
    }

    @Test(enabled=false)
    public void jira()
    {
        System.out.println("JIRA is a testing tool");
    }
    @Test

    public void java()
    {
        System.out.println("JAVA language");
    }

    //   assertions

    @Test
    public void testCase()
    {
        String text1="java bir programlama dilidir";
        String text2="java bir programlama dilidir";
        Assert.assertTrue(text2==text2);
    }

    @Test(priority = 0)
    public void testCaseOne()
    {
        String str1 = "Hello";
        String str2 = "Hello";

        Assert.assertSame(str1, str2, "Contents are not Same");
        System.out.println("Test case one passed successfully");
    }
    @Test(priority = 1)
    public void testCaseTwo()
    {
        String s1 = "Java";
        String s2 = new String("Java");

        Assert.assertEquals(s1, s2, "Contents are not same");
        System.out.println("Test case two passed successfully");
    }
    @Test(priority = 2)
    public void testCaseThree()
    {
        String s1 = "Java";
        String s2 = new String("Java");

        Assert.assertSame(s1, s2, "Address of both string objects are not same");
        System.out.println("Test case three passed successfully");
    }

}
