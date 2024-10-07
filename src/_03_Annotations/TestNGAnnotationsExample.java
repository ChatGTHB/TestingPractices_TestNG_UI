package _03_Annotations;

import org.testng.annotations.*;

public class TestNGAnnotationsExample {

    /**
     * @BeforeSuite
        * @BeforeTest
             * @BeforeGroups
                * @BeforeClass
                  * @BeforeMethod
                            * @Test
                            * @Test
                  * @AfterMethod
                 * @AfterClass
             * @AfterGroups
         * @AfterTest
     * @AfterSuit
     */


    @BeforeSuite
     public void BeforeSuite(){
        System.out.println("BeforeSuite calisti");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest calisti");
    }
    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("BeforeGroups calisti");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass calisti");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod calisti");
    }
    @Test
    public void Test1(){
        System.out.println("Test1 calisti");
    }
    @Test
    public void Test2(){
        System.out.println("Test2 calisti");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod calisti");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass calisti");
    }
    @AfterGroups
    public void AfterGroups(){
        System.out.println("AfterGroups calisti");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest calisti");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite calisti");
    }
}
