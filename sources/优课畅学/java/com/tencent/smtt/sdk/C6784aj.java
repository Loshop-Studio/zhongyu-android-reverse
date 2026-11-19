package com.tencent.smtt.sdk;

import android.text.TextUtils;
import com.tencent.smtt.export.external.TbsCoreSettings;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.smtt.sdk.aj */
/* loaded from: classes4.dex */
class C6784aj {

    /* renamed from: a */
    public boolean f6809a = false;

    /* renamed from: b */
    public boolean f6810b = false;

    /* renamed from: c */
    private Map<String, String> f6811c;

    public C6784aj() {
        this.f6811c = null;
        this.f6811c = new HashMap();
    }

    /* renamed from: a */
    public synchronized void m6062a(String str, byte b10) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = "";
            if (b10 == 1) {
                str2 = "_begin";
            } else if (b10 == 2) {
                str2 = "_end";
            }
            this.f6811c.put(str + str2, String.valueOf(System.currentTimeMillis()));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m6063a(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6811c.put(str, String.valueOf(j10));
    }

    /* renamed from: a */
    public synchronized boolean m6064a(int i10, String str) {
        try {
            C6816bo c6816boM6152b = C6816bo.m6152b();
            if (!c6816boM6152b.m6157c()) {
                return false;
            }
            if (!this.f6810b || !this.f6809a) {
                if (System.currentTimeMillis() % 10 != 0) {
                    return true;
                }
            }
            this.f6810b = true;
            this.f6809a = true;
            this.f6811c.put("is_first_init_tbs", String.valueOf(true));
            this.f6811c.put("is_first_init_x5", String.valueOf(this.f6809a));
            this.f6811c.put("x5_webview_id", Integer.toString(i10));
            this.f6811c.put("current_url", str);
            Map<String, Object> map = QbSdk.f6583l;
            if (map != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_APP_SCENE_ID)) {
                this.f6811c.put(TbsCoreSettings.TBS_SETTINGS_APP_SCENE_ID, "" + QbSdk.f6583l.get(TbsCoreSettings.TBS_SETTINGS_APP_SCENE_ID));
            }
            c6816boM6152b.m6158d().m6173b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setTbsInitPerformanceData", new Class[]{Integer.TYPE, Map.class}, Integer.valueOf(i10), this.f6811c);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
