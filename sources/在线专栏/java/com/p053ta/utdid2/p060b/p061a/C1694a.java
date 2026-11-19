package com.p053ta.utdid2.p060b.p061a;

import android.content.Context;
import android.content.SharedPreferences;
import com.p053ta.p054a.p057c.C1688f;

/* renamed from: com.ta.utdid2.b.a.a */
/* loaded from: classes.dex */
public class C1694a {

    /* renamed from: a */
    private SharedPreferences f7465a;

    public C1694a(Context context, String str, String str2) {
        this.f7465a = null;
        if (context == null) {
            return;
        }
        this.f7465a = context.getSharedPreferences(str2, 0);
    }

    /* renamed from: a */
    public int m5785a() {
        SharedPreferences sharedPreferences = this.f7465a;
        int i4 = sharedPreferences != null ? sharedPreferences.getInt("type", 0) : 0;
        C1688f.m5770a("PersistentConfiguration", "getTypeFromSp type", Integer.valueOf(i4));
        return i4;
    }

    /* renamed from: k */
    public String m5787k() {
        SharedPreferences sharedPreferences = this.f7465a;
        String string = sharedPreferences != null ? sharedPreferences.getString("UTDID2", "") : "";
        C1688f.m5770a("PersistentConfiguration", "getUtdidFromSp utdid", string);
        return string;
    }

    /* renamed from: a */
    public void m5786a(String str, int i4) {
        if (this.f7465a != null) {
            C1688f.m5770a("PersistentConfiguration", "writeUtdidToSp utdid", str);
            SharedPreferences.Editor editorEdit = this.f7465a.edit();
            editorEdit.putString("UTDID2", str);
            editorEdit.putInt("type", i4);
            if (this.f7465a.getLong("t2", 0L) == 0) {
                editorEdit.putLong("t2", System.currentTimeMillis());
            }
            try {
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }
}
