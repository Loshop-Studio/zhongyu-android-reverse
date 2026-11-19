package p098n;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: n.j */
/* loaded from: classes2.dex */
public class C4401j implements InterfaceC4395d {

    /* renamed from: k */
    public static final Bitmap.Config f4913k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC4402k f4914a;

    /* renamed from: b */
    public final Set f4915b;

    /* renamed from: c */
    public final long f4916c;

    /* renamed from: d */
    public final a f4917d;

    /* renamed from: e */
    public long f4918e;

    /* renamed from: f */
    public long f4919f;

    /* renamed from: g */
    public int f4920g;

    /* renamed from: h */
    public int f4921h;

    /* renamed from: i */
    public int f4922i;

    /* renamed from: j */
    public int f4923j;

    /* renamed from: n.j$a */
    public interface a {
        /* renamed from: a */
        void mo5436a(Bitmap bitmap);

        /* renamed from: b */
        void mo5437b(Bitmap bitmap);
    }

    /* renamed from: n.j$b */
    public static final class b implements a {
        @Override // p098n.C4401j.a
        /* renamed from: a */
        public void mo5436a(Bitmap bitmap) {
        }

        @Override // p098n.C4401j.a
        /* renamed from: b */
        public void mo5437b(Bitmap bitmap) {
        }
    }

    public C4401j(long j4, InterfaceC4402k interfaceC4402k, Set set) {
        this.f4916c = j4;
        this.f4918e = j4;
        this.f4914a = interfaceC4402k;
        this.f4915b = set;
        this.f4917d = new b();
    }

    /* renamed from: f */
    public static void m5424f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m5425g(int i4, int i5, Bitmap.Config config) {
        if (config == null) {
            config = f4913k;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    /* renamed from: k */
    public static Set m5426k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i4 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC4402k m5427l() {
        return new C4404m();
    }

    /* renamed from: o */
    public static void m5428o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m5429p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m5428o(bitmap);
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: a */
    public void mo5390a(int i4) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i4);
        }
        if (i4 >= 40 || i4 >= 20) {
            mo5391b();
        } else if (i4 >= 20 || i4 == 15) {
            m5435q(m5434n() / 2);
        }
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: b */
    public void mo5391b() {
        Log.isLoggable("LruBitmapPool", 3);
        m5435q(0L);
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: c */
    public synchronized void mo5392c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f4914a.mo5442e(bitmap) <= this.f4918e && this.f4915b.contains(bitmap.getConfig())) {
                int iMo5442e = this.f4914a.mo5442e(bitmap);
                this.f4914a.mo5440c(bitmap);
                this.f4917d.mo5437b(bitmap);
                this.f4922i++;
                this.f4919f += iMo5442e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.f4914a.mo5443f(bitmap));
                }
                m5430h();
                m5432j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f4914a.mo5443f(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f4915b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: d */
    public Bitmap mo5393d(int i4, int i5, Bitmap.Config config) {
        Bitmap bitmapM5433m = m5433m(i4, i5, config);
        if (bitmapM5433m == null) {
            return m5425g(i4, i5, config);
        }
        bitmapM5433m.eraseColor(0);
        return bitmapM5433m;
    }

    @Override // p098n.InterfaceC4395d
    /* renamed from: e */
    public Bitmap mo5394e(int i4, int i5, Bitmap.Config config) {
        Bitmap bitmapM5433m = m5433m(i4, i5, config);
        return bitmapM5433m == null ? m5425g(i4, i5, config) : bitmapM5433m;
    }

    /* renamed from: h */
    public final void m5430h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m5431i();
        }
    }

    /* renamed from: i */
    public final void m5431i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f4920g);
        sb.append(", misses=");
        sb.append(this.f4921h);
        sb.append(", puts=");
        sb.append(this.f4922i);
        sb.append(", evictions=");
        sb.append(this.f4923j);
        sb.append(", currentSize=");
        sb.append(this.f4919f);
        sb.append(", maxSize=");
        sb.append(this.f4918e);
        sb.append("\nStrategy=");
        sb.append(this.f4914a);
    }

    /* renamed from: j */
    public final void m5432j() {
        m5435q(this.f4918e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m5433m(int i4, int i5, Bitmap.Config config) {
        Bitmap bitmapMo5441d;
        m5424f(config);
        bitmapMo5441d = this.f4914a.mo5441d(i4, i5, config != null ? config : f4913k);
        if (bitmapMo5441d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f4914a.mo5439b(i4, i5, config));
            }
            this.f4921h++;
        } else {
            this.f4920g++;
            this.f4919f -= this.f4914a.mo5442e(bitmapMo5441d);
            this.f4917d.mo5436a(bitmapMo5441d);
            m5429p(bitmapMo5441d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f4914a.mo5439b(i4, i5, config));
        }
        m5430h();
        return bitmapMo5441d;
    }

    /* renamed from: n */
    public long m5434n() {
        return this.f4918e;
    }

    /* renamed from: q */
    public final synchronized void m5435q(long j4) {
        while (this.f4919f > j4) {
            Bitmap bitmapMo5438a = this.f4914a.mo5438a();
            if (bitmapMo5438a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m5431i();
                }
                this.f4919f = 0L;
                return;
            }
            this.f4917d.mo5436a(bitmapMo5438a);
            this.f4919f -= this.f4914a.mo5442e(bitmapMo5438a);
            this.f4923j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f4914a.mo5443f(bitmapMo5438a));
            }
            m5430h();
            bitmapMo5438a.recycle();
        }
    }

    public C4401j(long j4) {
        this(j4, m5427l(), m5426k());
    }
}
