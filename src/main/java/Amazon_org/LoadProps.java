package Amazon_org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class LoadProps {
    public static String getProperty(String key) {
        Properties prop = new Properties();
        FileInputStream input;

        try {
            input = new FileInputStream("/home/poojan/IdeaProjects/Amazon/src/test/TestData/TestConfig.properties");

            prop.load(input);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static String getReportConfigPath() {
        String reportConfigPath = getProperty("reportConfigPath");
        if (reportConfigPath != null)
            return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}
