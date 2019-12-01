import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class test {
    @Test
    public void fun() throws IOException {
        String a = "{\"a\":123}";
        ObjectMapper mapper = new ObjectMapper();
        kk a1 = mapper.readValue(a,kk.class);
        System.out.println(a1.getA()+"     "+a1.getB());
    }
}
