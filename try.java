
import java.io.*;
public class try
{
public static void main(String args[]) throws IOException
{
System.out.println("Enter IP");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String ip=br.readLine();
String checkclass=ip.substring(0,3);

int cc=Integer.parseInt(checkclass);


    String mask=null;
    if(cc>0)
    {
    if(cc<=127)
    {
           mask="255.0.0.0";
    System.out.println("Class A ip address");
    System.out.println("subnetmask:\n"+mask);
    }
   
    if(cc>=128 && cc<=191 )
    {
   
    mask="255.255.0.0";
    System.out.println("Class B ip address");
    System.out.println("subnetmask:\n"+mask);
   
    }
    if(cc>=192 && cc<=223 )
 
    {
    mask="255.255.255.0";
    System.out.println("Class C ip address");
    System.out.println("subnetmask:\n"+mask);
   
    }
    if(cc>=224 && cc<=239)
    {
    mask="255.0.0.0";
    System.out.println("Class d ip address used for multicasting");
   
    }
   
   
    if(cc>=240 && cc<=255)
   
    {
    mask="255.0.0.0";
    System.out.println("Class E ip address used for Experimental use");
   
    }
    }
    String networkAddr="";
    String lastAddr="";
   
   
    String[] ipAddrparts=ip.split("\\,");
    String[] maskparts=mask.split("\\,");
   
    for(int i=0;i<4;i++)
    {
    int x=Integer.parseInt(ipAddrparts[i]);
    int y=Integer.parseInt(maskparts[i]);
    int z=x&y;
    System.out.println("AND"+z);
    networkAddr+=z+",";
    int w=z|(y^255);
    lastAddr+=w+",";
    }
    System.out.println("First ip of block:"+networkAddr);
    System.out.println("Last ip of block"+lastAddr);
   
   
   
}

}