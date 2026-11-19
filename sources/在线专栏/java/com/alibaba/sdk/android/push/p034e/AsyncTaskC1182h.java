package com.alibaba.sdk.android.push.p034e;

import android.content.Context;
import android.util.Log;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.util.C1109c;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.common.util.p031a.AbstractAsyncTaskC1168c;
import com.alibaba.sdk.android.push.common.util.p031a.C1167b;
import com.alibaba.sdk.android.push.p028a.C1158f;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.e.h */
/* loaded from: classes.dex */
public class AsyncTaskC1182h extends AbstractAsyncTaskC1168c {

    /* renamed from: c */
    private static final AmsLogger f6863c = AmsLogger.getLogger("MPS:VipRequestTask");

    /* renamed from: d */
    private final CommonCallback f6864d;

    public AsyncTaskC1182h(Context context, String str, CommonCallback commonCallback) {
        super(context, str);
        this.f6864d = commonCallback;
    }

    /* renamed from: a */
    private void m5264a(int i4, C1167b c1167b, CommonCallback commonCallback) {
        ErrorCode errorCodeBuild;
        String code;
        if (commonCallback == null) {
            return;
        }
        f6863c.m5016d("requestType: " + i4 + ", errorCode:" + c1167b.f6747c + ", httpcode: " + c1167b.f6746b + ", content:" + c1167b.f6745a);
        if (!c1167b.f6747c.getCode().equals(C1163c.f6718a.getCode())) {
            commonCallback.onFailed(c1167b.f6747c.getCode(), c1167b.f6747c.getMsg());
            return;
        }
        try {
            commonCallback.onSuccess(C1183i.m5265a(i4, c1167b.f6746b, c1167b.f6745a));
        } catch (C1158f e4) {
            f6863c.m5020e("Vip call failed", e4);
            code = e4.m5155a().getCode();
            errorCodeBuild = e4.m5155a();
            commonCallback.onFailed(code, errorCodeBuild.getMsg());
        } catch (Throwable th) {
            f6863c.m5020e("Vip call failed.", th);
            errorCodeBuild = C1163c.f6728k.copy().msg(th.getMessage()).detail(Log.getStackTraceString(th)).build();
            code = errorCodeBuild.getCode();
            commonCallback.onFailed(code, errorCodeBuild.getMsg());
        }
    }

    @Override // com.alibaba.sdk.android.push.common.util.p031a.AbstractAsyncTaskC1168c
    /* renamed from: a */
    protected Map<String, String> mo5182a(Context context, Map<String, String> map) {
        return C1109c.m5057a(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.alibaba.sdk.android.push.common.util.p031a.AbstractAsyncTaskC1168c, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(C1167b c1167b) {
        super.onPostExecute(c1167b);
        m5264a(m5179a(), c1167b, this.f6864d);
    }
}
