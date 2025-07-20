package Lec24;
import java.util.Stack;
public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<>();
System.out.println(st.capacity());
//add
st.push(10);
st.push(20);
st.push(1);
System.out.println(st.size());
//stack ki default capacity 10 hoti hai to hum use 
//change nhi kar sakte but arraylist ka default change kr sakte hai
// ArrayList<Integer> ll=new ArrayList<>(100);

//view
System.out.println(st.peek());
//remove
System.out.println(st.pop());
System.out.println(st);
System.out.println(st.isEmpty());
	}

}
