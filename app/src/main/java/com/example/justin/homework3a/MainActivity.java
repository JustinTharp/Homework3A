package com.example.justin.homework3a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rockonClick(View v)
    {
        Toast.makeText(MainActivity.this, "Rock was clicked", Toast.LENGTH_SHORT).show();
    }
    public void paperonClick(View v)
    {
        Toast.makeText(MainActivity.this, "Paper was clicked", Toast.LENGTH_SHORT).show();
    }
    public void scissorsonClick(View v)
    {
        Toast.makeText(MainActivity.this, "Scissors was clicked", Toast.LENGTH_SHORT).show();
    }
    public void lizardonClick(View v)
    {
        Toast.makeText(MainActivity.this, "Lizard was clicked", Toast.LENGTH_SHORT).show();
    }
    public void spockonClick (View v)
    {
        Toast.makeText(MainActivity.this, "Spock was clicked", Toast.LENGTH_SHORT).show();
    }

}
