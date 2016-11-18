import java.io.Closeable;
import java.io.IOException;


public class FunWithExceptions implements Closeable{
	public static void main(String args[]){
		try {
			FunWithExceptions fe = new FunWithExceptions();
			fe.matchProviders("Mumbai", "Bombay");
		} catch (ProviderMisMatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void matchProviders(String p1, String p2) throws ProviderMisMatchException  {
		if(p1.equalsIgnoreCase(p2)){
			System.out.println("Providers Match");
		}else{
			throw new ProviderMisMatchException("Provider MisMatch");
		}
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
