package applusiana.kamusbahasa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 04/05/2018.
 */

public class DatabaseKamus extends SQLiteOpenHelper {

    private  static final  String DATABASE_NAME = "dbkamus";
    public  static final String ID = "id";
    public  static final String INGGRIS = "inggris";
    public static final  String INDONESIA = "indonesia";

    public DatabaseKamus(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, 1);
    }

    public DatabaseKamus(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists " +
            "kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "inggris TEXT, " +
            "indonesia TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    public void addTranslate(dbTranslate translate){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(INGGRIS, translate.getInggris());
        cv.put(INDONESIA, translate.getIndonesia());

        db.insert("kamus", null, cv);
    }

    public String getTranslateEng(String ind){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query("kamus",
                new String[]{INGGRIS},
                INDONESIA + " = ?",
                new String[] {ind},
                null,
                null,
                null,
                "1" );

        if (cursor != null){
            if (cursor.moveToFirst());
            return cursor.getString(0);
        }

        return "";
    }

    public String getTranslateInd(String eng){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query("kamus",
                new String[]{INDONESIA},
                INGGRIS + " = ?",
                new String[] {eng},
                null,
                null,
                null,
                "1" );

        if (cursor != null){
            if (cursor.moveToFirst());
            return cursor.getString(0);
        }

        return "";
    }

    public List<translate> getAll(){
        List<translate> translates = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from kamus", null);

        if (cursor != null){
            if (cursor.moveToFirst()){
                while (!cursor.isAfterLast()){

                    translate Translate = new translate();
                    Translate.setId(cursor.getInt(0));
                    Translate.setInggris(cursor.getString(1));
                    Translate.setIndonesia(cursor.getString(2));

                    translates.add(Translate);

                    cursor.moveToNext();
                }
            }

        }

        return translates;
    }

}
