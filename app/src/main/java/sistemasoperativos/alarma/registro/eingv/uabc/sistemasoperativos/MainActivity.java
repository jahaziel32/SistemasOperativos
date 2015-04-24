package sistemasoperativos.alarma.registro.eingv.uabc.sistemasoperativos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
    String op,descripcion;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] escri={"Linux","OS","Ubuntu","Windows"};
        String[] mobile={"Android","BlackBerry OS","Firefox OS","iOS","Windows Phone"};


        spinner = (Spinner) findViewById(R.id.spinnerOp);
        final ToggleButton btnEstado=(ToggleButton)findViewById(R.id.botonEstados);

        final ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mobile);
        final ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,escri);
        spinner.setAdapter(adapter2);

        btnEstado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEstado.isChecked()){
                    spinner.setAdapter(adapter);

                }else {
                    spinner.setAdapter(adapter2);

                }
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Toast mensaje=Toast.makeText(getApplication(),"Esta aplicacion muestra una pequeña descripcion" +
                    "de algunos Sistemas Operativos, asi como sus distintas versiones",Toast.LENGTH_LONG);
            mensaje.show();
            return true;
        }else if (id==R.id.ver_os) {
            op=spinner.getSelectedItem().toString();

            System.err.println(op);
            datoSpinner(op);
            return true;
        }else if (id==R.id.salir){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void datoSpinner(String opcion){
        Intent intent = new Intent(this, Activity_dos.class);

        switch (opcion) {
            case "Linux":
                descripcion="";
                intent.putExtra("OS", "Linux");
                intent.putExtra("linux", descripcion);
                break;
            case "Ubuntu":
                descripcion="";
                intent.putExtra("OS", "Ubuntu");
                intent.putExtra("ubuntu", descripcion);
                break;
            case "Windows":
                descripcion="Microsoft Windows (conocido generalmente como Windows o MS Windows), " +
                        "es el nombre de una familia de cuyos distribuciones para PC, smartphone, " +
                        "servidores y sistemas empotrados, desarrollados y vendidos por Microsoft, " +
                        "y disponibles para múltiples arquitecturas, tales como x86 y ARM. Desde un " +
                        "punto de vista técnico, estas no son sistemas operativos, sino que contienen uno " +
                        "junto con una amplia variedad de software; no obstante, es usual (aunque no necesariamente correcto) " +
                        "denominar al conjunto como sistema operativo en lugar de distribución. " +
                        "Microsoft introdujo un entorno operativo denominado Windows el 20 de noviembre de 1985 como un complemento para MS-DOS en respuesta al creciente interés en las interfaces gráficas de usuario (GUI).";
                intent.putExtra("OS", "Windows");
                intent.putExtra("windows", descripcion);
                break;
            case "OS":
                descripcion="";
                intent.putExtra("OS", "OS");
                intent.putExtra("oss", descripcion);
                break;
            case "Android":
                descripcion = "Android es un sistema operativo basado en el núcleo Linux. " +
                        "Fue diseñado principalmente para dispositivos móviles con pantalla táctil, " +
                        "como teléfonos inteligentes o tablets; y también para relojes inteligentes, " +
                        "televisores y automóviles. Inicialmente fue desarrollado por Android Inc., " +
                        "empresa que Google respaldó económicamente y más tarde, en 2005, compró. " +
                        "Android fue presentado en 2007 junto la fundación del Open Handset Alliance " +
                        "(un consorcio de compañías de hardware, software y telecomunicaciones) para avanzar " +
                        "en los estándares abiertos de los dispositivos móviles.";
                intent.putExtra("OS", "Android");
                intent.putExtra("android", descripcion);
                break;
            case "Firefox OS":
                descripcion="";
                intent.putExtra("OS", "Firefox OS");
                intent.putExtra("firefox", descripcion);
                break;
            case "iOS":
                descripcion = "";
                intent.putExtra("OS", "iOS");
                intent.putExtra("ios", descripcion);
                break;
            case "Windows Phone":
                descripcion = "";
                intent.putExtra("OS", "WP");
                intent.putExtra("WPhone", descripcion);
                break;
            case "BlackBerry OS":
                descripcion="";
                intent.putExtra("OS","BlackBerry OS");
                intent.putExtra("bbos",descripcion);
                break;
        }

        startActivity(intent);
    }
}
