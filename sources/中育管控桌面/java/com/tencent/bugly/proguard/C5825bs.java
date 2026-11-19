package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes3.dex */
public final class C5825bs extends AbstractC5839m implements Cloneable {

    /* renamed from: a */
    public String f4284a = "";

    /* renamed from: b */
    public String f4285b = "";

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4224a(this.f4284a, 0);
        c5838l.m4224a(this.f4285b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4284a = c5837k.m4205b(0, true);
        this.f4285b = c5837k.m4205b(1, true);
    }
}
