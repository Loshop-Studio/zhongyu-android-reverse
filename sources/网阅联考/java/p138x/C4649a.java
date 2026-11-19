package p138x;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC2864a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p062g0.AbstractC3745e;
import p062g0.AbstractC3750j;
import p071i.C3773c;
import p071i.C3774d;
import p071i.C3775e;
import p071i.InterfaceC3771a;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;
import p118s.C4542l;

/* renamed from: x.a */
/* loaded from: classes2.dex */
public class C4649a implements InterfaceC3795e {

    /* renamed from: f */
    public static final a f5932f = new a();

    /* renamed from: g */
    public static final b f5933g = new b();

    /* renamed from: a */
    public final Context f5934a;

    /* renamed from: b */
    public final List f5935b;

    /* renamed from: c */
    public final b f5936c;

    /* renamed from: d */
    public final a f5937d;

    /* renamed from: e */
    public final C4650b f5938e;

    /* renamed from: x.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC3771a m6547a(InterfaceC3771a.a aVar, C3773c c3773c, ByteBuffer byteBuffer, int i4) {
            return new C3775e(aVar, c3773c, byteBuffer, i4);
        }
    }

    /* renamed from: x.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f5939a = AbstractC3750j.m4774e(0);

        /* renamed from: a */
        public synchronized C3774d m6548a(ByteBuffer byteBuffer) {
            C3774d c3774d;
            c3774d = (C3774d) this.f5939a.poll();
            if (c3774d == null) {
                c3774d = new C3774d();
            }
            return c3774d.m4908p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m6549b(C3774d c3774d) {
            c3774d.m4893a();
            this.f5939a.offer(c3774d);
        }
    }

    public C4649a(Context context, List list, InterfaceC4395d interfaceC4395d, InterfaceC4393b interfaceC4393b) {
        this(context, list, interfaceC4395d, interfaceC4393b, f5933g, f5932f);
    }

    /* renamed from: e */
    public static int m6543e(C3773c c3773c, int i4, int i5) {
        int iMin = Math.min(c3773c.m4889a() / i5, c3773c.m4892d() / i4);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(iMax);
            sb.append(", target dimens: [");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            sb.append("], actual dimens: [");
            sb.append(c3773c.m4892d());
            sb.append("x");
            sb.append(c3773c.m4889a());
            sb.append("]");
        }
        return iMax;
    }

    /* renamed from: c */
    public final C4652d m6544c(ByteBuffer byteBuffer, int i4, int i5, C3774d c3774d, C3794d c3794d) {
        long jM4752b = AbstractC3745e.m4752b();
        try {
            C3773c c3773cM4895c = c3774d.m4895c();
            if (c3773cM4895c.m4890b() > 0 && c3773cM4895c.m4891c() == 0) {
                Bitmap.Config config = c3794d.m4951c(AbstractC4655g.f5944a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC3771a interfaceC3771aM6547a = this.f5937d.m6547a(this.f5938e, c3773cM4895c, byteBuffer, m6543e(c3773cM4895c, i4, i5));
                interfaceC3771aM6547a.mo4879e(config);
                interfaceC3771aM6547a.mo4876b();
                Bitmap bitmapMo4875a = interfaceC3771aM6547a.mo4875a();
                if (bitmapMo4875a == null) {
                    return null;
                }
                C4652d c4652d = new C4652d(new GifDrawable(this.f5934a, interfaceC3771aM6547a, C4542l.m6179c(), i4, i5, bitmapMo4875a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Decoded GIF from stream in ");
                    sb.append(AbstractC3745e.m4751a(jM4752b));
                }
                return c4652d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Decoded GIF from stream in ");
                sb2.append(AbstractC3745e.m4751a(jM4752b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(AbstractC3745e.m4751a(jM4752b));
            }
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4652d mo1966b(ByteBuffer byteBuffer, int i4, int i5, C3794d c3794d) {
        C3774d c3774dM6548a = this.f5936c.m6548a(byteBuffer);
        try {
            return m6544c(byteBuffer, i4, i5, c3774dM6548a, c3794d);
        } finally {
            this.f5936c.m6549b(c3774dM6548a);
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(ByteBuffer byteBuffer, C3794d c3794d) {
        return !((Boolean) c3794d.m4951c(AbstractC4655g.f5945b)).booleanValue() && AbstractC2864a.m1760e(this.f5935b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C4649a(Context context, List list, InterfaceC4395d interfaceC4395d, InterfaceC4393b interfaceC4393b, b bVar, a aVar) {
        this.f5934a = context.getApplicationContext();
        this.f5935b = list;
        this.f5937d = aVar;
        this.f5938e = new C4650b(interfaceC4395d, interfaceC4393b);
        this.f5936c = bVar;
    }
}
