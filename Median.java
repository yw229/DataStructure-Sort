package Question9;

import java.util.Arrays;
import java.util.PriorityQueue;
/*
 * Use heap to find the median number  -- maxHeap, min heap 
 * The median number is the largest value in maxheap 
 * maxheap keeps the value that less than median, and minheap keeps the value greater than it 
 * if new add value is greater than minheap peek, need to poll the minheap peek and push it into max heap, then push 
 * the value into min heap ;
 * if new value is smaller than maxheap peek, need to poll the maxheap peek and push it into min heap 
 * 
 * */

public class Median {
	public PriorityQueue<Integer> maxheap ;
	public PriorityQueue<Integer> minheap ;
	
	public void addNewNumber(int rand)
	{
		if( minheap.size() == maxheap.size()) // if size the same, make the lower size bigger because median is maxheap 
		{
			if( ! minheap.isEmpty() && rand > minheap.peek() )
			{
				maxheap.offer(minheap.poll()) ;
				minheap.offer(rand) ;
			}
			else // size same, rand smaller than min heap peek push down heap 
			{
				maxheap.offer(rand);
			}
		}
		else  // size not equal   check rand is smaller than max heap, if it is poll maxheap peek and push it to min heap reheapify 
		{
			if(rand < maxheap.peek())
			{
				minheap.offer(maxheap.poll()) ;
				maxheap.offer(rand) ;
			}
			else // size not same, larger than max peek ,push up heap 
			{
				minheap.offer(rand) ;
			}
		}
		
	}
	public double getMedian()
	{
		if(maxheap.isEmpty()) 
			return minheap.peek() ;
		else	
			if(minheap.isEmpty())
				return maxheap.peek() ;
		if(maxheap.size() == minheap.size())
			return (maxheap.peek() + minheap.peek()) /2.0 ;
		else
			if(maxheap.size() > minheap.size())
				return maxheap.peek() ;
			else
				return minheap.peek() ;
	}
	
	public void addNewArray(int rand)
	{
		 addNewNumber(rand) ;
		 printMinHeapAndMaxHeap();
			System.out.println("\nMedian = " + getMedian() + "\n");
	}
	private void printMinHeapAndMaxHeap() {
		// TODO Auto-generated method stub
		Integer[] sortMinArray = minheap.toArray( new Integer[minheap.size()]) ;
		Integer[] sortMaxArray = maxheap.toArray( new Integer[maxheap.size()]) ;
		Arrays.sort(sortMinArray, new MinHeapComparator()) ;
		Arrays.sort(sortMaxArray, new MaxHeapComparator()) ;
		
		System.out.print("MinHeap =");
		for (int i = sortMinArray.length - 1; i >= 0 ; i--){
			System.out.print(" " + sortMinArray[i]);
		}
		System.out.print("\nMaxHeap =");
		for (int i = 0; i < sortMaxArray.length; i++){
			System.out.print(" " + sortMaxArray[i]);
		}
	}
	
	public static void main(String[] args) {
		int arraySize = 10;
		int range = 7;
		Median m = new Median() ;
		MaxHeapComparator maxHeapComparator = new MaxHeapComparator();
		MinHeapComparator minHeapComparator = new MinHeapComparator();
		m.maxheap= new PriorityQueue<Integer>(arraySize - arraySize/2, maxHeapComparator);
		m.minheap = new PriorityQueue<Integer>(arraySize/2, minHeapComparator);

		for(int i = 0; i < arraySize; i++) {
			int randomNumber = (int) (Math.random( ) * (range+1));
			m.addNewArray(randomNumber);
		}
	}
}
