package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes3.dex */
public final class C4084bl extends AbstractC4123m implements Cloneable {

    /* renamed from: a */
    public String f3686a = "";

    /* renamed from: b */
    public String f3687b = "";

    /* renamed from: c */
    public String f3688c = "";

    /* renamed from: d */
    public String f3689d = "";

    /* renamed from: e */
    public String f3690e = "";

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3234a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3233a(C4121l c4121l) throws UnsupportedEncodingException {
        c4121l.m3315a(this.f3686a, 0);
        String str = this.f3687b;
        if (str != null) {
            c4121l.m3315a(str, 1);
        }
        String str2 = this.f3688c;
        if (str2 != null) {
            c4121l.m3315a(str2, 2);
        }
        String str3 = this.f3689d;
        if (str3 != null) {
            c4121l.m3315a(str3, 3);
        }
        String str4 = this.f3690e;
        if (str4 != null) {
            c4121l.m3315a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC4123m
    /* renamed from: a */
    public final void mo3232a(C4119k c4119k) {
        this.f3686a = c4119k.m3296b(0, true);
        this.f3687b = c4119k.m3296b(1, false);
        this.f3688c = c4119k.m3296b(2, false);
        this.f3689d = c4119k.m3296b(3, false);
        this.f3690e = c4119k.m3296b(4, false);
    }
}
