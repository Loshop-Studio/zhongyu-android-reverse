package com.efs.sdk.base.p035a.p038c.p039a;

import android.content.SharedPreferences;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p035a.p038c.C1285a;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p042e.C1300f;
import com.efs.sdk.base.p035a.p042e.HandlerC1296b;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p049c.C1328b;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.e */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1290e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile SharedPreferences f7043a;

    /* renamed from: b */
    static void m5478b() {
        File fileM5527a = C1315a.m5527a(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a);
        if (fileM5527a.exists()) {
            fileM5527a.delete();
        }
    }

    /* renamed from: d */
    private void m5479d() {
        if (this.f7043a == null) {
            synchronized (HandlerC1296b.class) {
                if (this.f7043a == null) {
                    this.f7043a = SharedPreferencesUtils.getSharedPreferences(C1293a.m5487a().f7010c, C1328b.m5568a(("config_" + C1293a.m5487a().f7008a.toLowerCase()).getBytes()));
                    this.f7043a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    /* renamed from: a */
    final boolean m5480a(C1287b c1287b) {
        m5481c();
        if (this.f7043a == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f7043a.edit();
        editorEdit.clear();
        editorEdit.putInt("cver", c1287b.f7026a);
        editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : c1287b.f7030e.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
        return true;
    }

    /* renamed from: c */
    final void m5481c() {
        try {
            m5479d();
        } catch (Throwable th) {
            C1329d.m5573b("efs.config", "init sharedpreferences error", th);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C1300f.a.f7081a.m5507a()) {
            return;
        }
        C1288c.m5456a().m5468b();
    }

    /* renamed from: a */
    static boolean m5477a() {
        C1285a c1285aM5487a = C1293a.m5487a();
        File fileM5529b = C1315a.m5529b(c1285aM5487a.f7010c, c1285aM5487a.f7008a);
        if (!fileM5529b.exists()) {
            return false;
        }
        C1321b.m5547b(fileM5529b);
        return true;
    }
}
