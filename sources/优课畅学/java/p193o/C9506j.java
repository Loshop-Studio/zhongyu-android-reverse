package p193o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: o.j */
/* loaded from: classes3.dex */
public class C9506j implements InterfaceC9500d {

    /* renamed from: k */
    public static final Bitmap.Config f18864k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC9507k f18865a;

    /* renamed from: b */
    public final Set f18866b;

    /* renamed from: c */
    public final long f18867c;

    /* renamed from: d */
    public final a f18868d;

    /* renamed from: e */
    public long f18869e;

    /* renamed from: f */
    public long f18870f;

    /* renamed from: g */
    public int f18871g;

    /* renamed from: h */
    public int f18872h;

    /* renamed from: i */
    public int f18873i;

    /* renamed from: j */
    public int f18874j;

    /* renamed from: o.j$a */
    public interface a {
        /* renamed from: a */
        void mo17664a(Bitmap bitmap);

        /* renamed from: b */
        void mo17665b(Bitmap bitmap);
    }

    public C9506j(long j10, InterfaceC9507k interfaceC9507k, Set set) {
        this.f18867c = j10;
        this.f18869e = j10;
        this.f18865a = interfaceC9507k;
        this.f18866b = set;
        this.f18868d = new b();
    }

    /* renamed from: e */
    public static void m17652e(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: f */
    public static Bitmap m17653f(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f18864k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* renamed from: j */
    public static Set m17654j() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: k */
    public static InterfaceC9507k m17655k() {
        return new C9509m();
    }

    /* renamed from: n */
    public static void m17656n(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: o */
    public static void m17657o(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m17656n(bitmap);
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: a */
    public void mo17619a() {
        Log.isLoggable("LruBitmapPool", 3);
        m17663p(0L);
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: b */
    public synchronized void mo17620b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f18865a.mo17670e(bitmap) <= this.f18869e && this.f18866b.contains(bitmap.getConfig())) {
                int iMo17670e = this.f18865a.mo17670e(bitmap);
                this.f18865a.mo17667b(bitmap);
                this.f18868d.mo17665b(bitmap);
                this.f18873i++;
                this.f18870f += iMo17670e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f18865a.mo17666a(bitmap);
                }
                m17658g();
                m17660i();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f18865a.mo17666a(bitmap);
                bitmap.isMutable();
                this.f18866b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: c */
    public Bitmap mo17621c(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM17661l = m17661l(i10, i11, config);
        if (bitmapM17661l == null) {
            return m17653f(i10, i11, config);
        }
        bitmapM17661l.eraseColor(0);
        return bitmapM17661l;
    }

    @Override // p193o.InterfaceC9500d
    /* renamed from: d */
    public Bitmap mo17622d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM17661l = m17661l(i10, i11, config);
        return bitmapM17661l == null ? m17653f(i10, i11, config) : bitmapM17661l;
    }

    /* renamed from: g */
    public final void m17658g() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m17659h();
        }
    }

    /* renamed from: h */
    public final void m17659h() {
        Objects.toString(this.f18865a);
    }

    /* renamed from: i */
    public final void m17660i() {
        m17663p(this.f18869e);
    }

    /* renamed from: l */
    public final synchronized Bitmap m17661l(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapMo17668c;
        try {
            m17652e(config);
            bitmapMo17668c = this.f18865a.mo17668c(i10, i11, config != null ? config : f18864k);
            if (bitmapMo17668c == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f18865a.mo17669d(i10, i11, config);
                }
                this.f18872h++;
            } else {
                this.f18871g++;
                this.f18870f -= this.f18865a.mo17670e(bitmapMo17668c);
                this.f18868d.mo17664a(bitmapMo17668c);
                m17657o(bitmapMo17668c);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f18865a.mo17669d(i10, i11, config);
            }
            m17658g();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo17668c;
    }

    /* renamed from: m */
    public long m17662m() {
        return this.f18869e;
    }

    /* renamed from: p */
    public final synchronized void m17663p(long j10) {
        while (this.f18870f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f18865a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m17659h();
                    }
                    this.f18870f = 0L;
                    return;
                }
                this.f18868d.mo17664a(bitmapRemoveLast);
                this.f18870f -= this.f18865a.mo17670e(bitmapRemoveLast);
                this.f18874j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f18865a.mo17666a(bitmapRemoveLast);
                }
                m17658g();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p193o.InterfaceC9500d
    public void trimMemory(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            mo17619a();
        } else if (i10 >= 20 || i10 == 15) {
            m17663p(m17662m() / 2);
        }
    }

    public C9506j(long j10) {
        this(j10, m17655k(), m17654j());
    }

    /* renamed from: o.j$b */
    public static final class b implements a {
        @Override // p193o.C9506j.a
        /* renamed from: a */
        public void mo17664a(Bitmap bitmap) {
        }

        @Override // p193o.C9506j.a
        /* renamed from: b */
        public void mo17665b(Bitmap bitmap) {
        }
    }
}
