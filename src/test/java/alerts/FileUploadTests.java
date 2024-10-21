package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
       var uploadPage = homePage.clickFileUploadLink();
       uploadPage.uploadFile("C:\\Week15\\Selenium\\resources\\testFile.txt.txt");
        Assert.assertEquals(uploadPage.getUploadedFiles(),"testFile.txt.txt");
    }
}
