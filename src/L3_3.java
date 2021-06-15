import java.io.*;

public class L3_3 {
    public static void main (String[] args) throws IOException
    {
        System.out.println("type number");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        //文字列を数値に変換
        int num = Integer.parseInt(str);

        System.out.println(str + "が入力されました");
    }
}
