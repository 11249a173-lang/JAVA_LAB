import java.io.*;

public class FileIOStream
{
    public static void main(String[] args) throws Exception
    {
        String data = "Java is easy to learn.";

        InputStream in = new ByteArrayInputStream(data.getBytes());
        OutputStream out = new ByteArrayOutputStream();

        int ch;

        while ((ch = in.read()) != -1)
        {
            out.write(ch);
        }

        System.out.println(out.toString());

        in.close();
        out.close();
    }
}