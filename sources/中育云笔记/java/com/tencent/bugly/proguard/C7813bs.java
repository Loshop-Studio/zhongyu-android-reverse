package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes5.dex */
public final class C7813bs extends AbstractC7827m implements Cloneable {

    /* renamed from: a */
    public String f14005a = "";

    /* renamed from: b */
    public String f14006b = "";

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10909a(this.f14005a, 0);
        c7826l.m10909a(this.f14006b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f14005a = c7825k.m10890b(0, true);
        this.f14006b = c7825k.m10890b(1, true);
    }
}
