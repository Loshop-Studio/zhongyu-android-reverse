package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes4.dex */
public final class C6463bl extends AbstractC6484m implements Cloneable {

    /* renamed from: a */
    public String f4827a = "";

    /* renamed from: b */
    public String f4828b = "";

    /* renamed from: c */
    public String f4829c = "";

    /* renamed from: d */
    public String f4830d = "";

    /* renamed from: e */
    public String f4831e = "";

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4497a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4496a(C6483l c6483l) throws UnsupportedEncodingException {
        c6483l.m4579a(this.f4827a, 0);
        String str = this.f4828b;
        if (str != null) {
            c6483l.m4579a(str, 1);
        }
        String str2 = this.f4829c;
        if (str2 != null) {
            c6483l.m4579a(str2, 2);
        }
        String str3 = this.f4830d;
        if (str3 != null) {
            c6483l.m4579a(str3, 3);
        }
        String str4 = this.f4831e;
        if (str4 != null) {
            c6483l.m4579a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6484m
    /* renamed from: a */
    public final void mo4495a(C6482k c6482k) {
        this.f4827a = c6482k.m4560b(0, true);
        this.f4828b = c6482k.m4560b(1, false);
        this.f4829c = c6482k.m4560b(2, false);
        this.f4830d = c6482k.m4560b(3, false);
        this.f4831e = c6482k.m4560b(4, false);
    }
}
