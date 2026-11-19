package com.umeng.analytics.process;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.process.AbstractC6778a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p124h2.C8091a;
import p124h2.C8092b;
import p144j2.C8210a;
import p186n2.AbstractC9089c;
import p260u2.AbstractC9666a;
import p310z2.AbstractC9993d;
import p310z2.C9991b;
import p310z2.InterfaceC9990a;

/* loaded from: classes4.dex */
public class UMProcessDBHelper {

    /* renamed from: d */
    public static UMProcessDBHelper f6707d;

    /* renamed from: a */
    public Context f6708a;

    /* renamed from: b */
    public C9991b f6709b = new C9991b();

    /* renamed from: c */
    public C6776c f6710c = new C6776c(this, null);

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$a */
    public class C6774a implements Serializable {

        /* renamed from: a */
        public int f6711a;

        /* renamed from: b */
        public String f6712b;

        /* renamed from: c */
        public String f6713c;

        /* renamed from: d */
        public String f6714d;

        /* renamed from: e */
        public int f6715e;

        /* renamed from: f */
        public String f6716f;

        /* renamed from: g */
        public String f6717g;

        /* renamed from: h */
        public String f6718h;

        public C6774a() {
        }

        public /* synthetic */ C6774a(UMProcessDBHelper uMProcessDBHelper, C6775b c6775b) {
            this();
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$b */
    public class C6775b implements AbstractC6778a.b {
        public C6775b() {
        }

        @Override // com.umeng.analytics.process.AbstractC6778a.b
        /* renamed from: a */
        public void mo6243a() {
            if (AbstractC9666a.f17069a) {
                AbstractC9089c.m14596m(UMProcessDBHelper.this.f6708a, 36946, C6779b.m6250i(UMProcessDBHelper.this.f6708a), null);
            }
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$c */
    public class C6776c implements InterfaceC9990a {
        public C6776c() {
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: a */
        public boolean mo6244a(String str) {
            return false;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: c */
        public boolean mo6245c(String str, Object obj) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith("ua_")) {
                str = str.replaceFirst("ua_", "");
            }
            UMProcessDBHelper.this.m6235i(str.replace(".db", ""), (JSONArray) obj);
            return true;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: e */
        public boolean mo6246e(File file, int i9) {
            return false;
        }

        public /* synthetic */ C6776c(UMProcessDBHelper uMProcessDBHelper, C6775b c6775b) {
            this();
        }
    }

    /* renamed from: com.umeng.analytics.process.UMProcessDBHelper$d */
    public class C6777d implements InterfaceC9990a {
        public C6777d() {
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: a */
        public boolean mo6244a(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith("ua_")) {
                str = str.replaceFirst("ua_", "");
            }
            UMProcessDBHelper.this.m6239m(str.replace(".db", ""));
            return true;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: c */
        public boolean mo6245c(String str, Object obj) {
            return false;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: e */
        public boolean mo6246e(File file, int i9) {
            return false;
        }

        public /* synthetic */ C6777d(UMProcessDBHelper uMProcessDBHelper, C6775b c6775b) {
            this();
        }
    }

    public UMProcessDBHelper(Context context) {
        C8210a.m13221a().m13223c(context);
    }

    /* renamed from: h */
    public static UMProcessDBHelper m6229h(Context context) {
        if (f6707d == null) {
            synchronized (UMProcessDBHelper.class) {
                try {
                    if (f6707d == null) {
                        f6707d = new UMProcessDBHelper(context);
                    }
                } finally {
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = f6707d;
        uMProcessDBHelper.f6708a = context;
        return uMProcessDBHelper;
    }

    /* renamed from: c */
    public final List m6230c(String str, JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i9);
                    C6774a c6774a = new C6774a(this, null);
                    c6774a.f6713c = jSONObject.optString("id");
                    c6774a.f6717g = AbstractC9993d.m17320e(this.f6708a);
                    c6774a.f6718h = AbstractC9993d.m17319d(this.f6708a);
                    c6774a.f6712b = jSONObject.optString("__i");
                    c6774a.f6715e = jSONObject.optInt("__t");
                    c6774a.f6716f = str;
                    if (jSONObject.has("ds")) {
                        jSONObject.remove("ds");
                    }
                    jSONObject.put("ds", m6234g());
                    jSONObject.remove("__i");
                    jSONObject.remove("__t");
                    c6774a.f6714d = C8210a.m13221a().m13222b(jSONObject.toString());
                    jSONObject.remove("ds");
                    arrayList.add(c6774a);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m6231d(String str) {
        try {
            return new File(C8091a.m12919h(this.f6708a, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e */
    public void m6232e(String str, String str2, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM12922a;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseM12922a = C8092b.m12921b(this.f6708a).m12922a(str);
            try {
                sQLiteDatabaseM12922a.beginTransaction();
                int size = list.size();
                if (size > 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        sQLiteDatabaseM12922a.execSQL("delete from __et_p where rowid=" + ((C6774a) list.get(i9)).f6711a);
                    }
                } else {
                    sQLiteDatabaseM12922a.delete("__et_p", null, null);
                }
                sQLiteDatabaseM12922a.setTransactionSuccessful();
                sQLiteDatabaseM12922a.endTransaction();
            } catch (Exception unused) {
                sQLiteDatabase = sQLiteDatabaseM12922a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                C8092b.m12921b(this.f6708a).m12923c(str);
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteDatabaseM12922a != null) {
                    sQLiteDatabaseM12922a.endTransaction();
                }
                C8092b.m12921b(this.f6708a).m12923c(str);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            sQLiteDatabaseM12922a = null;
            th = th3;
        }
        C8092b.m12921b(this.f6708a).m12923c(str);
    }

    /* renamed from: f */
    public void m6233f(List list) {
        SQLiteDatabase sQLiteDatabaseM12922a = null;
        try {
            sQLiteDatabaseM12922a = C8092b.m12921b(this.f6708a).m12922a("_main_");
            sQLiteDatabaseM12922a.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabaseM12922a.delete("__et_p", "id=?", new String[]{String.valueOf((Integer) it.next())});
            }
            sQLiteDatabaseM12922a.setTransactionSuccessful();
        } catch (Exception unused) {
            if (sQLiteDatabaseM12922a != null) {
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseM12922a != null) {
                sQLiteDatabaseM12922a.endTransaction();
            }
            C8092b.m12921b(this.f6708a).m12923c("_main_");
            throw th;
        }
        sQLiteDatabaseM12922a.endTransaction();
        C8092b.m12921b(this.f6708a).m12923c("_main_");
    }

    /* renamed from: g */
    public final int m6234g() {
        return 0;
    }

    /* renamed from: i */
    public void m6235i(String str, JSONArray jSONArray) throws Throwable {
        if (AbstractC9666a.f17069a && !TextUtils.isEmpty(str)) {
            m6237k(str, m6230c(str, jSONArray));
        }
    }

    /* renamed from: j */
    public void m6236j(String str, JSONArray jSONArray) throws Throwable {
        if (AbstractC9666a.f17069a && !TextUtils.isEmpty(str)) {
            File file = new File(C8091a.m12919h(this.f6708a, str));
            if (file.exists()) {
                this.f6709b.m17312c(file, this.f6710c, jSONArray);
            } else {
                m6235i(str, jSONArray);
            }
        }
    }

    /* renamed from: k */
    public final boolean m6237k(String str, List list) throws Throwable {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseM12922a = C8092b.m12921b(this.f6708a).m12922a(str);
            try {
                try {
                    sQLiteDatabaseM12922a.beginTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C6774a c6774a = (C6774a) it.next();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", c6774a.f6712b);
                            contentValues.put("__e", c6774a.f6713c);
                            contentValues.put("__t", Integer.valueOf(c6774a.f6715e));
                            contentValues.put("__pn", c6774a.f6716f);
                            contentValues.put("__av", c6774a.f6717g);
                            contentValues.put("__vc", c6774a.f6718h);
                            contentValues.put("__s", c6774a.f6714d);
                            sQLiteDatabaseM12922a.insert("__et_p", null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    sQLiteDatabaseM12922a.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseM12922a.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    C8092b.m12921b(this.f6708a).m12923c(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = sQLiteDatabaseM12922a;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    C8092b.m12921b(this.f6708a).m12923c(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = sQLiteDatabaseM12922a;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                C8092b.m12921b(this.f6708a).m12923c(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: l */
    public void m6238l() {
        try {
            AbstractC6778a.m6248b(C8091a.m12918c(this.f6708a), new C6777d(this, null), new C6775b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public final void m6239m(String str) throws Throwable {
        if (m6231d(str)) {
            List listM6240n = m6240n(str);
            if (!listM6240n.isEmpty() && m6237k("_main_", listM6240n)) {
                m6232e(str, null, listM6240n);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.umeng.analytics.process.UMProcessDBHelper$b] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: n */
    public final List m6240n(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM12922a;
        Exception e10;
        Cursor cursorRawQuery;
        ArrayList arrayList = new ArrayList();
        ?? r22 = 0;
        r22 = 0;
        try {
            try {
                try {
                    sQLiteDatabaseM12922a = C8092b.m12921b(this.f6708a).m12922a(str);
                } catch (Throwable th) {
                    th = th;
                    r22 = "select *  from __et_p";
                }
                try {
                    sQLiteDatabaseM12922a.beginTransaction();
                    cursorRawQuery = sQLiteDatabaseM12922a.rawQuery("select *  from __et_p", null);
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                C6774a c6774a = new C6774a(this, r22);
                                c6774a.f6711a = cursorRawQuery.getInt(0);
                                c6774a.f6712b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__i"));
                                c6774a.f6713c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__e"));
                                c6774a.f6714d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__s"));
                                c6774a.f6715e = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("__t"));
                                c6774a.f6716f = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__pn"));
                                c6774a.f6717g = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__av"));
                                c6774a.f6718h = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__vc"));
                                arrayList.add(c6774a);
                            } catch (Exception e11) {
                                e10 = e11;
                                e10.printStackTrace();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (sQLiteDatabaseM12922a != null) {
                                    sQLiteDatabaseM12922a.endTransaction();
                                }
                                C8092b.m12921b(this.f6708a).m12923c(str);
                                return arrayList;
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    cursorRawQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r22 != 0) {
                        try {
                            r22.close();
                        } catch (Exception unused) {
                            C8092b.m12921b(this.f6708a).m12923c(str);
                            throw th;
                        }
                    }
                    if (sQLiteDatabaseM12922a != null) {
                        sQLiteDatabaseM12922a.endTransaction();
                    }
                    C8092b.m12921b(this.f6708a).m12923c(str);
                    throw th;
                }
            } catch (Exception e13) {
                sQLiteDatabaseM12922a = null;
                e10 = e13;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabaseM12922a = null;
            }
            sQLiteDatabaseM12922a.endTransaction();
        } catch (Exception unused2) {
        }
        C8092b.m12921b(this.f6708a).m12923c(str);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject m6241o(long r20, java.util.List r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.m6241o(long, java.util.List):org.json.JSONObject");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* renamed from: p */
    public JSONObject m6242p(Integer num) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        StringBuilder sb = new StringBuilder();
        ?? M12922a = "select *  from __et_p where rowid=";
        sb.append("select *  from __et_p where rowid=");
        sb.append(num);
        String string = sb.toString();
        ?? r32 = 0;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        Cursor cursor = null;
        r32 = 0;
        try {
            try {
                M12922a = C8092b.m12921b(this.f6708a).m12922a("_main_");
                try {
                    M12922a.beginTransaction();
                    Cursor cursorRawQuery = M12922a.rawQuery(string, null);
                    if (cursorRawQuery != null) {
                        try {
                            try {
                                if (cursorRawQuery.moveToNext()) {
                                    jSONObject = new JSONObject();
                                    try {
                                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__av"));
                                        String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("__vc"));
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject.put("__av", string2);
                                        }
                                        if (!TextUtils.isEmpty(string3)) {
                                            jSONObject.put("__vc", string3);
                                        }
                                        jSONObject2 = jSONObject;
                                    } catch (Exception e10) {
                                        e = e10;
                                        cursor = cursorRawQuery;
                                        sQLiteDatabase = M12922a;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused) {
                                                C8092b.m12921b(this.f6708a).m12923c("_main_");
                                                r32 = jSONObject;
                                                M12922a = sQLiteDatabase;
                                                return r32;
                                            }
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        C8092b.m12921b(this.f6708a).m12923c("_main_");
                                        r32 = jSONObject;
                                        M12922a = sQLiteDatabase;
                                        return r32;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                r32 = cursorRawQuery;
                                if (r32 != 0) {
                                    try {
                                        r32.close();
                                    } catch (Exception unused2) {
                                        C8092b.m12921b(this.f6708a).m12923c("_main_");
                                        throw th;
                                    }
                                }
                                if (M12922a != 0) {
                                    M12922a.endTransaction();
                                }
                                C8092b.m12921b(this.f6708a).m12923c("_main_");
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            jSONObject = null;
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused3) {
                        }
                    }
                    M12922a.endTransaction();
                    C8092b.m12921b(this.f6708a).m12923c("_main_");
                    r32 = jSONObject2;
                    M12922a = M12922a;
                } catch (Exception e12) {
                    e = e12;
                    jSONObject = null;
                    sQLiteDatabase = M12922a;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e = e13;
            sQLiteDatabase = null;
            jSONObject = null;
        } catch (Throwable th3) {
            th = th3;
            M12922a = 0;
        }
        return r32;
    }
}
