package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes4.dex */
public final class C6470bs extends AbstractC6484m implements Cloneable {

    /* renamed from: a */
    public String f4906a = "";

    /* renamed from: b */
    public String f4907b = "";

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4579a(this.f4906a, 0);
        c6483l.m4579a(this.f4907b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4906a = c6482k.m4560b(0, true);
        this.f4907b = c6482k.m4560b(1, true);
    }
}
