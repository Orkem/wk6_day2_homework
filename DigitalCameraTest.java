import static org.junit.Assert.*;
import org.junit.*;

public class DigitalCameraTest{
  DigitalCamera dcamera;

  @Before
  public void before(){
    dcamera = new DigitalCamera("Nikon 34T", "Noise reduction filter","Hi-resolution");
  }

  @Test
  public void testCanPrintDetails(){
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution", dcamera.printDetails());
  }
}