package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.analytics.pro.w */
/* loaded from: classes2.dex */
class C3406w implements InterfaceC3405v {

    /* renamed from: a */
    private long f2341a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.InterfaceC3405v
    /* renamed from: a */
    public void mo3340a(long j4) {
        this.f2341a = j4;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3405v
    /* renamed from: a */
    public long mo3338a() {
        return this.f2341a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3405v
    /* renamed from: a */
    public String mo3339a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(jCurrentTimeMillis + appkey + "02:00:00:00:00:00");
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.InterfaceC3405v
    /* renamed from: a */
    public boolean mo3342a(long j4, long j5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j4 == 0 || jCurrentTimeMillis - j4 >= this.f2341a) && j5 > 0 && jCurrentTimeMillis - j5 > this.f2341a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3405v
    /* renamed from: a */
    public void mo3341a(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong(C3403t.f2322b, 0L);
            editorEdit.putLong(C3403t.f2325e, jCurrentTimeMillis);
            editorEdit.putLong(C3403t.f2326f, 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
