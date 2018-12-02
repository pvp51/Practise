package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> output = new ArrayList<>();
		List<Integer> input = new ArrayList<>();
		int m =4;
		int n = input.size();	
		while(output.size() < 3){
			if(input.size() > m){
				List<Integer> first = new ArrayList<>();
				List<Integer> last = new ArrayList<>();
				first = input.subList(0, m);
				last = input.subList(n-m, n); 
				if(first.size() == last.size()){
					int f = Collections.max(first);
					int l = Collections.max(last);
					if(f == l){
						int index = input.lastIndexOf(l);
						input.remove(index); //index
					}
					else if(f > l){
						input.remove(f); //obj
					}
					else{
						int index = last.indexOf(l);
						input.remove(n-m+index);
					}
				}
				else{
					System.err.println("Error");}
			}
			else{
				int max = Collections.max(input);
				output.add(max);
				input.remove(max); //Obj
			}
		}
		

	}

}
