import java.io.*;

public class L5_1 {
    public static void main (String[] args ) throws IOException
    {
        System.out.println ("Type number");

        BufferedReader br =
                new BufferedReader (new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        if(res == 1)
            System.out.println("Typed 1");
        System.out.println("finished");
    }
}
