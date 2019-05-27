package com.example.diabete;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;


public class ModifierProtocole extends MainActivity
{


    private	Button	button1	;
    private	Button	button2;

    @Override
    public	void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.modifier_protocole);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        String Matin1 = preferences.getString("Matin1","");
        final EditText editMatin1 = (EditText) findViewById(R.id.editMatin1);
        //Remplace la textView par la clé correspondante
        editMatin1.setText(Matin1);

        String Midi1 = preferences.getString("Midi1","");
        final EditText editMidi1 = (EditText) findViewById(R.id.editMidi1);
        //Remplace la textView par la clé correspondante
        editMidi1.setText(Midi1);

        String Soir1 = preferences.getString("Soir1","");
        final EditText editSoir1 = (EditText) findViewById(R.id.editSoir1);
        //Remplace la textView par la clé correspondante
        editSoir1.setText(Soir1);


        String Matin2 = preferences.getString("Matin2","");
        final EditText editMatin2 = (EditText) findViewById(R.id.editMatin2);
        //Remplace la textView par la clé correspondante
        editMatin2.setText(Matin2);

        String Midi2 = preferences.getString("Midi2","");
        final EditText editMidi2 = (EditText) findViewById(R.id.editMidi2);
        //Remplace la textView par la clé correspondante
        editMidi2.setText(Midi2);

        String Soir2 = preferences.getString("Soir2","");
        final EditText editSoir2 = (EditText) findViewById(R.id.editSoir2);
        //Remplace la textView par la clé correspondante
        editSoir2.setText(Soir2);


        String Matin3 = preferences.getString("Matin3","");
        final EditText editMatin3 = (EditText) findViewById(R.id.editMatin3);
        //Remplace la textView par la clé correspondante
        editMatin3.setText(Matin3);

        String Midi3 = preferences.getString("Midi3","");
        final EditText editMidi3 = (EditText) findViewById(R.id.editMidi3);
        //Remplace la textView par la clé correspondante
        editMidi3.setText(Midi3);

        String Soir3 = preferences.getString("Soir3","");
        final EditText editSoir3 = (EditText) findViewById(R.id.editSoir3);
        //Remplace la textView par la clé correspondante
        editSoir3.setText(Soir3);


        String Matin4 = preferences.getString("Matin4","");
        final EditText editMatin4 = (EditText) findViewById(R.id.editMatin4);
        //Remplace la textView par la clé correspondante
        editMatin4.setText(Matin4);

        String Midi4 = preferences.getString("Midi4","");
        final EditText editMidi4 = (EditText) findViewById(R.id.editMidi4);
        //Remplace la textView par la clé correspondante
        editMidi4.setText(Midi4);

        String Soir4 = preferences.getString("Soir4","");
        final EditText editSoir4 = (EditText) findViewById(R.id.editSoir4);
        //Remplace la textView par la clé correspondante
        editSoir4.setText(Soir4);


        String Matin5 = preferences.getString("Matin5","");
        final EditText editMatin5 = (EditText) findViewById(R.id.editMatin5);
        //Remplace la textView par la clé correspondante
        editMatin5.setText(Matin5);

        String Midi5 = preferences.getString("Midi5","");
        final EditText editMidi5 = (EditText) findViewById(R.id.editMidi5);
        //Remplace la textView par la clé correspondante
        editMidi5.setText(Midi5);

        String Soir5 = preferences.getString("Soir5","");
        final EditText editSoir5 = (EditText) findViewById(R.id.editSoir5);
        //Remplace la textView par la clé correspondante
        editSoir5.setText(Soir5);


        String Matin6 = preferences.getString("Matin6","");
        final EditText editMatin6 = (EditText) findViewById(R.id.editMatin6);
        //Remplace la textView par la clé correspondante
        editMatin6.setText(Matin6);

        String Midi6 = preferences.getString("Matin6","");
        final EditText editMidi6 = (EditText) findViewById(R.id.editMidi6);
        //Remplace la textView par la clé correspondante
        editMidi6.setText(Midi6);

        String Soir6 = preferences.getString("Soir6","");
        final EditText editSoir6 = (EditText) findViewById(R.id.editSoir6);
        //Remplace la textView par la clé correspondante
        editSoir6.setText(Soir6);


        String Matin7 = preferences.getString("Matin7","");
        final EditText editMatin7 = (EditText) findViewById(R.id.editMatin7);
        //Remplace la textView par la clé correspondante
        editMatin7.setText(Matin7);

        String Midi7 = preferences.getString("Matin7","");
        final EditText editMidi7 = (EditText) findViewById(R.id.editMidi7);
        //Remplace la textView par la clé correspondante
        editMidi7.setText(Midi7);

        String Soir7 = preferences.getString("Soir7","");
        final EditText editSoir7 = (EditText) findViewById(R.id.editSoir7);
        //Remplace la textView par la clé correspondante
        editSoir7.setText(Soir7);

        button1 = (Button) findViewById(R.id.buttonEnregistrer);
        button2 = (Button) findViewById(R.id.buttonConsulter);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    //Récupère les String
                  String Matin1 = editMatin1.getText().toString();
                    String Midi1 = editMidi1.getText().toString();
                    String Soir1 = editSoir1.getText().toString();

                    String Matin2 = editMatin2.getText().toString();
                    String Midi2 = editMidi2.getText().toString();
                    String Soir2 =editSoir2.getText().toString();

                    String Matin3 = editMatin3.getText().toString();
                    String Midi3 = editMidi3.getText().toString();
                    String Soir3 = editSoir3.getText().toString();

                    String Matin4 = editMatin4.getText().toString();
                    String Midi4 = editMidi4.getText().toString();
                    String Soir4 = editSoir4.getText().toString();

                    String Matin5 = editMatin5.getText().toString();
                    String Midi5 = editMidi5.getText().toString();
                    String Soir5 = editSoir5.getText().toString();

                    String Matin6 = editMatin6.getText().toString();
                    String Midi6 = editMidi6.getText().toString();
                    String Soir6 = editSoir6.getText().toString();

                    String Matin7 = editMatin7.getText().toString();
                    String Midi7 = editMidi7.getText().toString();
                    String Soir7 = editSoir7.getText().toString();


                    Intent intent = new Intent(ModifierProtocole.this, ConsulterProtocole.class);

                    //clé + valeur
                    //Permet la sauvegarde puis la modification des valeurs (Editor)
                    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("Matin1", Matin1);
                    editor.putString("Midi1", Midi1);
                    editor.putString("Soir1", Soir1);

                    editor.putString("Matin2", Matin2);
                    editor.putString("Midi2", Midi2);
                    editor.putString("Soir2", Soir2);

                    editor.putString("Matin3", Matin3);
                    editor.putString("Midi3", Midi3);
                    editor.putString("Soir3", Soir3);

                    editor.putString("Matin4", Matin4);
                    editor.putString("Midi4", Midi4);
                    editor.putString("Soir4", Soir4);

                    editor.putString("Matin5", Matin5);
                    editor.putString("Midi5", Midi5);
                    editor.putString("Soir5", Soir5);

                    editor.putString("Matin6", Matin6);
                    editor.putString("Midi6", Midi6);
                    editor.putString("Soir6", Soir6);

                    editor.putString("Matin7", Matin7);
                    editor.putString("Midi7", Midi7);
                    editor.putString("Soir7", Soir7);

                    //Applique la modification
                    editor.apply();

                    //Effectué la redirection de l'intent
                    startActivity(intent);

                }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModifierProtocole.this, ConsulterProtocole.class);
                startActivity(intent);
            }
        });
    }
}