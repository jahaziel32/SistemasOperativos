package sistemasoperativos.alarma.registro.eingv.uabc.sistemasoperativos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;


public class Activity_dos extends ActionBarActivity {

    String so,opv,descri;
    TextView titulo;
    EditText desc;
    Spinner spinner;
    String[] vAnd={"Android 1.0 Apple Pie","Android 1.1 Banana Bread","Android 1.5 Cupcake",
            "Android 1.6 Donut","Android 2.0/2.1 Eclair","Android 2.2.x Froyo","Android 2.3.x Gingerbread",
            "Android 3.x Honeycomb","Android 4.0.x Ice Cream Sandwich","Android 4.1/4.3 Jelly Bean",
            "Android 4.4 KitKat","Android 5.0 Lollipop"};
    String[] vWin={"Windows 1.0","Windows NT","Windows 3.5","Windows 95","Windows 98","Windows 2000",
            "Windows XP","Windows vista","Windows 7","Windows 8","Windows 8.1"};
    String[] vWP={"Windows Phone 7","Windows Phone 7.1","Windows Phone 7.5","Windows Phone 8"};
    String[] vUb={"Ubuntu 4.10","Ubuntu 5.04","Ubuntu 5.10","Ubuntu 6.06 LTS","Ubuntu 6.10",
            "Ubuntu 7.04","Ubuntu 7.10","Ubuntu 8.04 LTS","Ubuntu 8.10","Ubuntu 9.04","Ubuntu 9.10",
            "Ubuntu 10.04 LTS","Ubuntu 10.10","Ubuntu 11.04","Ubuntu 11.10","Ubuntu 12.04 LTS",
            "Ubuntu 12.10","Ubuntu 13.04","Ubuntu 13.10","Ubuntu 14.04 LTS","Ubuntu 14.10"};
    String[] vLi={};
    String[] vios={};
    String[] vFi={};
    String[] vBB={};
    String[] vOS={};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_dos);

        titulo=(TextView)findViewById(R.id.textViewTitle);
        desc=(EditText)findViewById(R.id.textViewDesc);
        spinner=(Spinner)findViewById(R.id.spinnerV);


        so=getIntent().getStringExtra("OS");
        titulo.setText(getIntent().getStringExtra("OS"));


        switch (so){
            case "Linux":
                versiones(vLi);
                break;
            case "Windows":

                versiones(vWin);
                break;
            case "Ubuntu":
                versiones(vUb);
                break;
            case "Android":

                desc.setText(getIntent().getStringExtra("android"));
                versiones(vAnd);

                break;
            case "Firefox OS":
                versiones(vFi);
                break;
            case "OS":
                versiones(vOS);
                break;
            case "iOS":
                versiones(vios);
                break;
            case "WP":

                desc.setText(getIntent().getStringExtra("WPhone"));
                versiones(vWP);
                break;
            case "BlackBerry OS":
                versiones(vBB);
                break;
        }



    }

    public void versiones(String[] most){
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,most);
        spinner.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_dos, menu);
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
            opv= spinner.getSelectedItem().toString();
            System.out.println(spinner.getSelectedItemId());
            System.out.println(opv);
            datoSpinner(opv);
            return true;
        }else if (id==R.id.regresa){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    public void datoSpinner(String dato){
        Intent intent = new Intent(this, Activity_tres.class);
        switch (dato){
            /**********************Android***********************/
            case "Android 1.0 Apple Pie":
                descri="Android 1.0 Apple Pie (Tarta de manzana), la primera versión " +
                        "comercial del software, fue lanzado el 23 septiembre de 2008. " +
                        "El primer dispositivo Android, el HTC Dream.";
                intent.putExtra("ver","and1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","23 septiembre de 2008");
                

                break;
            case "Android 1.1 Banana Bread":
                descri="Android 1.1 Banana Bread (Pan de plátano) " +
                        "fue lanzada, inicialmente solo para el HTC Dream así que solo sirve para " +
                        "este telefono.Android 1.1 fue conocido como \"Petit Four\" internamente," +
                        " aunque este nombre no se utilizó oficialmente." +
                        " La actualización resolvió fallos, cambio la API y agregó una serie de características";
                intent.putExtra("ver","and1.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","9 de febrero de 2009");

                break;
            case "Android 1.5 Cupcake":
                descri="La actualización de Android 1.5 Cupcake" +
                        ", basada en núcleo Linux 2.6.27. La actualización incluye " +
                        "varias nuevas características y correcciones de interfaz de usuario";
                intent.putExtra("ver","and1.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","30 de abril de 2009");

                break;
            case "Android 1.6 Donut":
                descri="Android 1.6 Donut esta basado en el núcleo Linux 2.6.29.";
                intent.putExtra("ver","and1.6");
                intent.putExtra("des",descri);
                intent.putExtra("fi","15 de septiembre de 2009");

                break;
            case "Android 2.0/2.1 Eclair":
                descri="SDK de Android 2.0 – con nombre en " +
                        "clave Eclair – fue lanzado, basado en el núcleo de linux 2.6.29.";
                intent.putExtra("ver","and2");
                intent.putExtra("des",descri);
                intent.putExtra("fi","26 de octubre de 2009");

                break;
            case "Android 2.2.x Froyo":
                descri="SDK de Android 2.2 Froyo (Yogur helado) fue lanzado, basado en el núcleo Linux 2.6.32.";
                intent.putExtra("ver","and2.2");
                intent.putExtra("des",descri);
                intent.putExtra("fi","20 de mayo de 2010");

                break;
            case "Android 2.3.x Gingerbread":
                descri="SDK de Android 2.3 Gingerbread " +
                        "(Pan de Jengibre) fue lanzado, basado en el núcleo Linux 2.6.35.";
                intent.putExtra("ver","and2.3");
                intent.putExtra("des",descri);
                intent.putExtra("fi","6 de diciembre de 2010");

                break;
            case "Android 3.x Honeycomb":
                descri="SDK de Android 3.0 Honeycomb " +
                        "(Panal de Miel). Fue la primera actualización exclusiva para tablet," +
                        " lo que quiere decir que sólo es apta para tablets y no para teléfonos " +
                        "Android. Está basada en el núcleo de Linux 2.6.36. El primer dispositivo " +
                        "con esta versión fue la tableta Motorola Xoom, lanzado el 24 de febrero de 2011.";
                intent.putExtra("ver","and3");
                intent.putExtra("des",descri);
                intent.putExtra("fi","22 de febrero de 2011");

                break;
            case "Android 4.0.x Ice Cream Sandwich":
                descri="El SDK para Android 4.0.0 Ice Cream Sandwich (Sandwich de Helado), " +
                        "basado en el núcleo de Linux 3.0.1. Gabe Cohen de Google declaró que Android " +
                        "4.0 era \"teóricamente compatible\" con cualquier dispositivo Android " +
                        "2.3 en producción en ese momento, pero sólo si su procesador y memoria " +
                        "ram lo soportaban. El código fuente para Android 4.0 se puso a " +
                        "disposición el 14 de noviembre de 2011.";
                intent.putExtra("ver","and4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","19 de octubre de 2011");

                break;
            case "Android 4.1/4.3 Jelly Bean":
                descri="Google anunció Android 4.1 Jelly Bean (Gomita Confitada o Gominola) " +
                        "en conferencia el 27 de junio de 2012. Basado en el núcleo de linux " +
                        "3.0.31, Bean fue una actualización incremental con el enfoque primario " +
                        "de mejorar la funcionalidad y el rendimiento de la interfaz de usuario. " +
                        "La mejora de rendimiento involucró el \"Proyecto Butter\", el cual usa" +
                        " anticipación táctil, triple buffer, latencia vsync extendida y un " +
                        "arreglo en la velocidad de cuadros de 60 fps para crear una fluida y " +
                        "\"mantecosa\"-suavidad de la interfaz de usuario. Android 4.1 Jelly " +
                        "Bean fue lanzado bajo AOSP el 9 de julio de 2012, y el Nexus 7, el" +
                        " primer dispositivo en correr Jelly Bean, fue lanzado el 13 de julio de 2012.";
                intent.putExtra("ver","and4.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","27 de junio de 2012");

                break;
            case "Android 4.4 KitKat":
                descri="Su nombre se debe a la chocolatina KitKat, de la empresa internacional Nestlé";
                intent.putExtra("ver","and4.4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","31 de octubre de 2013");

                break;
            case "Android 5.0 Lollipop":
                descri="";
                intent.putExtra("ver","and5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","3 de noviembre de 2014");

                break;
            /**************Windows*******************/
            case "Windows 1.0":
                descri="";
                intent.putExtra("ver","w1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows NT":
                descri="";
                intent.putExtra("ver","wNT");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 3.5":
                descri="";
                intent.putExtra("ver","w3.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 95":
                descri="";
                intent.putExtra("ver","w95");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 98":
                descri="";
                intent.putExtra("ver","w98");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 2000":
                descri="";
                intent.putExtra("ver","w20");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows XP":
                descri="";
                intent.putExtra("ver","wXP");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows vista":
                descri="";
                intent.putExtra("ver","wV");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 7":
                descri="";
                intent.putExtra("ver","w7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 8":
                descri="";
                intent.putExtra("ver","w8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows 8.1":
                descri="";
                intent.putExtra("ver","w8.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            /***************Windows Phone*************/
            case "Windows Phone 7":
                descri="";
                intent.putExtra("ver","wp7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows Phone 7.1":
                descri="";
                intent.putExtra("ver","wp7.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows Phone 7.5":
                descri="";
                intent.putExtra("ver","wp7.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Windows Phone 8":
                descri="";
                intent.putExtra("ver","wp8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            /**********Ubuntu*********************/
            case "Ubuntu 4.10":
                descri="";
                intent.putExtra("ver","u4.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 5.04":
                descri="";
                intent.putExtra("ver","u5.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 5.10":
                descri="";
                intent.putExtra("ver","u5.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 6.06 LTS":
                descri="";
                intent.putExtra("ver","u6.06");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 6.10":
                descri="";
                intent.putExtra("ver","u6.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 7.04":
                descri="";
                intent.putExtra("ver","u7.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 7.10":
                descri="";
                intent.putExtra("ver","u7.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 8.04 LTS":
                descri="";
                intent.putExtra("ver","u8.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 8.10":
                descri="";
                intent.putExtra("ver","u8.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 9.04":
                descri="";
                intent.putExtra("ver","u9.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 9.10":
                descri="";
                intent.putExtra("ver","9.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 10.04 LTS":
                descri="";
                intent.putExtra("ver","u10.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 10.10":
                descri="";
                intent.putExtra("ver","u10.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 11.04":
                descri="";
                intent.putExtra("ver","u11.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 11.10":
                descri="";
                intent.putExtra("ver","u11.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 12.04 LTS":
                descri="";
                intent.putExtra("ver","u12.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 12.10":
                descri="";
                intent.putExtra("ver","u12.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 13.04":
                descri="";
                intent.putExtra("ver","u13.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 13.10":
                descri="";
                intent.putExtra("ver","u13.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 14.04 LTS":
                descri="";
                intent.putExtra("ver","u14.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
            case "Ubuntu 14.10":
                descri="";
                intent.putExtra("ver","u14.10");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                break;
        }


        startActivity(intent);
    }
}
