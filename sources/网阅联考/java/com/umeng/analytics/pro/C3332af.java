package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p075i3.AbstractC3786d;

/* renamed from: com.umeng.analytics.pro.af */
/* loaded from: classes2.dex */
public class C3332af implements InterfaceC3408y {
    @Override // com.umeng.analytics.pro.InterfaceC3408y
    /* renamed from: a */
    public String mo2826a(Context context) {
        String strM4940b = null;
        try {
            if (AbstractC3786d.m4939a(context)) {
                strM4940b = AbstractC3786d.m4940b(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strM4940b;
    }
}
