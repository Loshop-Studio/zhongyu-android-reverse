package com.p074ta.utdid2.p081b.p082a;

import android.content.Context;
import android.content.SharedPreferences;
import com.p074ta.p075a.p078c.C7585f;

/* renamed from: com.ta.utdid2.b.a.a */
/* loaded from: classes5.dex */
public class C7591a {

    /* renamed from: a */
    private SharedPreferences f12863a;

    public C7591a(Context context, String str, String str2) {
        this.f12863a = null;
        if (context == null) {
            return;
        }
        this.f12863a = context.getSharedPreferences(str2, 0);
    }

    /* renamed from: a */
    public int m9811a() {
        SharedPreferences sharedPreferences = this.f12863a;
        int i10 = sharedPreferences != null ? sharedPreferences.getInt("type", 0) : 0;
        C7585f.m9796a("PersistentConfiguration", "getTypeFromSp type", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: k */
    public String m9813k() {
        SharedPreferences sharedPreferences = this.f12863a;
        String string = sharedPreferences != null ? sharedPreferences.getString("UTDID2", "") : "";
        C7585f.m9796a("PersistentConfiguration", "getUtdidFromSp utdid", string);
        return string;
    }

    /* renamed from: a */
    public void m9812a(String str, int i10) {
        if (this.f12863a != null) {
            C7585f.m9796a("PersistentConfiguration", "writeUtdidToSp utdid", str);
            SharedPreferences.Editor editorEdit = this.f12863a.edit();
            editorEdit.putString("UTDID2", str);
            editorEdit.putInt("type", i10);
            if (this.f12863a.getLong("t2", 0L) == 0) {
                editorEdit.putLong("t2", System.currentTimeMillis());
            }
            try {
                editorEdit.commit();
            } catch (Exception unused) {
            }
        }
    }
}
