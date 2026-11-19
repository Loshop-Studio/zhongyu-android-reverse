package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p070h3.AbstractC3770a;

/* renamed from: com.umeng.analytics.pro.ag */
/* loaded from: classes2.dex */
class C3333ag implements InterfaceC3408y {
    @Override // com.umeng.analytics.pro.InterfaceC3408y
    /* renamed from: a */
    public String mo2826a(Context context) {
        String strM4874c = null;
        try {
            if (AbstractC3770a.m4873b()) {
                strM4874c = AbstractC3770a.m4874c(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strM4874c;
    }
}
