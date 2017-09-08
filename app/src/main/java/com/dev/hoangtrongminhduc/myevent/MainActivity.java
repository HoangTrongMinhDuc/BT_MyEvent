package com.dev.hoangtrongminhduc.myevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btntinhtong(View view){
        EditText edta=(EditText) findViewById(R.id.edta);
        int a=Integer.parseInt(edta.getText()+"");
        EditText edtb=(EditText) findViewById(R.id.edtb);
        int b=Integer.parseInt(edtb.getText()+"");
        TextView txvkq=(TextView) findViewById(R.id.txvkq);
        txvkq.setText((a+b)+"");
    }
}
