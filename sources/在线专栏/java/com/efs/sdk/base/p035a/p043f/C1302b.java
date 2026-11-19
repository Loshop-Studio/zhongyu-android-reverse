package com.efs.sdk.base.p035a.p043f;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.f.b */
/* loaded from: classes.dex */
public final class C1302b {

    /* renamed from: a */
    public C1301a f7089a;

    /* renamed from: b */
    public C1303c f7090b = new C1303c();

    /* renamed from: c */
    public byte[] f7091c;

    /* renamed from: d */
    public File f7092d;

    public C1302b(String str, byte b4) {
        this.f7089a = new C1301a(str, b4);
    }

    /* renamed from: e */
    private void m5510e() {
        byte[] bArr;
        C1301a c1301a = this.f7089a;
        int i4 = c1301a.f7084c;
        if (i4 == 0 && (bArr = this.f7091c) != null) {
            c1301a.f7087f = bArr.length;
        } else if (i4 == 1 && this.f7092d.exists()) {
            this.f7089a.f7087f = this.f7092d.length();
        }
    }

    /* renamed from: a */
    public final long m5511a() {
        m5510e();
        return this.f7089a.f7087f;
    }

    /* renamed from: b */
    public final boolean m5516b() {
        return !Constants.CP_NONE.equals(this.f7089a.f7085d);
    }

    /* renamed from: c */
    public final boolean m5517c() {
        return 1 != this.f7089a.f7086e;
    }

    /* renamed from: d */
    public final void m5518d() {
        this.f7090b.f7093a = true;
    }

    /* renamed from: b */
    public final void m5515b(int i4) {
        this.f7089a.f7084c = i4;
    }

    /* renamed from: a */
    public final void m5513a(String str) {
        this.f7089a.f7085d = str;
    }

    /* renamed from: a */
    public final void m5512a(int i4) {
        this.f7089a.f7086e = i4;
        m5510e();
    }

    /* renamed from: a */
    public final void m5514a(byte[] bArr) {
        this.f7091c = bArr;
        m5510e();
    }

    /* renamed from: a */
    public static C1302b m5509a(ILogProtocol iLogProtocol) {
        C1302b c1302b;
        C1302b c1302b2 = null;
        try {
            c1302b = new C1302b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e4) {
            e = e4;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType == 0) {
                c1302b.m5515b(0);
                c1302b.m5514a(iLogProtocol.generate());
            } else if (bodyType != 1) {
                C1329d.m5572a("efs.base", "Can not support body type: " + iLogProtocol.getBodyType(), null);
            } else {
                c1302b.m5515b(1);
                c1302b.f7092d = new File(iLogProtocol.getFilePath());
            }
            return c1302b;
        } catch (Exception e5) {
            e = e5;
            c1302b2 = c1302b;
            C1329d.m5573b("efs.base", "log send error", e);
            return c1302b2;
        }
    }
}
