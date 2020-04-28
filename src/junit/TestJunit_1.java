package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * 使用junit测试框架
 *
 * 好处：
 * 1. 新增加的测试，对原来的测试没有影响
 * 2. 如果测试失败了，会立即得到通知
 **/
public class TestJunit_1 {
    //表示这个方法是一个测试方法
    @Test
    public void testSum1(){
        int result = SumUtil.sum(1,2,3);
        //Assert.assertEquals(result, 6); 表示对 result 数值的期待是 6，如果是其他数值，就无法通过测试。
        Assert.assertEquals(result,6);
    }
} 
