package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3390g;
import java.io.File;

/* renamed from: com.umeng.analytics.process.b */
/* loaded from: classes2.dex */
class C3416b extends SQLiteOpenHelper {
    public C3416b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, str, cursorFactory, i4);
    }

    /* renamed from: a */
    public static C3416b m3365a(Context context, String str) {
        String strM3368b = m3368b(context, str);
        InterfaceC3415a.f2376h.equals(str);
        return new C3416b(context, strM3368b, null, 1);
    }

    /* renamed from: b */
    public static String m3368b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = InterfaceC3415a.f2376h;
        }
        String strM3155b = C3390g.m3155b(context) + "subprocess/";
        if (InterfaceC3415a.f2376h.equals(str)) {
            strM3155b = C3390g.m3155b(context);
        }
        File file = new File(strM3155b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(strM3155b + InterfaceC3415a.f2373e, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m3367a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    /* renamed from: a */
    private void m3367a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    public static String m3366a(Context context) {
        return C3390g.m3155b(context) + "subprocess/";
    }
}
