package com.alibaba.sdk.android.push.p034e;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import com.alibaba.sdk.android.ams.common.p021b.InterfaceC1099b;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.p030c.C1160a;

/* renamed from: com.alibaba.sdk.android.push.e.b */
/* loaded from: classes.dex */
public class C1176b {
    /* renamed from: a */
    public static void m5220a(CommonCallback commonCallback, C1179e c1179e) {
        ErrorCode errorCodeM5222a = c1179e.m5222a();
        AmsLogger.getImportantLogger().m5022i("errorCode:" + errorCodeM5222a);
        if (errorCodeM5222a.getCode().contains(C1163c.f6718a.getCode())) {
            if (commonCallback != null) {
                commonCallback.onSuccess(errorCodeM5222a.getMsg());
            }
        } else {
            if (commonCallback != null) {
                commonCallback.onFailed(errorCodeM5222a.getCode(), errorCodeM5222a.getMsg());
            }
            m5221a(errorCodeM5222a.getCode(), errorCodeM5222a.getMsg());
        }
    }

    /* renamed from: a */
    private static void m5221a(String str, String str2) {
        InterfaceC1099b interfaceC1099bM5010a = C1100c.m5010a();
        C1160a c1160aM5159a = C1160a.m5159a();
        if (c1160aM5159a == null || interfaceC1099bM5010a == null) {
            return;
        }
        c1160aM5159a.m5164a(str, str2, interfaceC1099bM5010a.mo5002b());
    }
}
