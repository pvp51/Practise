package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupItems {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5 };
		int target = 7;
		System.out.println(groupPairs(arr, target));	
	}
	
	private static List<List<Integer>> groupPairs(int[] arr, int target) {
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			if(arr[i] > target)
				break;
			List<List<Integer>> tempOuter = new ArrayList<>();
			for(int j = 0; j < outer.size(); j++){
				List<Integer> innerTemp = new ArrayList<>();
				innerTemp.addAll(outer.get(j));
				if(arr[i] + listSum(innerTemp) < target){	//listSum(innerTemp) = returns sum of elements of an array
					innerTemp.add(arr[i]);
					tempOuter.add(innerTemp);
				}			
			}
			if(tempOuter.size() > 0)
				outer.addAll(tempOuter);
			List<Integer> inner = new ArrayList<>();
			inner.add(arr[i]);
			outer.add(inner);
		}
		return outer;
	}

	private static int listSum(List<Integer> temp) {
		int sum = 0;
		for(int i=0; i<temp.size(); i++){
			sum+= temp.get(i);
		}
		return sum;
		
	}

}
