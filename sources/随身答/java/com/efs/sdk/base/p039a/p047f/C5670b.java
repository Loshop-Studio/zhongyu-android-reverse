package com.efs.sdk.base.p039a.p047f;

import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* renamed from: com.efs.sdk.base.a.f.b */
/* loaded from: classes3.dex */
public final class C5670b {

    /* renamed from: a */
    public C5669a f4723a;

    /* renamed from: b */
    public C5671c f4724b = new C5671c();

    /* renamed from: c */
    public byte[] f4725c;

    /* renamed from: d */
    public File f4726d;

    public C5670b(String str, byte b10) {
        this.f4723a = new C5669a(str, b10);
    }

    /* renamed from: e */
    private void m4120e() {
        byte[] bArr;
        C5669a c5669a = this.f4723a;
        int i9 = c5669a.f4718c;
        if (i9 == 0 && (bArr = this.f4725c) != null) {
            c5669a.f4721f = bArr.length;
        } else if (i9 == 1 && this.f4726d.exists()) {
            this.f4723a.f4721f = this.f4726d.length();
        }
    }

    /* renamed from: a */
    public final long m4121a() {
        m4120e();
        return this.f4723a.f4721f;
    }

    /* renamed from: b */
    public final boolean m4126b() {
        return !"none".equals(this.f4723a.f4719d);
    }

    /* renamed from: c */
    public final boolean m4127c() {
        return 1 != this.f4723a.f4720e;
    }

    /* renamed from: d */
    public final void m4128d() {
        this.f4724b.f4727a = true;
    }

    /* renamed from: b */
    public final void m4125b(int i9) {
        this.f4723a.f4718c = i9;
    }

    /* renamed from: a */
    public final void m4123a(String str) {
        this.f4723a.f4719d = str;
    }

    /* renamed from: a */
    public final void m4122a(int i9) {
        this.f4723a.f4720e = i9;
        m4120e();
    }

    /* renamed from: a */
    public final void m4124a(byte[] bArr) {
        this.f4725c = bArr;
        m4120e();
    }

    /* renamed from: a */
    public static C5670b m4119a(ILogProtocol iLogProtocol) {
        C5670b c5670b = null;
        try {
            C5670b c5670b2 = new C5670b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
            try {
                int bodyType = iLogProtocol.getBodyType();
                if (bodyType == 0) {
                    c5670b2.m4125b(0);
                    c5670b2.m4124a(iLogProtocol.generate());
                    return c5670b2;
                }
                if (bodyType != 1) {
                    C5697d.m4182a("efs.base", "Can not support body type: " + iLogProtocol.getBodyType(), null);
                    return c5670b2;
                }
                c5670b2.m4125b(1);
                c5670b2.f4726d = new File(iLogProtocol.getFilePath());
                return c5670b2;
            } catch (Exception e10) {
                e = e10;
                c5670b = c5670b2;
                C5697d.m4183b("efs.base", "log send error", e);
                return c5670b;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
