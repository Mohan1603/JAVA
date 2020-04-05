import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		QueueDemo demo = new QueueDemo();
		Queue queue1 = demo.createQueueForDemo();
		demo.printQueueForDemo(queue1);

		// new QueueDemo().printQueueForDemo(new QueueDemo().createQueueForDemo());

	}

	private Queue createQueueForDemo() {
		PriorityQueue<Integer> queueOfIntegers = new PriorityQueue<>();
		queueOfIntegers.add(100);
		queueOfIntegers.add(200);
		queueOfIntegers.add(50);

		return queueOfIntegers;
	}

	private void printQueueForDemo(Queue queue) {
		System.out.println("Retriving head of the list: " + queue.peek());
		System.out.println("Retriving & Deleting head of the list 1st attempt: " + queue.poll());
		System.out.println("Retriving & Deleting head of the list 2nd attempt: " + queue.poll());

		Iterator queueIterator = queue.iterator();
		while (queueIterator.hasNext()) {
			// queueIterator.remove(); if you want to remove
			System.out.println("Print the values in list: " + queueIterator.next());
		}
	}

}
