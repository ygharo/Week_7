public class Queue {
//creating my prototype class to be used in main 
	private static char Queue[]; // creating an array

	private static int capacity, front, rear; // variables for all types created from this class

	Queue(int size) { // constructor, default visibility, adding as a parameter the size which will be
						// different when the test program is implemented

		capacity = size;
		front = 0; // initializing var
		rear = 0;
		Queue = new char[size]; // storing alphabet

	}

	public void enqueue(char letter) { // ensure is not full before adding letters

		if (rear == -1) { // 0 index position
			front = 0;
			rear = 0;
			Queue[rear] = letter; // add a letter at the rear position if condition is met

		} else if (rear + 1 >= capacity) { // overflow

			System.out.println("\n\tError! Your queue is full!");
		}

		else if (rear + 1 < capacity) { // if <= will throw an outOfBound exception

			Queue[++rear] = letter; // increase position
		}

	}

	public boolean isEmpty() { //boolean method to verify if empty

		return front == -1;  

	}

	public char dequeue() { // Check the queue is not empty and items are popped FIFO order

		if (isEmpty())

			throw new RuntimeException("Queue Underflow"); //nothing to pop

		else {

			char letter = Queue[front];
			
			if (front == rear) {
				front = -1;
				rear = -1;
				

			} else {
				System.out.print("\n\tDequeuing your queue (FIFO) " + letter);
				front++;
			}
			return letter;
		}

	}

	static void Display() { //printing out my elements in the queue
		int i; // counter
		if (front == rear) {
			System.out.print("\n\tThe Queue is empty now\n");
			return;
		}

		// printing elements front to rear order

		for (i = front; i < rear; i++) {
			System.out.print("\n\tRemaining element in your queue: " + Queue[i]);
			Queue[i]++;
		}
		return;
	}

}
