package Pages;
import org.testng.Assert;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

class CompareUtil {
    public enum Result { Matched, SizeMismatch, PixelMismatch }
    static Result CompareImage(String baseFile, String actualFile) {
        Result compareResult = Result.PixelMismatch;
        Image baseImage = Toolkit.getDefaultToolkit().getImage(baseFile);
        Image actualImage = Toolkit.getDefaultToolkit().
                getImage(actualFile);
        try {
            PixelGrabber baseImageGrab = new PixelGrabber(baseImage, 0, 0, -1, -1, false);
            PixelGrabber actualImageGrab = new PixelGrabber(actualImage, 0, 0, -1, -1, false);
            int[] baseImageData = null;
            int[] actualImageData = null;
            if(baseImageGrab.grabPixels()) {
                baseImageData = (int[])baseImageGrab.getPixels();
            }
            if(actualImageGrab.grabPixels()) {
                actualImageData = (int[])actualImageGrab.getPixels();
            }
            System.out.println(baseImageGrab.getHeight() + "<--baseImage Height and  actualImage  Height-->" +actualImageGrab.getHeight());
            System.out.println(baseImageGrab.getWidth() + "<--baseImage Width and  actualImage  Width-->" +actualImageGrab.getWidth());
            if ((baseImageGrab.getHeight() != actualImageGrab.getHeight()) || (baseImageGrab.getWidth() != actualImageGrab.getWidth())){
                compareResult = Result.SizeMismatch;
                Assert.fail("Image Height or Width not same Test failed");
            }
            else if(java.util.Arrays.equals(baseImageData,actualImageData)){
                compareResult = Result.Matched;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return compareResult;
    }
}