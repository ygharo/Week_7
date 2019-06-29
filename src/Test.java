public class Test {


public static void main(String str[]) throws RuntimeException {

	Queue queue = new Queue(11);

System.out.print("Adding alphabet letters : a,");
queue.enqueue('a'); 
System.out.print(" b,");
queue.enqueue('b');
System.out.print(" c,");
queue.enqueue('c');
System.out.print(" d,");
queue.enqueue('d');
System.out.print(" e,");
queue.enqueue('e');
System.out.print(" f,");
queue.enqueue('f');
System.out.print(" g,");
queue.enqueue('g');
System.out.print(" h,");
queue.enqueue('h');
System.out.print(" i, ");
queue.enqueue('i');
System.out.print(" j ");
queue.enqueue('j');
 //Adding this last letter should throw the error message
//queue.enqueue('k');


//Popping out the letters
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.dequeue();
//Keep invoking the method to throw the exception
//queue.dequeue(); queue.dequeue(); queue.dequeue(); queue.dequeue(); queue.dequeue(); queue.dequeue(); queue.dequeue();

//Printing out the remaining letters in the queue
queue.Display();

}
}
