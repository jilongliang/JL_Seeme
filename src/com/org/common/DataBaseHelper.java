package com.org.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * 
 *@author liangjilong 
 *
 *DataBaseHelper是一个访问SQLite的助类,提供两个方面的功能
 *  1.getReadableDatebase(),getWriteableDatabase()可以获取SQLiteDatabase对象,通过
 *  2.提供了onCreate()和onUpdate()两个回调函数,允许我们常见和升级数据库是进行使用
 */
public class DataBaseHelper extends SQLiteOpenHelper {
	// 给一个默认的SQLite的数据库名
	private static final String DataBaseName = "SQLite_DB";
	private static final int VERSION = 2;

	/**
	 * 在SQLiteOpenHelper的子类当中,必须要有的构造函数
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 */
	public DataBaseHelper(Context context, String name, CursorFactory factory,
			int version) {
		// 必须通过super调用父类当中的构造函数
		super(context, DataBaseName, factory, version);
	}

	public DataBaseHelper(Context context) {
		super(context, DataBaseName, null, VERSION);
	}

	/**
	 * 其实是调用四个构造的函数的方法
	 * @param context
	 * @param name
	 * @param version
	 */
	public DataBaseHelper(Context context, String name, int version) {
		this(context, name, null, version);
	}

	/**
	 * 该函数是在第一次创建数据库的时候执行,实际上是在第一次得到SQLiteDataBase对象的时候
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		System.out.println("create a DataBase");
		// execSQL函数用于执行sql语句
		String sql="create table person(personid integer primary key autoincrement, name varchar(20),age integer,tel varchar(20))";
		db.execSQL(sql);
	}
	/**
	 * onUpgrade
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// 存在这个表的话就把它删除,
		db.execSQL("DROP TABLE IF EXISTS person");
		System.out.println("update a Database");
	}

}
