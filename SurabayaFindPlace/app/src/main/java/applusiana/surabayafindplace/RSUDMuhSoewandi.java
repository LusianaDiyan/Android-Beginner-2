package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 10/02/2018.
 */

public class RSUDMuhSoewandi extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsud_muhsoewandi);

        WebView browser = (WebView) findViewById(R.id.rsud_muhsoewandi);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/RSUDMuhSoewandi.html");
    }
}
