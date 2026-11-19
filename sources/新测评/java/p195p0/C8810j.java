package p195p0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: p0.j */
/* loaded from: classes3.dex */
public class C8810j implements InterfaceC8804d {

    /* renamed from: k */
    public static final Bitmap.Config f14962k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final InterfaceC8811k f14963a;

    /* renamed from: b */
    public final Set f14964b;

    /* renamed from: c */
    public final long f14965c;

    /* renamed from: d */
    public final a f14966d;

    /* renamed from: e */
    public long f14967e;

    /* renamed from: f */
    public long f14968f;

    /* renamed from: g */
    public int f14969g;

    /* renamed from: h */
    public int f14970h;

    /* renamed from: i */
    public int f14971i;

    /* renamed from: j */
    public int f14972j;

    /* renamed from: p0.j$a */
    public interface a {
        /* renamed from: a */
        void mo14756a(Bitmap bitmap);

        /* renamed from: b */
        void mo14757b(Bitmap bitmap);
    }

    public C8810j(long j10, InterfaceC8811k interfaceC8811k, Set set) {
        this.f14965c = j10;
        this.f14967e = j10;
        this.f14963a = interfaceC8811k;
        this.f14964b = set;
        this.f14966d = new b();
    }

    /* renamed from: f */
    public static void m14744f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m14745g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f14962k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* renamed from: k */
    public static Set m14746k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static InterfaceC8811k m14747l() {
        return new C8813m();
    }

    /* renamed from: o */
    public static void m14748o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m14749p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m14748o(bitmap);
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: a */
    public void mo14710a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            mo14711b();
        } else if (i10 >= 20 || i10 == 15) {
            m14755q(m14754n() / 2);
        }
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: b */
    public void mo14711b() {
        Log.isLoggable("LruBitmapPool", 3);
        m14755q(0L);
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: c */
    public synchronized void mo14712c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f14963a.mo14762e(bitmap) <= this.f14967e && this.f14964b.contains(bitmap.getConfig())) {
                int iMo14762e = this.f14963a.mo14762e(bitmap);
                this.f14963a.mo14760c(bitmap);
                this.f14966d.mo14757b(bitmap);
                this.f14971i++;
                this.f14968f += iMo14762e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f14963a.mo14758a(bitmap);
                }
                m14750h();
                m14752j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f14963a.mo14758a(bitmap);
                bitmap.isMutable();
                this.f14964b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: d */
    public Bitmap mo14713d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM14753m = m14753m(i10, i11, config);
        if (bitmapM14753m == null) {
            return m14745g(i10, i11, config);
        }
        bitmapM14753m.eraseColor(0);
        return bitmapM14753m;
    }

    @Override // p195p0.InterfaceC8804d
    /* renamed from: e */
    public Bitmap mo14714e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM14753m = m14753m(i10, i11, config);
        return bitmapM14753m == null ? m14745g(i10, i11, config) : bitmapM14753m;
    }

    /* renamed from: h */
    public final void m14750h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m14751i();
        }
    }

    /* renamed from: i */
    public final void m14751i() {
        Objects.toString(this.f14963a);
    }

    /* renamed from: j */
    public final void m14752j() {
        m14755q(this.f14967e);
    }

    /* renamed from: m */
    public final synchronized Bitmap m14753m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapMo14761d;
        try {
            m14744f(config);
            bitmapMo14761d = this.f14963a.mo14761d(i10, i11, config != null ? config : f14962k);
            if (bitmapMo14761d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f14963a.mo14759b(i10, i11, config);
                }
                this.f14970h++;
            } else {
                this.f14969g++;
                this.f14968f -= this.f14963a.mo14762e(bitmapMo14761d);
                this.f14966d.mo14756a(bitmapMo14761d);
                m14749p(bitmapMo14761d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f14963a.mo14759b(i10, i11, config);
            }
            m14750h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo14761d;
    }

    /* renamed from: n */
    public long m14754n() {
        return this.f14967e;
    }

    /* renamed from: q */
    public final synchronized void m14755q(long j10) {
        while (this.f14968f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f14963a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m14751i();
                    }
                    this.f14968f = 0L;
                    return;
                }
                this.f14966d.mo14756a(bitmapRemoveLast);
                this.f14968f -= this.f14963a.mo14762e(bitmapRemoveLast);
                this.f14972j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f14963a.mo14758a(bitmapRemoveLast);
                }
                m14750h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8810j(long j10) {
        this(j10, m14747l(), m14746k());
    }

    /* renamed from: p0.j$b */
    public static final class b implements a {
        @Override // p195p0.C8810j.a
        /* renamed from: a */
        public void mo14756a(Bitmap bitmap) {
        }

        @Override // p195p0.C8810j.a
        /* renamed from: b */
        public void mo14757b(Bitmap bitmap) {
        }
    }
}
