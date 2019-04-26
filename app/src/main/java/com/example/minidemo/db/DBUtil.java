package com.example.minidemo.db;

import android.content.Context;

import com.example.minidemo.model.DaoMaster;
import com.example.minidemo.model.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * @author bob
 * Date     19-4-26
 * Description
 */
public class DBUtil {
    /**
     * 数据库名称
     */
    private static final String DATA_NAME="DATA_NAME";

    private static DaoSession daoSession;

    public static void init(Context context){
        initGreenDB(context);
    }
    /**
     * 初始化GreenDao数据库
     * @param context
     */
    private static void initGreenDB(Context context){
        DaoMaster.DevOpenHelper openHelper=new  DaoMaster.DevOpenHelper(context,DATA_NAME);
        Database db = openHelper.getWritableDb();
        DaoMaster daoMaster =new DaoMaster(db);
        daoSession =daoMaster.newSession();
    }


}
