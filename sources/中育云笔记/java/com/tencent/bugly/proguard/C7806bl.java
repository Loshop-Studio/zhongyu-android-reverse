package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes5.dex */
public final class C7806bl extends AbstractC7827m implements Cloneable {

    /* renamed from: a */
    public String f13926a = "";

    /* renamed from: b */
    public String f13927b = "";

    /* renamed from: c */
    public String f13928c = "";

    /* renamed from: d */
    public String f13929d = "";

    /* renamed from: e */
    public String f13930e = "";

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10827a(StringBuilder sb2, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10826a(C7826l c7826l) throws UnsupportedEncodingException {
        c7826l.m10909a(this.f13926a, 0);
        String str = this.f13927b;
        if (str != null) {
            c7826l.m10909a(str, 1);
        }
        String str2 = this.f13928c;
        if (str2 != null) {
            c7826l.m10909a(str2, 2);
        }
        String str3 = this.f13929d;
        if (str3 != null) {
            c7826l.m10909a(str3, 3);
        }
        String str4 = this.f13930e;
        if (str4 != null) {
            c7826l.m10909a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC7827m
    /* renamed from: a */
    public final void mo10825a(C7825k c7825k) {
        this.f13926a = c7825k.m10890b(0, true);
        this.f13927b = c7825k.m10890b(1, false);
        this.f13928c = c7825k.m10890b(2, false);
        this.f13929d = c7825k.m10890b(3, false);
        this.f13930e = c7825k.m10890b(4, false);
    }
}
