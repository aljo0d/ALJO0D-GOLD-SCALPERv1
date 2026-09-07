package com.aljood.goldscalper;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
    TextView status, connection, floating, openTrades, details;
    Button start, stop;
    boolean running = false;

    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        Spinner p=findViewById(R.id.platform), l=findViewById(R.id.lotMode), m=findViewById(R.id.maxTrades);
        p.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, new String[]{"MT5","MT4"}));
        l.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, new String[]{"Minimum","Custom"}));
        m.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, new String[]{"1","2","3","Custom"}));

        status=findViewById(R.id.status); connection=findViewById(R.id.connection);
        floating=findViewById(R.id.floating); openTrades=findViewById(R.id.openTrades); details=findViewById(R.id.details);
        start=findViewById(R.id.start); stop=findViewById(R.id.stop);

        start.setOnClickListener(v -> setRunning(true));
        stop.setOnClickListener(v -> setRunning(false));
    }

    private void setRunning(boolean value) {
        running=value;
        if (running) {
            status.setText("●  RUNNING"); status.setTextColor(Color.rgb(37,211,102));
            connection.setText("● READY"); connection.setTextColor(Color.rgb(37,211,102));
            start.setText("RUNNING  ●");
            floating.setText("Floating Profit\n$0.00");
            openTrades.setText("Open Trades\n0");
            details.setText("Last Trade     —\nDirection      —\nSL / TP         —\nSpread          —\nToday P/L       $0.00\nConnection      READY");
        } else {
            status.setText("●  STOPPED"); status.setTextColor(Color.rgb(255,91,97));
            connection.setText("● OFFLINE"); connection.setTextColor(Color.rgb(255,91,97));
            start.setText("START  ▶");
        }
    }
}
