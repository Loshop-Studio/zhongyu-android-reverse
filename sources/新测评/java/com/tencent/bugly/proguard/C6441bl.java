package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;

/* renamed from: com.tencent.bugly.proguard.bl */
/* loaded from: classes4.dex */
public final class C6441bl extends AbstractC6462m implements Cloneable {

    /* renamed from: a */
    public String f5484a = "";

    /* renamed from: b */
    public String f5485b = "";

    /* renamed from: c */
    public String f5486c = "";

    /* renamed from: d */
    public String f5487d = "";

    /* renamed from: e */
    public String f5488e = "";

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5137a(StringBuilder sb, int i10) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5136a(C6461l c6461l) throws UnsupportedEncodingException {
        c6461l.m5219a(this.f5484a, 0);
        String str = this.f5485b;
        if (str != null) {
            c6461l.m5219a(str, 1);
        }
        String str2 = this.f5486c;
        if (str2 != null) {
            c6461l.m5219a(str2, 2);
        }
        String str3 = this.f5487d;
        if (str3 != null) {
            c6461l.m5219a(str3, 3);
        }
        String str4 = this.f5488e;
        if (str4 != null) {
            c6461l.m5219a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC6462m
    /* renamed from: a */
    public final void mo5135a(C6460k c6460k) {
        this.f5484a = c6460k.m5200b(0, true);
        this.f5485b = c6460k.m5200b(1, false);
        this.f5486c = c6460k.m5200b(2, false);
        this.f5487d = c6460k.m5200b(3, false);
        this.f5488e = c6460k.m5200b(4, false);
    }
}
