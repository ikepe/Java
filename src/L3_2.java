import java.io.*;

public class L3_2 {
    public static void main (String[] args) throws IOException
    {
        System.out.println("type text");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str + "が入力されました");
    }
}
