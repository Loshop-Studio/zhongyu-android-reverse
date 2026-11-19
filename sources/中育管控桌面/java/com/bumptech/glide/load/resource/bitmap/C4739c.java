package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C4737a;
import java.io.IOException;
import java.io.InputStream;
import p016b1.C4401c;
import p016b1.C4406h;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes3.dex */
public class C4739c implements InterfaceC6286e {

    /* renamed from: a */
    public final C4737a f2567a;

    /* renamed from: b */
    public final InterfaceC6497b f2568b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C4737a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f2569a;

        /* renamed from: b */
        public final C4401c f2570b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C4401c c4401c) {
            this.f2569a = recyclableBufferedInputStream;
            this.f2570b = c4401c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C4737a.b
        /* renamed from: a */
        public void mo2839a(InterfaceC6499d interfaceC6499d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM1415a = this.f2570b.m1415a();
            if (iOExceptionM1415a != null) {
                if (bitmap == null) {
                    throw iOExceptionM1415a;
                }
                interfaceC6499d.mo7197c(bitmap);
                throw iOExceptionM1415a;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C4737a.b
        /* renamed from: b */
        public void mo2840b() {
            this.f2569a.m2785c();
        }
    }

    public C4739c(C4737a c4737a, InterfaceC6497b interfaceC6497b) {
        this.f2567a = c4737a;
        this.f2568b = interfaceC6497b;
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(InputStream inputStream, int i6, int i7, C6285d c6285d) {
        boolean z6;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z6 = false;
        } else {
            z6 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f2568b);
        }
        C4401c c4401cM1414c = C4401c.m1414c(recyclableBufferedInputStream);
        try {
            InterfaceC6440j interfaceC6440jM2832f = this.f2567a.m2832f(new C4406h(c4401cM1414c), i6, i7, c6285d, new a(recyclableBufferedInputStream, c4401cM1414c));
            c4401cM1414c.m1416g();
            if (z6) {
                recyclableBufferedInputStream.m2786g();
            }
            return interfaceC6440jM2832f;
        } finally {
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(InputStream inputStream, C6285d c6285d) {
        return this.f2567a.m2836p(inputStream);
    }
}
