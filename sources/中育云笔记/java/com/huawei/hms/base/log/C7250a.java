package com.huawei.hms.base.log;

import android.content.Context;
import p386w5.InterfaceC11705a;

/* renamed from: com.huawei.hms.base.log.a */
/* loaded from: classes5.dex */
public class C7250a implements InterfaceC7253d {

    /* renamed from: a */
    public InterfaceC7253d f11422a;

    public C7250a(InterfaceC11705a interfaceC11705a) {
    }

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8392a(Context context, String str) {
        InterfaceC7253d interfaceC7253d = this.f11422a;
        if (interfaceC7253d != null) {
            interfaceC7253d.mo8392a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8393a(InterfaceC7253d interfaceC7253d) {
        this.f11422a = interfaceC7253d;
    }

    @Override // com.huawei.hms.base.log.InterfaceC7253d
    /* renamed from: a */
    public void mo8394a(String str, int i10, String str2, String str3) {
        InterfaceC7253d interfaceC7253d = this.f11422a;
        if (interfaceC7253d != null) {
            interfaceC7253d.mo8394a(str, i10, str2, str3);
        }
    }
}
