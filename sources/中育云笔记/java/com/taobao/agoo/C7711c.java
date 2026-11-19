package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.p087a.C7709b;
import com.taobao.agoo.p087a.p088a.C7707c;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.agoo.c */
/* loaded from: classes5.dex */
final class C7711c extends IAgooAppReceiver {

    /* renamed from: a */
    final /* synthetic */ IRegister f13281a;

    /* renamed from: b */
    final /* synthetic */ Context f13282b;

    /* renamed from: c */
    final /* synthetic */ IACCSManager f13283c;

    /* renamed from: d */
    final /* synthetic */ String f13284d;

    /* renamed from: e */
    final /* synthetic */ String f13285e;

    public C7711c(IRegister iRegister, Context context, IACCSManager iACCSManager, String str, String str2) {
        this.f13281a = iRegister;
        this.f13282b = context;
        this.f13283c = iACCSManager;
        this.f13284d = str;
        this.f13285e = str2;
    }

    @Override // com.taobao.accs.IAgooAppReceiver
    public String getAppkey() {
        return this.f13284d;
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindApp(int i10, String str, String str2) {
        if (i10 == AccsErrorCode.SUCCESS.getCodeInt()) {
            onBindApp(i10, str2);
        } else if (this.f13281a != null) {
            ErrorCode errorCodeBuild = C7703a.m10188a(i10, str).detail("bindApp").build();
            this.f13281a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i10, String str) {
        try {
            ALog.m10119i("TaobaoRegister", "onBindApp", Constants.KEY_ERROR_CODE, Integer.valueOf(i10));
            if (i10 == AccsErrorCode.SUCCESS.getCodeInt()) {
                if (TaobaoRegister.mRequestListener == null) {
                    C7709b unused = TaobaoRegister.mRequestListener = new C7709b(this.f13282b);
                }
                this.f13283c.registerDataListener(this.f13282b, "AgooDeviceCmd", TaobaoRegister.mRequestListener);
                if (C7709b.f13279b.m10194b(this.f13282b.getPackageName()) && Config.getDeviceToken(this.f13282b) != null) {
                    ALog.m10119i("TaobaoRegister", "agoo aready Registered return ", new Object[0]);
                    IRegister iRegister = this.f13281a;
                    if (iRegister != null) {
                        iRegister.onSuccess(Config.getDeviceToken(this.f13282b));
                        return;
                    }
                    return;
                }
                byte[] bArrM10203a = C7707c.m10203a(this.f13282b, this.f13284d, this.f13285e);
                if (bArrM10203a == null) {
                    IRegister iRegister2 = this.f13281a;
                    if (iRegister2 != null) {
                        ErrorCode errorCode = C7703a.REGISTER_DATA_ERROR;
                        iRegister2.onFailure(errorCode.getCode(), errorCode.getMsg());
                        return;
                    }
                    return;
                }
                String strSendRequest = this.f13283c.sendRequest(this.f13282b, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", bArrM10203a, null));
                if (TextUtils.isEmpty(strSendRequest)) {
                    IRegister iRegister3 = this.f13281a;
                    if (iRegister3 != null) {
                        ErrorCode errorCode2 = C7703a.ACCS_CHECK_ERROR;
                        iRegister3.onFailure(errorCode2.getCode(), errorCode2.getMsg());
                        return;
                    }
                    return;
                }
                if (this.f13281a != null) {
                    TaobaoRegister.mRequestListener.f13280a.put(strSendRequest, this.f13281a);
                    return;
                }
                return;
            }
            if (this.f13281a != null) {
                ErrorCode errorCodeBuild = C7703a.m10188a(i10, "no error msg").detail("bindApp").build();
                this.f13281a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        } catch (Throwable th) {
            ALog.m10117e("TaobaoRegister", "register onBindApp", th, new Object[0]);
        }
    }
}
