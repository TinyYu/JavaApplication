package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * before & after
 * @Before @After 也是常见的测试框架注解，分别用来在测试开始之前做的事情，和结束之后做的事情。
 **/
public class TestJunit_3 {
    @Before
    public void before(){
        System.out.println("测试前的准备工作");
    }

    @After
    public void after(){
        System.out.println("测试后的工作");
    }

    @Test
    public void testSum1(){
        int result = SumUtil.sum(1,2,3);
        Assert.assertEquals(result,6);
    }

    @Test
    public void testSum2(){
        int result = SumUtil.sum(1,2,3);
        Assert.assertEquals(result,5);
    }
} 
