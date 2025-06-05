package runner;

import org.testng.TestNG;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

public class TestNGRunner {
    public static void main(String[] args) throws IOException {

        System.out.println("CLASSPATH: " + System.getProperty("java.class.path"));

        InputStream input = TestNGRunner.class.getClassLoader().getResourceAsStream("testng.xml");

        if (input == null) {
            throw new RuntimeException("testng.xml not found in classpath");
        }

        File xmlFile = File.createTempFile("testng", ".xml");
        Files.copy(input, xmlFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList(xmlFile.getAbsolutePath()));
        testng.run();


//java -jar ContinousIntegration-1.0-SNAPSHOT-jar-with-dependencies.jar
        //java -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
        //java -cp ContinousIntegration-1.0-SNAPSHOT-tests.jar Demo.TestCaseUI
        //java -Denvironment=RT -DgroupName=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
        //java -Denvironment=RT -DgroupToRun=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
        //java -Denvironment=RT -DmethodName=Test1 -jar ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar
    }
}
