package p024c0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import io.reactivex.internal.operators.observable.C5711g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p180v0.AbstractC6664k;

/* renamed from: c0.h */
/* loaded from: classes2.dex */
public final class C3211h implements InterfaceC3205b {

    /* renamed from: j */
    public static final Bitmap.Config f1756j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C3215l f1757a;

    /* renamed from: b */
    public final Set f1758b;

    /* renamed from: c */
    public final C5711g f1759c;

    /* renamed from: d */
    public final long f1760d;

    /* renamed from: e */
    public long f1761e;

    /* renamed from: f */
    public int f1762f;

    /* renamed from: g */
    public int f1763g;

    /* renamed from: h */
    public int f1764h;

    /* renamed from: i */
    public int f1765i;

    public C3211h(long j7) {
        C3215l c3215l = new C3215l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1760d = j7;
        this.f1757a = c3215l;
        this.f1758b = setUnmodifiableSet;
        this.f1759c = new C5711g(2);
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: a */
    public final Bitmap mo2141a(int i, int i8, Bitmap.Config config) {
        Bitmap bitmapM2162f = m2162f(i, i8, config);
        if (bitmapM2162f != null) {
            return bitmapM2162f;
        }
        if (config == null) {
            config = f1756j;
        }
        return Bitmap.createBitmap(i, i8, config);
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: b */
    public final synchronized void mo2142b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f1757a.getClass();
                if (AbstractC6664k.m6323c(bitmap) <= this.f1760d && this.f1758b.contains(bitmap.getConfig())) {
                    this.f1757a.getClass();
                    int iM6323c = AbstractC6664k.m6323c(bitmap);
                    this.f1757a.m2168e(bitmap);
                    this.f1759c.getClass();
                    this.f1764h++;
                    this.f1761e += iM6323c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f1757a.getClass();
                        sb.append(C3215l.m2164c(AbstractC6664k.m6323c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m2161d();
                    }
                    m2163g(this.f1760d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f1757a.getClass();
                sb2.append(C3215l.m2164c(AbstractC6664k.m6323c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f1758b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: c */
    public final void mo2143c(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo2144e();
        } else if (i >= 20 || i == 15) {
            m2163g(this.f1760d / 2);
        }
    }

    /* renamed from: d */
    public final void m2161d() {
        Log.v("LruBitmapPool", "Hits=" + this.f1762f + ", misses=" + this.f1763g + ", puts=" + this.f1764h + ", evictions=" + this.f1765i + ", currentSize=" + this.f1761e + ", maxSize=" + this.f1760d + "\nStrategy=" + this.f1757a);
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: e */
    public final void mo2144e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m2163g(0L);
    }

    /* renamed from: f */
    public final synchronized Bitmap m2162f(int i, int i8, Bitmap.Config config) {
        Bitmap bitmapM2166b;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM2166b = this.f1757a.m2166b(i, i8, config != null ? config : f1756j);
            if (bitmapM2166b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f1757a.getClass();
                    sb.append(C3215l.m2164c(AbstractC6664k.m6322b(i, i8, config), config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f1763g++;
            } else {
                this.f1762f++;
                long j7 = this.f1761e;
                this.f1757a.getClass();
                this.f1761e = j7 - AbstractC6664k.m6323c(bitmapM2166b);
                this.f1759c.getClass();
                bitmapM2166b.setHasAlpha(true);
                bitmapM2166b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f1757a.getClass();
                sb2.append(C3215l.m2164c(AbstractC6664k.m6322b(i, i8, config), config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m2161d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM2166b;
    }

    /* renamed from: g */
    public final synchronized void m2163g(long j7) {
        while (this.f1761e > j7) {
            try {
                C3215l c3215l = this.f1757a;
                Bitmap bitmap = (Bitmap) c3215l.f1776b.m104B();
                if (bitmap != null) {
                    c3215l.m2165a(Integer.valueOf(AbstractC6664k.m6323c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m2161d();
                    }
                    this.f1761e = 0L;
                    return;
                }
                this.f1759c.getClass();
                long j8 = this.f1761e;
                this.f1757a.getClass();
                this.f1761e = j8 - AbstractC6664k.m6323c(bitmap);
                this.f1765i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f1757a.getClass();
                    sb.append(C3215l.m2164c(AbstractC6664k.m6323c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m2161d();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p024c0.InterfaceC3205b
    /* renamed from: i */
    public final Bitmap mo2145i(int i, int i8, Bitmap.Config config) {
        Bitmap bitmapM2162f = m2162f(i, i8, config);
        if (bitmapM2162f != null) {
            bitmapM2162f.eraseColor(0);
            return bitmapM2162f;
        }
        if (config == null) {
            config = f1756j;
        }
        return Bitmap.createBitmap(i, i8, config);
    }
}
