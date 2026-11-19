package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.umeng.analytics.pro.cb */
/* loaded from: classes2.dex */
public class C3382cb extends AbstractC3384cd {

    /* renamed from: a */
    protected InputStream f2034a;

    /* renamed from: b */
    protected OutputStream f2035b;

    public C3382cb() {
        this.f2034a = null;
        this.f2035b = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: a */
    public boolean mo3117a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: b */
    public void mo3118b() throws C3385ce {
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: c */
    public void mo3120c() throws IOException {
        InputStream inputStream = this.f2034a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            this.f2034a = null;
        }
        OutputStream outputStream = this.f2035b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.f2035b = null;
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: d */
    public void mo3121d() throws IOException, C3385ce {
        OutputStream outputStream = this.f2035b;
        if (outputStream == null) {
            throw new C3385ce(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e4) {
            throw new C3385ce(0, e4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: a */
    public int mo3116a(byte[] bArr, int i4, int i5) throws IOException, C3385ce {
        InputStream inputStream = this.f2034a;
        if (inputStream == null) {
            throw new C3385ce(1, "Cannot read from null inputStream");
        }
        try {
            int i6 = inputStream.read(bArr, i4, i5);
            if (i6 >= 0) {
                return i6;
            }
            throw new C3385ce(4);
        } catch (IOException e4) {
            throw new C3385ce(0, e4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: b */
    public void mo3119b(byte[] bArr, int i4, int i5) throws IOException, C3385ce {
        OutputStream outputStream = this.f2035b;
        if (outputStream == null) {
            throw new C3385ce(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i4, i5);
        } catch (IOException e4) {
            throw new C3385ce(0, e4);
        }
    }

    public C3382cb(InputStream inputStream) {
        this.f2035b = null;
        this.f2034a = inputStream;
    }

    public C3382cb(OutputStream outputStream) {
        this.f2034a = null;
        this.f2035b = outputStream;
    }

    public C3382cb(InputStream inputStream, OutputStream outputStream) {
        this.f2034a = inputStream;
        this.f2035b = outputStream;
    }
}
