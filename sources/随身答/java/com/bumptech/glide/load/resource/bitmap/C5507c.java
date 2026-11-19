package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C5505a;
import java.io.IOException;
import java.io.InputStream;
import p091e1.C7831c;
import p091e1.C7835g;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes3.dex */
public class C5507c implements InterfaceC8085e {

    /* renamed from: a */
    public final C5505a f3558a;

    /* renamed from: b */
    public final InterfaceC8865b f3559b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C5505a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f3560a;

        /* renamed from: b */
        public final C7831c f3561b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C7831c c7831c) {
            this.f3560a = recyclableBufferedInputStream;
            this.f3561b = c7831c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5505a.b
        /* renamed from: a */
        public void mo3283a(InterfaceC8867d interfaceC8867d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM12234a = this.f3561b.m12234a();
            if (iOExceptionM12234a != null) {
                if (bitmap == null) {
                    throw iOExceptionM12234a;
                }
                interfaceC8867d.mo13732c(bitmap);
                throw iOExceptionM12234a;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5505a.b
        /* renamed from: b */
        public void mo3284b() {
            this.f3560a.m3255c();
        }
    }

    public C5507c(C5505a c5505a, InterfaceC8865b interfaceC8865b) {
        this.f3558a = c5505a;
        this.f3559b = interfaceC8865b;
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(InputStream inputStream, int i9, int i10, C8084d c8084d) {
        boolean z9;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z9 = false;
        } else {
            z9 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f3559b);
        }
        C7831c c7831cM12233c = C7831c.m12233c(recyclableBufferedInputStream);
        try {
            InterfaceC8259j interfaceC8259jM3277g = this.f3558a.m3277g(new C7835g(c7831cM12233c), i9, i10, c8084d, new a(recyclableBufferedInputStream, c7831cM12233c));
            c7831cM12233c.m12235g();
            if (z9) {
                recyclableBufferedInputStream.m3256g();
            }
            return interfaceC8259jM3277g;
        } finally {
        }
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(InputStream inputStream, C8084d c8084d) {
        return this.f3558a.m3280p(inputStream);
    }
}
