package p353u0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5819a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p109d1.AbstractC8905f;
import p109d1.AbstractC8910k;
import p156g0.C9255c;
import p156g0.C9256d;
import p156g0.C9257e;
import p156g0.InterfaceC9253a;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;
import p284p0.C10598e;

/* renamed from: u0.a */
/* loaded from: classes3.dex */
public class C11313a implements InterfaceC9439f {

    /* renamed from: f */
    public static final a f27117f = new a();

    /* renamed from: g */
    public static final b f27118g = new b();

    /* renamed from: a */
    public final Context f27119a;

    /* renamed from: b */
    public final List f27120b;

    /* renamed from: c */
    public final b f27121c;

    /* renamed from: d */
    public final a f27122d;

    /* renamed from: e */
    public final C11314b f27123e;

    /* renamed from: u0.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC9253a m25264a(InterfaceC9253a.a aVar, C9255c c9255c, ByteBuffer byteBuffer, int i10) {
            return new C9257e(aVar, c9255c, byteBuffer, i10);
        }
    }

    /* renamed from: u0.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f27124a = AbstractC8910k.m17475f(0);

        /* renamed from: a */
        public synchronized C9256d m25265a(ByteBuffer byteBuffer) {
            C9256d c9256d;
            try {
                c9256d = (C9256d) this.f27124a.poll();
                if (c9256d == null) {
                    c9256d = new C9256d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c9256d.m18241p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m25266b(C9256d c9256d) {
            c9256d.m18226a();
            this.f27124a.offer(c9256d);
        }
    }

    public C11313a(Context context, List list, InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b) {
        this(context, list, interfaceC9772d, interfaceC9770b, f27118g, f27117f);
    }

    /* renamed from: e */
    public static int m25260e(C9255c c9255c, int i10, int i11) {
        int iMin = Math.min(c9255c.m18222a() / i11, c9255c.m18225d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            c9255c.m18225d();
            c9255c.m18222a();
        }
        return iMax;
    }

    /* renamed from: c */
    public final C11316d m25261c(ByteBuffer byteBuffer, int i10, int i11, C9256d c9256d, C9438e c9438e) {
        long jM17452b = AbstractC8905f.m17452b();
        try {
            C9255c c9255cM18228c = c9256d.m18228c();
            if (c9255cM18228c.m18223b() > 0 && c9255cM18228c.m18224c() == 0) {
                Bitmap.Config config = c9438e.m18626c(AbstractC11319g.f27129a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC9253a interfaceC9253aM25264a = this.f27122d.m25264a(this.f27123e, c9255cM18228c, byteBuffer, m25260e(c9255cM18228c, i10, i11));
                interfaceC9253aM25264a.mo18211d(config);
                interfaceC9253aM25264a.mo18209b();
                Bitmap bitmapMo18208a = interfaceC9253aM25264a.mo18208a();
                if (bitmapMo18208a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        AbstractC8905f.m17451a(jM17452b);
                    }
                    return null;
                }
                C11316d c11316d = new C11316d(new GifDrawable(this.f27119a, interfaceC9253aM25264a, C10598e.m22420c(), i10, i11, bitmapMo18208a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    AbstractC8905f.m17451a(jM17452b);
                }
                return c11316d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                AbstractC8905f.m17451a(jM17452b);
            }
            return null;
        } finally {
        }
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C11316d mo4266b(ByteBuffer byteBuffer, int i10, int i11, C9438e c9438e) {
        C9256d c9256dM25265a = this.f27121c.m25265a(byteBuffer);
        try {
            return m25261c(byteBuffer, i10, i11, c9256dM25265a, c9438e);
        } finally {
            this.f27121c.m25266b(c9256dM25265a);
        }
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(ByteBuffer byteBuffer, C9438e c9438e) {
        return !((Boolean) c9438e.m18626c(AbstractC11319g.f27130b)).booleanValue() && AbstractC5819a.m4041g(this.f27120b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C11313a(Context context, List list, InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b, b bVar, a aVar) {
        this.f27119a = context.getApplicationContext();
        this.f27120b = list;
        this.f27122d = aVar;
        this.f27123e = new C11314b(interfaceC9772d, interfaceC9770b);
        this.f27121c = bVar;
    }
}
