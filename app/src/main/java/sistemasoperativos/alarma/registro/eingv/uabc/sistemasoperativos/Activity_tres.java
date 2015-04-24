package sistemasoperativos.alarma.registro.eingv.uabc.sistemasoperativos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;


public class Activity_tres extends ActionBarActivity {
    TextView fechC,fechD;
    String fechaC,fechaD,osv;
    ImageView mos;
    EditText des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tres);

        fechC=(TextView)findViewById(R.id.fechCreacion);
        fechD=(TextView)findViewById(R.id.fechDescon);
        des=(EditText)findViewById(R.id.descrip);
        mos=(ImageView)findViewById(R.id.imageView);
        //fechaC=getIntent().getStringExtra("").toString();

        des.setText(getIntent().getStringExtra("des").toString());
        fechC.setText(getIntent().getStringExtra("fi").toString());
        fechD.setText(getIntent().getStringExtra("fd"));
        osv=getIntent().getStringExtra("ver");

        switch(osv){
            /************Android*****************/
            case "and1":
                mos.setImageResource(R.drawable.android1);
                break;
            case "and1.1":
                mos.setImageResource(R.drawable.android1_1);
                break;
            case "and1.5":
                mos.setImageResource(R.drawable.android1_5);
                break;
            case "and1.6":
                mos.setImageResource(R.drawable.android1_6);
                break;
            case "and2":
                mos.setImageResource(R.drawable.android2);
                break;
            case "and2.2":
                mos.setImageResource(R.drawable.android2_2);
                break;
            case "and2.3":
                mos.setImageResource(R.drawable.android2_3);
                break;
            case "and3":
                mos.setImageResource(R.drawable.android3);
                break;
            case "and4.0":
                mos.setImageResource(R.drawable.android4);
                break;
            case "and4.1":
                mos.setImageResource(R.drawable.android4_1);
                break;
            case "and4.4":
                mos.setImageResource(R.drawable.android4_4);
                break;
            case "and5":
                mos.setImageResource(R.drawable.android5);
                break;
            /***************Windows**************/
            case "w1":
                break;
            case "wNT":
                break;
            case "w3.5":
                break;
            case "w95":
                break;
            case "w98":
                break;
            case "w20":
                break;
            case "wXP":
                break;
            case "wV":
                break;
            case "w7":
                break;
            case "w8":
                break;
            case "w8.1":
                break;
            /********Whindows Phone***********/
            case "wp7":
                break;
            case "wp7.1":
                break;
            case "wp7.5":
                break;
            case "wp8":
                break;
            /*************Ubuntu***************/
            case "u4.1":
                break;
            case "u5.04":
                break;
            case "u5.1":
                break;
            case "u6.06":
                break;
            case "u6.1":
                break;
            case "u7.04":
                break;
            case "u7.1":
                break;
            case "u8.04":
                break;
            case "u8.1":
                break;
            case "u9.04":
                break;
            case "u9.1":
                break;
            case "u10.04":
                break;
            case "u10.1":
                break;
            case "u11.04":
                break;
            case "u11.1":
                break;
            case "u12.04":
                break;
            case "u12.1":
                break;
            case "u13.04":
                break;
            case "u13.1":
                break;
            case "u14.04":
                break;
            case "u14.1":
                break;


        }



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_tres, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(getApplication(),MainActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
