package p073e1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p106h1.C7616a;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p162m0.C8538c;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p162m0.InterfaceC8542g;
import p184o0.AbstractC8683c;
import p261v0.C9637j;
import p261v0.C9638k;
import p261v0.C9639l;
import p261v0.C9644q;
import p261v0.C9646s;
import p301z0.C9968e;

/* renamed from: e1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7324a implements Cloneable {

    /* renamed from: a */
    public int f11868a;

    /* renamed from: e */
    public Drawable f11872e;

    /* renamed from: f */
    public int f11873f;

    /* renamed from: g */
    public Drawable f11874g;

    /* renamed from: h */
    public int f11875h;

    /* renamed from: m */
    public boolean f11880m;

    /* renamed from: o */
    public Drawable f11882o;

    /* renamed from: p */
    public int f11883p;

    /* renamed from: t */
    public boolean f11887t;

    /* renamed from: u */
    public Resources.Theme f11888u;

    /* renamed from: v */
    public boolean f11889v;

    /* renamed from: w */
    public boolean f11890w;

    /* renamed from: x */
    public boolean f11891x;

    /* renamed from: z */
    public boolean f11893z;

    /* renamed from: b */
    public float f11869b = 1.0f;

    /* renamed from: c */
    public AbstractC8683c f11870c = AbstractC8683c.f14426e;

    /* renamed from: d */
    public Priority f11871d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f11876i = true;

    /* renamed from: j */
    public int f11877j = -1;

    /* renamed from: k */
    public int f11878k = -1;

    /* renamed from: l */
    public InterfaceC8537b f11879l = C7616a.m12540c();

    /* renamed from: n */
    public boolean f11881n = true;

    /* renamed from: q */
    public C8539d f11884q = new C8539d();

    /* renamed from: r */
    public Map f11885r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f11886s = Object.class;

    /* renamed from: y */
    public boolean f11892y = true;

    /* renamed from: L */
    public static boolean m11645L(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: A */
    public final float m11646A() {
        return this.f11869b;
    }

    /* renamed from: B */
    public final Resources.Theme m11647B() {
        return this.f11888u;
    }

    /* renamed from: C */
    public final Map m11648C() {
        return this.f11885r;
    }

    /* renamed from: D */
    public final boolean m11649D() {
        return this.f11893z;
    }

    /* renamed from: E */
    public final boolean m11650E() {
        return this.f11890w;
    }

    /* renamed from: F */
    public final boolean m11651F() {
        return this.f11889v;
    }

    /* renamed from: G */
    public final boolean m11652G(AbstractC7324a abstractC7324a) {
        return Float.compare(abstractC7324a.f11869b, this.f11869b) == 0 && this.f11873f == abstractC7324a.f11873f && AbstractC7652k.m12688d(this.f11872e, abstractC7324a.f11872e) && this.f11875h == abstractC7324a.f11875h && AbstractC7652k.m12688d(this.f11874g, abstractC7324a.f11874g) && this.f11883p == abstractC7324a.f11883p && AbstractC7652k.m12688d(this.f11882o, abstractC7324a.f11882o) && this.f11876i == abstractC7324a.f11876i && this.f11877j == abstractC7324a.f11877j && this.f11878k == abstractC7324a.f11878k && this.f11880m == abstractC7324a.f11880m && this.f11881n == abstractC7324a.f11881n && this.f11890w == abstractC7324a.f11890w && this.f11891x == abstractC7324a.f11891x && this.f11870c.equals(abstractC7324a.f11870c) && this.f11871d == abstractC7324a.f11871d && this.f11884q.equals(abstractC7324a.f11884q) && this.f11885r.equals(abstractC7324a.f11885r) && this.f11886s.equals(abstractC7324a.f11886s) && AbstractC7652k.m12688d(this.f11879l, abstractC7324a.f11879l) && AbstractC7652k.m12688d(this.f11888u, abstractC7324a.f11888u);
    }

    /* renamed from: H */
    public final boolean m11653H() {
        return this.f11876i;
    }

    /* renamed from: I */
    public final boolean m11654I() {
        return m11656K(8);
    }

    /* renamed from: J */
    public boolean m11655J() {
        return this.f11892y;
    }

    /* renamed from: K */
    public final boolean m11656K(int i10) {
        return m11645L(this.f11868a, i10);
    }

    /* renamed from: M */
    public final boolean m11657M() {
        return this.f11881n;
    }

    /* renamed from: N */
    public final boolean m11658N() {
        return this.f11880m;
    }

    /* renamed from: O */
    public final boolean m11659O() {
        return m11656K(2048);
    }

    /* renamed from: P */
    public final boolean m11660P() {
        return AbstractC7652k.m12704t(this.f11878k, this.f11877j);
    }

    /* renamed from: Q */
    public AbstractC7324a m11661Q() {
        this.f11887t = true;
        return m11671a0();
    }

    /* renamed from: R */
    public AbstractC7324a m11662R() {
        return m11666V(DownsampleStrategy.f3728e, new C9637j());
    }

    /* renamed from: S */
    public AbstractC7324a m11663S() {
        return m11665U(DownsampleStrategy.f3727d, new C9638k());
    }

    /* renamed from: T */
    public AbstractC7324a m11664T() {
        return m11665U(DownsampleStrategy.f3726c, new C9646s());
    }

    /* renamed from: U */
    public final AbstractC7324a m11665U(DownsampleStrategy downsampleStrategy, InterfaceC8542g interfaceC8542g) {
        return m11670Z(downsampleStrategy, interfaceC8542g, false);
    }

    /* renamed from: V */
    public final AbstractC7324a m11666V(DownsampleStrategy downsampleStrategy, InterfaceC8542g interfaceC8542g) {
        if (this.f11889v) {
            return clone().m11666V(downsampleStrategy, interfaceC8542g);
        }
        m11684i(downsampleStrategy);
        return m11686j0(interfaceC8542g, false);
    }

    /* renamed from: W */
    public AbstractC7324a m11667W(int i10, int i11) {
        if (this.f11889v) {
            return clone().m11667W(i10, i11);
        }
        this.f11878k = i10;
        this.f11877j = i11;
        this.f11868a |= 512;
        return m11672b0();
    }

    /* renamed from: X */
    public AbstractC7324a m11668X(int i10) {
        if (this.f11889v) {
            return clone().m11668X(i10);
        }
        this.f11875h = i10;
        int i11 = this.f11868a | 128;
        this.f11874g = null;
        this.f11868a = i11 & (-65);
        return m11672b0();
    }

    /* renamed from: Y */
    public AbstractC7324a m11669Y(Priority priority) {
        if (this.f11889v) {
            return clone().m11669Y(priority);
        }
        this.f11871d = (Priority) AbstractC7651j.m12683d(priority);
        this.f11868a |= 8;
        return m11672b0();
    }

    /* renamed from: Z */
    public final AbstractC7324a m11670Z(DownsampleStrategy downsampleStrategy, InterfaceC8542g interfaceC8542g, boolean z9) {
        AbstractC7324a abstractC7324aM11681g0 = z9 ? m11681g0(downsampleStrategy, interfaceC8542g) : m11666V(downsampleStrategy, interfaceC8542g);
        abstractC7324aM11681g0.f11892y = true;
        return abstractC7324aM11681g0;
    }

    /* renamed from: b */
    public AbstractC7324a mo3335b(AbstractC7324a abstractC7324a) {
        if (this.f11889v) {
            return clone().mo3335b(abstractC7324a);
        }
        if (m11645L(abstractC7324a.f11868a, 2)) {
            this.f11869b = abstractC7324a.f11869b;
        }
        if (m11645L(abstractC7324a.f11868a, 262144)) {
            this.f11890w = abstractC7324a.f11890w;
        }
        if (m11645L(abstractC7324a.f11868a, 1048576)) {
            this.f11893z = abstractC7324a.f11893z;
        }
        if (m11645L(abstractC7324a.f11868a, 4)) {
            this.f11870c = abstractC7324a.f11870c;
        }
        if (m11645L(abstractC7324a.f11868a, 8)) {
            this.f11871d = abstractC7324a.f11871d;
        }
        if (m11645L(abstractC7324a.f11868a, 16)) {
            this.f11872e = abstractC7324a.f11872e;
            this.f11873f = 0;
            this.f11868a &= -33;
        }
        if (m11645L(abstractC7324a.f11868a, 32)) {
            this.f11873f = abstractC7324a.f11873f;
            this.f11872e = null;
            this.f11868a &= -17;
        }
        if (m11645L(abstractC7324a.f11868a, 64)) {
            this.f11874g = abstractC7324a.f11874g;
            this.f11875h = 0;
            this.f11868a &= -129;
        }
        if (m11645L(abstractC7324a.f11868a, 128)) {
            this.f11875h = abstractC7324a.f11875h;
            this.f11874g = null;
            this.f11868a &= -65;
        }
        if (m11645L(abstractC7324a.f11868a, 256)) {
            this.f11876i = abstractC7324a.f11876i;
        }
        if (m11645L(abstractC7324a.f11868a, 512)) {
            this.f11878k = abstractC7324a.f11878k;
            this.f11877j = abstractC7324a.f11877j;
        }
        if (m11645L(abstractC7324a.f11868a, 1024)) {
            this.f11879l = abstractC7324a.f11879l;
        }
        if (m11645L(abstractC7324a.f11868a, 4096)) {
            this.f11886s = abstractC7324a.f11886s;
        }
        if (m11645L(abstractC7324a.f11868a, 8192)) {
            this.f11882o = abstractC7324a.f11882o;
            this.f11883p = 0;
            this.f11868a &= -16385;
        }
        if (m11645L(abstractC7324a.f11868a, 16384)) {
            this.f11883p = abstractC7324a.f11883p;
            this.f11882o = null;
            this.f11868a &= -8193;
        }
        if (m11645L(abstractC7324a.f11868a, 32768)) {
            this.f11888u = abstractC7324a.f11888u;
        }
        if (m11645L(abstractC7324a.f11868a, 65536)) {
            this.f11881n = abstractC7324a.f11881n;
        }
        if (m11645L(abstractC7324a.f11868a, 131072)) {
            this.f11880m = abstractC7324a.f11880m;
        }
        if (m11645L(abstractC7324a.f11868a, 2048)) {
            this.f11885r.putAll(abstractC7324a.f11885r);
            this.f11892y = abstractC7324a.f11892y;
        }
        if (m11645L(abstractC7324a.f11868a, 524288)) {
            this.f11891x = abstractC7324a.f11891x;
        }
        if (!this.f11881n) {
            this.f11885r.clear();
            int i10 = this.f11868a;
            this.f11880m = false;
            this.f11868a = i10 & (-133121);
            this.f11892y = true;
        }
        this.f11868a |= abstractC7324a.f11868a;
        this.f11884q.m14058d(abstractC7324a.f11884q);
        return m11672b0();
    }

    /* renamed from: b0 */
    public final AbstractC7324a m11672b0() {
        if (this.f11887t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m11671a0();
    }

    /* renamed from: c */
    public AbstractC7324a m11673c() {
        if (this.f11887t && !this.f11889v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f11889v = true;
        return m11661Q();
    }

    /* renamed from: c0 */
    public AbstractC7324a m11674c0(C8538c c8538c, Object obj) {
        if (this.f11889v) {
            return clone().m11674c0(c8538c, obj);
        }
        AbstractC7651j.m12683d(c8538c);
        AbstractC7651j.m12683d(obj);
        this.f11884q.m14059e(c8538c, obj);
        return m11672b0();
    }

    /* renamed from: d */
    public AbstractC7324a m11675d() {
        return m11681g0(DownsampleStrategy.f3728e, new C9637j());
    }

    /* renamed from: d0 */
    public AbstractC7324a m11676d0(InterfaceC8537b interfaceC8537b) {
        if (this.f11889v) {
            return clone().m11676d0(interfaceC8537b);
        }
        this.f11879l = (InterfaceC8537b) AbstractC7651j.m12683d(interfaceC8537b);
        this.f11868a |= 1024;
        return m11672b0();
    }

    /* renamed from: e */
    public AbstractC7324a m11677e() {
        return m11681g0(DownsampleStrategy.f3727d, new C9639l());
    }

    /* renamed from: e0 */
    public AbstractC7324a m11678e0(float f10) {
        if (this.f11889v) {
            return clone().m11678e0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f11869b = f10;
        this.f11868a |= 2;
        return m11672b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC7324a) {
            return m11652G((AbstractC7324a) obj);
        }
        return false;
    }

    @Override // 
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC7324a clone() {
        try {
            AbstractC7324a abstractC7324a = (AbstractC7324a) super.clone();
            C8539d c8539d = new C8539d();
            abstractC7324a.f11884q = c8539d;
            c8539d.m14058d(this.f11884q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC7324a.f11885r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f11885r);
            abstractC7324a.f11887t = false;
            abstractC7324a.f11889v = false;
            return abstractC7324a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: f0 */
    public AbstractC7324a m11679f0(boolean z9) {
        if (this.f11889v) {
            return clone().m11679f0(true);
        }
        this.f11876i = !z9;
        this.f11868a |= 256;
        return m11672b0();
    }

    /* renamed from: g */
    public AbstractC7324a m11680g(Class cls) {
        if (this.f11889v) {
            return clone().m11680g(cls);
        }
        this.f11886s = (Class) AbstractC7651j.m12683d(cls);
        this.f11868a |= 4096;
        return m11672b0();
    }

    /* renamed from: g0 */
    public final AbstractC7324a m11681g0(DownsampleStrategy downsampleStrategy, InterfaceC8542g interfaceC8542g) {
        if (this.f11889v) {
            return clone().m11681g0(downsampleStrategy, interfaceC8542g);
        }
        m11684i(downsampleStrategy);
        return m11685i0(interfaceC8542g);
    }

    /* renamed from: h */
    public AbstractC7324a m11682h(AbstractC8683c abstractC8683c) {
        if (this.f11889v) {
            return clone().m11682h(abstractC8683c);
        }
        this.f11870c = (AbstractC8683c) AbstractC7651j.m12683d(abstractC8683c);
        this.f11868a |= 4;
        return m11672b0();
    }

    /* renamed from: h0 */
    public AbstractC7324a m11683h0(Class cls, InterfaceC8542g interfaceC8542g, boolean z9) {
        if (this.f11889v) {
            return clone().m11683h0(cls, interfaceC8542g, z9);
        }
        AbstractC7651j.m12683d(cls);
        AbstractC7651j.m12683d(interfaceC8542g);
        this.f11885r.put(cls, interfaceC8542g);
        int i10 = this.f11868a;
        this.f11881n = true;
        this.f11868a = 67584 | i10;
        this.f11892y = false;
        if (z9) {
            this.f11868a = i10 | 198656;
            this.f11880m = true;
        }
        return m11672b0();
    }

    public int hashCode() {
        return AbstractC7652k.m12699o(this.f11888u, AbstractC7652k.m12699o(this.f11879l, AbstractC7652k.m12699o(this.f11886s, AbstractC7652k.m12699o(this.f11885r, AbstractC7652k.m12699o(this.f11884q, AbstractC7652k.m12699o(this.f11871d, AbstractC7652k.m12699o(this.f11870c, AbstractC7652k.m12700p(this.f11891x, AbstractC7652k.m12700p(this.f11890w, AbstractC7652k.m12700p(this.f11881n, AbstractC7652k.m12700p(this.f11880m, AbstractC7652k.m12698n(this.f11878k, AbstractC7652k.m12698n(this.f11877j, AbstractC7652k.m12700p(this.f11876i, AbstractC7652k.m12699o(this.f11882o, AbstractC7652k.m12698n(this.f11883p, AbstractC7652k.m12699o(this.f11874g, AbstractC7652k.m12698n(this.f11875h, AbstractC7652k.m12699o(this.f11872e, AbstractC7652k.m12698n(this.f11873f, AbstractC7652k.m12696l(this.f11869b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC7324a m11684i(DownsampleStrategy downsampleStrategy) {
        return m11674c0(DownsampleStrategy.f3731h, AbstractC7651j.m12683d(downsampleStrategy));
    }

    /* renamed from: i0 */
    public AbstractC7324a m11685i0(InterfaceC8542g interfaceC8542g) {
        return m11686j0(interfaceC8542g, true);
    }

    /* renamed from: j0 */
    public AbstractC7324a m11686j0(InterfaceC8542g interfaceC8542g, boolean z9) {
        if (this.f11889v) {
            return clone().m11686j0(interfaceC8542g, z9);
        }
        C9644q c9644q = new C9644q(interfaceC8542g, z9);
        m11683h0(Bitmap.class, interfaceC8542g, z9);
        m11683h0(Drawable.class, c9644q, z9);
        m11683h0(BitmapDrawable.class, c9644q.m16014c(), z9);
        m11683h0(GifDrawable.class, new C9968e(interfaceC8542g), z9);
        return m11672b0();
    }

    /* renamed from: k */
    public AbstractC7324a m11687k(int i10) {
        if (this.f11889v) {
            return clone().m11687k(i10);
        }
        this.f11873f = i10;
        int i11 = this.f11868a | 32;
        this.f11872e = null;
        this.f11868a = i11 & (-17);
        return m11672b0();
    }

    /* renamed from: k0 */
    public AbstractC7324a m11688k0(boolean z9) {
        if (this.f11889v) {
            return clone().m11688k0(z9);
        }
        this.f11893z = z9;
        this.f11868a |= 1048576;
        return m11672b0();
    }

    /* renamed from: l */
    public final AbstractC8683c m11689l() {
        return this.f11870c;
    }

    /* renamed from: m */
    public final int m11690m() {
        return this.f11873f;
    }

    /* renamed from: n */
    public final Drawable m11691n() {
        return this.f11872e;
    }

    /* renamed from: p */
    public final Drawable m11692p() {
        return this.f11882o;
    }

    /* renamed from: q */
    public final int m11693q() {
        return this.f11883p;
    }

    /* renamed from: r */
    public final boolean m11694r() {
        return this.f11891x;
    }

    /* renamed from: s */
    public final C8539d m11695s() {
        return this.f11884q;
    }

    /* renamed from: t */
    public final int m11696t() {
        return this.f11877j;
    }

    /* renamed from: u */
    public final int m11697u() {
        return this.f11878k;
    }

    /* renamed from: v */
    public final Drawable m11698v() {
        return this.f11874g;
    }

    /* renamed from: w */
    public final int m11699w() {
        return this.f11875h;
    }

    /* renamed from: x */
    public final Priority m11700x() {
        return this.f11871d;
    }

    /* renamed from: y */
    public final Class m11701y() {
        return this.f11886s;
    }

    /* renamed from: z */
    public final InterfaceC8537b m11702z() {
        return this.f11879l;
    }

    /* renamed from: a0 */
    public final AbstractC7324a m11671a0() {
        return this;
    }
}
