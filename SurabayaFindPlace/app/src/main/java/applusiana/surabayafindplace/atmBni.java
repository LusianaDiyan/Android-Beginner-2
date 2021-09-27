package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 11/02/2018.
 */

public class atmBni extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_bni);

        WebView browser = (WebView) findViewById(R.id.atm_Bni);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/atmBni.html");
    }
}
