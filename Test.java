package L1;

/**
 * @Abdulrahman
 */

public class Test {
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