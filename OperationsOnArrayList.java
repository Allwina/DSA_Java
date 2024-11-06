import java.util.*;
public class OperationsOnArrayList {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<>();
		//add
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		//add at index
		list.add(0,40);
		System.out.println(list);
		//get
		System.out.println(list.get(0));
		//set
		list.set(0, 50);
		System.out.println(list.get(0));
		//remove
		list.remove(2);
		System.out.println(list);
		//size
		System.out.println(list.size());
		in.close();
	}

}
