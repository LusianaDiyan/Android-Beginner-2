package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 11/02/2018.
 */

public class RSBhayangkara extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rs_bhayangkara);

        WebView browser = (WebView) findViewById(R.id.rs_Bhayangkara);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/RSUDMuhSoewandi.html");
    }
}
