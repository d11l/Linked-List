package aads_1;
/**
 * @Abdulrahman
 */
public class Linked_list <T>{
    
Node head ;//Frist
Node tail ;//End 
int len = 0;// List length

public Linked_list(){}

public Linked_list(T value) {
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
current = prev =null;
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
  
  



public void union(Linked_list set2) { 

if (set2.head == null) { 
display();
return;
}
if (head == null) { 
set2.display(); 
return;
}

Node current = head;
while (current.next != null) { 
current = current.next;
}
current.next = set2.head;

Node ptr1 = null, ptr2 = null, dup = null; 
ptr1 = head;

while (ptr1 != null && ptr1.next != null) { 
ptr2 = ptr1;

while (ptr2.next != null) {

if (ptr1.value == ptr2.next.value) {

dup = ptr2.next;
ptr2.next = ptr2.next.next; 
System.gc();
} else{ 
ptr2 = ptr2.next;
}
}
ptr1 = ptr1.next;
}
display();

}


void intersection(Linked_list set2) { 
Node set1Cur;
Node set2Cur;
Linked_list addset = new Linked_list();
for (set1Cur = head; set1Cur != null; set1Cur = set1Cur.next) { 
for (set2Cur = set2.head; set2Cur != null; set2Cur = set2Cur.next) 
if (set1Cur.value == set2Cur.value) { 
addset.add_frist(set1Cur.value);
}
}
addset.display();

}
  

}