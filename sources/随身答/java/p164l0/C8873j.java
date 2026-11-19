package p164l0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: l0.j */
/* loaded from: classes3.dex */
public class C8873j implements InterfaceC8867d {

    /* renamed from: k */
    public static final Bitmap.Config f14652k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC8874k f14653a;

    /* renamed from: b */
    public final Set f14654b;

    /* renamed from: c */
    public final long f14655c;

    /* renamed from: d */
    public final a f14656d;

    /* renamed from: e */
    public long f14657e;

    /* renamed from: f */
    public long f14658f;

    /* renamed from: g */
    public int f14659g;

    /* renamed from: h */
    public int f14660h;

    /* renamed from: i */
    public int f14661i;

    /* renamed from: j */
    public int f14662j;

    /* renamed from: l0.j$a */
    public interface a {
        /* renamed from: a */
        void mo13776a(Bitmap bitmap);

        /* renamed from: b */
        void mo13777b(Bitmap bitmap);
    }

    public C8873j(long j9, InterfaceC8874k interfaceC8874k, Set set) {
        this.f14655c = j9;
        this.f14657e = j9;
        this.f14653a = interfaceC8874k;
        this.f14654b = set;
        this.f14656d = new b();
    }

    /* renamed from: f */
    public static void m13764f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m13765g(int i9, int i10, Bitmap.Config config) {
        if (config == null) {
            config = f14652k;
        }
        return Bitmap.createBitmap(i9, i10, config);
    }

    /* renamed from: k */
    public static Set m13766k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i9 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i9 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC8874k m13767l() {
        return new C8876m();
    }

    /* renamed from: o */
    public static void m13768o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m13769p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m13768o(bitmap);
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: a */
    public void mo13730a(int i9) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i9 >= 40 || i9 >= 20) {
            mo13731b();
        } else if (i9 >= 20 || i9 == 15) {
            m13775q(m13774n() / 2);
        }
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: b */
    public void mo13731b() {
        Log.isLoggable("LruBitmapPool", 3);
        m13775q(0L);
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: c */
    public synchronized void mo13732c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f14653a.mo13782e(bitmap) <= this.f14657e && this.f14654b.contains(bitmap.getConfig())) {
                int iMo13782e = this.f14653a.mo13782e(bitmap);
                this.f14653a.mo13780c(bitmap);
                this.f14656d.mo13777b(bitmap);
                this.f14661i++;
                this.f14658f += iMo13782e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f14653a.mo13778a(bitmap);
                }
                m13770h();
                m13772j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f14653a.mo13778a(bitmap);
                bitmap.isMutable();
                this.f14654b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: d */
    public Bitmap mo13733d(int i9, int i10, Bitmap.Config config) {
        Bitmap bitmapM13773m = m13773m(i9, i10, config);
        if (bitmapM13773m == null) {
            return m13765g(i9, i10, config);
        }
        bitmapM13773m.eraseColor(0);
        return bitmapM13773m;
    }

    @Override // p164l0.InterfaceC8867d
    /* renamed from: e */
    public Bitmap mo13734e(int i9, int i10, Bitmap.Config config) {
        Bitmap bitmapM13773m = m13773m(i9, i10, config);
        return bitmapM13773m == null ? m13765g(i9, i10, config) : bitmapM13773m;
    }

    /* renamed from: h */
    public final void m13770h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m13771i();
        }
    }

    /* renamed from: i */
    public final void m13771i() {
        Objects.toString(this.f14653a);
    }

    /* renamed from: j */
    public final void m13772j() {
        m13775q(this.f14657e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m13773m(int i9, int i10, Bitmap.Config config) {
        Bitmap bitmapMo13781d;
        try {
            m13764f(config);
            bitmapMo13781d = this.f14653a.mo13781d(i9, i10, config != null ? config : f14652k);
            if (bitmapMo13781d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f14653a.mo13779b(i9, i10, config);
                }
                this.f14660h++;
            } else {
                this.f14659g++;
                this.f14658f -= this.f14653a.mo13782e(bitmapMo13781d);
                this.f14656d.mo13776a(bitmapMo13781d);
                m13769p(bitmapMo13781d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f14653a.mo13779b(i9, i10, config);
            }
            m13770h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo13781d;
    }

    /* renamed from: n */
    public long m13774n() {
        return this.f14657e;
    }

    /* renamed from: q */
    public final synchronized void m13775q(long j9) {
        while (this.f14658f > j9) {
            try {
                Bitmap bitmapRemoveLast = this.f14653a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m13771i();
                    }
                    this.f14658f = 0L;
                    return;
                }
                this.f14656d.mo13776a(bitmapRemoveLast);
                this.f14658f -= this.f14653a.mo13782e(bitmapRemoveLast);
                this.f14662j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f14653a.mo13778a(bitmapRemoveLast);
                }
                m13770h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8873j(long j9) {
        this(j9, m13767l(), m13766k());
    }

    /* renamed from: l0.j$b */
    public static final class b implements a {
        @Override // p164l0.C8873j.a
        /* renamed from: a */
        public void mo13776a(Bitmap bitmap) {
        }

        @Override // p164l0.C8873j.a
        /* renamed from: b */
        public void mo13777b(Bitmap bitmap) {
        }
    }
}
