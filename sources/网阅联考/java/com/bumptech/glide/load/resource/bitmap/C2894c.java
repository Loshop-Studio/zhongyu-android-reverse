package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2892a;
import java.io.IOException;
import java.io.InputStream;
import p062g0.C3743c;
import p062g0.C3747g;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes2.dex */
public class C2894c implements InterfaceC3795e {

    /* renamed from: a */
    public final C2892a f904a;

    /* renamed from: b */
    public final InterfaceC4393b f905b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C2892a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f906a;

        /* renamed from: b */
        public final C3743c f907b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C3743c c3743c) {
            this.f906a = recyclableBufferedInputStream;
            this.f907b = c3743c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2892a.b
        /* renamed from: a */
        public void mo1959a() {
            this.f906a.m1931b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2892a.b
        /* renamed from: b */
        public void mo1960b(InterfaceC4395d interfaceC4395d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM4746a = this.f907b.m4746a();
            if (iOExceptionM4746a != null) {
                if (bitmap == null) {
                    throw iOExceptionM4746a;
                }
                interfaceC4395d.mo5392c(bitmap);
                throw iOExceptionM4746a;
            }
        }
    }

    public C2894c(C2892a c2892a, InterfaceC4393b interfaceC4393b) {
        this.f904a = c2892a;
        this.f905b = interfaceC4393b;
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(InputStream inputStream, int i4, int i5, C3794d c3794d) {
        boolean z3;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z3 = false;
        } else {
            z3 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f905b);
        }
        C3743c c3743cM4745b = C3743c.m4745b(recyclableBufferedInputStream);
        try {
            return this.f904a.m1953g(new C3747g(c3743cM4745b), i4, i5, c3794d, new a(recyclableBufferedInputStream, c3743cM4745b));
        } finally {
            c3743cM4745b.m4747c();
            if (z3) {
                recyclableBufferedInputStream.m1932c();
            }
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(InputStream inputStream, C3794d c3794d) {
        return this.f904a.m1956p(inputStream);
    }
}
