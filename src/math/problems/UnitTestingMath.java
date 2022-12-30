package math.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


            Factorial f = new Factorial();
            Assert.assertEquals(120,120);

            LowestNumber l = new LowestNumber();
            Assert.assertEquals(5,5);

            FindMissingNumber m = new FindMissingNumber();
            Assert.assertEquals(9,9);

            FindLowestDifference d = new FindLowestDifference();
            Assert.assertEquals(1,1);

    }
}
