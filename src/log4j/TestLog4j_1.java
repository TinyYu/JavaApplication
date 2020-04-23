package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 * 使用Log4j打印日志
 **/
public class TestLog4j_1 {
    //基于类的名称获取日志对象
    static Logger logger = Logger.getLogger(TestLog4j_1.class);
    public static void main(String[] args) throws InterruptedException{
        //进行默认配置
        BasicConfigurator.configure();

        //6个级别 TRACE DEBUG INFO WARN ERROR FATAL
        //只输出高于DEBUG级别的日志
        logger.setLevel(Level.DEBUG);

        //进行不同级别的日志输出
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        Thread.sleep(1000);
        logger.warn("告警信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
} 
