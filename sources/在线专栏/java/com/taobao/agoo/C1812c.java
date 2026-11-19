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
import com.taobao.agoo.p066a.C1810b;
import com.taobao.agoo.p066a.p067a.C1808c;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.agoo.c */
/* loaded from: classes.dex */
final class C1812c extends IAgooAppReceiver {

    /* renamed from: a */
    final /* synthetic */ IRegister f7883a;

    /* renamed from: b */
    final /* synthetic */ Context f7884b;

    /* renamed from: c */
    final /* synthetic */ IACCSManager f7885c;

    /* renamed from: d */
    final /* synthetic */ String f7886d;

    /* renamed from: e */
    final /* synthetic */ String f7887e;

    C1812c(IRegister iRegister, Context context, IACCSManager iACCSManager, String str, String str2) {
        this.f7883a = iRegister;
        this.f7884b = context;
        this.f7885c = iACCSManager;
        this.f7886d = str;
        this.f7887e = str2;
    }

    @Override // com.taobao.accs.IAgooAppReceiver
    public String getAppkey() {
        return this.f7886d;
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindApp(int i4, String str, String str2) {
        if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
            onBindApp(i4, str2);
        } else if (this.f7883a != null) {
            ErrorCode errorCodeBuild = C1804a.m6162a(i4, str).detail("bindApp").build();
            this.f7883a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i4, String str) {
        try {
            ALog.m6093i("TaobaoRegister", "onBindApp", Constants.KEY_ERROR_CODE, Integer.valueOf(i4));
            if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
                if (TaobaoRegister.mRequestListener == null) {
                    C1810b unused = TaobaoRegister.mRequestListener = new C1810b(this.f7884b);
                }
                this.f7885c.registerDataListener(this.f7884b, "AgooDeviceCmd", TaobaoRegister.mRequestListener);
                if (C1810b.f7881b.m6168b(this.f7884b.getPackageName()) && Config.getDeviceToken(this.f7884b) != null) {
                    ALog.m6093i("TaobaoRegister", "agoo aready Registered return ", new Object[0]);
                    IRegister iRegister = this.f7883a;
                    if (iRegister != null) {
                        iRegister.onSuccess(Config.getDeviceToken(this.f7884b));
                        return;
                    }
                    return;
                }
                byte[] bArrM6177a = C1808c.m6177a(this.f7884b, this.f7886d, this.f7887e);
                if (bArrM6177a == null) {
                    IRegister iRegister2 = this.f7883a;
                    if (iRegister2 != null) {
                        ErrorCode errorCode = C1804a.REGISTER_DATA_ERROR;
                        iRegister2.onFailure(errorCode.getCode(), errorCode.getMsg());
                        return;
                    }
                    return;
                }
                String strSendRequest = this.f7885c.sendRequest(this.f7884b, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", bArrM6177a, null));
                if (TextUtils.isEmpty(strSendRequest)) {
                    IRegister iRegister3 = this.f7883a;
                    if (iRegister3 != null) {
                        ErrorCode errorCode2 = C1804a.ACCS_CHECK_ERROR;
                        iRegister3.onFailure(errorCode2.getCode(), errorCode2.getMsg());
                        return;
                    }
                    return;
                }
                if (this.f7883a != null) {
                    TaobaoRegister.mRequestListener.f7882a.put(strSendRequest, this.f7883a);
                    return;
                }
                return;
            }
            if (this.f7883a != null) {
                ErrorCode errorCodeBuild = C1804a.m6162a(i4, "no error msg").detail("bindApp").build();
                this.f7883a.onFailure(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }
        } catch (Throwable th) {
            ALog.m6091e("TaobaoRegister", "register onBindApp", th, new Object[0]);
        }
    }
}
