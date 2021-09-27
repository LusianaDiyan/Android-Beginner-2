package applusiana.surabayafindplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHospitalClick(View theButton){
        Intent hospital = new Intent(MainActivity.this,Hospital.class);
        startActivity(hospital);
    }

    public void onHotelClick(View theButton){
        Intent hotel = new Intent(MainActivity.this,Hotel.class);
        startActivity(hotel);
    }

    public void onAtmClick(View theButton){
        Intent atm = new Intent(MainActivity.this,Atm.class);
        startActivity(atm);
    }

    public void onBengkelClick(View theButton){
        Intent bengkel = new Intent(MainActivity.this,Bengkel.class);
        startActivity(bengkel);
    }

    public void onExitClick(View theButton){
        finish();
    }
}
