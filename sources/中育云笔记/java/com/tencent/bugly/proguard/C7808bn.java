package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes5.dex */
public final class C7808bn extends AbstractC7827m implements Cloneable {

    /* renamed from: d */
    static byte[] f13934d;

    /* renamed from: a */
    public byte f13935a;

    /* renamed from: b */
    public String f13936b;

    /* renamed from: c */
    public byte[] f13937c;

    public C7808bn() {
        this.f13935a = (byte) 0;
        this.f13936b = "";
        this.f13937c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10904a(this.f13935a, 0);
        c7826l.m10909a(this.f13936b, 1);
        byte[] bArr = this.f13937c;
        if (bArr != null) {
            c7826l.m10914a(bArr, 2);
        }
    }

    public C7808bn(byte b10, String str, byte[] bArr) {
        this.f13935a = b10;
        this.f13936b = str;
        this.f13937c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13935a = c7825k.m10880a(this.f13935a, 0, true);
        this.f13936b = c7825k.m10890b(1, true);
        if (f13934d == null) {
            f13934d = new byte[]{0};
        }
        this.f13937c = c7825k.m10891c(2, false);
    }
}
