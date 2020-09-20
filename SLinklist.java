class Node{
	public int item;
	public Node next;
	
	Node(int item){
		this.item=item;
		this.next=null;
	}
}
public class SLinklist
{
	public	Node head;
	
	public boolean isEmpty()
	{
		return (head==null);
	}
	int count;
	public int Count()
	{
		Node current;
		current=head;
		
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void insertFirst(int x)
	{
		
		Node new_node=new Node(x);
		new_node.next=head;
		head=new_node;
	}
	public void insertLast(int x)
	{
		Node new_node=new Node(x);
		Node current;
		current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;
		current=new_node;
	}
	public void insertAny(int index,int x){
		Node current;
		current=head;
		if(index>Count())
		{
			System.out.println("Invalid index");
		}
		else if(index==1)
		{
			insertFirst(x);
		}
		else{	
			for(int i=1;i<index-1;i++)
			{
				current=current.next;
			}
			Node new_node=new Node(x);
			new_node.next=current.next;
			current.next=new_node;
		}
        		
		
	} 
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		head=head.next;
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else if(Count()==1)
		{
			head=null;
		}
		else{
			Node current;
			current=head;
			while(current.next.next!=null)
			{
				current=current.next;
			}
			current.next=null;
		}
	}
	public void deleteAny(int index){
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		if(index<Count())
		{
			Node current,previous;
			current=head;
			previous=current;
			for(int i=1;i<index;i++)
			{
				previous=current;
				current=current.next;
			}
			previous.next=current.next;
		}
		
	}
	public void printList(){
		Node current;
		current=head;
		while(current!=null)
		{
		System.out.print("["+current.item+"] "+" ");
			current=current.next;
			
		}
	}
	public static void main(String [] args){
		
		SLinklist list=new SLinklist();
		SLinklist list1=new SLinklist();
		list.insertFirst(4);
		list.insertFirst(10);
		list.insertFirst(21);
		list.insertFirst(40);
		list.insertLast(31);
		list.insertLast(50);
		list.insertLast(78);
		int x=list.Count();
		System.out.println("The nuber of nodes are here is :"+x);
		list.insertAny(2,3);
		list.insertAny(1,4);
		list.printList();
		System.out.println();
		list.deleteFirst();
		list.printList();
		System.out.println();
		list.deleteLast();
		
		list.printList();
		System.out.println();
		list1.insertFirst(4);
		
		list1.deleteLast();
		list1.printList();
		
		list.deleteAny(3);
		System.out.println();
		list.printList();
	}
	
}