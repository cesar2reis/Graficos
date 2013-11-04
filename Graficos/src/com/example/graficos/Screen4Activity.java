package com.example.graficos;
 
import android.app.Activity; 
import android.content.Intent; 
import android.graphics.Color; 
import android.os.Bundle; 
import android.view.View; 
import android.webkit.WebView; 
import android.widget.Toast; 
@SuppressWarnings("unused")
public class Screen4Activity extends Activity { 
WebView wvGrafico; 
String strURL; 

@Override
public void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.screen4); 
strURL = "https://chart.googleapis.com/chart?" + 
"cht=lc&" + //define o tipo do gr�fico "linha" 
"chxt=x,y&" + //imprime os valores dos eixos X, Y 
"chs=300x300&" + //define o tamanho da imagem 
"chd=t:10,45,5,10,13,26&" + //valor de cada coluna do gr�fico 
"chl=Jan|Fev|Mar|Abr|Mai|Jun&" + //r�tulo para cada coluna 
"chdl=Vendas&" + //legenda do gr�fico 
"chxr=1,0,50&" + //define o valor de in�cio e fim do eixo 
"chds=0,50&" + //define o valor de escala dos dados 
"chg=0,5,0,0&" + //desenha linha horizontal na grade 
"chco=3D7930&" + //cor da linha do gr�fico 
"chtt=Vendas+x+1000&" + //cabe�alho do gr�fico 
"chm=B,C5D4B5BB,0,0,0"; }//fundo verde
}
