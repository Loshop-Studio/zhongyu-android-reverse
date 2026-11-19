package com.efs.sdk.base.p039a.p042c.p043a;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import com.efs.sdk.base.p039a.p042c.C5653a;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p046e.C5668f;
import com.efs.sdk.base.p039a.p046e.HandlerC5664b;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p053c.C5696b;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.e */
/* loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC5658e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile SharedPreferences f4677a;

    /* renamed from: b */
    public static void m4088b() {
        File fileM4137a = C5683a.m4137a(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a);
        if (fileM4137a.exists()) {
            fileM4137a.delete();
        }
    }

    /* renamed from: d */
    private void m4089d() {
        if (this.f4677a == null) {
            synchronized (HandlerC5664b.class) {
                try {
                    if (this.f4677a == null) {
                        this.f4677a = SharedPreferencesUtils.getSharedPreferences(C5661a.m4097a().f4644c, C5696b.m4178a(("config_" + C5661a.m4097a().f4642a.toLowerCase()).getBytes()));
                        this.f4677a.registerOnSharedPreferenceChangeListener(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m4090a(@NonNull C5655b c5655b) {
        m4091c();
        if (this.f4677a == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f4677a.edit();
        editorEdit.clear();
        editorEdit.putInt("cver", c5655b.f4660a);
        editorEdit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : c5655b.f4664e.entrySet()) {
            editorEdit.putString(entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
        return true;
    }

    /* renamed from: c */
    public final void m4091c() {
        try {
            m4089d();
        } catch (Throwable th) {
            C5697d.m4183b("efs.config", "init sharedpreferences error", th);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C5668f.a.f4715a.m4117a()) {
            return;
        }
        C5656c.m4066a().m4078b();
    }

    /* renamed from: a */
    public static boolean m4087a() {
        C5653a c5653aM4097a = C5661a.m4097a();
        File fileM4139b = C5683a.m4139b(c5653aM4097a.f4644c, c5653aM4097a.f4642a);
        if (!fileM4139b.exists()) {
            return false;
        }
        C5689b.m4157b(fileM4139b);
        return true;
    }
}
