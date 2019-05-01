package com.example.diabete;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class Protocole extends MainActivity
{


   DiabeteBD diabeteBD;

    private	Button	button1	;
    private	Button	button2;

    EditText editMatin1, editMidi1, editSoir1;
    EditText editMatin2, editMidi2, editSoir2;
    EditText editMatin3, editMidi3, editSoir3;
    EditText editMatin4, editMidi4, editSoir4;
    EditText editMatin5, editMidi5, editSoir5;
    EditText editMatin6, editMidi6, editSoir6;
    EditText editMatin7, editMidi7, editSoir7;


    @Override
    public	void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.protocole);


        diabeteBD = new DiabeteBD(this);

        editMatin1 = (EditText) findViewById(R.id.editMatin1);
        editMidi1 = (EditText) findViewById(R.id.editMidi1);
        editSoir1 = (EditText) findViewById(R.id.editSoir1);

        editMatin2 = (EditText) findViewById(R.id.editMatin2);
        editMidi2 = (EditText) findViewById(R.id.editMidi2);
        editSoir2 = (EditText) findViewById(R.id.editSoir2);

        editMatin3 = (EditText) findViewById(R.id.editMatin3);
        editMidi3 = (EditText) findViewById(R.id.editMidi3);
        editSoir3 = (EditText) findViewById(R.id.editSoir3);

        editMatin4 = (EditText) findViewById(R.id.editMatin4);
        editMidi4 = (EditText) findViewById(R.id.editMidi4);
        editSoir4 = (EditText) findViewById(R.id.editSoir4);

        editMatin5 = (EditText) findViewById(R.id.editMatin5);
        editMidi5 = (EditText) findViewById(R.id.editMidi5);
        editSoir5 = (EditText) findViewById(R.id.editSoir5);

        editMatin6 = (EditText) findViewById(R.id.editMatin6);
        editMidi6 = (EditText) findViewById(R.id.editMidi6);
        editSoir6 = (EditText) findViewById(R.id.editSoir6);

        editMatin7 = (EditText) findViewById(R.id.editMatin7);
        editMidi7 = (EditText) findViewById(R.id.editMidi7);
        editSoir7 = (EditText) findViewById(R.id.editSoir7);

        button1 = (Button) findViewById(R.id.buttonEnregistrer);
        button2 = (Button) findViewById(R.id.buttonConsulter);





        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editMatin1.getText().toString().isEmpty() || editMidi1.getText().toString().isEmpty() || editSoir1.getText().toString().isEmpty() ||
                        editMatin2.getText().toString().isEmpty() || editMidi2.getText().toString().isEmpty() || editSoir2.getText().toString().isEmpty() ||
                        editMatin3.getText().toString().isEmpty() || editMidi3.getText().toString().isEmpty() || editSoir3.getText().toString().isEmpty() ||
                        editMatin4.getText().toString().isEmpty() || editMidi4.getText().toString().isEmpty() || editSoir4.getText().toString().isEmpty() ||
                        editMatin5.getText().toString().isEmpty() || editMidi5.getText().toString().isEmpty() || editSoir5.getText().toString().isEmpty() ||
                        editMatin6.getText().toString().isEmpty() || editMidi6.getText().toString().isEmpty() || editSoir6.getText().toString().isEmpty() ||
                        editMatin7.getText().toString().isEmpty() || editMidi7.getText().toString().isEmpty() || editSoir7.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Veuillez remplir toutes les Unités d'insuline.", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    //Récupère les String
                    String Matin1 = editMatin1.getText().toString();
                    String Midi1 = editMidi1.getText().toString();
                    String Soir1 = editSoir1.getText().toString();

                    String Matin2 = editMatin2.getText().toString();
                    String Midi2 = editMidi2.getText().toString();
                    String Soir2 = editSoir2.getText().toString();

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


                        Intent intent = new Intent(Protocole.this, ConsulterProtocole.class);

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
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Protocole.this, ConsulterProtocole.class);
                startActivity(intent);
            }
        });
    }
}

