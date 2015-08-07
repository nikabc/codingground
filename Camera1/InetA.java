import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class InetA
{
    String send_url()
    {
        try {
            String url = "http://rodeomondeo.com";
            URL obj = new URL(url);
        	HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        	conn.setReadTimeout(5000);
        	//conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
        	//conn.addRequestProperty("User-Agent", "Mozilla");
        	//conn.addRequestProperty("Referer", "google.com");
        
        	//System.out.println("Request URL ... " + url);
        
        
            BufferedReader in = new BufferedReader(
                                  new InputStreamReader(conn.getInputStream()));
        	String inputLine;
        	StringBuffer html = new StringBuffer();
        
        	while ((inputLine = in.readLine()) != null) {
        		html.append(inputLine);
        	}
        	in.close();
        
        	System.out.println("URL Content... \n" + html.toString());
        }catch(/*java.net.MalformedURLException*/java.io.IOException e){
            System.out.println("EXCEPTION: " + e);
        }finally{
            
        }
        System.out.println("DONE");
        return "none";
    }
}
