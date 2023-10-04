import org.example.Factorial;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();
    @DataProvider(name = "Factorial Data")
    public  Object [][] myData(){
        return  new  Object[][]{
                {2,2},
                {5,120},
                {2,20},
                {5,67},
                {6,720},
                {4,24},
                {10,3628800},
                {8,63},
                {8,85},







        };
    }
    @Test(dataProvider = "Factorial Data")
    public void testFact(int num , int expected){
        int fact = factorial.getfactorial(num);
        Assert.assertEquals(fact,expected);
    }
}
