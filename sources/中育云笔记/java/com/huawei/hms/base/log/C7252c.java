package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* renamed from: com.huawei.hms.base.log.c */
/* loaded from: classes5.dex */
public class C7252c implements InterfaceC7253d {

    /* renamed from: a */
    public InterfaceC7253d f11426a;

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8392a(Context context, String str) {
        InterfaceC7253d interfaceC7253d = this.f11426a;
        if (interfaceC7253d != null) {
            interfaceC7253d.mo8392a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8393a(InterfaceC7253d interfaceC7253d) {
        this.f11426a = interfaceC7253d;
    }

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8394a(String str, int i10, String str2, String str3) {
        Log.println(i10, "HMSSDK_" + str2, str3);
        InterfaceC7253d interfaceC7253d = this.f11426a;
        if (interfaceC7253d != null) {
            interfaceC7253d.mo8394a(str, i10, str2, str3);
        }
    }
}
