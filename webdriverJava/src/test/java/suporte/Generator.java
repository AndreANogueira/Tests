package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String dataHoraAquirvo(){

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("YYYYMMDDhhmmss").format(ts);
    }
}