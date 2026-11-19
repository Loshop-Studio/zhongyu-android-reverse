package p146s0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC4687a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p016b1.AbstractC4404f;
import p016b1.AbstractC4409k;
import p046e0.C6258c;
import p046e0.C6259d;
import p046e0.C6260e;
import p046e0.InterfaceC6256a;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;
import p111n0.C7448e;

/* renamed from: s0.a */
/* loaded from: classes3.dex */
public class C7679a implements InterfaceC6286e {

    /* renamed from: f */
    public static final a f10133f = new a();

    /* renamed from: g */
    public static final b f10134g = new b();

    /* renamed from: a */
    public final Context f10135a;

    /* renamed from: b */
    public final List f10136b;

    /* renamed from: c */
    public final b f10137c;

    /* renamed from: d */
    public final a f10138d;

    /* renamed from: e */
    public final C7680b f10139e;

    /* renamed from: s0.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC6256a m9136a(InterfaceC6256a.a aVar, C6258c c6258c, ByteBuffer byteBuffer, int i6) {
            return new C6260e(aVar, c6258c, byteBuffer, i6);
        }
    }

    /* renamed from: s0.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f10140a = AbstractC4409k.m1445f(0);

        /* renamed from: a */
        public synchronized C6259d m9137a(ByteBuffer byteBuffer) {
            C6259d c6259d;
            try {
                c6259d = (C6259d) this.f10140a.poll();
                if (c6259d == null) {
                    c6259d = new C6259d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c6259d.m6384p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m9138b(C6259d c6259d) {
            c6259d.m6369a();
            this.f10140a.offer(c6259d);
        }
    }

    public C7679a(Context context, List list, InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b) {
        this(context, list, interfaceC6499d, interfaceC6497b, f10134g, f10133f);
    }

    /* renamed from: e */
    public static int m9132e(C6258c c6258c, int i6, int i7) {
        int iMin = Math.min(c6258c.m6365a() / i7, c6258c.m6368d() / i6);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            c6258c.m6368d();
            c6258c.m6365a();
        }
        return iMax;
    }

    /* renamed from: c */
    public final C7682d m9133c(ByteBuffer byteBuffer, int i6, int i7, C6259d c6259d, C6285d c6285d) {
        long jM1422b = AbstractC4404f.m1422b();
        try {
            C6258c c6258cM6371c = c6259d.m6371c();
            if (c6258cM6371c.m6366b() > 0 && c6258cM6371c.m6367c() == 0) {
                Bitmap.Config config = c6285d.m6420c(AbstractC7685g.f10145a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC6256a interfaceC6256aM9136a = this.f10138d.m9136a(this.f10139e, c6258cM6371c, byteBuffer, m9132e(c6258cM6371c, i6, i7));
                interfaceC6256aM9136a.mo6354d(config);
                interfaceC6256aM9136a.mo6352b();
                Bitmap bitmapMo6351a = interfaceC6256aM9136a.mo6351a();
                if (bitmapMo6351a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        AbstractC4404f.m1421a(jM1422b);
                    }
                    return null;
                }
                C7682d c7682d = new C7682d(new GifDrawable(this.f10135a, interfaceC6256aM9136a, C7448e.m8496c(), i6, i7, bitmapMo6351a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    AbstractC4404f.m1421a(jM1422b);
                }
                return c7682d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                AbstractC4404f.m1421a(jM1422b);
            }
            return null;
        } finally {
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7682d mo2796a(ByteBuffer byteBuffer, int i6, int i7, C6285d c6285d) {
        C6259d c6259dM9137a = this.f10137c.m9137a(byteBuffer);
        try {
            return m9133c(byteBuffer, i6, i7, c6259dM9137a, c6285d);
        } finally {
            this.f10137c.m9138b(c6259dM9137a);
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(ByteBuffer byteBuffer, C6285d c6285d) {
        return !((Boolean) c6285d.m6420c(AbstractC7685g.f10146b)).booleanValue() && AbstractC4687a.m2569g(this.f10136b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C7679a(Context context, List list, InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b, b bVar, a aVar) {
        this.f10135a = context.getApplicationContext();
        this.f10136b = list;
        this.f10138d = aVar;
        this.f10139e = new C7680b(interfaceC6499d, interfaceC6497b);
        this.f10137c = bVar;
    }
}
