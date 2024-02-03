import java.io.*;

public class try1
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter Your IP Adress : ");
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		
		String ip = rd.readLine();
		System.out.println("Entered IP Adress is : "+ ip);
		
		//spliting the string ip adress 
		String a = ip.substring(0,3);
		int cc = Integer.parseInt(a);
		System.out.println("After Spliting : "+ cc);
		
		String mask=null;
		if(cc>0)
		{
			
			if(cc>0 && cc<=127)
			{
				mask = "255.0.0.0";
				System.out.println("your ip is from class : A ");
			}
			else if(cc>127 && cc<=191)
			{
				
				mask = "255.255.0.0";
				System.out.println("your ip is from class : B "+"and your Mask is : "+mask);
			}
			else if(cc>191 && cc<=223)
			{
				
				mask = "255.255.255.0";
				System.out.println("your ip is from class : C "+"and your Mask is : "+mask);
			}
			else if(cc>223 && cc<=239)
			{
				
				mask = "255.0.0.0";
				System.out.println("your ip is from class : D "+"and your Mask is : "+mask);
			}
			else if(cc>239 && cc<=255)
			{
				
				mask = "255.0.0.0";
				System.out.println("your ip is from class : E "+"and your Mask is : "+mask);
			}
			else
			{
				System.out.println("Your ip is not valid");
			}
			
		}
		    String networkAddr="";
		    String lastAddr="";
		    
		    String[] ipAddrParts=ip.split("\\.");
		    String[] maskParts=mask.split("\\.");
		    
		    for(int i=0;i<4;i++)
		    {
		    
			    int x=Integer.parseInt(ipAddrParts[i]);
			    int y=Integer.parseInt(maskParts[i]);
			    int z=x&y;
			    
			    networkAddr+=z+".";
			    int w=z|(y^255);
			    lastAddr+=w+".";
		     }
		     
		     System.out.println("First IP of block: " +networkAddr);
		     System.out.println("last IP of block: " +lastAddr);
	}	
  }