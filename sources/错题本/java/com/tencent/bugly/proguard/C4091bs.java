package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes3.dex */
public final class C4091bs extends AbstractC4123m implements Cloneable {

    /* renamed from: a */
    public String f3765a = "";

    /* renamed from: b */
    public String f3766b = "";

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3315a(this.f3765a, 0);
        c4121l.m3315a(this.f3766b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3765a = c4119k.m3296b(0, true);
        this.f3766b = c4119k.m3296b(1, true);
    }
}
