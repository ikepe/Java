import java.io.*;

public class L5_2 {
    public static  void main (String[] args) throws IOException
    {
        System.out.println("type number");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch (res) {
            case 1 -> System.out.println(("Typed 1"));
            case 2 -> System.out.println(("Typed 2"));
            default -> System.out.println("Type 1 or 2");
        }
    }
}
