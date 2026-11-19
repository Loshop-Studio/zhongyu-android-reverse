package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes4.dex */
public final class C6703bn extends AbstractC6722m implements Cloneable {

    /* renamed from: d */
    static byte[] f6069d;

    /* renamed from: a */
    public byte f6070a;

    /* renamed from: b */
    public String f6071b;

    /* renamed from: c */
    public byte[] f6072c;

    public C6703bn() {
        this.f6070a = (byte) 0;
        this.f6071b = "";
        this.f6072c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5393a(this.f6070a, 0);
        c6721l.m5398a(this.f6071b, 1);
        byte[] bArr = this.f6072c;
        if (bArr != null) {
            c6721l.m5403a(bArr, 2);
        }
    }

    public C6703bn(byte b10, String str, byte[] bArr) {
        this.f6070a = b10;
        this.f6071b = str;
        this.f6072c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6070a = c6720k.m5369a(this.f6070a, 0, true);
        this.f6071b = c6720k.m5379b(1, true);
        if (f6069d == null) {
            f6069d = new byte[]{0};
        }
        this.f6072c = c6720k.m5380c(2, false);
    }
}
