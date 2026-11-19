package com.efs.sdk.base.p020a.p023c.p024a;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p020a.p023c.C2913a;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p027e.C2928f;
import com.efs.sdk.base.p020a.p027e.HandlerC2924b;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p034c.C2956b;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.e */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2918e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile SharedPreferences f1073a;

    /* renamed from: b */
    public static void m2119b() {
        File fileM2168a = C2943a.m2168a(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a);
        if (fileM2168a.exists()) {
            fileM2168a.delete();
        }
    }

    /* renamed from: d */
    private void m2120d() {
        if (this.f1073a == null) {
            synchronized (HandlerC2924b.class) {
                if (this.f1073a == null) {
                    this.f1073a = SharedPreferencesUtils.getSharedPreferences(C2921a.m2128a().f1040c, C2956b.m2209a(("config_" + C2921a.m2128a().f1038a.toLowerCase()).getBytes()));
                    this.f1073a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m2121a(@NonNull C2915b c2915b) {
        m2122c();
        if (this.f1073a == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f1073a.edit();
        editorEdit.clear();
        editorEdit.putInt("cver", c2915b.f1056a);
        editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : c2915b.f1060e.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
        return true;
    }

    /* renamed from: c */
    public final void m2122c() {
        try {
            m2120d();
        } catch (Throwable th) {
            C2957d.m2214b("efs.config", "init sharedpreferences error", th);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C2928f.a.f1111a.m2148a()) {
            return;
        }
        C2916c.m2097a().m2109b();
    }

    /* renamed from: a */
    public static boolean m2118a() {
        C2913a c2913aM2128a = C2921a.m2128a();
        File fileM2170b = C2943a.m2170b(c2913aM2128a.f1040c, c2913aM2128a.f1038a);
        if (!fileM2170b.exists()) {
            return false;
        }
        C2949b.m2188b(fileM2170b);
        return true;
    }
}
