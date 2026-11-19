package p074i0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: i0.j */
/* loaded from: classes3.dex */
public class C6505j implements InterfaceC6499d {

    /* renamed from: k */
    public static final Bitmap.Config f8316k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC6506k f8317a;

    /* renamed from: b */
    public final Set f8318b;

    /* renamed from: c */
    public final long f8319c;

    /* renamed from: d */
    public final a f8320d;

    /* renamed from: e */
    public long f8321e;

    /* renamed from: f */
    public long f8322f;

    /* renamed from: g */
    public int f8323g;

    /* renamed from: h */
    public int f8324h;

    /* renamed from: i */
    public int f8325i;

    /* renamed from: j */
    public int f8326j;

    /* renamed from: i0.j$a */
    public interface a {
        /* renamed from: a */
        void mo7241a(Bitmap bitmap);

        /* renamed from: b */
        void mo7242b(Bitmap bitmap);
    }

    public C6505j(long j6, InterfaceC6506k interfaceC6506k, Set set) {
        this.f8319c = j6;
        this.f8321e = j6;
        this.f8317a = interfaceC6506k;
        this.f8318b = set;
        this.f8320d = new b();
    }

    /* renamed from: f */
    public static void m7229f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m7230g(int i6, int i7, Bitmap.Config config) {
        if (config == null) {
            config = f8316k;
        }
        return Bitmap.createBitmap(i6, i7, config);
    }

    /* renamed from: k */
    public static Set m7231k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i6 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i6 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC6506k m7232l() {
        return new C6508m();
    }

    /* renamed from: o */
    public static void m7233o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m7234p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m7233o(bitmap);
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: a */
    public void mo7195a(int i6) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i6 >= 40 || i6 >= 20) {
            mo7196b();
        } else if (i6 >= 20 || i6 == 15) {
            m7240q(m7239n() / 2);
        }
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: b */
    public void mo7196b() {
        Log.isLoggable("LruBitmapPool", 3);
        m7240q(0L);
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: c */
    public synchronized void mo7197c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f8317a.mo7247e(bitmap) <= this.f8321e && this.f8318b.contains(bitmap.getConfig())) {
                int iMo7247e = this.f8317a.mo7247e(bitmap);
                this.f8317a.mo7245c(bitmap);
                this.f8320d.mo7242b(bitmap);
                this.f8325i++;
                this.f8322f += iMo7247e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f8317a.mo7243a(bitmap);
                }
                m7235h();
                m7237j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f8317a.mo7243a(bitmap);
                bitmap.isMutable();
                this.f8318b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: d */
    public Bitmap mo7198d(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapM7238m = m7238m(i6, i7, config);
        if (bitmapM7238m == null) {
            return m7230g(i6, i7, config);
        }
        bitmapM7238m.eraseColor(0);
        return bitmapM7238m;
    }

    @Override // p074i0.InterfaceC6499d
    /* renamed from: e */
    public Bitmap mo7199e(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapM7238m = m7238m(i6, i7, config);
        return bitmapM7238m == null ? m7230g(i6, i7, config) : bitmapM7238m;
    }

    /* renamed from: h */
    public final void m7235h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m7236i();
        }
    }

    /* renamed from: i */
    public final void m7236i() {
        Objects.toString(this.f8317a);
    }

    /* renamed from: j */
    public final void m7237j() {
        m7240q(this.f8321e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m7238m(int i6, int i7, Bitmap.Config config) {
        Bitmap bitmapMo7246d;
        try {
            m7229f(config);
            bitmapMo7246d = this.f8317a.mo7246d(i6, i7, config != null ? config : f8316k);
            if (bitmapMo7246d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f8317a.mo7244b(i6, i7, config);
                }
                this.f8324h++;
            } else {
                this.f8323g++;
                this.f8322f -= this.f8317a.mo7247e(bitmapMo7246d);
                this.f8320d.mo7241a(bitmapMo7246d);
                m7234p(bitmapMo7246d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f8317a.mo7244b(i6, i7, config);
            }
            m7235h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo7246d;
    }

    /* renamed from: n */
    public long m7239n() {
        return this.f8321e;
    }

    /* renamed from: q */
    public final synchronized void m7240q(long j6) {
        while (this.f8322f > j6) {
            try {
                Bitmap bitmapRemoveLast = this.f8317a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m7236i();
                    }
                    this.f8322f = 0L;
                    return;
                }
                this.f8320d.mo7241a(bitmapRemoveLast);
                this.f8322f -= this.f8317a.mo7247e(bitmapRemoveLast);
                this.f8326j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f8317a.mo7243a(bitmapRemoveLast);
                }
                m7235h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6505j(long j6) {
        this(j6, m7232l(), m7231k());
    }

    /* renamed from: i0.j$b */
    public static final class b implements a {
        @Override // p074i0.C6505j.a
        /* renamed from: a */
        public void mo7241a(Bitmap bitmap) {
        }

        @Override // p074i0.C6505j.a
        /* renamed from: b */
        public void mo7242b(Bitmap bitmap) {
        }
    }
}
