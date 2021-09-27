package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 11/02/2018.
 */

public class atmMandiri extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_mandiri);

        WebView browser = (WebView) findViewById(R.id.atm_Mandiri);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/atmMandiri.html");
    }
}
