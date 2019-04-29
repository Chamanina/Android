package com.example.diabete;


import android.content.SharedPreferences;
import android.os.Bundle;
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

       /* SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        int editMatin1 = sharedPreferences.getInt("editMatin1",1);
        int editMidi1 = sharedPreferences.getInt("editMidi1", 1);*/

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
                    //récupère string
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
                        intent.putExtra("Matin1",Matin1);
                        intent.putExtra("Midi1", Midi1);
                        intent.putExtra("Soir1", Soir1);

                        intent.putExtra("Matin2",Matin2);
                        intent.putExtra("Midi2", Midi2);
                        intent.putExtra("Soir2", Soir2);

                        intent.putExtra("Matin3",Matin3);
                        intent.putExtra("Midi3", Midi3);
                        intent.putExtra("Soir3", Soir3);

                        intent.putExtra("Matin4",Matin4);
                        intent.putExtra("Midi4", Midi4);
                        intent.putExtra("Soir4", Soir4);

                        intent.putExtra("Matin5",Matin5);
                        intent.putExtra("Midi5", Midi5);
                        intent.putExtra("Soir5", Soir5);

                        intent.putExtra("Matin6",Matin6);
                        intent.putExtra("Midi6", Midi6);
                        intent.putExtra("Soir6", Soir6);

                        intent.putExtra("Matin7",Matin7);
                        intent.putExtra("Midi7", Midi7);
                        intent.putExtra("Soir7", Soir7);

                        startActivity(intent);

                    // On récupère les edits d'insuline
                     /*  //Passe un entier : nombre caractère se trouvant dans le string. Pour passer 2 types de données (String et Int)

                        String Matin1 = editMatin1.getText().toString();
                        //Changement du edit en ENTIER
                        int editMatin1 = Integer.parseInt(Matin1);

                        String Midi1 = editMidi1.getText().toString();
                        int editMidi1 = Integer.parseInt(Midi1);

                        // MODE_PRIVATE  : Seul l'appli peut accéder à la sauvegarde
                        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();

                        editor.putInt("editMatin1", editMatin1);
                        editor.putInt("editMidi1",editMidi1);

                        editor.apply();*/

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

