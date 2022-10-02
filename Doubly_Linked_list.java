package L2;

/**
 * @Abdulrahman
 */

public class Doubly_Linked_list <T>{    


DNode head = null ;   
DNode tail = null;
int len = 0;

public Doubly_Linked_list(){}
public Doubly_Linked_list(T value) {
 DNode temp = new DNode(value); 
     temp.next = null ; 
     head = tail = temp;
 len++; 
}



//Add Methods

public void add_frist(T value){// Before head  
     DNode temp = new DNode(value); 
     
      if(Is_empty()){  
    head = tail = temp;
   }else{    
     temp.next = head ;
     head = temp;
   len++;
      }
  } 

 public void add_last(T value){// After tail
  
        DNode newNode = new DNode(value);  

        if(head == null) {  
            head = tail = newNode;  
           
            head.prevous = tail.next = null;  
        }  
        else{  
            tail.next = newNode;   
            newNode.prevous = tail;  
            tail = newNode;  
            tail.next = null;  
    }
           len++; 
}


 
   public void AddAfter(T insertAfter, T value) {
    DNode newNode = new DNode(value);
    DNode current = head;
    
    if(head == null) {
        head = newNode;
    }
    else {
        while(current != null && !current.value.equals(insertAfter)) {
            
             current = current.next;
        }
        
        if(current != null) {
            newNode.next = current.next;
            newNode.prevous = current;
            newNode.next.prevous = newNode;
            current.next = newNode;
            len++;
     }
        else
             throw new IllegalArgumentException("Not found");
    }
    
 
   } 
 
   
   
   //Delete Methods 
   public void Delete_frist(){
   
      if(Is_empty()){
      System.out.println("Linked list is empty :("); 
      
        }else{   
         DNode current = head;  
          System.out.println("Deleted Successfully! ("+head.value+")");    
         head = current.next; 
         head.prevous = null;
         len--;
        }
   }
   
    public void Delete_Last(){
   
         if (Is_empty()){
       System.out.println("Linked list is empty :("); 
        } else {  
          System.out.println("Deleted Successfully! ("+tail.value+")");       
          tail = tail.prevous;  
          tail.next = null;
          len--;
         }
        
   
   }
   
     public void DeleteT(T target){
  
        if (Is_empty()){
       System.out.println("Linked list is empty :("); 

        } else {  
            
            DNode current = head;  
  
            while(current != null){ 
                current = current.next;
               if(current.value == target)
               break;  
            }  
  
            if(current == head) {
                head = current.next;  
            }  
             else if(current == tail) {  
                tail = tail.prevous;  
            }  
            else {  
                current.prevous.next = current.next;  
                current.next.prevous = current.prevous;  
            }  
               len--;
             System.out.println("Deleted Successfully! ("+current.value+")");      
             current = null;  
     
        }  
  }
     
     
     
     
       
   public void display(){ 
  
       display(1);
    
   }  
 
   
   public void display(int choice){ // If choice 1 will print from head to tail And 2 Inverse 

        DNode current = head;  
        if(head == null) {  
            System.out.println("Linked list is empty :(");  
            return;  
        }
        System.out.print("[ ");  
        if(choice  == 1){
        while(current != null) {  
            System.out.print("~["+current.value + "]~");  
            current = current.next;  
         }
       }else{
        current = tail;
         while(current != null) {  
           System.out.print("~["+current.value + "]~");  
            current = current.prevous;  
        } }
            System.out.print(" ]\nLength: "+getLength()+" \n");        
        
}

   
public void displayPreSucc(T value) { 

     if(head == null) {  
            System.out.println("Linked list is empty :(");  
            return;  
        }
    
    
    DNode current = head; 

if (current.value != value) 
while (current != null && current.value != value) { 
current = current.next;
}

if (current.prevous != null && current.next != null)
System.out.println("predecessor: "+current.prevous.value + " , Element: " + current.value + " , Successor: " + current.next.value);
else if (current.prevous == null && current.next != null) 
System.out.println("Element: " +current.value + ", Successor: " + current.next.value);
else if (current.prevous != null && current.next == null) 
System.out.println("predecessor: "+current.prevous.value + ", Element: " + current.value);
else
System.out.println("Element: "+current.value);
}   
 
    

public boolean Is_empty(){
    return (head == null);
}

public int getLength(){
return len;
} 



  
  
}
