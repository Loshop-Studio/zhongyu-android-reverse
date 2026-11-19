package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes3.dex */
public final class C5820bn extends AbstractC5839m implements Cloneable {

    /* renamed from: d */
    static byte[] f4213d;

    /* renamed from: a */
    public byte f4214a;

    /* renamed from: b */
    public String f4215b;

    /* renamed from: c */
    public byte[] f4216c;

    public C5820bn() {
        this.f4214a = (byte) 0;
        this.f4215b = "";
        this.f4216c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4219a(this.f4214a, 0);
        c5838l.m4224a(this.f4215b, 1);
        byte[] bArr = this.f4216c;
        if (bArr != null) {
            c5838l.m4229a(bArr, 2);
        }
    }

    public C5820bn(byte b7, String str, byte[] bArr) {
        this.f4214a = b7;
        this.f4215b = str;
        this.f4216c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4214a = c5837k.m4195a(this.f4214a, 0, true);
        this.f4215b = c5837k.m4205b(1, true);
        if (f4213d == null) {
            f4213d = new byte[]{0};
        }
        this.f4216c = c5837k.m4206c(2, false);
    }
}
