package com.alibaba.sdk.android.push.p064e;

import android.content.Context;
import android.util.Log;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.C5584c;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.common.util.p061a.AbstractAsyncTaskC5659c;
import com.alibaba.sdk.android.push.common.util.p061a.C5658b;
import com.alibaba.sdk.android.push.p058a.C5649f;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.e.h */
/* loaded from: classes3.dex */
public class AsyncTaskC5673h extends AbstractAsyncTaskC5659c {

    /* renamed from: c */
    private static final AmsLogger f4387c = AmsLogger.getLogger("MPS:VipRequestTask");

    /* renamed from: d */
    private final CommonCallback f4388d;

    public AsyncTaskC5673h(Context context, String str, CommonCallback commonCallback) {
        super(context, str);
        this.f4388d = commonCallback;
    }

    @Override // com.alibaba.sdk.android.push.common.util.p061a.AbstractAsyncTaskC5659c
    /* renamed from: a */
    public Map<String, String> mo3633a(Context context, Map<String, String> map) {
        return C5584c.m3458a(map);
    }

    /* renamed from: a */
    private void m3715a(int i10, C5658b c5658b, CommonCallback commonCallback) {
        ErrorCode errorCodeBuild;
        String code;
        if (commonCallback == null) {
            return;
        }
        f4387c.m3417d("requestType: " + i10 + ", errorCode:" + c5658b.f4271c + ", httpcode: " + c5658b.f4270b + ", content:" + c5658b.f4269a);
        if (!c5658b.f4271c.getCode().equals(C5654c.f4242a.getCode())) {
            commonCallback.onFailed(c5658b.f4271c.getCode(), c5658b.f4271c.getMsg());
            return;
        }
        try {
            commonCallback.onSuccess(C5674i.m3716a(i10, c5658b.f4270b, c5658b.f4269a));
        } catch (C5649f e10) {
            f4387c.m3421e("Vip call failed", e10);
            code = e10.m3606a().getCode();
            errorCodeBuild = e10.m3606a();
            commonCallback.onFailed(code, errorCodeBuild.getMsg());
        } catch (Throwable th) {
            f4387c.m3421e("Vip call failed.", th);
            errorCodeBuild = C5654c.f4252k.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build();
            code = errorCodeBuild.getCode();
            commonCallback.onFailed(code, errorCodeBuild.getMsg());
        }
    }

    @Override // com.alibaba.sdk.android.push.common.util.p061a.AbstractAsyncTaskC5659c, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(C5658b c5658b) {
        super.onPostExecute(c5658b);
        m3715a(m3630a(), c5658b, this.f4388d);
    }
}
