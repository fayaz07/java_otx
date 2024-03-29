import java.lang.Iterable;
import java.util.*;

interface Stack <Item>
{
    Item getTop(); 
    Item pop(); 
    void push(Item itm); 
    boolean isEmpty(); 
    int size();  
}

class ArrayStack <Item> implements Stack <Item>
{
    private Item container[];
    private int top;
    private final static int DEFAULT_SIZE = 10;
 
    public ArrayStack ()
    {
        this(DEFAULT_SIZE);
    }
 
    public ArrayStack (int initSize)
    {
        container = (Item[]) new Object [initSize];
        top = -1;
    }
 
    public Item getTop()
    {
        if (top == -1)
            return null;
        return container[top];
    }
 
    public boolean isEmpty()
    {
        return (top == -1);
    }
 
    public Item pop()
    {
        if (top == -1)
            return null;
 
        Item itm = container[top];
        container[top--] = null;
 
        if(top > 0 && top == container.length / 4)
           resize (container.length/2);
 
        return itm;
    }
 
    public void push(Item itm)
    {		
        if (top == container.length - 1)
            resize(2 * container.length);
 
        container[++top] = itm;
    }
 
    public int size()
    {
        return (top + 1);
    }
 
    private void resize (int newSize)
    {
        Item t[] = (Item[]) new Object[newSize];
        for (int i = 0; i <= top; i++)
            t[i] = container[i];
        container = t;
    }
 
    public Iterator<Item> iterator()
    {
        return new ArrayStackIterator();
    }
 
    private class ArrayStackIterator implements Iterator <Item>
    {
        private int i = top;
 
        public boolean hasNext()
        {
            return (i > -1);
        }
 
        public Item next()
        {
            return container[i--];
        }
 
        public void remove()
        {
           // not needed
        }
    }
}

public class StackGenerics
{
  public static void main (String a[])
  {
    Stack <Integer> s = new ArrayStack<Integer>();
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.push(70);
 
    System.out.println("Size of the stack: " + s.size());
 
    // iterate through stack
    System.out.println("Following items pushed to Stack as of now:");
    for (Integer i : s)
      System.out.println(i);	
  }
}
