package p268v0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5477a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p091e1.AbstractC7833e;
import p091e1.AbstractC7838j;
import p112g0.C7985c;
import p112g0.C7986d;
import p112g0.C7987e;
import p112g0.InterfaceC7983a;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;
import p218q0.C9350f;

/* renamed from: v0.a */
/* loaded from: classes3.dex */
public class C9740a implements InterfaceC8085e {

    /* renamed from: f */
    public static final a f17206f = new a();

    /* renamed from: g */
    public static final b f17207g = new b();

    /* renamed from: a */
    public final Context f17208a;

    /* renamed from: b */
    public final List f17209b;

    /* renamed from: c */
    public final b f17210c;

    /* renamed from: d */
    public final a f17211d;

    /* renamed from: e */
    public final C9741b f17212e;

    /* renamed from: v0.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC7983a m16284a(InterfaceC7983a.a aVar, C7985c c7985c, ByteBuffer byteBuffer, int i9) {
            return new C7987e(aVar, c7985c, byteBuffer, i9);
        }
    }

    /* renamed from: v0.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f17213a = AbstractC7838j.m12262e(0);

        /* renamed from: a */
        public synchronized C7986d m16285a(ByteBuffer byteBuffer) {
            C7986d c7986d;
            try {
                c7986d = (C7986d) this.f17213a.poll();
                if (c7986d == null) {
                    c7986d = new C7986d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c7986d.m12535p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m16286b(C7986d c7986d) {
            c7986d.m12520a();
            this.f17213a.offer(c7986d);
        }
    }

    public C9740a(Context context, List list, InterfaceC8867d interfaceC8867d, InterfaceC8865b interfaceC8865b) {
        this(context, list, interfaceC8867d, interfaceC8865b, f17207g, f17206f);
    }

    /* renamed from: e */
    public static int m16280e(C7985c c7985c, int i9, int i10) {
        int iMin = Math.min(c7985c.m12516a() / i10, c7985c.m12519d() / i9);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            c7985c.m12519d();
            c7985c.m12516a();
        }
        return iMax;
    }

    /* renamed from: c */
    public final C9743d m16281c(ByteBuffer byteBuffer, int i9, int i10, C7986d c7986d, C8084d c8084d) {
        long jM12240b = AbstractC7833e.m12240b();
        try {
            C7985c c7985cM12522c = c7986d.m12522c();
            if (c7985cM12522c.m12517b() > 0 && c7985cM12522c.m12518c() == 0) {
                Bitmap.Config config = c8084d.m12908c(AbstractC9746g.f17218a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC7983a interfaceC7983aM16284a = this.f17211d.m16284a(this.f17212e, c7985cM12522c, byteBuffer, m16280e(c7985cM12522c, i9, i10));
                interfaceC7983aM16284a.mo12505d(config);
                interfaceC7983aM16284a.mo12503b();
                Bitmap bitmapMo12502a = interfaceC7983aM16284a.mo12502a();
                if (bitmapMo12502a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        AbstractC7833e.m12239a(jM12240b);
                    }
                    return null;
                }
                C9743d c9743d = new C9743d(new GifDrawable(this.f17208a, interfaceC7983aM16284a, C9350f.m15293c(), i9, i10, bitmapMo12502a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    AbstractC7833e.m12239a(jM12240b);
                }
                return c9743d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                AbstractC7833e.m12239a(jM12240b);
            }
            return null;
        } finally {
        }
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9743d mo3290b(ByteBuffer byteBuffer, int i9, int i10, C8084d c8084d) {
        C7986d c7986dM16285a = this.f17210c.m16285a(byteBuffer);
        try {
            return m16281c(byteBuffer, i9, i10, c7986dM16285a, c8084d);
        } finally {
            this.f17210c.m16286b(c7986dM16285a);
        }
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(ByteBuffer byteBuffer, C8084d c8084d) {
        return !((Boolean) c8084d.m12908c(AbstractC9746g.f17219b)).booleanValue() && AbstractC5477a.m3086f(this.f17209b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C9740a(Context context, List list, InterfaceC8867d interfaceC8867d, InterfaceC8865b interfaceC8865b, b bVar, a aVar) {
        this.f17208a = context.getApplicationContext();
        this.f17209b = list;
        this.f17211d = aVar;
        this.f17212e = new C9741b(interfaceC8867d, interfaceC8865b);
        this.f17210c = bVar;
    }
}
