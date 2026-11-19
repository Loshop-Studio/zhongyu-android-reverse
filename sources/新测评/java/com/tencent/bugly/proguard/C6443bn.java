package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes4.dex */
public final class C6443bn extends AbstractC6462m implements Cloneable {

    /* renamed from: d */
    static byte[] f5492d;

    /* renamed from: a */
    public byte f5493a;

    /* renamed from: b */
    public String f5494b;

    /* renamed from: c */
    public byte[] f5495c;

    public C6443bn() {
        this.f5493a = (byte) 0;
        this.f5494b = "";
        this.f5495c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5214a(this.f5493a, 0);
        c6461l.m5219a(this.f5494b, 1);
        byte[] bArr = this.f5495c;
        if (bArr != null) {
            c6461l.m5224a(bArr, 2);
        }
    }

    public C6443bn(byte b10, String str, byte[] bArr) {
        this.f5493a = b10;
        this.f5494b = str;
        this.f5495c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5493a = c6460k.m5190a(this.f5493a, 0, true);
        this.f5494b = c6460k.m5200b(1, true);
        if (f5492d == null) {
            f5492d = new byte[]{0};
        }
        this.f5495c = c6460k.m5201c(2, false);
    }
}
