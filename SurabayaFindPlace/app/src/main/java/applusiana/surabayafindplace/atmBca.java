package applusiana.surabayafindplace;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by USER on 11/02/2018.
 */

public class atmBca extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_bca);

        WebView browser = (WebView) findViewById(R.id.atm_Bca);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/atmBca.html");
    }
}
