import java.io.*;

public class L3_4 {
    public static void main (String[] args) throws IOException
    {
        System.out.println("type 2 text");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(str1 + "が入力されました");
        System.out.println(str2 + "が入力されました");
    }
}
