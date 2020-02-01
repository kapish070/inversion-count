import java.util.*;
public class sunday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      while(a>0)
      {
    	  int size=sc.nextInt();
    	  int count=0;
    	  int b[]=new int[size];
    	  for(int i=0;i<size;i++)
    	  {
    		  b[i]=sc.nextInt();
    	  }
    	  for(int i=0;i<size-1;i++)
    	  {
    		  if(b[i]<b[i+1])
    		  {
    			  count++;
    		  }
    	  }
    	  System.out.print(count);
    	  a--;
      }
	}

}
