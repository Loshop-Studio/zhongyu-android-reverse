package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.analytics.pro.w */
/* loaded from: classes.dex */
class C1922w implements InterfaceC1921v {

    /* renamed from: a */
    private long f8933a = AnalyticsConfig.kContinueSessionMillis;

    C1922w() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC1921v
    /* renamed from: a */
    public void mo7263a(long j4) {
        this.f8933a = j4;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1921v
    /* renamed from: a */
    public long mo7261a() {
        return this.f8933a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1921v
    /* renamed from: a */
    public String mo7262a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(jCurrentTimeMillis + appkey + "02:00:00:00:00:00");
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.InterfaceC1921v
    /* renamed from: a */
    public boolean mo7265a(long j4, long j5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j4 == 0 || jCurrentTimeMillis - j4 >= this.f8933a) && j5 > 0 && jCurrentTimeMillis - j5 > this.f8933a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC1921v
    /* renamed from: a */
    public void mo7264a(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong(C1919t.f8914b, 0L);
            editorEdit.putLong(C1919t.f8917e, jCurrentTimeMillis);
            editorEdit.putLong(C1919t.f8918f, 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
