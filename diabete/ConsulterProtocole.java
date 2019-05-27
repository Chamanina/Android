package com.example.diabete;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConsulterProtocole extends Protocole
{
    private	Button	button1	;

    private static final String TAG = "SecondActivity";

    TextView simpleEditMatin1, simpleEditMidi1, simpleEditSoir1;
    TextView simpleEditMatin2, simpleEditMidi2, simpleEditSoir2;
    TextView simpleEditMatin3, simpleEditMidi3, simpleEditSoir3;
    TextView simpleEditMatin4, simpleEditMidi4, simpleEditSoir4;
    TextView simpleEditMatin5, simpleEditMidi5, simpleEditSoir5;
    TextView simpleEditMatin6, simpleEditMidi6, simpleEditSoir6;
    TextView simpleEditMatin7, simpleEditMidi7, simpleEditSoir7;




    @Override
    public	void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.consulter_protocole);

        //Récupération des vues
        button1 = (Button)findViewById(R.id.button1);

        simpleEditMatin1 = (TextView)findViewById(R.id.editMatin1);
        simpleEditMidi1 = (TextView)findViewById(R.id.editMidi1);
        simpleEditSoir1 = (TextView)findViewById(R.id.editSoir1);

        simpleEditMatin2 = (TextView)findViewById(R.id.editMatin2);
        simpleEditMidi2 = (TextView)findViewById(R.id.editMidi2);
        simpleEditSoir2 = (TextView)findViewById(R.id.editSoir2);

        simpleEditMatin3 = (TextView)findViewById(R.id.editMatin3);
        simpleEditMidi3 = (TextView)findViewById(R.id.editMidi3);
        simpleEditSoir3 = (TextView)findViewById(R.id.editSoir3);

        simpleEditMatin4 = (TextView)findViewById(R.id.editMatin4);
        simpleEditMidi4 = (TextView)findViewById(R.id.editMidi4);
        simpleEditSoir4 = (TextView)findViewById(R.id.editSoir4);

        simpleEditMatin5 = (TextView)findViewById(R.id.editMatin5);
        simpleEditMidi5 = (TextView)findViewById(R.id.editMidi5);
        simpleEditSoir5 = (TextView)findViewById(R.id.editSoir5);

        simpleEditMatin6 = (TextView)findViewById(R.id.editMatin6);
        simpleEditMidi6 = (TextView)findViewById(R.id.editMidi6);
        simpleEditSoir6 = (TextView)findViewById(R.id.editSoir6);

        simpleEditMatin7 = (TextView)findViewById(R.id.editMatin7);
        simpleEditMidi7 = (TextView)findViewById(R.id.editMidi7);
        simpleEditSoir7 = (TextView)findViewById(R.id.editSoir7);




        //Récupération de l'intent afin d'éviter de toujours faire un new
        Intent intent = getIntent();
        if (intent != null)
        {

            // - DE 0.60G
            //Charge les préférences de l'application par rapport aux clés exportés de Protocole.java
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

            String Matin1 = preferences.getString("Matin1","");
            TextView textViewMatin1 = (TextView)findViewById(R.id.simpleEditMatin1);
            //Remplace la textView par la clé correspondante
            textViewMatin1.setText(Matin1);

                String Midi1 = preferences.getString("Midi1","");
                TextView textViewMidi1 = (TextView)findViewById(R.id.simpleEditMidi1);
                textViewMidi1.setText(Midi1);

                    String Soir1 = preferences.getString("Soir1","");
                    TextView textViewSoir1 = (TextView)findViewById(R.id.simpleEditSoir1);
                    textViewSoir1.setText(Soir1);

            //- DE 1.00G
            String Matin2 = preferences.getString("Matin2","");
            TextView textViewMatin2 = (TextView)findViewById(R.id.simpleEditMatin2);
            //Remplace la textView par la clé correspondante
            textViewMatin2.setText(Matin2);

                String Midi2 = preferences.getString("Midi2","");
                TextView textViewMidi2 = (TextView)findViewById(R.id.simpleEditMidi2);
                textViewMidi2.setText(Midi2);

                    String Soir2 = preferences.getString("Soir2","");
                    TextView textViewSoir2 = (TextView)findViewById(R.id.simpleEditSoir2);
                    textViewSoir2.setText(Soir2);

            // DE 1.00G A 1.50G
            String Matin3 = preferences.getString("Matin3","");
            TextView textViewMatin3 = (TextView)findViewById(R.id.simpleEditMatin3);
            //Remplace la textView par la clé correspondante
            textViewMatin3.setText(Matin3);

                String Midi3 = preferences.getString("Midi3","");
                TextView textViewMidi3 = (TextView)findViewById(R.id.simpleEditMidi3);
                textViewMidi3.setText(Midi3);

                    String Soir3 = preferences.getString("Soir3","");
                    TextView textViewSoir3 = (TextView)findViewById(R.id.simpleEditSoir3);
                    textViewSoir3.setText(Soir3);

            // DE 1.50G A 2.00G
            String Matin4 = preferences.getString("Matin4","");
            TextView textViewMatin4 = (TextView)findViewById(R.id.simpleEditMatin4);
            //Remplace la textView par la clé correspondante
            textViewMatin4.setText(Matin4);

                String Midi4 = preferences.getString("Midi4","");
                TextView textViewMidi4 = (TextView)findViewById(R.id.simpleEditMidi4);
                textViewMidi4.setText(Midi4);

                    String Soir4 = preferences.getString("Soir4","");
                    TextView textViewSoir4 = (TextView)findViewById(R.id.simpleEditSoir4);
                    textViewSoir4.setText(Soir4);


            // DE 2.00G A 2.50G
            String Matin5 = preferences.getString("Matin5","");
            TextView textViewMatin5 = (TextView)findViewById(R.id.simpleEditMatin5);
            //Remplace la textView par la clé correspondante
            textViewMatin5.setText(Matin5);

                String Midi5 = preferences.getString("Midi5","");
                TextView textViewMidi5 = (TextView)findViewById(R.id.simpleEditMidi5);
                textViewMidi5.setText(Midi5);

                    String Soir5 = preferences.getString("Soir5","");
                    TextView textViewSoir5 = (TextView)findViewById(R.id.simpleEditSoir5);
                    textViewSoir5.setText(Soir5);


            // DE 2.50G A 3.00G
            String Matin6 = preferences.getString("Matin6","");
            TextView textViewMatin6 = (TextView)findViewById(R.id.simpleEditMatin6);
            //Remplace la textView par la clé correspondante
            textViewMatin6.setText(Matin6);

                String Midi6 = preferences.getString("Midi6","");
                TextView textViewMidi6 = (TextView)findViewById(R.id.simpleEditMidi6);
                textViewMidi6.setText(Midi6);

                    String Soir6 = preferences.getString("Soir6","");
                    TextView textViewSoir6 = (TextView)findViewById(R.id.simpleEditSoir6);
                    textViewSoir6.setText(Soir6);


            // + DE 3.00G
            String Matin7 = preferences.getString("Matin7","");
            TextView textViewMatin7 = (TextView)findViewById(R.id.simpleEditMatin7);
            //Remplace la textView par la clé correspondante
            textViewMatin7.setText(Matin7);

                String Midi7 = preferences.getString("Midi7","");
                TextView textViewMidi7 = (TextView)findViewById(R.id.simpleEditMidi7);
                textViewMidi7.setText(Midi7);

                    String Soir7 = preferences.getString("Soir7","");
                    TextView textViewSoir7 = (TextView)findViewById(R.id.simpleEditSoir7);
                    textViewSoir7.setText(Soir7);

        }

        button1.setOnClickListener	(new View.OnClickListener()
        {
            public	void	onClick	(View	v)
            {
               Intent intent = new Intent(ConsulterProtocole.this,MainActivity.class);
               startActivity(intent);
            }
        });
    }
}