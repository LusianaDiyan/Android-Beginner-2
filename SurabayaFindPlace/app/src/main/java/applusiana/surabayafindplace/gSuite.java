package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 11/02/2018.
 */

public class gSuite extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_suite);

        WebView browser = (WebView) findViewById(R.id.gSuite);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/gSuite.html");
    }
}
