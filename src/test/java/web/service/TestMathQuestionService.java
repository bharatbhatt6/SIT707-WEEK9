package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testTrueAdd() {
        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), Double.valueOf(3));
    }

    @Test
    public void testAddNumber1Empty() {
        Assert.assertNull(MathQuestionService.q1Addition("", "2"));
    }

    @Test
    public void testAddNumber2Empty() {
        Assert.assertNull(MathQuestionService.q1Addition("1", ""));
    }

    @Test
    public void testAddBothNumbersEmpty() {
        Assert.assertNull(MathQuestionService.q1Addition("", ""));
    }

    @Test
    public void testAddInvalidNumber1() {
        Assert.assertNull(MathQuestionService.q1Addition("a", "2"));
    }

    @Test
    public void testAddInvalidNumber2() {
        Assert.assertNull(MathQuestionService.q1Addition("1", "b"));
    }

    @Test
    public void testAddBothNumbersInvalid() {
        Assert.assertNull(MathQuestionService.q1Addition("a", "b"));
    }

    @Test
    public void testTrueSubtraction() {
        Assert.assertEquals(MathQuestionService.q2Subtraction("5", "3"), Double.valueOf(2));
    }

    @Test
    public void testSubtractionNumber1Empty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("", "3"));
    }

    @Test
    public void testSubtractionNumber2Empty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("5", ""));
    }

    @Test
    public void testSubtractionBothNumbersEmpty() {
        Assert.assertNull(MathQuestionService.q2Subtraction("", ""));
    }

    @Test
    public void testSubtractionInvalidNumber1() {
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "3"));
    }

    @Test
    public void testSubtractionInvalidNumber2() {
        Assert.assertNull(MathQuestionService.q2Subtraction("5", "b"));
    }

    @Test
    public void testSubtractionBothNumbersInvalid() {
        Assert.assertNull(MathQuestionService.q2Subtraction("a", "b"));
    }

    @Test
    public void testTrueMultiplication() {
        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"), Double.valueOf(6));
    }

    @Test
    public void testMultiplicationNumber1Empty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", "3"));
    }

    @Test
    public void testMultiplicationNumber2Empty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("2", ""));
    }

    @Test
    public void testMultiplicationBothNumbersEmpty() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", ""));
    }

    @Test
    public void testMultiplicationInvalidNumber1() {
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "3"));
    }

    @Test
    public void testMultiplicationInvalidNumber2() {
        Assert.assertNull(MathQuestionService.q3Multiplication("2", "b"));
    }

    @Test
    public void testMultiplicationBothNumbersInvalid() {
        Assert.assertNull(MathQuestionService.q3Multiplication("a", "b"));
    }
}
