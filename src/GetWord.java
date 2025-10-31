import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetWord {
    public static String word() {
        UnsafeSSL.disableCertificateValidation();
        try {
            URL url = new URL("https://random-word-api.vercel.app/api?words=1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HttpResponseCode: " + conn.getResponseCode());
            }
            else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                String raw = response.toString();

                return raw.substring(2, raw.length() - 2).trim();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
