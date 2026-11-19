package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1906g;
import java.io.File;

/* renamed from: com.umeng.analytics.process.b */
/* loaded from: classes.dex */
class C1932b extends SQLiteOpenHelper {
    C1932b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, str, cursorFactory, i4);
    }

    /* renamed from: a */
    static C1932b m7288a(Context context, String str) {
        String strM7291b = m7291b(context, str);
        InterfaceC1931a.f8968h.equals(str);
        return new C1932b(context, strM7291b, null, 1);
    }

    /* renamed from: b */
    public static String m7291b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = InterfaceC1931a.f8968h;
        }
        String strM7078b = C1906g.m7078b(context) + "subprocess/";
        if (InterfaceC1931a.f8968h.equals(str)) {
            strM7078b = C1906g.m7078b(context);
        }
        File file = new File(strM7078b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(strM7078b + InterfaceC1931a.f8965e, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m7290a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    /* renamed from: a */
    private void m7290a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    public static String m7289a(Context context) {
        return C1906g.m7078b(context) + "subprocess/";
    }
}
