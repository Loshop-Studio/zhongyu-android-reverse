package com.efs.sdk.base.p020a.p028f;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.f.b */
/* loaded from: classes2.dex */
public final class C2930b {

    /* renamed from: a */
    public C2929a f1119a;

    /* renamed from: b */
    public C2931c f1120b = new C2931c();

    /* renamed from: c */
    public byte[] f1121c;

    /* renamed from: d */
    public File f1122d;

    public C2930b(String str, byte b4) {
        this.f1119a = new C2929a(str, b4);
    }

    /* renamed from: e */
    private void m2151e() {
        byte[] bArr;
        C2929a c2929a = this.f1119a;
        int i4 = c2929a.f1114c;
        if (i4 == 0 && (bArr = this.f1121c) != null) {
            c2929a.f1117f = bArr.length;
        } else if (i4 == 1 && this.f1122d.exists()) {
            this.f1119a.f1117f = this.f1122d.length();
        }
    }

    /* renamed from: a */
    public final long m2152a() {
        m2151e();
        return this.f1119a.f1117f;
    }

    /* renamed from: b */
    public final boolean m2157b() {
        return !Constants.CP_NONE.equals(this.f1119a.f1115d);
    }

    /* renamed from: c */
    public final boolean m2158c() {
        return 1 != this.f1119a.f1116e;
    }

    /* renamed from: d */
    public final void m2159d() {
        this.f1120b.f1123a = true;
    }

    /* renamed from: b */
    public final void m2156b(int i4) {
        this.f1119a.f1114c = i4;
    }

    /* renamed from: a */
    public final void m2154a(String str) {
        this.f1119a.f1115d = str;
    }

    /* renamed from: a */
    public final void m2153a(int i4) {
        this.f1119a.f1116e = i4;
        m2151e();
    }

    /* renamed from: a */
    public final void m2155a(byte[] bArr) {
        this.f1121c = bArr;
        m2151e();
    }

    /* renamed from: a */
    public static C2930b m2150a(ILogProtocol iLogProtocol) {
        C2930b c2930b;
        C2930b c2930b2 = null;
        try {
            c2930b = new C2930b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e4) {
            e = e4;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType == 0) {
                c2930b.m2156b(0);
                c2930b.m2155a(iLogProtocol.generate());
            } else if (bodyType != 1) {
                C2957d.m2213a("efs.base", "Can not support body type: " + iLogProtocol.getBodyType(), null);
            } else {
                c2930b.m2156b(1);
                c2930b.f1122d = new File(iLogProtocol.getFilePath());
            }
            return c2930b;
        } catch (Exception e5) {
            e = e5;
            c2930b2 = c2930b;
            C2957d.m2214b("efs.base", "log send error", e);
            return c2930b2;
        }
    }
}
