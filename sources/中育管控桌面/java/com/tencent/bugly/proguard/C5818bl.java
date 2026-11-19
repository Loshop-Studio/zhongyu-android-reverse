package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes3.dex */
public final class C5818bl extends AbstractC5839m implements Cloneable {

    /* renamed from: a */
    public String f4205a = "";

    /* renamed from: b */
    public String f4206b = "";

    /* renamed from: c */
    public String f4207c = "";

    /* renamed from: d */
    public String f4208d = "";

    /* renamed from: e */
    public String f4209e = "";

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4142a(StringBuilder sb, int i6) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4141a(C5838l c5838l) throws UnsupportedEncodingException {
        c5838l.m4224a(this.f4205a, 0);
        String str = this.f4206b;
        if (str != null) {
            c5838l.m4224a(str, 1);
        }
        String str2 = this.f4207c;
        if (str2 != null) {
            c5838l.m4224a(str2, 2);
        }
        String str3 = this.f4208d;
        if (str3 != null) {
            c5838l.m4224a(str3, 3);
        }
        String str4 = this.f4209e;
        if (str4 != null) {
            c5838l.m4224a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC5839m
    /* renamed from: a */
    public final void mo4140a(C5837k c5837k) {
        this.f4205a = c5837k.m4205b(0, true);
        this.f4206b = c5837k.m4205b(1, false);
        this.f4207c = c5837k.m4205b(2, false);
        this.f4208d = c5837k.m4205b(3, false);
        this.f4209e = c5837k.m4205b(4, false);
    }
}
