package L2;

/**
 * @Abdulrahman
 */

public class Test {   
public static void main(String[] args) {
      
//Test        
Doubly_Linked_list l = new Doubly_Linked_list("Zero");    
l.add_last("One");
l.add_last("Two");
l.add_last("Three");
l.AddAfter("Zero","half");
l.add_last("four");
l.add_last("five");

l.display();// head to tail 
l.Delete_frist();
l.Delete_Last();
l.DeleteT("Two");
l.displayPreSucc("One");
l.display(2);// tail to head 

/*
output:

[ ~[Zero]~~[half]~~[One]~~[Two]~~[Three]~~[four]~~[five]~ ]
Length: 7 
Deleted Successfully! (Zero)
Deleted Successfully! (five)
Deleted Successfully! (Two)
predecessor: half , Element: One , Successor: Three
[ ~[four]~~[Three]~~[One]~~[half]~ ]
Length: 4 
*/  
  
  
}
}
