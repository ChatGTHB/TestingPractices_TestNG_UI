package _02_PrioritySorting;

import org.testng.annotations.Test;

public class TestNGPrioritySorting {

    @Test(priority = 1)
    public void testMethodOne(){
        System.out.println("TestNG Method One - Priority 1");
    }

    @Test(priority = 2)
    public void testMethodTwo(){
        System.out.println("TestNG Method Two - Priority 2");
    }

    @Test
    public void testMethodThree(){
        System.out.println("TestNG Method Three - Priority Yok");

    }

    @Test(priority = 3)
    public void testMethodFour(){
        System.out.println("TestNG Method Four - Priority 3");
    }

    @Test
    public void testMethodFive(){
        System.out.println("TestNG Method Five - Priority Yok");
    }
}
