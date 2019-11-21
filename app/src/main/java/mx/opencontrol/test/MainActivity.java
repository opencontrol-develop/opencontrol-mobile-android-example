package mx.opencontrol.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import mx.opencontrol.android.Opencontrol;

public class MainActivity extends AppCompatActivity {

    private final String merchantId="<Your merchant Test>";
    private final String userName="<Your user test>";
    private final String publicKey ="<Your public key>";
    private final boolean productionMode=false;
    Opencontrol opencontrol;
    private TextView textViewSessionId;
    private Button buttonGetSessionId;

    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.opencontrol = new Opencontrol(merchantId,publicKey,userName,productionMode);
        this.textViewSessionId= (TextView)findViewById(R.id.textViewSessionId);
        this.buttonGetSessionId = (Button)findViewById(R.id.buttonGetSessionId);
        buttonGetSessionId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewSessionId.setText(getSessionId());
            }
        });
        activity = this;

    }

    private String getSessionId(){
        return this.opencontrol.getDeviceCollectorDefaultImpl().setup(this);
    }
}
