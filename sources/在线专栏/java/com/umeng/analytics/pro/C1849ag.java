package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.miui.deviceid.IdentifierManager;

/* renamed from: com.umeng.analytics.pro.ag */
/* loaded from: classes.dex */
class C1849ag implements InterfaceC1924y {
    C1849ag() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC1924y
    /* renamed from: a */
    public String mo6749a(Context context) {
        String strM10057b = null;
        try {
            if (IdentifierManager.m10056a()) {
                strM10057b = IdentifierManager.m10057b(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strM10057b;
    }
}
