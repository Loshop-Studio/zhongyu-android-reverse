package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C5401a;
import java.io.IOException;
import java.io.InputStream;
import p117i1.C7644c;
import p117i1.C7649h;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes3.dex */
public class C5403c implements InterfaceC8540e {

    /* renamed from: a */
    public final C5401a f3776a;

    /* renamed from: b */
    public final InterfaceC8802b f3777b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C5401a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f3778a;

        /* renamed from: b */
        public final C7644c f3779b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C7644c c7644c) {
            this.f3778a = recyclableBufferedInputStream;
            this.f3779b = c7644c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5401a.b
        /* renamed from: a */
        public void mo3659a(InterfaceC8804d interfaceC8804d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM12660a = this.f3779b.m12660a();
            if (iOExceptionM12660a != null) {
                if (bitmap == null) {
                    throw iOExceptionM12660a;
                }
                interfaceC8804d.mo14712c(bitmap);
                throw iOExceptionM12660a;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5401a.b
        /* renamed from: b */
        public void mo3660b() {
            this.f3778a.m3605f();
        }
    }

    public C5403c(C5401a c5401a, InterfaceC8802b interfaceC8802b) {
        this.f3776a = c5401a;
        this.f3777b = interfaceC8802b;
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(InputStream inputStream, int i10, int i11, C8539d c8539d) {
        boolean z9;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z9 = false;
        } else {
            z9 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f3777b);
        }
        C7644c c7644cM12659f = C7644c.m12659f(recyclableBufferedInputStream);
        try {
            InterfaceC8690j interfaceC8690jM3652f = this.f3776a.m3652f(new C7649h(c7644cM12659f), i10, i11, c8539d, new a(recyclableBufferedInputStream, c7644cM12659f));
            c7644cM12659f.m12661g();
            if (z9) {
                recyclableBufferedInputStream.m3606g();
            }
            return interfaceC8690jM3652f;
        } finally {
        }
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(InputStream inputStream, C8539d c8539d) {
        return this.f3776a.m3656p(inputStream);
    }
}
