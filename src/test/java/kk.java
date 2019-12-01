import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class kk {
    private  String a;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bit;

    public Date getBit() {
        return bit;
    }

    public void setBit(Date bit) {
        this.bit = bit;
    }

    public String getA() {
        return a;
    }


    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    private String b;

    @Override
    public String toString() {
        return "kk{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
