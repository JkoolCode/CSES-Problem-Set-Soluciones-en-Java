import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Junior Oblitas
 * Link Problema: https://cses.fi/problemset/task/1071
 * Link Video Solución: 
 */
public class P6NumberSpiral {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int t = in.nextInt();
        solve(t, in, out);
        out.close();
    }

    static void solve(int testCases, InputReader in, PrintWriter out){
        long x, y, rs;
        for (int i = 0; i < testCases; i++) {
            x = in.nextLong();
            y = in.nextLong();
            if(y <= x){
                if(x % 2 == 0) rs = (x*x) - (y - 1);
                else rs = ((x-1)*(x-1)) + y; 
            }else{
                if(y % 2 == 0) rs = ((y-1)*(y-1)) + x; 
                else rs = (y*y) - (x - 1);
            }
            out.println(rs);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
