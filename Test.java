package L1;

/**
 * @Abdulrahman
 */

public class Test_Singly_Linked_list {
public static void main(String[] args) {

Singly_Linked_list L1 =new Singly_Linked_list("two");


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

/*
output:

Deleted Successfully! (five)
predecessor: half , Element: one , Successor: two
----------------------------
[ ~ [ Zero ] ~~ [ half ] ~~ [ one ] ~~ [ two ] ~~ [ three ] ~~ [ four ] ~ ]
 Length: 6 

*/  

}    
}
