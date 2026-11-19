package p303y;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5400a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p116h0.AbstractC8702f;
import p116h0.AbstractC8707k;
import p148k.C9044c;
import p148k.C9045d;
import p148k.C9046e;
import p148k.InterfaceC9042a;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;
import p248t.C10084k;

/* renamed from: y.a */
/* loaded from: classes3.dex */
public class C10591a implements InterfaceC9231e {

    /* renamed from: f */
    public static final a f20984f = new a();

    /* renamed from: g */
    public static final b f20985g = new b();

    /* renamed from: a */
    public final Context f20986a;

    /* renamed from: b */
    public final List f20987b;

    /* renamed from: c */
    public final b f20988c;

    /* renamed from: d */
    public final a f20989d;

    /* renamed from: e */
    public final C10592b f20990e;

    /* renamed from: y.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC9042a m19757a(InterfaceC9042a.a aVar, C9044c c9044c, ByteBuffer byteBuffer, int i10) {
            return new C9046e(aVar, c9044c, byteBuffer, i10);
        }
    }

    /* renamed from: y.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f20991a = AbstractC8707k.m14188f(0);

        /* renamed from: a */
        public synchronized C9045d m19758a(ByteBuffer byteBuffer) {
            C9045d c9045d;
            try {
                c9045d = (C9045d) this.f20991a.poll();
                if (c9045d == null) {
                    c9045d = new C9045d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c9045d.m15827p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m19759b(C9045d c9045d) {
            c9045d.m15812a();
            this.f20991a.offer(c9045d);
        }
    }

    public C10591a(Context context, List list, InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b) {
        this(context, list, interfaceC9500d, interfaceC9498b, f20985g, f20984f);
    }

    /* renamed from: e */
    public static int m19753e(C9044c c9044c, int i10, int i11) {
        int iMin = Math.min(c9044c.m15808a() / i11, c9044c.m15811d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            c9044c.m15811d();
            c9044c.m15808a();
        }
        return iMax;
    }

    /* renamed from: c */
    public final C10594d m19754c(ByteBuffer byteBuffer, int i10, int i11, C9045d c9045d, C9230d c9230d) {
        long jM14165b = AbstractC8702f.m14165b();
        try {
            C9044c c9044cM15814c = c9045d.m15814c();
            if (c9044cM15814c.m15809b() > 0 && c9044cM15814c.m15810c() == 0) {
                Bitmap.Config config = c9230d.m16940c(AbstractC10597g.f20996a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC9042a interfaceC9042aM19757a = this.f20989d.m19757a(this.f20990e, c9044cM15814c, byteBuffer, m19753e(c9044cM15814c, i10, i11));
                interfaceC9042aM19757a.mo15797d(config);
                interfaceC9042aM19757a.mo15795b();
                Bitmap bitmapMo15794a = interfaceC9042aM19757a.mo15794a();
                if (bitmapMo15794a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        AbstractC8702f.m14164a(jM14165b);
                    }
                    return null;
                }
                C10594d c10594d = new C10594d(new GifDrawable(this.f20986a, interfaceC9042aM19757a, C10084k.m18820c(), i10, i11, bitmapMo15794a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    AbstractC8702f.m14164a(jM14165b);
                }
                return c10594d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                AbstractC8702f.m14164a(jM14165b);
            }
            return null;
        } finally {
        }
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C10594d mo3061a(ByteBuffer byteBuffer, int i10, int i11, C9230d c9230d) {
        C9045d c9045dM19758a = this.f20988c.m19758a(byteBuffer);
        try {
            return m19754c(byteBuffer, i10, i11, c9045dM19758a, c9230d);
        } finally {
            this.f20988c.m19759b(c9045dM19758a);
        }
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(ByteBuffer byteBuffer, C9230d c9230d) {
        return !((Boolean) c9230d.m16940c(AbstractC10597g.f20997b)).booleanValue() && AbstractC5400a.m2835g(this.f20987b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C10591a(Context context, List list, InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b, b bVar, a aVar) {
        this.f20986a = context.getApplicationContext();
        this.f20987b = list;
        this.f20989d = aVar;
        this.f20990e = new C10592b(interfaceC9500d, interfaceC9498b);
        this.f20988c = bVar;
    }
}
