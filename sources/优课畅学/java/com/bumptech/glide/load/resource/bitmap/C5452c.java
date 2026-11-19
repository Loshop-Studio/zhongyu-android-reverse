package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C5450a;
import java.io.IOException;
import java.io.InputStream;
import p116h0.C8699c;
import p116h0.C8704h;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes3.dex */
public class C5452c implements InterfaceC9231e {

    /* renamed from: a */
    public final C5450a f3209a;

    /* renamed from: b */
    public final InterfaceC9498b f3210b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C5450a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f3211a;

        /* renamed from: b */
        public final C8699c f3212b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C8699c c8699c) {
            this.f3211a = recyclableBufferedInputStream;
            this.f3212b = c8699c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5450a.b
        /* renamed from: a */
        public void mo3104a(InterfaceC9500d interfaceC9500d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM14158a = this.f3212b.m14158a();
            if (iOExceptionM14158a != null) {
                if (bitmap == null) {
                    throw iOExceptionM14158a;
                }
                interfaceC9500d.mo17620b(bitmap);
                throw iOExceptionM14158a;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5450a.b
        /* renamed from: b */
        public void mo3105b() {
            this.f3211a.m3050b();
        }
    }

    public C5452c(C5450a c5450a, InterfaceC9498b interfaceC9498b) {
        this.f3209a = c5450a;
        this.f3210b = interfaceC9498b;
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(InputStream inputStream, int i10, int i11, C9230d c9230d) {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f3210b);
        }
        C8699c c8699cM14157b = C8699c.m14157b(recyclableBufferedInputStream);
        try {
            InterfaceC9357j interfaceC9357jM3097f = this.f3209a.m3097f(new C8704h(c8699cM14157b), i10, i11, c9230d, new a(recyclableBufferedInputStream, c8699cM14157b));
            c8699cM14157b.m14159c();
            if (z10) {
                recyclableBufferedInputStream.m3051c();
            }
            return interfaceC9357jM3097f;
        } finally {
        }
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(InputStream inputStream, C9230d c9230d) {
        return this.f3209a.m3101p(inputStream);
    }
}
