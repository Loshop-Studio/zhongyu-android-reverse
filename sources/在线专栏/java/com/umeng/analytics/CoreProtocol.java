package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C1913n;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMSenderStateNotify;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CoreProtocol implements UMLogDataProtocol, UMSenderStateNotify {

    /* renamed from: a */
    private static Context f8148a;

    /* renamed from: com.umeng.analytics.CoreProtocol$a */
    private static class C1830a {

        /* renamed from: a */
        private static final CoreProtocol f8149a = new CoreProtocol();

        private C1830a() {
        }
    }

    public static CoreProtocol getInstance(Context context) {
        if (f8148a == null && context != null) {
            f8148a = context.getApplicationContext();
        }
        return C1830a.f8149a;
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onConnectionAvailable() {
        C1913n.m7148a(f8148a).m7181a();
    }

    @Override // com.umeng.commonsdk.framework.UMSenderStateNotify
    public void onSenderIdle() {
        C1913n.m7148a(f8148a).m7188b();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C1913n.m7148a(f8148a).m7182a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j4) {
        return C1913n.m7148a(f8148a).m7180a(j4);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i4) {
        C1913n.m7148a(f8148a).m7183a(obj, i4);
    }

    private CoreProtocol() {
    }
}
