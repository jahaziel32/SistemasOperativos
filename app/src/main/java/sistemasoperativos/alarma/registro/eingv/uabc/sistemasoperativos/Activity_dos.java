package sistemasoperativos.alarma.registro.eingv.uabc.sistemasoperativos;

import android.content.Intent;
import android.graphics.Color;
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
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                break;
            case "Ubuntu":
                versiones(vUb);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF9C00D3"));
                break;
            case "Android":
                desc.setText(getIntent().getStringExtra("android"));
                versiones(vAnd);
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                spinner.setBackgroundColor(Color.WHITE);

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
                intent.putExtra("fd","");

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
                intent.putExtra("fd","");

                break;
            case "Android 1.5 Cupcake":
                descri="La actualización de Android 1.5 Cupcake" +
                        ", basada en núcleo Linux 2.6.27. La actualización incluye " +
                        "varias nuevas características y correcciones de interfaz de usuario";
                intent.putExtra("ver","and1.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","30 de abril de 2009");
                intent.putExtra("fd","");

                break;
            case "Android 1.6 Donut":
                descri="Android 1.6 Donut esta basado en el núcleo Linux 2.6.29.";
                intent.putExtra("ver","and1.6");
                intent.putExtra("des",descri);
                intent.putExtra("fi","15 de septiembre de 2009");
                intent.putExtra("fd","");

                break;
            case "Android 2.0/2.1 Eclair":
                descri="SDK de Android 2.0 – con nombre en " +
                        "clave Eclair – fue lanzado, basado en el núcleo de linux 2.6.29.";
                intent.putExtra("ver","and2");
                intent.putExtra("des",descri);
                intent.putExtra("fi","26 de octubre de 2009");
                intent.putExtra("fd","");

                break;
            case "Android 2.2.x Froyo":
                descri="SDK de Android 2.2 Froyo (Yogur helado) fue lanzado, basado en el núcleo Linux 2.6.32.";
                intent.putExtra("ver","and2.2");
                intent.putExtra("des",descri);
                intent.putExtra("fi","20 de mayo de 2010");
                intent.putExtra("fd","");

                break;
            case "Android 2.3.x Gingerbread":
                descri="SDK de Android 2.3 Gingerbread " +
                        "(Pan de Jengibre) fue lanzado, basado en el núcleo Linux 2.6.35.";
                intent.putExtra("ver","and2.3");
                intent.putExtra("des",descri);
                intent.putExtra("fi","6 de diciembre de 2010");
                intent.putExtra("fd","");

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
                intent.putExtra("fd","");

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
                intent.putExtra("fd","");

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
                intent.putExtra("fd","");

                break;
            case "Android 4.4 KitKat":
                descri="Su nombre se debe a la chocolatina KitKat, de la empresa internacional Nestlé";
                intent.putExtra("ver","and4.4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","31 de octubre de 2013");
                intent.putExtra("fd","");

                break;
            case "Android 5.0 Lollipop":
                descri="";
                intent.putExtra("ver","and5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","3 de noviembre de 2014");
                intent.putExtra("fd","");

                break;
            /**************Windows*******************/
            case "Windows 1.0":
                descri="";
                intent.putExtra("ver","w1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows NT":
                descri="";
                intent.putExtra("ver","wNT");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 3.5":
                descri="";
                intent.putExtra("ver","w3.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 95":
                descri="";
                intent.putExtra("ver","w95");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 98":
                descri="";
                intent.putExtra("ver","w98");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 2000":
                descri="";
                intent.putExtra("ver","w20");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows XP":
                descri="";
                intent.putExtra("ver","wXP");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows vista":
                descri="";
                intent.putExtra("ver","wV");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 7":
                descri="";
                intent.putExtra("ver","w7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 8":
                descri="";
                intent.putExtra("ver","w8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows 8.1":
                descri="";
                intent.putExtra("ver","w8.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            /***************Windows Phone*************/
            case "Windows Phone 7":
                descri="";
                intent.putExtra("ver","wp7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows Phone 7.1":
                descri="";
                intent.putExtra("ver","wp7.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows Phone 7.5":
                descri="";
                intent.putExtra("ver","wp7.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Windows Phone 8":
                descri="";
                intent.putExtra("ver","wp8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            /**********Ubuntu*********************/
            case "Ubuntu 4.10":
                descri="Ubuntu 4.10 (nombre clave Warty Warthog - Jabalí Verrugoso), la primera " +
                        "versión de Ubuntu. Su nombre se debe a que fue publicada (warts and all). " +
                        "Fue desarrollado sobre Debian GNU/Linux y con planes de un nuevo lanzamiento " +
                        "cada seis meses y dieciocho meses de soporte. El escritorio era de color " +
                        "rosa bastante claro, el naranja y el marrón simbolizaban las " +
                        "tribus sudafricanas. Un motivo por el que Ubuntu se puso en la cabeza desde " +
                        "su comienzo fue el Live CD, que ofrecía a los usuarios el poder probar Ubuntu " +
                        "sin necesidad de instalarlo.";
                intent.putExtra("ver","u4.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi"," 20 de octubre de 2004,");
                intent.putExtra("fd","30 de abril de 2006");
                break;
            case "Ubuntu 5.04":
                descri="Ubuntu 5.04 (nombre clave Hoary Hedgehog - Puerco-espín Anciano), fue el segundo " +
                        "lanzamiento de Ubuntu por Canonical. Ubuntu 5.04 añadió muchas características " +
                        "incluyendo un administrador de actualizaciones, soporte para notificador de " +
                        "actualización, readahead y grepmap, suspensión, hibernación y standby, escalado de " +
                        "frecuencia dinámica para procesadores, base de datos de hardware de Ubuntu, instalación " +
                        "Kickstart, y autenticación APT. Ubuntu 5.04 permitió la instalación desde " +
                        "dispositivos USB. Ubuntu 5.04 usó UTF-8de forma prederminada. El Live CD fue mejorado y " +
                        "extendido a las versiones de x86-64 y Power PC.";
                intent.putExtra("ver","u5.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","8 de abril de 2005");
                intent.putExtra("fd","31 de octubre de 2006");
                break;
            case "Ubuntu 5.10":
                descri="Ubuntu 5.10 (nombre clave Breezy Badger - Tejón Despreocupado). Esta versión añadió " +
                        "varias características nuevas incluyendo un gestor de arranque gráfico (Usplash), " +
                        "una herramienta para añadir y quitar aplicaciones, un editor de menú (alacarte), " +
                        "un selector de lenguaje, soporte para Logical Volume Manager, soporte completo para " +
                        "impresoras Hewlett-Packard, soporte para OEM, e integración conLaunchpad para el reporte " +
                        "de bugs y desarrollo de software.";
                intent.putExtra("ver","u5.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","12 de octubre de 2005");
                intent.putExtra("fd","13 de abril de 2007");
                break;
            case "Ubuntu 6.06 LTS":
                descri="Ubuntu 6.06 LTS (nombre clave Dapper Drake - Pato Culto). Fue el cuarto lanzamiento de " +
                        "Ubuntu, y el primero con soporte a largo plazo (LTS). Su lanzamiento fue retrasado dos " +
                        "meses, ya que había sido planeado como 6.04. El desarrollo de esta versión no se completó " +
                        "en abril de 2006 y Mark Shuttleworth aprobó retrasar el lanzamiento a junio.\n" +
                        "Ubuntu 6.06 incluyó varias características nuevas, incluyendo tener el Live CD y el CD de " +
                        "instalación combinados en un solo disco, un instalador gráfico en el Live CD (Ubiquity), " +
                        "Usplash en el apagado como en el encendido, una nuevo administrador de conexiones de red, " +
                        "tema de escritorio implementado usando las convenciones de Tango, basado en Clearlooks y con " +
                        "colores naranjas en vez de cafés, y un instalador gráfico (GDebi) para paquetes de software. " +
                        "Ubuntu 6.06 no permitía instalarse desde un dispositivo USB, pero por primera vez permitió la " +
                        "instalación directamente en dispositivos removibles USB. También se creó una nueva distribución " +
                        "basada en Ubuntu pero con el entorno de escritorio Xfce, llamada Xubuntu.";
                intent.putExtra("ver","u6.06");
                intent.putExtra("des",descri);
                intent.putExtra("fi","1 de junio de 2006");
                intent.putExtra("fd","14 de julio de 2009");
                break;
            case "Ubuntu 6.10":
                descri="Ubuntu 6.10 (nombre clave Edgy Eft - Tritón Crispado). Simbolizaba una transición " +
                        "deDapper Drake a la inminente Feisty Fawn. Con un tiempo de arranque y apagado de " +
                        "sistema más rápido y la integración de Tomboyy F-Spot El trabajo de arte en Ubuntu pasó " +
                        "a ser más ligero y agradable a la vista.\n" + "Kubuntu añadió un software de gestión de " +
                        "fotos, digiKam; se rediseñó el panel de configuración de sistema; y se mejoraron los " +
                        "botones y el soporte de control de batería de los portátiles.";
                intent.putExtra("ver","u6.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","26 de octubre de 2006");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 7.04":
                descri="Ubuntu 7.04 (nombre clave Feisty Fawn - Cervatillo Animado). Apareció con nuevas características " +
                        "de servidor incluyendo nuevos métodos que proporcionan facilidades para la instalación de códecs " +
                        "multimedia y controladores binarios, así como mejoras de red.\n" +
                        "Incorporó, además, un asistente de migración desde Windows y el controlador NTFS-3G de " +
                        "forma predeterminada, así como descubrimiento de servicios de red con Avahi que permitía, entre " +
                        "otras cosas, compartir música vía DAAP al igual que en iTunes.";
                intent.putExtra("ver","u7.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","19 de abril de 2007");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 7.10":
                descri="Ubuntu 7.10 (nombre clave Gutsy Gibbon - Gibón Valiente). Incluía mayor seguridad gracias " +
                        "alAppArmor security framework, una mayor velocidad en la búsqueda de archivos, un administrador " +
                        "de complementos de Firefox, una herramienta de configuración gráfica para el X.org y un soporte" +
                        " mejorado del sistema de archivos NTFS. Se activó Compiz de manera predeterminada y se añadió " +
                        "una interfaz más rápida para el cambio de usuario.\n" +
                        "Por vez primera se añadieron carpetas para organizar archivos (Documentos, Música, Imágenes, " +
                        "Vídeos...) dentro de la carpeta personal del usuario, una característica que ya existía en " +
                        "otras distribuciones como Fedora y Linux Mint.";
                intent.putExtra("ver","u7.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","18 de octubre de 2007");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 8.04 LTS":
                descri="Ubuntu 8.04 LTS (nombre clave Hardy Heron - Garza Robusta), fue la segunda versión de " +
                        "soporte extendido (LTS). Presentaba algunas novedades entre las que destabacan: la " +
                        "inclusión por defecto de nuevas aplicaciones como: Tracker, Brasero, Transmission, " +
                        "Vinagre VNC, y PulseAudio.\n" + "Además se hizo posible el tener acceso al Active " +
                        "Directory usando Likewise Open y fue la primera versión que incluyó el instaladorWubi" +
                        " en el Live CD, que permite instalar la distribución como un programa de Windows sin" +
                        " necesidad de hacer ninguna partición en el disco duro.";
                intent.putExtra("ver","u8.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","24 de abril de 2008");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 8.10":
                descri="Ubuntu 8.10 (nombre clave Intrepid Ibex - Cabra Intrépida). Destacaba por sus mejoras como: una cuenta de invitado, interacción escalable entre el escritorio y el dispositivo móvil, mejora de la conectividad con Internet, un directorio privado y cifrado para los usuarios, la posibilidad de crear un Live USB y la esperada recompilación automática de los controladores del núcleo gracias a la herramienta DKMS.";
                intent.putExtra("ver","u8.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","30 de octubre de 2008");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 9.04":
                descri="Ubuntu 9.04 (nombre clave Jaunty Jackalope - Jackalope Desenfadado). Trajo consigo " +
                        "importantes avances como una disminución drástica del tiempo de inicio del sistema, " +
                        "acceso casi inmediato al sacar al equipo de un estado de suspensión/hibernación, soporte " +
                        "para tarjetas de red 3G y una mejora de acceso a redes inalámbricas.\n" +
                        "Además, la inclusión del núcleo Linux 2.6.28, permitió ofrecer el novedoso sistema " +
                        "de archivos ext4 de forma opcional y la aceleración EXA para las tarjetas gráficas ATI, " +
                        "proporcionando una mejor experiencia en aceleración gráfica. También incluyó un nuevo " +
                        "sistema de notificaciones, Notify OSD, y temas visuales.";
                intent.putExtra("ver","u9.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","23 de abril de 2009");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 9.10":
                descri="Ubuntu 9.10 (nombre clave Karmic Koala - Koala Kármico). En esta versión se enfocaron esfuerzos" +
                        " en la mejora de la computación en nube utilizando la plataforma Eucalyptus, y se integró con " +
                        "Ubuntu One, un servicio que permite almacenar, sincronizar y compartir archivos en línea entre" +
                        " equipos con Ubuntu.\n" + "También ofreció un mejor soporte para Ubuntu Netbook Remix y dio " +
                        "soporte a Moblin y Android. El sistema contó con el núcleo Linux 2.6.31, utilizaba GNOME 2.28 " +
                        "y el sistema de archivos EXT4 de manera predeterminada.";
                intent.putExtra("ver","9.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","29 de octubre de 2009");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 10.04 LTS":
                descri="Ubuntu 10.04 LTS (nombre clave Lucid Lynx - Lince Lucido). Incorpora integración con " +
                        "Ubuntu One Music Store que permite comprar música en Internet, lo cual se complementa " +
                        "con el soporte por defecto para iPhone y iPod touch.\n" + "En lo referente a integración" +
                        " con servicios web, incorpora un menú llamado Me Menu (Menú Yo), el cual facilita la " +
                        "administración de diferentes redes sociales, correo y mensajería instantánea.\n" +
                        "Incluyó la versión 2.0 del Centro de software de Ubuntu, que da la posibilidad de " +
                        "instalar paquetes individuales y tiene la capacidad de monitorizar los repositorios PPA " +
                        "que hayamos activado.";
                intent.putExtra("ver","u10.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","29 de abril de 2010");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 10.10":
                descri="Ubuntu 10.10 (nombre clave Maverick Meerkat - Suricato Inconformista).\n" +
                        "Ubuntu 10.10 se enfoca principalmente en su versión para netbooks, con importantes " +
                        "cambios en el diseño y experiencia de usuario. La versión para escritorio también trae " +
                        "mejoras de diseño y de nivel técnico.\n" + "La versión para netbooks incluye el entorno " +
                        "de escritorio Unity, que fue creado especialmente para esta versión, siguiendo la misma " +
                        "línea de diseño utilizada en GNOME 3.0. Se implementó un menú de aplicaciones global " +
                        "y los botones de controles de ventana (cerrar, minimizar, maximizar) en la barra superior. " +
                        "También se eliminaron todos los notificadores de terceros de la barra superior, que están siendo " +
                        "reemplazados por nuevos indicadores con menús desplegables.\n" + "El instalador de Ubuntu, " +
                        "Ubiquity, se rediseñó casi completamente, con la opción de instalar Adobe Flash, códecs propietarios " +
                        "como MP3, Xvid, DVD (MPEG-2), y Java (es necesaria una conexión a Internet). Las transparencias " +
                        "en ventanas y menús son más consistentes con la interfaz de usuario gracias al soporte RGB/A que " +
                        "viene por defecto.El tema visual predeterminado, «Ambiance», fue retocado, al igual que el " +
                        "tema opcional (Radiance), utilizando colores más claros (los tonos cafés ya no se utilizaron más), " +
                        "dando una apariencia más ligera en general.";
                intent.putExtra("ver","u10.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","10 de octubre de 2010");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 11.04":
                descri="Ubuntu 11.04 (nombre clave Natty Narwhal - Narval Elegante). Esta versión marca el fin deUbuntu Netbook Edition, puesto que se ha decidido fusionarla con la edición de escritorio.[66]\n" +
                        "Esta versión recibió varios cambios en su apariencia, partiendo por la implementación de la interfaz de usuario Unity que incluye un lanzador izquierdo, un tablero con acceso a aplicaciones y una barra superior con indicadores y menús.[67] Debido a Unity, no se utilizó GNOME Shell, ya que Unity es el shell creado por Canonical para Ubuntu, pero sí se emplearon todas las demás herramientas y aplicaciones de GNOME, como es habitual.[68] En esta versión, Unity funciona con Compiz como compositor de ventanas, siendo este último mucho más rápido que el anterior compositor Mutter, utilizado en la versión 10.10 Netbook Edition.[69]\n" +
                        "Ubuntu 11.04 incluye tres sesiones de escritorio en la entrada de usuario de Ubuntu; la primera sesión es 'Ubuntu', utiliza Unity y es necesario tener instalados controladores para ambientes gráficos 3D. La segunda sesión es 'Ubuntu Clásico', utiliza el mismo entorno que se utilizaba en versiones anteriores de Ubuntu con GNOME Panel, y utiliza efectos de escritorio. La tercera sesión es 'Ubuntu Clásico (Sin efectos)', como la anterior sesión pero sin efectos de escritorio.";
                intent.putExtra("ver","u11.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","28 de abril de 2011");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 11.10":
                descri="";
                intent.putExtra("ver","u11.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 12.04 LTS":
                descri="";
                intent.putExtra("ver","u12.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 12.10":
                descri="";
                intent.putExtra("ver","u12.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 13.04":
                descri="";
                intent.putExtra("ver","u13.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 13.10":
                descri="";
                intent.putExtra("ver","u13.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 14.04 LTS":
                descri="";
                intent.putExtra("ver","u14.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 14.10":
                descri="";
                intent.putExtra("ver","u14.10");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
        }


        startActivity(intent);
    }
}
