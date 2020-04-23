package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 配置
 **/
public class TestLog4j_2 {
    static Logger logger = Logger.getLogger(TestLog4j_2.class);
    public static void main(String[] args) {
        PropertyConfigurator.configure("F:\\java\\JavaApplication\\src\\log4j\\log4j.properties");
        for (int i = 0;i < 5000;i++){
            logger.trace("跟踪信息");
            logger.debug("调式信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
} 
