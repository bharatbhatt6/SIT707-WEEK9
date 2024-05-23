package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testTrueAdd() {
        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), Double.valueOf(3));
    }

    @Test
    public void testAddNumberEmpty() {
        Assert.assertNull(MathQuestionService.q1Addition("", "2"));
        Assert.assertNull(MathQuestionService.q1Addition("1", ""));
        Assert.assertNull(MathQuestionService.q1Addition("", ""));
    }

    @Test
    public void testAddInvalidNumber() {
        Assert.assertNull(MathQuestionService.q1Addition("a", "2"));
        Assert.assertNull(MathQuestionService.q1Addition("1", "b"));
        Assert.assertNull(MathQuestionService.q1Addition("a", "b"));
    }

    @Test
    public void testTrueSubtraction() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("5", "3"), Double.valueOf(2));
    }

    @Test
    public void testSubtractionNumberEmpty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("", "3"));
        Assert.assertNull(MathQuestionService.q2Subtraction("5", ""));
        Assert.assertNull(MathQuestionService.q2Subtraction("", ""));
    }

    @Test
    public void testSubtractionInvalidNumber() {
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "3"));
        Assert.assertNull(MathQuestionService.q2Subtraction("5", "b"));
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "b"));
    }

    @Test
    public void testTrueMultiplication() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"), Double.valueOf(6));
    }

    @Test
    public void testMultiplicationNumberEmpty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", "3"));
        Assert.assertNull(MathQuestionService.q3Multiplication("2", ""));
        Assert.assertNull(MathQuestionService.q3Multiplication("", ""));
    }

    @Test
    public void testMultiplicationInvalidNumber() {
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "3"));
        Assert.assertNull(MathQuestionService.q3Multiplication("2", "b"));
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "b"));
    }
}
