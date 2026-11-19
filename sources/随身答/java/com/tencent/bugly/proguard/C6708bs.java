package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bs */
/* loaded from: classes4.dex */
public final class C6708bs extends AbstractC6722m implements Cloneable {

    /* renamed from: a */
    public String f6140a = "";

    /* renamed from: b */
    public String f6141b = "";

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5316a(StringBuilder sb, int i9) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5315a(C6721l c6721l) throws UnsupportedEncodingException {
        c6721l.m5398a(this.f6140a, 0);
        c6721l.m5398a(this.f6141b, 1);
    }

    @Override // com.tencent.bugly.proguard.AbstractC6722m
    /* renamed from: a */
    public final void mo5314a(C6720k c6720k) {
        this.f6140a = c6720k.m5379b(0, true);
        this.f6141b = c6720k.m5379b(1, true);
    }
}
