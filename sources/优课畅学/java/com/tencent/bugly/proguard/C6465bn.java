package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes4.dex */
public final class C6465bn extends AbstractC6484m implements Cloneable {

    /* renamed from: d */
    static byte[] f4835d;

    /* renamed from: a */
    public byte f4836a;

    /* renamed from: b */
    public String f4837b;

    /* renamed from: c */
    public byte[] f4838c;

    public C6465bn() {
        this.f4836a = (byte) 0;
        this.f4837b = "";
        this.f4838c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4574a(this.f4836a, 0);
        c6483l.m4579a(this.f4837b, 1);
        byte[] bArr = this.f4838c;
        if (bArr != null) {
            c6483l.m4584a(bArr, 2);
        }
    }

    public C6465bn(byte b10, String str, byte[] bArr) {
        this.f4836a = b10;
        this.f4837b = str;
        this.f4838c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4836a = c6482k.m4550a(this.f4836a, 0, true);
        this.f4837b = c6482k.m4560b(1, true);
        if (f4835d == null) {
            f4835d = new byte[]{0};
        }
        this.f4838c = c6482k.m4561c(2, false);
    }
}
