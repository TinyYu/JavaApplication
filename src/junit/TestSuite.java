package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 多个测试
 **/
@RunWith(Suite.class)
@Suite.SuiteClasses({TestJunit_2.class, TestJunit_3.class})
public class TestSuite {

} 
