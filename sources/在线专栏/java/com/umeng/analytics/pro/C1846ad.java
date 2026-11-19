package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.heytap.openid.sdk.OpenIDSDK;

/* renamed from: com.umeng.analytics.pro.ad */
/* loaded from: classes.dex */
public class C1846ad implements InterfaceC1924y {

    /* renamed from: a */
    private boolean f8215a = false;

    @Override // com.umeng.analytics.pro.InterfaceC1924y
    /* renamed from: a */
    public String mo6749a(Context context) {
        try {
            if (!this.f8215a) {
                OpenIDSDK.m10048a(context);
                this.f8215a = true;
            }
            if (OpenIDSDK.m10049a()) {
                return OpenIDSDK.m10051c(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
