package p301z0;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5351a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p117i1.AbstractC7647f;
import p117i1.AbstractC7652k;
import p151l0.C8484c;
import p151l0.C8485d;
import p151l0.C8486e;
import p151l0.InterfaceC8482a;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;
import p250u0.C9533e;

/* renamed from: z0.a */
/* loaded from: classes3.dex */
public class C9964a implements InterfaceC8540e {

    /* renamed from: f */
    public static final a f17813f = new a();

    /* renamed from: g */
    public static final b f17814g = new b();

    /* renamed from: a */
    public final Context f17815a;

    /* renamed from: b */
    public final List f17816b;

    /* renamed from: c */
    public final b f17817c;

    /* renamed from: d */
    public final a f17818d;

    /* renamed from: e */
    public final C9965b f17819e;

    /* renamed from: z0.a$a */
    public static class a {
        /* renamed from: a */
        public InterfaceC8482a m16788a(InterfaceC8482a.a aVar, C8484c c8484c, ByteBuffer byteBuffer, int i10) {
            return new C8486e(aVar, c8484c, byteBuffer, i10);
        }
    }

    /* renamed from: z0.a$b */
    public static class b {

        /* renamed from: a */
        public final Queue f17820a = AbstractC7652k.m12690f(0);

        /* renamed from: a */
        public synchronized C8485d m16789a(ByteBuffer byteBuffer) {
            C8485d c8485d;
            try {
                c8485d = (C8485d) this.f17820a.poll();
                if (c8485d == null) {
                    c8485d = new C8485d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c8485d.m13899p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m16790b(C8485d c8485d) {
            c8485d.m13884a();
            this.f17820a.offer(c8485d);
        }
    }

    public C9964a(Context context, List list, InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b) {
        this(context, list, interfaceC8804d, interfaceC8802b, f17814g, f17813f);
    }

    /* renamed from: e */
    public static int m16784e(C8484c c8484c, int i10, int i11) {
        int iMin = Math.min(c8484c.m13880a() / i11, c8484c.m13883d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            c8484c.m13883d();
            c8484c.m13880a();
        }
        return iMax;
    }

    /* renamed from: c */
    public final C9967d m16785c(ByteBuffer byteBuffer, int i10, int i11, C8485d c8485d, C8539d c8539d) {
        long jM12667b = AbstractC7647f.m12667b();
        try {
            C8484c c8484cM13886c = c8485d.m13886c();
            if (c8484cM13886c.m13881b() > 0 && c8484cM13886c.m13882c() == 0) {
                Bitmap.Config config = c8539d.m14057c(AbstractC9970g.f17825a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC8482a interfaceC8482aM16788a = this.f17818d.m16788a(this.f17819e, c8484cM13886c, byteBuffer, m16784e(c8484cM13886c, i10, i11));
                interfaceC8482aM16788a.mo13869d(config);
                interfaceC8482aM16788a.mo13867b();
                Bitmap bitmapMo13866a = interfaceC8482aM16788a.mo13866a();
                if (bitmapMo13866a == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        AbstractC7647f.m12666a(jM12667b);
                    }
                    return null;
                }
                C9967d c9967d = new C9967d(new GifDrawable(this.f17815a, interfaceC8482aM16788a, C9533e.m15909c(), i10, i11, bitmapMo13866a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    AbstractC7647f.m12666a(jM12667b);
                }
                return c9967d;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                AbstractC7647f.m12666a(jM12667b);
            }
            return null;
        } finally {
        }
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C9967d mo3617b(ByteBuffer byteBuffer, int i10, int i11, C8539d c8539d) {
        C8485d c8485dM16789a = this.f17817c.m16789a(byteBuffer);
        try {
            return m16785c(byteBuffer, i10, i11, c8485dM16789a, c8539d);
        } finally {
            this.f17817c.m16790b(c8485dM16789a);
        }
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(ByteBuffer byteBuffer, C8539d c8539d) {
        return !((Boolean) c8539d.m14057c(AbstractC9970g.f17826b)).booleanValue() && AbstractC5351a.m3388g(this.f17816b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public C9964a(Context context, List list, InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b, b bVar, a aVar) {
        this.f17815a = context.getApplicationContext();
        this.f17816b = list;
        this.f17818d = aVar;
        this.f17819e = new C9965b(interfaceC8804d, interfaceC8802b);
        this.f17817c = bVar;
    }
}
