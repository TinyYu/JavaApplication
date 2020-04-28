package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * 使用xml文件
 **/
public class TestLog4j_3 {
    static Logger logger = Logger.getLogger(TestLog4j_3.class);
    public static void main(String[] args) {
       DOMConfigurator.configure("F:\\java\\JavaApplication\\src\\log4j\\log4j.xml");
        for (int i = 0;i < 500;i++){
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
} 
