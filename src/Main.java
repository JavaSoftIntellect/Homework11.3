import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text here:");
		String text=in.nextLine();
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<String> stack = new Stack<String>();
		
		if(text.length()%2==0){
			System.out.println("Statement is wrong,you can't continue!");
			return;
		}
		for(int i=0;i<text.length();i++){
			if(i%2==0){
				if(text.charAt(i)>='0'&&text.charAt(i)<='9'){
					queue.offer(Character.getNumericValue(text.charAt(i)));
				}else{
					System.out.println("Statement is wrong,you can't continue!");
					return;
				}
			}else{
				if (text.charAt(i)=='+'||text.charAt(i)<='-'){
					stack.push(Character.toString(text.charAt(i)));
				}else{
					System.out.println("Statement is wrong,you can't continue!");
					return;
				}
			}
		}
		queue.poll();
		queue.poll();
		stack.pop();
		int result=0;
		int temp;
		while(!queue.isEmpty()){
			temp=queue.poll();
			if(stack.pop().equals("+")){
				result +=temp;
			}else{
				result-=temp;
			}System.out.println(result);
			in.close();
		}

	}

}
