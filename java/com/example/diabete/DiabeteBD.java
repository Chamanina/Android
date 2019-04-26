package com.example.diabete;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DiabeteBD extends SQLiteOpenHelper {

    //Nom de la BD
    private  static final String DATABASE_NAME = "Diabete";

    // Numéro de version
    private static final int DATABASE_VERSION = 1;

    //Nom des tables (GLYCEMIE , PROTOCOLE)
    private static final String TABLE_GLYCEMIE = "T_GLYCEMIE";
    private static final String TABLE_PROTOCOLE = "T_PROTOCOLE";

    //Noms des champs de la table GLYCEMIE
    private static final String KEY_ID_GLY ="Id_gly";
    private static final String KEY_LIBELLE_GLY = "Libelle_gly";

    //Noms des champs de la table PROTOCOLE
    private static final String KEY_ID_PRO ="Id_pro";
    private static final String KEY_MATIN_GLY = "Matin_gly";
    private static final String KEY_MIDI_GLY = "Midi_gly";
    private static final String KEY_SOIR_GLY = "Soir_gly";

    public DiabeteBD(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Création de la table GLYCEMIE
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_T_GLYCEMIE_TABLE = "CREATE TABLE " + TABLE_GLYCEMIE + "("
                + KEY_ID_GLY + "INTERGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_LIBELLE_GLY + "TEXT" + ")";

        String CREATE_T_PROTOCOLE_TABLE = "CREATE TABLE " + TABLE_PROTOCOLE + "("
                + KEY_ID_PRO + "INTERGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_ID_GLY + "INTEGER,"
                + KEY_MATIN_GLY + "INTEGER,"
                + KEY_MIDI_GLY + "INTEGER,"
                + KEY_SOIR_GLY + "INTERGER,"
                + " FOREIGN KEY (" + KEY_ID_GLY + ") REFERENCES " + TABLE_GLYCEMIE + "(" + KEY_ID_GLY + "))";

        db.execSQL(CREATE_T_GLYCEMIE_TABLE);
        db.execSQL(CREATE_T_PROTOCOLE_TABLE);

        //Ajout des glycémies
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('Moins de 0,60g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('Moins de 1,00g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('De 1,00g à 1,50g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('De 1,50g à 2,00g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('De 2,00g à 2,50g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('De 2,50g à 3,00g')");
        db.execSQL("INSERT INTO TABLE_GLYCEMIE (LIBELLE_GLY) "
                + "VALUES ('Plus de 3,00g')");
    }

     void insertProtocole(String KEY_MATIN_GLY, String KEY_MIDI_GLY, String KEY_SOIR_GLY, SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DiabeteBD.TABLE_PROTOCOLE,KEY_MATIN_GLY);
        contentValues.put(DiabeteBD.TABLE_PROTOCOLE,KEY_MIDI_GLY);
        contentValues.put(DiabeteBD.TABLE_PROTOCOLE,KEY_SOIR_GLY);
        db.insert(DiabeteBD.TABLE_PROTOCOLE,null,contentValues);
    }

    /*public List<Protocole> getLesProtocoles(){
        List<Protocole> protocoleList = new ArrayList<Protocole>();

        String selectQuery = "SELECT * FROM " + TABLE_PROTOCOLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Protocole protocole = new Protocole();
                protocole.editMatin1(Integer.parseInt(cursor.getString(0)));
                protocole.editMidi1(Integer.parseInt(cursor.getString(1)));
                protocole.editSoir1(Integer.parseInt(cursor.getString(3)));

                protocoleList.add(protocole);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return protocoleList;

            }*/




    //Maj de la BD si nouvelle version
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        //Suppression de la table GLYCEMIE si elle existe
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_GLYCEMIE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PROTOCOLE);

        //Création à nouveau de la table;
        onCreate(db);
    }
}




