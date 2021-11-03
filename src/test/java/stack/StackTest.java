package stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = Stack.Make(2);
    }

    @Test
    public void newlyCreatedStack_ShouldBeEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        assertEquals(0,stack.getSize());
    }

    @Test
    public void AfterOnePush_StackSizeShouldBeOne() throws Exception {
        stack.push(1);
        assertEquals(1,stack.getSize());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_StackShouldBeEmpty() throws Exception {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test(expected = Stack.OverFlow.class)
    public void WhenPushedBeyondTheStackSize_StackOverFlowError() throws Exception {
        stack.push(1);
        stack.push(1);
        stack.push(1);
    }

    @Test(expected = Stack.UnderFlow.class)
    public void WhenEmptyStackIsPopped_ShouldThrowStackUnderFlow() throws Exception {
        stack = Stack.Make(0);
        stack.pop();
    }

    @Test
    public void WhenOneIsPushed_OneIsPopped() throws Exception {
        stack.push(1);
        assertEquals(1,stack.pop());

    }

    @Test
    public void WhenOneAndTwoArePushed_TwoAndOneArePushed() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2,stack.pop());
        assertEquals(1,stack.pop());
    }

    @Test(expected = Stack.IllegalCapacity.class)
    public void WhenCreateAStackWithNegativeSize_ShouldThrowIllegalCapacity() throws Exception {
        Stack.Make(-1);
    }

}
