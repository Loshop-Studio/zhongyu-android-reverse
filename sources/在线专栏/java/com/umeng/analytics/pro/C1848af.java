package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.vivo.identifier.IdentifierManager;

/* renamed from: com.umeng.analytics.pro.af */
/* loaded from: classes.dex */
public class C1848af implements InterfaceC1924y {
    @Override // com.umeng.analytics.pro.InterfaceC1924y
    /* renamed from: a */
    public String mo6749a(Context context) {
        String strM10078b = null;
        try {
            if (IdentifierManager.m10077a(context)) {
                strM10078b = IdentifierManager.m10078b(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strM10078b;
    }
}
