package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C3397n;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* renamed from: a */
    private static Context f1556a;

    /* renamed from: com.umeng.analytics.CoreProtocol$a */
    public static class C3314a {

        /* renamed from: a */
        private static final CoreProtocol f1557a = new CoreProtocol();

        private C3314a() {
        }
    }

    public static CoreProtocol getInstance(Context context) {
        if (f1556a == null && context != null) {
            f1556a = context.getApplicationContext();
        }
        return C3314a.f1557a;
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        C3397n.m3225a(f1556a).m3258a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        C3397n.m3225a(f1556a).m3265b();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C3397n.m3225a(f1556a).m3259a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j4) {
        return C3397n.m3225a(f1556a).m3257a(j4);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i4) {
        C3397n.m3225a(f1556a).m3260a(obj, i4);
    }

    private CoreProtocol() {
    }
}
