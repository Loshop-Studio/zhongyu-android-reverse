package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p065g3.AbstractC3757a;

/* renamed from: com.umeng.analytics.pro.ad */
/* loaded from: classes2.dex */
public class C3330ad implements InterfaceC3408y {

    /* renamed from: a */
    private boolean f1623a = false;

    @Override // com.umeng.analytics.pro.InterfaceC3408y
    /* renamed from: a */
    public String mo2826a(Context context) {
        try {
            if (!this.f1623a) {
                AbstractC3757a.m4792a(context);
                this.f1623a = true;
            }
            if (AbstractC3757a.m4793b()) {
                return AbstractC3757a.m4794c(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
