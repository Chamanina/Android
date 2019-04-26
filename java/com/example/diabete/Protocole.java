package com.example.diabete;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;


public class Protocole extends MainActivity
{
    DiabeteBD diabeteBD;
    SQLiteDatabase sqLiteDatabase;
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

        DiabeteBD db = new DiabeteBD(this);

        editMatin1 = (EditText) findViewById(R.id.editMatin1);
       String EditMatin1 = editMatin1.getText().toString();

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
        button2 = (Button) findViewById(R.id.buttonRetour);


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
                } else {

                    Toast.makeText(getApplicationContext(), " :" + editMatin1, Toast.LENGTH_LONG).show();
                   /* setResult(RESULT_OK);
                    finish();//l’ac1vité est terminée et on	retourne à l’activité principale}
                */}
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();    //l’ac1vité	est	terminée	et	on	retourne	à	l’ac1vité	éme>rice
            }
        });



        }

        //insertion dans la BD Diabete
    /*public void insertProtocole(View view){

        String EditMidi1 = editMidi1.getText().toString();
        String EditSoir1 = editSoir1.getText().toString();

        String EditMatin2 = editMatin2.getText().toString();
        String EditMidi2 = editMidi2.getText().toString();
        String EditSoir2 = editSoir2.getText().toString();

        String EditMatin3 = editMatin3.getText().toString();
        String EditMidi3 = editMidi3.getText().toString();
        String EditSoir3 = editSoir3.getText().toString();

        String EditMatin4 = editMatin4.getText().toString();
        String EditMidi4 = editMidi4.getText().toString();
        String EditSoir4 = editSoir4.getText().toString();

        String EditMatin5 = editMatin5.getText().toString();
        String EditMidi5 = editMidi5.getText().toString();
        String EditSoir5 = editSoir5.getText().toString();

        String EditMatin6 = editMatin6.getText().toString();
        String EditMidi6 = editMidi6.getText().toString();
        String EditSoir6 = editSoir6.getText().toString();

        String EditMatin7 = editMatin7.getText().toString();
        String EditMidi7 = editMidi7.getText().toString();
        String EditSoir7 = editSoir7.getText().toString();

        diabeteBD = new DiabeteBD(context);
        sqLiteDatabase = diabeteBD.getWritableDatabase();
        diabeteBD.insertProtocole(EditMatin1,EditMidi1,EditSoir1,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin2,EditMidi2,EditSoir2,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin3,EditMidi3,EditSoir3,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin4,EditMidi4,EditSoir4,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin5,EditMidi5,EditSoir5,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin6,EditMidi6,EditSoir6,sqLiteDatabase);
        diabeteBD.insertProtocole(EditMatin7,EditMidi7,EditSoir7,sqLiteDatabase);
*/
    }




