import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List al = new ArrayList();
			al.add("Manoj");
			al.add("Poornima");
			al.add("Vihaan");
			System.out.println("Enter a String");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
     		al.add(a);
			for (int i=0; i<al.size(); i++) {
				System.out.println(al.get(i));
			}
			
			for (Object o: al) {
				System.out.println(o);
			}
			
			Iterator it = al.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
			al.forEach(new Consumer<String>() {

				@Override
				public void accept(String arg0) {
					// TODO Auto-generated method stub
					System.out.println(arg0);
				}
			});
			
			al.forEach(new ConsumerClass());
			
			
	}

}
