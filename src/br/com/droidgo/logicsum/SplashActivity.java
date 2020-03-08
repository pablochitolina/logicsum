package br.com.droidgo.logicsum;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.droidgo.logicsum.bean.UserDataSingleton;
import br.com.droidgo.logicsum.sum.util.Constants;
import br.com.droidgo.logicsum.R;
 
public class SplashActivity extends Activity {
 
    // Splash screen timer
    private static int LOGO_TIME_OUT = 1500;
    private static int TXT_TIME_1 = 200;
    private static int TXT_TIME_2 = 300;
    private static int TXT_TIME_3 = 400;
    private static int TXT_TIME_4 = 500;
    private static int TXT_TIME_5 = 600;
    private static int TXT_TIME_6 = 700;
    private static int TXT_TIME_7 = 800;
    private static int TXT_TIME_8 = 900;
    private static int TXT_TIME_9 = 1000;
    
    private UserDataSingleton userData = UserDataSingleton.getInstance();
    
    TextView txtL, txtO, txtG, txtI, txtC, txtS, txtU, txtM;
    ImageView imgLogo;
 
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        userData.setMostraMsg(Boolean.TRUE);
        userData.setInstrucao(getResources().getString(R.string.labelInstrucao));
        
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        
        txtL = (TextView) findViewById(R.id.txtL);
        txtO = (TextView) findViewById(R.id.txtO);
        txtG = (TextView) findViewById(R.id.txtG); 
        txtI = (TextView) findViewById(R.id.txtI); 
        txtC = (TextView) findViewById(R.id.txtC); 
        txtS = (TextView) findViewById(R.id.txtS); 
        txtU = (TextView) findViewById(R.id.txtU); 
        txtM = (TextView) findViewById(R.id.txtM);
        
        new Handler().postDelayed(new Runnable() {
        	 
            @Override
            public void run() {
            	Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
            
        }, LOGO_TIME_OUT);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtL.setTextColor(getResources().getColor(R.color.c1));
            }
        }, TXT_TIME_1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtO.setTextColor(getResources().getColor(R.color.c2));
            }
        }, TXT_TIME_2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtG.setTextColor(getResources().getColor(R.color.c3));
            }
        }, TXT_TIME_3);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtI.setTextColor(getResources().getColor(R.color.c4));
            }
        }, TXT_TIME_4);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtC.setTextColor(getResources().getColor(R.color.c5));
            }
        }, TXT_TIME_5);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtS.setTextColor(getResources().getColor(R.color.c6));
            }
        }, TXT_TIME_6);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtU.setTextColor(getResources().getColor(R.color.c8));
            }
        }, TXT_TIME_7);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtM.setTextColor(getResources().getColor(R.color.c8));
            	
            }
        }, TXT_TIME_8);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	txtL.setTextColor(getResources().getColor(R.color.c1));
            	txtO.setTextColor(getResources().getColor(R.color.c2));
            	txtG.setTextColor(getResources().getColor(R.color.c3));
            	txtI.setTextColor(getResources().getColor(R.color.c4));
            	txtC.setTextColor(getResources().getColor(R.color.c5));
            	txtS.setTextColor(getResources().getColor(R.color.c6));
            	txtU.setTextColor(getResources().getColor(R.color.c7));
            	txtM.setTextColor(getResources().getColor(R.color.c8));
            	
            }
        }, TXT_TIME_9);
    }
}
