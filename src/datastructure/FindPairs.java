package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FindPairs {

	private static List<int []> finalList;

	public static void main(String[] args) {
		int[] arr = { 2, 2, 8, 9, 8, 1, 10 };
		int target = 10;
		System.out.println(calcPairs(arr, target));	
		for(int i=0; i < finalList.size(); i++){
			System.out.println(Arrays.toString(finalList.get(i)));
		}
	}

	private static int calcPairs(int[] arr, int target) {
		if(arr == null || arr.length == 0)
			return 0;
		finalList = new ArrayList<>();
		Map<Integer, Queue<Integer>> arrayInfo = new HashMap<>(); 
		int count = 0;

		for(int i=0; i < arr.length; i++){
			if(!arrayInfo.containsKey(target - arr[i])){
				Queue<Integer> temp = new LinkedList<>();
				if(arrayInfo.containsKey(arr[i])){
					temp = arrayInfo.get(arr[i]);				
				}
				temp.add(i);
				arrayInfo.put(arr[i], temp);
			}
			else{
				Queue<Integer> temp = arrayInfo.get(target - arr[i]);
				if(temp.size() == 0)
					arrayInfo.remove(arr[i]);
				else{
					temp.poll();
					count++;
					int[] pair = { target - arr[i], arr[i]};
					finalList.add(pair);
					arrayInfo.put(target - arr[i], temp);
				}
			}
		}
		return count;
	}
}
