package ofctest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TestUtil {
    private static Map<String, String> regionMap;
    static {
        try (InputStream in =
                     TestUtil.class
                             .getResourceAsStream(
                                     "OC1Regions");
             BufferedReader reader = new BufferedReader(new InputStreamReader(in, UTF_8))) {
            String info = null;
            while ( (info = reader.readLine()) != null ){
                // spliting each line of content by delimiter
                String[] values = info.split(":");
                // first part is item and second is price
                String region = values[0].trim();
                String geoRegion = values[1].trim();

                if( !region.equals("") && !geoRegion.equals("") ) {
                    regionMap.put(region, geoRegion);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read default config file", e);
        }
    }

    public static String getGeoRegion(String region) {
        return regionMap.getOrDefault(region, region);
    }
}
