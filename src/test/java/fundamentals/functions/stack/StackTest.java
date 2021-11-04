package fundamentals.functions.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = BoundedStack.Make(2);
    }

    @Test
    public void newlyCreatedStack_ShouldBeEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void AfterOnePush_StackSizeShouldBeOne() throws Exception {
        stack.push(1);
        assertEquals(1, stack.getSize());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_StackShouldBeEmpty() throws Exception {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test(expected = BoundedStack.OverFlow.class)
    public void WhenPushedBeyondTheStackSize_StackOverFlowError() throws Exception {
        stack.push(1);
        stack.push(1);
        stack.push(1);
    }

    @Test(expected = BoundedStack.UnderFlow.class)
    public void WhenEmptyStackIsPopped_ShouldThrowStackUnderFlow() throws Exception {
        stack = BoundedStack.Make(0);
        stack.pop();
    }

    @Test
    public void WhenOneIsPushed_OneIsPopped() throws Exception {
        stack.push(1);
        assertEquals(1, stack.pop());

    }

    @Test
    public void WhenOneAndTwoArePushed_TwoAndOneArePushed() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test(expected = BoundedStack.IllegalCapacity.class)
    public void WhenCreateAStackWithNegativeSize_ShouldThrowIllegalCapacity() throws Exception {
        BoundedStack.Make(-1);
    }

    @Test(expected = BoundedStack.OverFlow.class)
    public void WhenCreateStackWithZeroCapacity_PushThrowsOverFlowException() throws Exception {
        stack = BoundedStack.Make(0);
        stack.push(1);
    }

    @Test(expected = BoundedStack.UnderFlow.class)
    public void WhenCreateStackWithZeroCapacity_PopThrowsUnderFlowException() throws Exception {
        stack = BoundedStack.Make(0);
        stack.pop();
    }

    @Test(expected = BoundedStack.ZeroCapacityAccess.class)
    public void WhenCreateStackWithZeroCapacity_TopThrowsZeroCapacityAccessException() throws Exception {
        stack = BoundedStack.Make(0);
        stack.top();
    }

    @Test(expected = Stack.ZeroCapacityAccess.class)
    public void whenZeroCapacityStack_findThrowsZeroCapacityAccess() throws Exception {
        stack = BoundedStack.Make(0);
        stack.find(1);
    }

    @Test
    public void whenOneIsPushed_ThenOneIsOnTop() throws Exception {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    public void whenOneAndTwoArePushedThenTwoPushed_ThenOneIsOnTop() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.top());

    }

    @Test
    public void whenOneAndTwoArePushed_find2Return1() throws Exception {
        stack.push(1);
        stack.push(3);
        assertEquals(1, stack.find(3));
        assertEquals(0, stack.find(1));
    }

    @Test(expected = Stack.ElementNotFoundException.class)
    public void whenFindElementThatDoesntExist_ThrowsElementNotFoundException() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.find(4);
    }

}
