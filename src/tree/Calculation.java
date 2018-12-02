package tree;

public class Calculation {

	private static String input = "1+6";
	private static int i = 0;
	private static String symbol;

	public static void main(String[] args) {
		TreeNode finalTree = new TreeNode();
		finalTree = createTree();		
	}

	private static TreeNode createTree() {
		TreeNode termTree = new TreeNode();
		termTree = digit();
		TreeNode localTree = new TreeNode();
		
		if((symbol.contentEquals("+") || symbol.contentEquals("-") )&& !symbol.contentEquals("#")){
			TreeNode term2tree = new TreeNode();
			String local = symbol;
			getInput(); 
			term2tree = createTree();
			localTree.setData(local);
			localTree.setLeft(termTree);
			localTree.setRight(term2tree);
		}
		else{
			return localTree = termTree;
		}

		return localTree;
	}

	private static TreeNode digit() {
		TreeNode termTree = new TreeNode();
		getInput();
		if(!symbol.contentEquals("#")){
			termTree.setData(symbol);
			getInput();
		}
		return termTree;
	}

	private static String getInput() {
		String temp="";
		if(i<input.length()){
			temp = input.substring(i, i+1);
			i++;
		}
		else{
			temp="#";
		}
		symbol = temp;
		return temp;
	}

}
