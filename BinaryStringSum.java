import java.io.*;
public class BinaryStringSum {
    public static void main(String[]  args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter two Binary strings: ");
        String val1=in.readLine();
        String val2=in.readLine();
        String ans=sumBinary(val1,val2);
        if(ans == "-1")
            System.out.println("Enter a valid Binary string.");
        else
            System.out.println("Sum is : "+ans);
    }
    public static String sumBinary(String val1,String val2)
    {
        String ans="";
        char a='0', b='0';
        int i,j,p,q,c=0;
        i=val1.length()-1;
        j=val2.length()-1;
        while(i>=0 && j>=0 || c==1)
        {
            if (i>=0)
                a=val1.charAt(i);
            if(j>=0)
                b=val1.charAt(j);
            if(a!='1' && a!='0' || b!='1' && b!='0')
                return "-1";
            if(i>=0)
                p=Integer.parseInt(Character.toString(a));
            else
                p=0;
            if(j>=0)
                q=Integer.parseInt(Character.toString((b)));
            else
                q=0;
            ans=Integer.toString((p+q+c)%2)+ans;
            if(p+q+c>1)
                c=1;
            else
                c=0;
            i--;
            j--;
        }
        if(i>=0)
            ans=val1.substring(0,i+1)+ans;
        if(j>=0)
            ans=val2.substring(0,j+1)+ans;

        return ans;
    }
}
