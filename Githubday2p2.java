import java.util.ArrayList;

public class Githubday2p2{
	public static void main(String[]args){
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(8);
   		list.add(2);
    		list.add(1);
    		list.add(3);

    		System.out.println(createNum(list));
		
		/*System.out.println("Hello");
		System.out.println("Hi Manas");
		System.out.println("Hey Mithil");
		System.out.println("Hey again Mithil");
		System.out.println("Testing Errorrr");
		*/

	}
	public static int createNum(ArrayList<Integer> list){
    	int multiply = 1;
    	int creation = 0;
    	for(int i = list.size() - 1; i >= 0; i--){
      		creation+=(list.get(i)*multiply);
      		multiply*=10;
    	}
    	return creation;
	}
}
