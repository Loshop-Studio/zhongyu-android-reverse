package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes4.dex */
public final class C6448bs extends AbstractC6462m implements Cloneable {

    /* renamed from: a */
    public String f5563a = "";

    /* renamed from: b */
    public String f5564b = "";

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5219a(this.f5563a, 0);
        c6461l.m5219a(this.f5564b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5563a = c6460k.m5200b(0, true);
        this.f5564b = c6460k.m5200b(1, true);
    }
}
