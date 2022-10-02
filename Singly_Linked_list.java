package L1;
/**
 * @Abdulrahman
 */
public class Singly_Linked_list <T>{
    
Node head ;
Node tail ;
int len = 0;// List length

public Singly_Linked_list(){}

public Singly_Linked_list(T value) {
    
 Node temp = new Node(value); 
     temp.next = null ; 
     head = tail = temp;
 len++;
 
}


public boolean Is_empty(){
   return (head == null);
}


//Add Methods
    
public void add_frist(T value){//Before head  
     Node temp = new Node(value); 
     
      if(Is_empty()){  
    head = tail = temp;
   }else{    
     temp.next = head ;
     head = temp;
   len++;
      }
  } 

    
    
    
public void add_last(T value){ // After tail
     Node temp = new Node(value); 
     temp.next = null ; 

     
     if(Is_empty()){ 
     head = tail = temp;
 }
 else{
     tail.next = temp;
     tail = temp;
 }
       len++;
}
    
    
    
    
    
public void AddAfter(T insertAfter, T value) {
    Node newNode = new Node(value);
    Node current = head;
    
    if(Is_empty()) {
        head = newNode;
    }
    else {
        while(current != null && current.value != insertAfter) {
            current = current.next;
        }
        if(current != null) {
            newNode.next = current.next;
            current.next = newNode;

     }
    }
    
    len++;
   }
 


//Delete Methods 
    
  public void Delete_frist(){
      if(Is_empty()){  
    System.out.println("Not Deleted, Linked List is empty");
      }
      else{
  System.out.println("Deleted Successfully! ("+head.value+")");        
  head = head.next;
  len--;
      }
  }
  
    
    
 public void Delete_Last(){
     
     if(Is_empty()){  
    System.out.println("Not Deleted, Linked List is empty");
      }else{
     
Node current = head;
while (current.next.next != null) { 
current = current.next;
}
System.out.println("Deleted Successfully! ("+current.next.value+")");  
current.next = null;
current = tail;
len--;
}
     
}
 
    
    
 public void deleteT(T target){
       
     if (Is_empty()){
       System.out.println("Linked list is empty :("); 
    
        } else {  
 Node current = head;
 Node prev = null;
 
 while(current != null && ! current.value.equals(target)) {
   prev = current;
   current = current.next;
 }
 if(current == null)
 throw new IllegalArgumentException("Not found");
 
  if(current == head){
     head = current.next;
       }  
  
   else if(current == tail){
     prev.next = null;  
     tail = prev;
   }
   else
     prev.next = current.next;
       
System.out.println("Deleted Successfully! ("+current.value+")"); 
current = prev = null;
len--;    
 }
    
} 
  
 
 
public int getLength(){
return len;
} 


    
  public void display() {
    
      System.out.print("[ ");
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print("~ [ "+temp.value+" ] ~");
}
       System.out.print(" ]\n Length: "+getLength()+" \n");
      
} 
  
  
    
public void displayPreSucc(T value) { 
Node current = head; 
Node s = null;
Node p = null;

if (current.value == value) { 
s = current.next;
} else
while (current != null && current.value != value) { 
p = current;
s = current.next.next; 
current = current.next;
}
if (p != null && s != null)
System.out.println("predecessor: "+p.value + " , Element: " + current.value + " , Successor: " + s.value);
else if (p == null && s != null) 
System.out.println("Element: " +current.value + ", Successor: " + s.value);
else if (p != null && s == null) 
System.out.println("predecessor: "+p.value + ", Element: " + current.value);
else
System.out.println("Element: "+current.value);
}
  
  
}
