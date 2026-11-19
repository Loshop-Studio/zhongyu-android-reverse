package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.umeng.analytics.pro.cb */
/* loaded from: classes.dex */
public class C1898cb extends AbstractC1900cd {

    /* renamed from: a */
    protected InputStream f8626a;

    /* renamed from: b */
    protected OutputStream f8627b;

    protected C1898cb() {
        this.f8626a = null;
        this.f8627b = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: a */
    public int mo7039a(byte[] bArr, int i4, int i5) throws IOException, C1901ce {
        InputStream inputStream = this.f8626a;
        if (inputStream == null) {
            throw new C1901ce(1, "Cannot read from null inputStream");
        }
        try {
            int i6 = inputStream.read(bArr, i4, i5);
            if (i6 >= 0) {
                return i6;
            }
            throw new C1901ce(4);
        } catch (IOException e4) {
            throw new C1901ce(0, e4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: a */
    public boolean mo7040a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: b */
    public void mo7041b() throws C1901ce {
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: b */
    public void mo7042b(byte[] bArr, int i4, int i5) throws IOException, C1901ce {
        OutputStream outputStream = this.f8627b;
        if (outputStream == null) {
            throw new C1901ce(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i4, i5);
        } catch (IOException e4) {
            throw new C1901ce(0, e4);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: c */
    public void mo7043c() throws IOException {
        InputStream inputStream = this.f8626a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            this.f8626a = null;
        }
        OutputStream outputStream = this.f8627b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.f8627b = null;
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: d */
    public void mo7044d() throws IOException, C1901ce {
        OutputStream outputStream = this.f8627b;
        if (outputStream == null) {
            throw new C1901ce(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e4) {
            throw new C1901ce(0, e4);
        }
    }

    public C1898cb(InputStream inputStream) {
        this.f8627b = null;
        this.f8626a = inputStream;
    }

    public C1898cb(OutputStream outputStream) {
        this.f8626a = null;
        this.f8627b = outputStream;
    }

    public C1898cb(InputStream inputStream, OutputStream outputStream) {
        this.f8626a = inputStream;
        this.f8627b = outputStream;
    }
}
