package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes4.dex */
public final class C6701bl extends AbstractC6722m implements Cloneable {

    /* renamed from: a */
    public String f6061a = "";

    /* renamed from: b */
    public String f6062b = "";

    /* renamed from: c */
    public String f6063c = "";

    /* renamed from: d */
    public String f6064d = "";

    /* renamed from: e */
    public String f6065e = "";

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5398a(this.f6061a, 0);
        String str = this.f6062b;
        if (str != null) {
            c6721l.m5398a(str, 1);
        }
        String str2 = this.f6063c;
        if (str2 != null) {
            c6721l.m5398a(str2, 2);
        }
        String str3 = this.f6064d;
        if (str3 != null) {
            c6721l.m5398a(str3, 3);
        }
        String str4 = this.f6065e;
        if (str4 != null) {
            c6721l.m5398a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6061a = c6720k.m5379b(0, true);
        this.f6062b = c6720k.m5379b(1, false);
        this.f6063c = c6720k.m5379b(2, false);
        this.f6064d = c6720k.m5379b(3, false);
        this.f6065e = c6720k.m5379b(4, false);
    }
}
