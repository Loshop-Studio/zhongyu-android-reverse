package p124h2;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.io.File;
import p114g2.AbstractC8014f0;

/* renamed from: h2.a */
/* loaded from: classes4.dex */
public class C8091a extends SQLiteOpenHelper {
    public C8091a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i9) {
        super(context, str, cursorFactory, i9);
    }

    /* renamed from: a */
    public static C8091a m12917a(Context context, String str) {
        String strM12919h = m12919h(context, str);
        "_main_".equals(str);
        return new C8091a(context, strM12919h, null, 1);
    }

    /* renamed from: c */
    public static String m12918c(Context context) {
        return AbstractC8014f0.m12597e(context) + "subprocess/";
    }

    /* renamed from: h */
    public static String m12919h(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "_main_";
        }
        String strM12597e = AbstractC8014f0.m12597e(context) + "subprocess/";
        if ("_main_".equals(str)) {
            strM12597e = AbstractC8014f0.m12597e(context);
        }
        File file = new File(strM12597e);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(strM12597e + "ua_%s.db", str);
    }

    /* renamed from: g */
    public final void m12920g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        m12920g(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }
}
