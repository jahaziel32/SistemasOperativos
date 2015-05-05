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
            "Windows XP","Windows vista","Windows 7","Windows 8"};
    String[] vWP={"Windows Phone 7","Windows Phone 7.1","Windows Phone 7.5","Windows Phone 8"};
    String[] vUb={"Ubuntu 4.10","Ubuntu 5.04","Ubuntu 5.10","Ubuntu 6.06 LTS","Ubuntu 6.10",
            "Ubuntu 7.04","Ubuntu 7.10","Ubuntu 8.04 LTS","Ubuntu 8.10","Ubuntu 9.04","Ubuntu 9.10",
            "Ubuntu 10.04 LTS","Ubuntu 10.10","Ubuntu 11.04","Ubuntu 11.10","Ubuntu 12.04 LTS",
            "Ubuntu 12.10","Ubuntu 13.04","Ubuntu 13.10","Ubuntu 14.04 LTS","Ubuntu 14.10"};
    String[] vios={"iOS 4","iOS 5","iOS 6","iOS 7","iOS 8"};
    String[] vFi={};
    String[] vBB={"BlackBerry 4.6","BlackBerry 6","BlackBerry 7.1","Blackberry 10"};
    String[] vOS={"Versión 10.0(Cheetah)","Versión 10.1(Puma)","Versión 10.3(Panther)","Versión 10.4(Tiger)",
            "Versión 10.5(Leopard)","Versión 10.6(Snow Leopard)","Versión 10.7(Lion)","Versión 10.8(Mountain Lion)",
            "Versión 10.9(Mavericks)","Versión 10.10(Yosemite)"};

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
            case "Windows":
                desc.setText(getIntent().getStringExtra("windows"));
                versiones(vWin);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFBCE7FF"));
                break;
            case "Ubuntu":
                desc.setText(getIntent().getStringExtra("ubuntu"));
                versiones(vUb);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#EADDBFFF"));
                break;
            case "Android":
                desc.setText(getIntent().getStringExtra("android"));
                versiones(vAnd);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFABFFB1"));
                break;
            case "OS":
                desc.setText(getIntent().getStringExtra("oss"));
                versiones(vOS);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#B1989898"));
                break;
            case "iOS":
                desc.setText(getIntent().getStringExtra("ios"));
                versiones(vios);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFDDEDFF"));
                break;

            case "BlackBerry OS":
                desc.setText(getIntent().getStringExtra("bbos"));
                versiones(vBB);
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFF9A9"));
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
                intent.putExtra("fi","noviembre de 1985");
                intent.putExtra("fd","");
                break;
            case "Windows NT":
                descri="Microsoft lanzó Windows NT basado en un nuevo kernel. NT era considerado como el" +
                        " sistema operativo profesional y fue la primera versión de Windows en utilizar la Multitarea apropiativa. ";
                intent.putExtra("ver","wNT");
                intent.putExtra("des",descri);
                intent.putExtra("fi","julio de 1993");
                intent.putExtra("fd","");
                break;
            case "Windows 3.5":
                descri="";
                intent.putExtra("ver","w3.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","1 de marzo de 1992");
                intent.putExtra("fd","");
                break;
            case "Windows 95":
                descri="Microsoft lanzó Windows 95, una versión nueva para los consumidores, que incluía grandes cambios " +
                        "que en la interfaz de usuario y la utilización de la multitarea apropiativa. Windows 95 fue " +
                        "diseñado para sustituir no solo a Windows 3.1, sino también a Windows para Workgroups y a MS-DOS." +
                        " También fue el primer sistema operativo Windows que utilizó las capacidades Plug and Play. ";
                intent.putExtra("ver","w95");
                intent.putExtra("des",descri);
                intent.putExtra("fi","24 de agosto de 1995");
                intent.putExtra("fd","");
                break;
            case "Windows 98":
                descri="Microsoft Windows 98. Sustancialmente fue criticado por su lentitud y por su falta " +
                        "de fiabilidad en comparación con Windows 95, pero muchos de sus problemas básicos " +
                        "fueron posteriormente rectificados con el lanzamiento de Windows 98 Second Edition en 1999. ";
                intent.putExtra("ver","w98");
                intent.putExtra("des",descri);
                intent.putExtra("fi","25 de junio de 1998");
                intent.putExtra("fd","");
                break;
            case "Windows 2000":
                descri="Microsoft lanzó Windows 2000 en febrero de 2000. La versión de consumidor tras Windows " +
                        "98 fue Windows Me (Windows Millennium Edition). Lanzado en septiembre de 2000, " +
                        "Windows Me implementaba una serie de nuevas tecnologías para Microsoft: en particular " +
                        "fue el «Universal Plug and Play». Durante el 2004 parte del código fuente de Windows 2000" +
                        " se filtró en internet, esto era malo para Microsoft porque el mismo núcleo utilizado en " +
                        "Windows 2000 se utilizó en Windows XP.";
                intent.putExtra("ver","w20");
                intent.putExtra("des",descri);
                intent.putExtra("fi","Febrero de 2000");
                intent.putExtra("fd","");
                break;
            case "Windows XP":
                descri="Microsoft lanzó Windows XP, una versión que se construyó en el kernel de Windows NT que " +
                        "también conserva la usabilidad orientada al consumidor de Windows 95 y sus sucesores." +
                        " En dos ediciones distintas, «Home» y «Professional», el primero carece por mucho de " +
                        "la seguridad y características de red de la edición Professional. ";
                intent.putExtra("ver","wXP");
                intent.putExtra("des",descri);
                intent.putExtra("fi","Octubre de 2001");
                intent.putExtra("fd","");
                break;
            case "Windows vista":
                descri="Microsoft lanzó Windows Vista. Contiene una serie de características nuevas, desde un " +
                        "shell rediseñado y la interfaz de usuario da importantes cambios técnicos, con especial " +
                        "atención a las características de seguridad. Está disponible en varias ediciones diferentes " +
                        "y ha sido objeto de muy severas críticas debido a su patente inestabilidad, sobredemanda de " +
                        "recursos de hardware, alto costo, y muy alta incompatibilidad con sus predecesores, hecho que no ocurría con éstos.";
                intent.putExtra("ver","wV");
                intent.putExtra("des",descri);
                intent.putExtra("fi","30 de enero de 2007");
                intent.putExtra("fd","");
                break;
            case "Windows 7":
                descri="Microsoft lanzó Windows 7. A diferencia de su predecesor, Windows Vista, que introdujo a " +
                        "un gran número de nuevas características, Windows 7 pretendía ser una actualización incremental" +
                        ", enfocada a la línea de Windows, con el objetivo de ser compatible con aplicaciones y hardware que" +
                        " Windows Vista no era compatible. Windows 7 tiene soporte multi-touch, un Windows shell rediseñado " +
                        "con una nueva barra de tareas, conocido como Superbar, un sistema red llamado HomeGroup, y mejoras" +
                        " en el rendimiento sobre todo en velocidad y en menor consumo de recursos.";
                intent.putExtra("ver","w7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","22 de octubre de 2009");
                intent.putExtra("fd","");
                break;
            case "Windows 8":
                descri="Microsoft lanzó Windows 8. Por primera vez desde Windows 95, el botón Inicio ya no " +
                        "está disponible en la barra de tareas, aunque la pantalla de inicio está aún activa " +
                        "haciendo clic en la esquina inferior izquierda de la pantalla y presionando la tecla " +
                        "Inicio en el teclado. Presenta un Explorador de Windows rediseñado, con la famosa interfaz" +
                        " ribbon de Microsoft Office. ";
                intent.putExtra("ver","w8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","29 de octubre de 2012,");
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
                descri="Ubuntu 11.04 (nombre clave Natty Narwhal - Narval Elegante). Esta versión marca el fin deUbuntu Netbook " +
                        "Edition, puesto que se ha decidido fusionarla con la edición de escritorio.\n" +
                        "Esta versión recibió varios cambios en su apariencia, partiendo por la implementación de la " +
                        "interfaz de usuario Unity que incluye un lanzador izquierdo, un tablero con acceso a aplicaciones " +
                        "y una barra superior con indicadores y menús. Debido a Unity, no se utilizó GNOME Shell, ya que " +
                        "Unity es el shell creado por Canonical para Ubuntu, pero sí se emplearon todas las demás herramientas" +
                        " y aplicaciones de GNOME, como es habitual. En esta versión, Unity funciona con Compiz como compositor" +
                        " de ventanas, siendo este último mucho más rápido que el anterior compositor Mutter, utilizado en la" +
                        " versión 10.10 Netbook Edition.\n" + "Ubuntu 11.04 incluye tres sesiones de escritorio en la " +
                        "entrada de usuario de Ubuntu; la primera sesión es 'Ubuntu', utiliza Unity y es necesario tener " +
                        "instalados controladores para ambientes gráficos 3D. La segunda sesión es 'Ubuntu Clásico', utiliza " +
                        "el mismo entorno que se utilizaba en versiones anteriores de Ubuntu con GNOME Panel, y utiliza efectos" +
                        " de escritorio. La tercera sesión es 'Ubuntu Clásico (Sin efectos)', como la anterior sesión pero sin " +
                        "efectos de escritorio.";
                intent.putExtra("ver","u11.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","28 de abril de 2011");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 11.10":
                descri="Ubuntu 11.10 (nombre clave Oneiric Ocelot - Ocelote Onírico).\n" +
                        "Ubuntu 11.10 incluye el entorno Unity 2D, el cual se usa por defecto en equipos que no " +
                        "puedan utilizar la interfaz Unity. Unity 2D no requiere de controladores de video, " +
                        "pero debido a eso no utiliza efectos de escritorio generados por Compiz como si lo haceUnity." +
                        " Los elementos de la interfaz Unity fueron portados a GTK 3 gracias a GNOME 3, debido a esto " +
                        "llegaron cambios de diseño en Nautilus y el Centro de control. Se incorpora el nuevo motor de " +
                        "temas Unico, el cual tiene como objetivo manejar los nuevos temas GTK+ 3, Unico reemplaza al " +
                        "anterior motor Murrine que utilizaba GTK 2.";
                intent.putExtra("ver","u11.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","13 de octubre de 2011");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 12.04 LTS":
                descri="Ubuntu 12.04 LTS (nombre clave Precise Pangolin - Pangolín Preciso).\n" +
                        "Esta versión es la primera con 5 años de soporte extendido en el escritorio.\n" +
                        "Se han hecho varios cambios en la interfaz de usuario. El acceso de Inicio del tablero " +
                        "de Unity fue rediseñado, eliminando los 8 iconos grandes de acceso y fueron reemplazados" +
                        " por aplicaciones y archivos de uso más reciente. El lanzador se encuentra siempre visible " +
                        "y ya no se auto-oculta cuando hay una ventana sobre ella. Se incluyó un nuevo acceso de Video " +
                        "en el tablero para buscar videos en línea y locales del computador.";
                intent.putExtra("ver","u12.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","26 de abril de 2012");
                intent.putExtra("fd","Aun con soporte");
                break;
            case "Ubuntu 12.10":
                descri="Ubuntu 12.10 (nombre clave Quantal Quetzal - Quetzal Cuántico).\n" +
                        "Nueva integración en el escritorio con Aplicaciones Web. Con esto el " +
                        "navegador Firefox consulta al usuario si quiere integrar un sitio como " +
                        "aplicación web, ello hace uso de notificaciones de escritorio, indicadores en" +
                        " el lanzador, acceso al menú de mensajería, también administrar imágenes, " +
                        "contactos, documentos en las secciones Fotos, Social, Archivos y carpetas, " +
                        "además de búsqueda de opciones de HUD.";
                intent.putExtra("ver","u12.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","18 de octubre de 2012");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 13.04":
                descri="Ubuntu 13.04 (nombre clave Raring Ringtail - Lemur Ansioso).\n" +
                        "Nuevos iconos de aplicaciones llegaron para Nautilus, Centro de software de " +
                        "Ubuntu, Actualización de software, el icono de Ubuntu y los iconos blancos de " +
                        "acceso del tablero de aplicaciones. El tablero de aplicaciones ahora tiene las " +
                        "mismas barras de desplazamiento que se utilizan en las demás aplicaciones. Se " +
                        "rediseñaron las ventanas de apagado de sistema para tener consistencia visual " +
                        "con el tablero de aplicaciones.\n";
                intent.putExtra("ver","u13.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","25 de abril de 2013");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 13.10":
                descri="Ubuntu 13.10 (nombre clave Saucy Salamander - Salamandra Descarada).\n" +
                        "Con esta versión llegó la nueva búsqueda inteligente al tablero, con múltiples " +
                        "fuentes de información en línea de varios sitios, además cada fuente en línea se puede " +
                        "deshabilitar o volver a habilitar. Nuevo reconocimiento de voz se integra a HUD 2.0, " +
                        "gracias a herramientas de reconocimiento de voz como PocketSphinx, Julius y VoxForge.\n";
                intent.putExtra("ver","u13.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","17 de octubre de 2013");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 14.04 LTS":
                descri="Ubuntu 14.04 LTS (nombre clave Trusty Tahr - Tauro Fiel), esta versión tiene muchas novedades, " +
                        "como el historial de sesiones, recuperar el nombre de usuario en la barra de indicadores en " +
                        "una opción de Cuentas de usuario como las versiones inferiores a 12.04, Menús en la barra de " +
                        "título en una opción de apariencia, eliminación de Ubuntu One y One Music, nuevas opciones en " +
                        "configuración del sistema, subir el volumen máximo al 100%, entre otros.";
                intent.putExtra("ver","u14.04");
                intent.putExtra("des",descri);
                intent.putExtra("fi","17 de abril de 2014");
                intent.putExtra("fd","");
                break;
            case "Ubuntu 14.10":
                descri="Ubuntu 14.10 (nombre clave Utopic Unicorn - Unicornio Utópico)";
                intent.putExtra("ver","u14.10");
                intent.putExtra("des",descri);
                intent.putExtra("fi","23 de octubre de 2014");
                intent.putExtra("fd","");
                break;
            case "iOS 4":
                descri="El iOS 4 quedó disponible al público para el iPhone y el iPod touch. El iPhone 3G, " +
                        "junto con el iPod Touch (2.ª generación) tienen funciones limitadas. Esta es la " +
                        "primera versión del iOS que deja de dar soporte a los dispositivos más antiguos, " +
                        "en este caso la primera generación de iPhone y iPod Touch. También es la primera " +
                        "versión que deja de cobrar al iPod Touch para actualizarse.";
                intent.putExtra("ver","ios4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","21 de junio de 2010");
                intent.putExtra("fd","");
                break;
            case "iOS 5":
                descri="Este también es la segunda versión iOS que no permite actualizarse en los dispositivos antiguos," +
                        " en este caso: el iPhone 3G y el iPod touch 2G. Fue lanzado para iPhone 3GS, iPhone 4, iPhone 4s," +
                        " iPod touch 3G, iPod touch 4G, iPad, iPad 2 y iPad 3 el 12 de octubre de 2011.";
                intent.putExtra("ver","ios5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","6 de junio de 2011");
                intent.putExtra("fd","");
                break;
            case "iOS 6":
                descri="También, es la tercera versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el" +
                        " iPad (1.ª generación) y iPod Touch (3.ª generación). Fue lanzada para el iPhone 3GS, iPhone 4, iPhone 4s, " +
                        "iPhone 5, iPod Touch (4.ª y 5.ª generación), iPad (2.ª, 3.ª y 4.ª generación) y ipad mini el 19 de septiembre de 2012";
                intent.putExtra("ver","ios6");
                intent.putExtra("des",descri);
                intent.putExtra("fi","12 de junio de 2012");
                intent.putExtra("fd","");
                break;
            case "iOS 7":
                descri="iOS 7. Es la cuarta versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el " +
                        "iPhone 3GS y iPod Touch (4.ª generación). Fue lanzada para el iPhone 4, iPhone 4s, iPhone 5, iPhone 5c, " +
                        "iPhone 5s, iPod Touch (5.ª generación), iPad (2.ª, 3.ª, 4.ª y 5.ª generación), iPad Mini y iPad Mini con " +
                        "Pantalla Retina el 17 de septiembre de 2013.";
                intent.putExtra("ver","ios7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","10 de junio de 2013");
                intent.putExtra("fd","");
                break;
            case "iOS 8":
                descri="iOS 8. Es la quinta versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el iPhone 4." +
                        " Será lanzada para el iPhone 4s, iPhone 5, iPhone 5c, iPhone 5s, iPhone 6, iPhone 6 Plus, iPod Touch (5.ª generación)" +
                        ", iPad (2.ª, 3.ª, 4.ª, 5.ª y 6.ª generación), iPad mini (1.ª, 2.ª y 3.ª generación).";
                intent.putExtra("ver","ios8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","2 de junio de 2014");
                intent.putExtra("fd","");
                break;
            /****************BlackBerry OS *****************/
            case "BlackBerry 4.6":
                descri="BlackBerry 4.6 es un sistema desarrollado por Research In Motion, las novedades las apĺicaciones se organizaron " +
                        "en carpetas en el menú de aplicaciones, interfaz nuevo, Multimedia se ha rediseñado completamente.";
                intent.putExtra("ver","bb4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "BlackBerry 6":
                descri="Blackberry 6 es un sistema desarrollado por Research In Motion la cual fue presentado en el WES 2010 junto " +
                        "con un video promocional donde se muestra algunas novedades. RIM apuesta que su BlackBerry 6 estará enfocado" +
                        " en el mercado corporativo y no-corporativo. La mejor experiencia de este sistema se encontrara en los equipos " +
                        "touchscreen (Pantalla Táctil), aunque RIM aseguro que en los equipos que cuenten con un TouchPad o TrackPad" +
                        " podrán ejecutarlo ya que ejerce casi la misma función. Así mismo todavía RIM no ha aclarado cuales son los " +
                        "equipos que se podrán actualizar a esta versión aunque hay muchos rumores al respecto.";
                intent.putExtra("ver","bb6");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "BlackBerry 7.1":
                descri="Blackberry 7.1 es la última versión estable hasta el momento, esta nueva versión es muy parecida a la versión 7.0, " +
                        "pero con una renovación de los iconos y de la resolución de la pantalla del teléfono inteligente, también tiene la función de trabajar como un Router inálambrico para distribuir redes Wi-Fi por el entorno de el teléfono inteligente, también tiene características que hacen más fácil el uso del teléfono inteligente. También incluye una versión completa del software de edición de documentos Documents To Go, puede usarse sin la necesidad de comprar alguna clave como en los sistemas pasados, que era requerida para realizar la edición de archivos.";
                intent.putExtra("ver","bb7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            case "Blackberry 10":
                descri="BlackBerry 10 es el más reciente sistema operativo móvil propietario, desarrollado por BlackBerry para" +
                        " su línea de teléfono inteligentes BlackBerry. Está basado en QNX el cual fue adquirido por RIM en" +
                        " abril de 2010. La plataforma se llamaba originalmente BBX pero se cambió cuando a RIM se le bloqueó " +
                        "el uso de la marca comercial BBX después de la acción legal de BASIS International, quien también lo " +
                        "usa para su software. El CEO de RIM, Thorsten Heins, ha dicho que la compañía está considerando licenciar " +
                        "BlackBerry 10 a otros OEMs.";
                intent.putExtra("ver","bb10");
                intent.putExtra("des",descri);
                intent.putExtra("fi","");
                intent.putExtra("fd","");
                break;
            /*******************MAC OS*************************/
            case "Versión 10.0(Cheetah)":
                descri="Apple liberó el Mac OS X v10.0 (de nombre en código Cheetah). La versión inicial era lenta, estaba " +
                        "incompleta y tenía muy pocas aplicaciones disponibles al momento de su lanzamiento, casi todas de " +
                        "desarrolladores independientes. Mientras que muchos críticos dijeron que el sistema operativo no " +
                        "estaba listo para el público, reconocieron la importancia del lanzamiento inicial como una base " +
                        "sobre la cual se puede progresar. La mera liberación del Mac OS X fue recibido por la comunidad " +
                        "Macintosh como un gran acontecimiento. Después de corregir algunos errores de software, los kernel" +
                        " panics se hicieron menos frecuentes.";
                intent.putExtra("ver","os10");
                intent.putExtra("des",descri);
                intent.putExtra("fi","24 de marzo de 2001");
                intent.putExtra("fd","");
                break;
            case "Versión 10.1(Puma)":
                descri="Apple lanzó esta nueva versión que incrementaba el rendimiento del sistema a la vez que " +
                        "incorporaba algunas nuevas características tales como la reproducción de DVD. Dada la pésima " +
                        "reputación de la versión 10.0, Apple lanzó la 10.1 en forma de un CD de actualización gratuito" +
                        " para sus usuarios,74 además de los 129$ que costaba para los usuarios que seguían utilizando Mac OS 9." +
                        " Esto ocasionó algunos quebraderos de cabeza a Apple cuando descubrió que los CD de actualización podían" +
                        " ser utilizados también para hacer instalaciones completas en sistemas con Mac OS 9 con tan sólo eliminar " +
                        "un determinado archivo.";
                intent.putExtra("ver","os10.1");
                intent.putExtra("des",descri);
                intent.putExtra("fi","25 de septiembre de 2001");
                intent.putExtra("fd","");
                break;
            case "Versión 10.3(Panther)":
                descri="Además de tener un rendimiento mucho mayor, incorporó la mayor actualización en la interfaz de usuario," +
                        " y tantas o más mejoras que Jaguar el año anterior. Por otra parte, en esta versión dejaron de " +
                        "soportarse algunos modelos antiguos G3.\n" + "Las nuevas mejoras de Panther incluyen:79 Finder " +
                        "actualizado (que incorpora una interfaz metálica y búsqueda rápida), Exposé (una nueva forma de " +
                        "manipular ventanas), cambio rápido de usuarios (permite tener sesiones con diferentes usuarios " +
                        "abiertas al mismo tiempo y pasar de una a otra rápidamente), iChat AV (que añade soporte para " +
                        "videoconferencia a iChat), renderización mejorada de PDF, soporte integrado de fax, interoperabilidad " +
                        "mejorada con Microsoft Windows, FileVault (sistema de cifrado en tiempo real) e incremento de " +
                        "velocidad en todo el sistema con un mayor soporte para los G5.";
                intent.putExtra("ver","os10.3");
                intent.putExtra("des",descri);
                intent.putExtra("fi","24 de octubre de 2003");
                intent.putExtra("fd","");
                break;
            case "Versión 10.4(Tiger)":
                descri="Mac OS X v10.4 \"Tiger\" . Contiene más de 150 nuevas mejoras, pero al igual que con el lanzamiento " +
                        "de Panther, algunas máquinas antiguas dejaron de ser soportadas; en particular, cualquier equipo Apple " +
                        "que no cuente con conexión FireWire no está ya soportado en Tiger. Como curiosidad cabe comentar que " +
                        "Apple dispone a partir de Tiger, de una versión \"paralela\" compilada para procesadores Intel, si bien," +
                        " teóricamente, sólo podrá instalarse bajo ciertas restricciones de hardware y en procesadores con soporte" +
                        " SSE3. Esta versión apareció oficialmente el día 10 de enero de 2006 con los primeros equipos \"Mac Intel\":" +
                        " El iMac Core Duo (ex iMac G5), Mac mini Core Solo y Core Duo (ex Mac mini G4) además de los nuevos" +
                        " portátiles denominados MacBook y MacBook Pro, ambos equipados con procesadores Intel Core Duo. " +
                        "También han existido versiones para G4 de este sistema operativo, incluida al menos en los últimos " +
                        "PowerBook G4 a la venta.";
                intent.putExtra("ver","os10.4");
                intent.putExtra("des",descri);
                intent.putExtra("fi","29 de abril de 2005");
                intent.putExtra("fd","");
                break;
            case "Versión 10.5(Leopard)":
                descri="Fue llamado por Apple como «la mayor actualización del Mac OS X». Trajo consigo más de 300 nuevas " +
                        "funciones. Leopard soporta tanto procesadores PowerPC como Intel; el soporte para procesadores G3 " +
                        "fue abandonado y el procesador G4 requiere una velocidad mínima de 867 MHz, y 512 MB de RAM para " +
                        "permitir la instalación. El DVD de instalación funciona con todas las arquitecturas soportadas " +
                        "(incluyendo maquinas de 64 bits). Las nuevas funciones incluyen una nueva apariencia, un Finder " +
                        "actualizado, Time Machine (software para realizar copias de seguridad), Spaces, Boot Camp preinstalado," +
                        " soporte completo para aplicaciones de 64 bits, nuevas funciones en Mail e iChat, y nuevas " +
                        "características de seguridad. Leopard es un sistema UNIX certificado para la plataforma Intel. " +
                        "Es además el primer sistema operativo basado en BSD en recibir la certificación UNIX 03.85 " +
                        "Leopard abandonó el soporte para el Entorno Classic y las aplicaciones del mismo. Fue la " +
                        "última versión del Mac OS X con soporte para la arquitectura PowerPC.";
                intent.putExtra("ver","os10.5");
                intent.putExtra("des",descri);
                intent.putExtra("fi","26 de octubre de 2007");
                intent.putExtra("fd","");
                break;
            case "Versión 10.6(Snow Leopard)":
                descri="En lugar de incluir grandes cambios en la apariencia y funcionalidades como ocurrió en las " +
                        "versiones anteriores de Mac OS X, Snow Leopard se enfocó en cambios internos, como lo son: " +
                        "incrementar el rendimiento, la eficiencia y la estabilidad del sistema operativo. Para la" +
                        " mayoría de usuarios, los cambios más notables son: la cantidad de espacio que ocupa una " +
                        "instalación limpia, un Finder reescrito en Cocoa, copias de seguridad más rápidas en Time" +
                        " Machine, a una versión más completa de la aplicación Vista Previa, al igual que mayor velocidad " +
                        "en el navegador de internet Safari.";
                intent.putExtra("ver","os10.6");
                intent.putExtra("des",descri);
                intent.putExtra("fi","28 de agosto de 2009");
                intent.putExtra("fd","");
                break;
            case "Versión 10.7(Lion)":
                descri="Apple mostró un Sneak Peek del próximo sistema operativo Mac OS X 10.7 con nombre código «Lion». " +
                        "Dentro de las primeras características se encuentran Launchpad que es un gestor de aplicaciones estilo " +
                        "iOS; y Mission Control que se podría decir es la integración de Dashboard, Exposé, Spaces y ventanas de " +
                        "Aplicaciones a pantalla completa. El 24 de febrero del 2011 fue entregada una beta de Mac os 10.7 'Lion' " +
                        "a los desarrolladores, develando nuevas características como Airdrop, Resume, Auto Save, Versions y Mail 5." +
                        " El 6 de junio del 2011 en la Keynote de la WWDC se anunció que OS X 10.7 será puesto a la venta únicamente " +
                        "en descarga digital por la Mac App Store en Julio del 2011. A partir del 20 de julio Lion fue puesto a la venta " +
                        "en la Mac App Store por 23.95 euros, 29.99 dólares al cambio, y se desveló que estaría disponible para descarga " +
                        "desde la App Store y a partir del 20 de agosto estaría disponible para su venta en formato de pendrive.";
                intent.putExtra("ver","os10.7");
                intent.putExtra("des",descri);
                intent.putExtra("fi","20 de octubre de 2010");
                intent.putExtra("fd","");
                break;
            case "Versión 10.8(Mountain Lion)":
                descri="Apple lanzó la Developer Preview de Mac OS X 10.8 Mountain Lion, una versión del sistema operativo " +
                        "en la que se incluyen muchas aplicaciones nativas de iOS, como Recordatorios, Notas o Mensajes. " +
                        "Incluye también un centro de notificaciones cercano al de iOS. Mac OS X Mountain Lion salió a la" +
                        " venta en España el 25 de julio de 2012. Con esta nueva versión, Apple pretende potenciar el uso " +
                        "de la nube, con el ya usado iCloud, gracias a la integración con la suite ofimática, iWork. Otra " +
                        "de las grandes novedades es Game Center, una plataforma de juego que pretende ser la primera en " +
                        "aunar los progresos y logros de las consolas portátiles con los sistemas de escritorio.";
                intent.putExtra("ver","os10.8");
                intent.putExtra("des",descri);
                intent.putExtra("fi","16 de febrero de 2012");
                intent.putExtra("fd","");
                break;
            case "Versión 10.9(Mavericks)":
                descri="Apple lanzó la Actualización Mac OS X 10.9 Mavericks, una nueva versión que integra las aplicaciones de " +
                        "iOS como Recordatorios, Notas, Mensajes, iBook y notificaciones instantáneas pero con mucha más personalización." +
                        " La nueva versión se puede actualizar sin ningún costo desde el mismo día de su presentación. Entre otras " +
                        "novedades anunciadas de OS X Mavericks está la opción de usar una HDTV como segundo monitor por medio de " +
                        "Apple TV y el aumento de la duración de la batería para los usuarios de MacBook Air de 11\" y 13\", con mayor" +
                        " ahorro de energía para iMac. ";
                intent.putExtra("ver","os10.9");
                intent.putExtra("des",descri);
                intent.putExtra("fi","22 de octubre de 2013");
                intent.putExtra("fd","");
                break;
            case "Versión 10.10(Yosemite)":
                descri=" Apple presentó en la \"WWDC 2014\" Mac OS X 10.10 Yosemite, una nueva versión del sistema " +
                        "operativo que presenta un rediseño en su interfaz y mejoras en el Finder, Safari, Mail, Centro " +
                        "de Notificaciones, etc. La versión Beta se encontrará disponible únicamente para el primer " +
                        "millón de usuarios que se suscriban en el programa Beta de Apple";
                intent.putExtra("ver","os10.10");
                intent.putExtra("des",descri);
                intent.putExtra("fi"," 2 de junio de 2014");
                intent.putExtra("fd","");
                break;
        }


        startActivity(intent);
    }
}
