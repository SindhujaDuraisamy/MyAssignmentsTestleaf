package week2.day3;

//To understand and implement the concept of Overloading in Java by creating a class and implementing methods with different sets of input arguments.

public class APIClient {
	
	//One version should accept one input argument: a String for the endpoint.
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Single argument method:" +endpoint); 
	}
	
	//Another version of the sendRequest method should accept three input arguments: a String for the endpoint, 
	//a String for the requestBody, and a boolean parameter requestStatus to verify whether the request is successful.
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Three argument method:" +" EndPoint: "+endpoint+ "RequestBody: " +requestBody+ "Return Status: " +requestStatus); 
		if(requestStatus)
		{
			System.out.println("Request Successful");
		}
		else
		{
			System.out.println("Request Failed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inside the main method, create an object of the APIClient class.
		APIClient apiObj=new APIClient();
		apiObj.sendRequest("www.apiclient.com");
		apiObj.sendRequest("www.apiclient.com","Request Body Content",false);
		
		//Call both versions of the sendRequest method on the APIClient object with different sets of input arguments to showcase method overloading.
		
		

	}

}
