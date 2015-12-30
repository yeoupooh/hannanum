package min.thomas.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yeoupooh on 12/30/15.
 */
public class BufferedReaderBuilder {
    public static BufferedReader fromRelativePath(String relativeFilePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(BufferedReaderBuilder.class.getResourceAsStream("/" + relativeFilePath));
        BufferedReader br = new BufferedReader(isr);
        return br;
    }
}
