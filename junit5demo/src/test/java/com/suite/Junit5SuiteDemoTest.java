package com.suite;

import com.testcaseinfo.testcase.Junit5DemoTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages(
//        {"com.testcaseinfo"}
//)
//@IncludePackages({
//        "com.testcaseinfo.testcase"})
@SelectClasses({
        Junit5DemoTest.class
})
@IncludeTags("测试方法二")
public class Junit5SuiteDemoTest {
}
