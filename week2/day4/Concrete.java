package week2.day4;

public class Concrete implements DatabaseConnection
{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update");
		
	}
	
	public static void main(String[] args)
	{
		Concrete concObj=new Concrete();
		concObj.connect();
		concObj.disconnect();
		concObj.executeUpdate();
	}

}
