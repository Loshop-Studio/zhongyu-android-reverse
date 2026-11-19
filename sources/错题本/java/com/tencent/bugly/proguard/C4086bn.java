package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bn */
/* loaded from: classes3.dex */
public final class C4086bn extends AbstractC4123m implements Cloneable {

    /* renamed from: d */
    static byte[] f3694d;

    /* renamed from: a */
    public byte f3695a;

    /* renamed from: b */
    public String f3696b;

    /* renamed from: c */
    public byte[] f3697c;

    public C4086bn() {
        this.f3695a = (byte) 0;
        this.f3696b = "";
        this.f3697c = null;
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3310a(this.f3695a, 0);
        c4121l.m3315a(this.f3696b, 1);
        byte[] bArr = this.f3697c;
        if (bArr != null) {
            c4121l.m3320a(bArr, 2);
        }
    }

    public C4086bn(byte b6, String str, byte[] bArr) {
        this.f3695a = b6;
        this.f3696b = str;
        this.f3697c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3695a = c4119k.m3286a(this.f3695a, 0, true);
        this.f3696b = c4119k.m3296b(1, true);
        if (f3694d == null) {
            f3694d = new byte[]{0};
        }
        this.f3697c = c4119k.m3297c(2, false);
    }
}
