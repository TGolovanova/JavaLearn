import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTests {

    @DataProvider
    public Object[][] testPositiveComps() {
        return new Object[][]{
                {500, 200, 300},
                {-1523, -1546, 23},
                {0, -15, 15}
        };
    }

    @DataProvider
    public Object[][] testPositiveMul() {
        return new Object[][]{
                {56, 7, 8},
                {-205, -5, 41},
                {0, 0, 2}
        };
    }

    @DataProvider
    public Object[][] testNegative() {
        return new Object[][]{
                {"one", -1, 2},
                {"null", -5, 5},
                {-4, 2, "two"}
        };
    }

    @DataProvider
    public Object[][] testNull() {
        return new Object[][]{
                {0, -1000, 2},
                {0, -5, 5000},
                {0, 2, 8830}
        };
    }

    @DataProvider
    public Object[][] testBorders() {
        return new Object[][]{
                {Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 1},
                {Integer.MIN_VALUE, Integer.MIN_VALUE, 0},
                {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, -1},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
    }

    @Test(dataProvider = "testPositiveComps")
    public void positiveOne(int one, int two, int three) {
        Assert.assertEquals(one, new Execute().sumResult(two, three), "Значения должны быть равны!");
    }

    @Test(dataProvider = "testPositiveComps")
    public void positiveTwo(int one, int two, int three) {
        Assert.assertEquals(two, new Execute().subResult(one, three), "Значения должны быть равны!");
    }

    @Test(dataProvider = "testPositiveMul")
    public void positiveFour(int one, int two, int three) {
        Assert.assertEquals(one, new Execute().multiResult(two, three), "Значения должны быть равны!");
    }

    @Test(dataProvider = "testPositiveMul")
    public void positiveFive(double one, double two, double three) {
        Assert.assertEquals(two, new Execute().divResult(one, three), "Значения должны быть равны!");
    }

    @Test(dataProvider = "testPositiveComps")
    public void testNegativeOne(int one, int two, int three) {
        Assert.assertNotEquals(two, new Execute().sumResult(one, three), "Значения не должны быть равны!");
    }

    @Test(dataProvider = "testNegative", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void testNegativeTwo(Object one, Object two, Object three) {
        Assert.assertNotEquals(two, new Execute().sumResult(one, three), "Можно вводить только числовые значения!");
    }

    @Test(dataProvider = "testPositiveComps")
    public void testNegativeThree(int one, int two, int three) {
        Assert.assertNotEquals(one, new Execute().subResult(two, three), "Значения не должны быть равны!");
    }

    @Test(dataProvider = "testNegative", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void testNegativeFour(Object one, Object two, Object three) {
        Assert.assertNotEquals(two, new Execute().subResult(one, three), "Можно вводить только числовые значения!");
    }

    @Test(dataProvider = "testPositiveMul")
    public void testNegativeFive(int one, int two, int three) {
        Assert.assertNotEquals(three, new Execute().multiResult(one, two), "Значения не должны быть равны!");
    }

    @Test(dataProvider = "testNegative", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void testNegativeSix(Object one, Object two, Object three) {
        Assert.assertNotEquals(two, new Execute().multiResult(one, three), "Можно вводить только числовые значения!");
    }

    @Test(dataProvider = "testNegative", expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void testNegativeSeven(Object one, Object two, Object three) {
        Assert.assertNotEquals(two, new Execute().multiResult(one, three), "Можно вводить только числовые значения!");
    }

    @Test(dataProvider = "testNull")
    public void testNegativeEight(Object one, Object two, Object three) {
        Assert.assertNotEquals(two, new Execute().multiResult(three, one), "На ноль делить нельзя!");
    }

    @Test(dataProvider = "testBorders")
    public void testBordersOne(Object one, Object two,Object three) {
        Assert.assertNotEquals(two, new Execute().multiResult(one, three), "Значения должны быть равны");
    }

}
