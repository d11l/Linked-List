package aads_1;

import java.util.LinkedList;

/**
 * @Abdulrahman
 */

public class Arrayss {
public static void main(String[] args) {

Linked_list L1 =new Linked_list("two");


L1.add_last("three");    
L1.add_frist("one");
L1.add_frist("Zero");
L1.add_last("four");
L1.add_last("five");

//
//L1.Delete_frist();
//L1.Delete_Last();
L1.deleteT("five");
L1.AddAfter("Zero", "half");
L1.displayPreSucc("one");

System.out.println("----------------------------");
L1.display();



}    
}



    

//Dynamic Array
/*
 DynamicArray <Integer> arr = new DynamicArray <Integer>();
 arr.add(4);
 arr.add(4);
 arr.add(4);
 arr.add(4);
 System.out.println(arr.getlen()); */

//--------------------------------------------------

// Linked list
/*

Linked_list L1 =new Linked_list(); //new node and has val=12 and next =null   


L1.add_last(2);    
L1.add_last(3);
//System.out.println(L1.is_empty());
//L1.Display();
L1.add_frist(1);
//System.err.println("--------");
L1.display();
*/

//--------------------------------------------------

//  Stack Array
/*

StackArray<Integer> st1= new StackArray<Integer>(5);

st1.push(10);
st1.push(20);
st1.push(30);
st1.push(40);
st1.push(50);


System.out.println(st1.pop());
System.out.println(st1.pop());
System.out.println(st1.pop());
System.out.println(st1.pop());
System.out.println(st1.pop());

*/

//--------------------------------------------------

// Stack Array Dynamic

/*
StackArray_Dynamic<Integer> st2= new StackArray_Dynamic<Integer>(3);

st2.push(10);
st2.push(20);
st2.push(30);
System.out.println("Size: "+st2.ArrayStack.length);
st2.push(30);
System.out.println("Size: "+st2.ArrayStack.length);
st2.pop();
st2.pop();
st2.pop();
st2.pop();
System.out.println("Size: "+st2.ArrayStack.length);
*/


// Stack JAVA
/*Stack<Integer> st2= new Stack<Integer>();

st2.push(10);
st2.push(20);
st2.push(30);
System.out.println("Size: "+st2.peek());
*/