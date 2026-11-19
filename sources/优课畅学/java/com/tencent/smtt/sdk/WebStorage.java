package com.tencent.smtt.sdk;

import java.util.Map;

/* loaded from: classes4.dex */
public class WebStorage {

    /* renamed from: a */
    private static WebStorage f6694a;

    @Deprecated
    public interface QuotaUpdater {
        void updateQuota(long j10);
    }

    /* renamed from: a */
    private static synchronized WebStorage m5948a() {
        try {
            if (f6694a == null) {
                f6694a = new WebStorage();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6694a;
    }

    public static WebStorage getInstance() {
        return m5948a();
    }

    public void deleteAllData() {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().deleteAllData();
        } else {
            c6816boM6152b.m6158d().m6196n();
        }
    }

    public void deleteOrigin(String str) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().deleteOrigin(str);
        } else {
            c6816boM6152b.m6158d().m6185e(str);
        }
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().getOrigins(valueCallback);
        } else {
            c6816boM6152b.m6158d().m6165a(valueCallback);
        }
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().getQuotaForOrigin(str, valueCallback);
        } else {
            c6816boM6152b.m6158d().m6175b(str, valueCallback);
        }
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().getUsageForOrigin(str, valueCallback);
        } else {
            c6816boM6152b.m6158d().m6167a(str, valueCallback);
        }
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j10) {
        C6816bo c6816boM6152b = C6816bo.m6152b();
        if (c6816boM6152b == null || !c6816boM6152b.m6157c()) {
            android.webkit.WebStorage.getInstance().setQuotaForOrigin(str, j10);
        } else {
            c6816boM6152b.m6158d().m6166a(str, j10);
        }
    }
}
