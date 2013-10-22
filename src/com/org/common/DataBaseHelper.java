package com.org.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * 
 *@author liangjilong 
 *
 *DataBaseHelper��һ������SQLite������,�ṩ��������Ĺ���
 *  1.getReadableDatebase(),getWriteableDatabase()���Ի�ȡSQLiteDatabase����,ͨ��
 *  2.�ṩ��onCreate()��onUpdate()�����ص�����,�������ǳ������������ݿ��ǽ���ʹ��
 */
public class DataBaseHelper extends SQLiteOpenHelper {
	// ��һ��Ĭ�ϵ�SQLite�����ݿ���
	private static final String DataBaseName = "SQLite_DB";
	private static final int VERSION = 2;

	/**
	 * ��SQLiteOpenHelper�����൱��,����Ҫ�еĹ��캯��
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 */
	public DataBaseHelper(Context context, String name, CursorFactory factory,
			int version) {
		// ����ͨ��super���ø��൱�еĹ��캯��
		super(context, DataBaseName, factory, version);
	}

	public DataBaseHelper(Context context) {
		super(context, DataBaseName, null, VERSION);
	}

	/**
	 * ��ʵ�ǵ����ĸ�����ĺ����ķ���
	 * @param context
	 * @param name
	 * @param version
	 */
	public DataBaseHelper(Context context, String name, int version) {
		this(context, name, null, version);
	}

	/**
	 * �ú������ڵ�һ�δ������ݿ��ʱ��ִ��,ʵ�������ڵ�һ�εõ�SQLiteDataBase�����ʱ��
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		System.out.println("create a DataBase");
		// execSQL��������ִ��sql���
		String sql="create table person(personid integer primary key autoincrement, name varchar(20),age integer,tel varchar(20))";
		db.execSQL(sql);
	}
	/**
	 * onUpgrade
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// ���������Ļ��Ͱ���ɾ��,
		db.execSQL("DROP TABLE IF EXISTS person");
		System.out.println("update a Database");
	}

}
