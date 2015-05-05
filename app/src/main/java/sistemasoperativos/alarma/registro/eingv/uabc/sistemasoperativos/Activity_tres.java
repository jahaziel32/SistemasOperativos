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
                mos.setImageResource(R.drawable.win1_00);
                break;
            case "wNT":
            case "w3.5":
            case "w95":
                mos.setImageResource(R.drawable.windows2000);
                break;
            case "w98":
                mos.setImageResource(R.drawable.win98);
                break;
            case "w20":
                mos.setImageResource(R.drawable.windows2000);
                break;
            case "wXP":
                mos.setImageResource(R.drawable.winxp);
                break;
            case "wV":
                mos.setImageResource(R.drawable.winvista);
                break;
            case "w7":
                mos.setImageResource(R.drawable.win7);
                break;
            case "w8":
                mos.setImageResource(R.drawable.win8);
                break;

            /*************Ubuntu***************/
            case "u4.1":
            case "u5.04":
            case "u5.1":
            case "u6.06":
            case "u6.1":
            case "u7.04":
            case "u7.1":
            case "u8.04":
            case "u8.1":
            case "u9.04":
            case "u9.1":
            case "u10.04":
            case "u10.1":
            case "u11.04":
            case "u11.1":
            case "u12.04":
            case "u12.1":
            case "u13.04":
            case "u13.1":
            case "u14.04":
            case "u14.1":
                mos.setImageResource(R.drawable.ubuntu1);
                break;
            /***************MAC OS **************/
            case "os10.1":
            case "os10.3":
            case "os10.4":
            case "os10.5":
            case "os10.6":
            case "os10.7":
            case "os10.8":
            case "os10.9":
            case "os10.10":
                mos.setImageResource(R.drawable.macos);
                break;
            /**********IOS******************/
            case "ios4":
            case "ios5":
            case "ios6":
            case "ios7":
            case "ios8":
                mos.setImageResource(R.drawable.ioslogo);
                break;

            case "bb4":
            case "bb6":
            case "bb7":
            case "bb10":
                mos.setImageResource(R.drawable.blackberrylogo);
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
