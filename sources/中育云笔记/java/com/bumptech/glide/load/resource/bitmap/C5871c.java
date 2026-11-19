package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C5869a;
import java.io.IOException;
import java.io.InputStream;
import p109d1.C8902c;
import p109d1.C8907h;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* loaded from: classes3.dex */
public class C5871c implements InterfaceC9439f {

    /* renamed from: a */
    public final C5869a f4979a;

    /* renamed from: b */
    public final InterfaceC9770b f4980b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class a implements C5869a.b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f4981a;

        /* renamed from: b */
        public final C8902c f4982b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, C8902c c8902c) {
            this.f4981a = recyclableBufferedInputStream;
            this.f4982b = c8902c;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5869a.b
        /* renamed from: a */
        public void mo4308a(InterfaceC9772d interfaceC9772d, Bitmap bitmap) throws IOException {
            IOException iOExceptionM17445e = this.f4982b.m17445e();
            if (iOExceptionM17445e != null) {
                if (bitmap == null) {
                    throw iOExceptionM17445e;
                }
                interfaceC9772d.mo19710c(bitmap);
                throw iOExceptionM17445e;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5869a.b
        /* renamed from: b */
        public void mo4309b() {
            this.f4981a.m4254e();
        }
    }

    public C5871c(C5869a c5869a, InterfaceC9770b interfaceC9770b) {
        this.f4979a = c5869a;
        this.f4980b = interfaceC9770b;
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(InputStream inputStream, int i10, int i11, C9438e c9438e) {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f4980b);
        }
        C8902c c8902cM17444f = C8902c.m17444f(recyclableBufferedInputStream);
        try {
            InterfaceC9657j interfaceC9657jM4301f = this.f4979a.m4301f(new C8907h(c8902cM17444f), i10, i11, c9438e, new a(recyclableBufferedInputStream, c8902cM17444f));
            c8902cM17444f.m17446g();
            if (z10) {
                recyclableBufferedInputStream.m4255f();
            }
            return interfaceC9657jM4301f;
        } finally {
        }
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(InputStream inputStream, C9438e c9438e) {
        return this.f4979a.m4305p(inputStream);
    }
}
