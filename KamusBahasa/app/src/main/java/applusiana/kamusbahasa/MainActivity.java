package applusiana.kamusbahasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnInput, btnTranslate, btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnInput = findViewById(R.id.btnInput);
       btnInput.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, inputActivity.class));
           }
       });

       btnTranslate = findViewById(R.id.btnTranslate);
       btnTranslate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, translate.class));
           }
       });

       btnList = findViewById(R.id.btnList);
       btnList.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, ListActivity.class));
           }
       });
    }
}
