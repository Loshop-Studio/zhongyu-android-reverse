package p213k0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: k0.j */
/* loaded from: classes3.dex */
public class C9778j implements InterfaceC9772d {

    /* renamed from: k */
    public static final Bitmap.Config f22947k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC9779k f22948a;

    /* renamed from: b */
    public final Set f22949b;

    /* renamed from: c */
    public final long f22950c;

    /* renamed from: d */
    public final a f22951d;

    /* renamed from: e */
    public long f22952e;

    /* renamed from: f */
    public long f22953f;

    /* renamed from: g */
    public int f22954g;

    /* renamed from: h */
    public int f22955h;

    /* renamed from: i */
    public int f22956i;

    /* renamed from: j */
    public int f22957j;

    /* renamed from: k0.j$a */
    public interface a {
        /* renamed from: a */
        void mo19754a(Bitmap bitmap);

        /* renamed from: b */
        void mo19755b(Bitmap bitmap);
    }

    public C9778j(long j10, InterfaceC9779k interfaceC9779k, Set set) {
        this.f22950c = j10;
        this.f22952e = j10;
        this.f22948a = interfaceC9779k;
        this.f22949b = set;
        this.f22951d = new b();
    }

    /* renamed from: f */
    public static void m19742f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m19743g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f22947k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* renamed from: k */
    public static Set m19744k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC9779k m19745l() {
        return new C9781m();
    }

    /* renamed from: o */
    public static void m19746o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m19747p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m19746o(bitmap);
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: a */
    public void mo19708a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            mo19709b();
        } else if (i10 >= 20 || i10 == 15) {
            m19753q(m19752n() / 2);
        }
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: b */
    public void mo19709b() {
        Log.isLoggable("LruBitmapPool", 3);
        m19753q(0L);
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: c */
    public synchronized void mo19710c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f22948a.mo19760e(bitmap) <= this.f22952e && this.f22949b.contains(bitmap.getConfig())) {
                int iMo19760e = this.f22948a.mo19760e(bitmap);
                this.f22948a.mo19758c(bitmap);
                this.f22951d.mo19755b(bitmap);
                this.f22956i++;
                this.f22953f += iMo19760e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f22948a.mo19756a(bitmap);
                }
                m19748h();
                m19750j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f22948a.mo19756a(bitmap);
                bitmap.isMutable();
                this.f22949b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: d */
    public Bitmap mo19711d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM19751m = m19751m(i10, i11, config);
        if (bitmapM19751m == null) {
            return m19743g(i10, i11, config);
        }
        bitmapM19751m.eraseColor(0);
        return bitmapM19751m;
    }

    @Override // p213k0.InterfaceC9772d
    /* renamed from: e */
    public Bitmap mo19712e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM19751m = m19751m(i10, i11, config);
        return bitmapM19751m == null ? m19743g(i10, i11, config) : bitmapM19751m;
    }

    /* renamed from: h */
    public final void m19748h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m19749i();
        }
    }

    /* renamed from: i */
    public final void m19749i() {
        Objects.toString(this.f22948a);
    }

    /* renamed from: j */
    public final void m19750j() {
        m19753q(this.f22952e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m19751m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapMo19759d;
        try {
            m19742f(config);
            bitmapMo19759d = this.f22948a.mo19759d(i10, i11, config != null ? config : f22947k);
            if (bitmapMo19759d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f22948a.mo19757b(i10, i11, config);
                }
                this.f22955h++;
            } else {
                this.f22954g++;
                this.f22953f -= this.f22948a.mo19760e(bitmapMo19759d);
                this.f22951d.mo19754a(bitmapMo19759d);
                m19747p(bitmapMo19759d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f22948a.mo19757b(i10, i11, config);
            }
            m19748h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo19759d;
    }

    /* renamed from: n */
    public long m19752n() {
        return this.f22952e;
    }

    /* renamed from: q */
    public final synchronized void m19753q(long j10) {
        while (this.f22953f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f22948a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m19749i();
                    }
                    this.f22953f = 0L;
                    return;
                }
                this.f22951d.mo19754a(bitmapRemoveLast);
                this.f22953f -= this.f22948a.mo19760e(bitmapRemoveLast);
                this.f22957j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f22948a.mo19756a(bitmapRemoveLast);
                }
                m19748h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C9778j(long j10) {
        this(j10, m19745l(), m19744k());
    }

    /* renamed from: k0.j$b */
    public static final class b implements a {
        @Override // p213k0.C9778j.a
        /* renamed from: a */
        public void mo19754a(Bitmap bitmap) {
        }

        @Override // p213k0.C9778j.a
        /* renamed from: b */
        public void mo19755b(Bitmap bitmap) {
        }
    }
}
