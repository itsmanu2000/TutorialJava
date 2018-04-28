import java.util.function.Consumer;

public class ConsumerClass implements Consumer<String> {

	@Override
	public void accept(String arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.equals("Vihaan"))
			System.out.println(arg0+ " is the son of the family");
		else
			System.out.println(arg0+" Memeber of the family");
		
	}
	

}
