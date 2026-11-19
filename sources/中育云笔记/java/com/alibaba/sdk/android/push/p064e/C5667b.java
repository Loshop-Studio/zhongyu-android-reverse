package com.alibaba.sdk.android.push.p064e;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import com.alibaba.sdk.android.ams.common.p051b.InterfaceC5574b;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.p060c.C5651a;

/* renamed from: com.alibaba.sdk.android.push.e.b */
/* loaded from: classes3.dex */
public class C5667b {
    /* renamed from: a */
    public static void m3671a(CommonCallback commonCallback, C5670e c5670e) {
        ErrorCode errorCodeM3673a = c5670e.m3673a();
        AmsLogger.getImportantLogger().m3423i("errorCode:" + errorCodeM3673a);
        if (errorCodeM3673a.getCode().contains(C5654c.f4242a.getCode())) {
            if (commonCallback != null) {
                commonCallback.onSuccess(errorCodeM3673a.getMsg());
            }
        } else {
            if (commonCallback != null) {
                commonCallback.onFailed(errorCodeM3673a.getCode(), errorCodeM3673a.getMsg());
            }
            m3672a(errorCodeM3673a.getCode(), errorCodeM3673a.getMsg());
        }
    }

    /* renamed from: a */
    private static void m3672a(String str, String str2) {
        InterfaceC5574b interfaceC5574bM3411a = C5575c.m3411a();
        C5651a c5651aM3610a = C5651a.m3610a();
        if (c5651aM3610a == null || interfaceC5574bM3411a == null) {
            return;
        }
        c5651aM3610a.m3615a(str, str2, interfaceC5574bM3411a.mo3403b());
    }
}
