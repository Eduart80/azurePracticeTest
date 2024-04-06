import app.mathFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testApp {
    @Test
    public void testingOne(){
        Assert.assertEquals(5,5);
    }
    @Test
    public void mathTest1(){
        mathFile mt = new mathFile();
       int res = mt.adding(2,2);
        System.out.println("Res add: "+res );
    }
    @Test
    public void mathTest2(){
        mathFile mt = new mathFile();
       int res = mt.subtract(3,2);
        System.out.println("Res sub: "+res );
    }
}
