package p002a1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p080d1.C7736a;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p122h0.C8083c;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p122h0.InterfaceC8087g;
import p152k0.AbstractC8252c;
import p228r0.C9399i;
import p228r0.C9400j;
import p228r0.C9401k;
import p228r0.C9406p;
import p228r0.C9408r;
import p268v0.C9744e;

/* renamed from: a1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0009a implements Cloneable {

    /* renamed from: a */
    public int f17a;

    /* renamed from: e */
    public Drawable f21e;

    /* renamed from: f */
    public int f22f;

    /* renamed from: g */
    public Drawable f23g;

    /* renamed from: h */
    public int f24h;

    /* renamed from: m */
    public boolean f29m;

    /* renamed from: o */
    public Drawable f31o;

    /* renamed from: p */
    public int f32p;

    /* renamed from: t */
    public boolean f36t;

    /* renamed from: u */
    public Resources.Theme f37u;

    /* renamed from: v */
    public boolean f38v;

    /* renamed from: w */
    public boolean f39w;

    /* renamed from: x */
    public boolean f40x;

    /* renamed from: z */
    public boolean f42z;

    /* renamed from: b */
    public float f18b = 1.0f;

    /* renamed from: c */
    public AbstractC8252c f19c = AbstractC8252c.f14327e;

    /* renamed from: d */
    public Priority f20d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f25i = true;

    /* renamed from: j */
    public int f26j = -1;

    /* renamed from: k */
    public int f27k = -1;

    /* renamed from: l */
    public InterfaceC8082b f28l = C7736a.m12081c();

    /* renamed from: n */
    public boolean f30n = true;

    /* renamed from: q */
    public C8084d f33q = new C8084d();

    /* renamed from: r */
    public Map f34r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f35s = Object.class;

    /* renamed from: y */
    public boolean f41y = true;

    /* renamed from: J */
    public static boolean m13J(int i9, int i10) {
        return (i9 & i10) != 0;
    }

    /* renamed from: A */
    public final float m14A() {
        return this.f18b;
    }

    /* renamed from: B */
    public final Resources.Theme m15B() {
        return this.f37u;
    }

    /* renamed from: C */
    public final Map m16C() {
        return this.f34r;
    }

    /* renamed from: D */
    public final boolean m17D() {
        return this.f42z;
    }

    /* renamed from: E */
    public final boolean m18E() {
        return this.f39w;
    }

    /* renamed from: F */
    public final boolean m19F() {
        return this.f25i;
    }

    /* renamed from: G */
    public final boolean m20G() {
        return m22I(8);
    }

    /* renamed from: H */
    public boolean m21H() {
        return this.f41y;
    }

    /* renamed from: I */
    public final boolean m22I(int i9) {
        return m13J(this.f17a, i9);
    }

    /* renamed from: K */
    public final boolean m23K() {
        return this.f30n;
    }

    /* renamed from: L */
    public final boolean m24L() {
        return this.f29m;
    }

    /* renamed from: M */
    public final boolean m25M() {
        return m22I(2048);
    }

    /* renamed from: N */
    public final boolean m26N() {
        return AbstractC7838j.m12275r(this.f27k, this.f26j);
    }

    /* renamed from: O */
    public AbstractC0009a m27O() {
        this.f36t = true;
        return m37Y();
    }

    /* renamed from: P */
    public AbstractC0009a m28P() {
        return m32T(DownsampleStrategy.f3524e, new C9399i());
    }

    /* renamed from: Q */
    public AbstractC0009a m29Q() {
        return m31S(DownsampleStrategy.f3523d, new C9400j());
    }

    /* renamed from: R */
    public AbstractC0009a m30R() {
        return m31S(DownsampleStrategy.f3522c, new C9408r());
    }

    /* renamed from: S */
    public final AbstractC0009a m31S(DownsampleStrategy downsampleStrategy, InterfaceC8087g interfaceC8087g) {
        return m36X(downsampleStrategy, interfaceC8087g, false);
    }

    /* renamed from: T */
    public final AbstractC0009a m32T(DownsampleStrategy downsampleStrategy, InterfaceC8087g interfaceC8087g) {
        if (this.f38v) {
            return mo49g().m32T(downsampleStrategy, interfaceC8087g);
        }
        m55j(downsampleStrategy);
        return m50g0(interfaceC8087g, false);
    }

    /* renamed from: U */
    public AbstractC0009a m33U(int i9, int i10) {
        if (this.f38v) {
            return mo49g().m33U(i9, i10);
        }
        this.f27k = i9;
        this.f26j = i10;
        this.f17a |= 512;
        return m38Z();
    }

    /* renamed from: V */
    public AbstractC0009a m34V(int i9) {
        if (this.f38v) {
            return mo49g().m34V(i9);
        }
        this.f24h = i9;
        int i10 = this.f17a | 128;
        this.f23g = null;
        this.f17a = i10 & (-65);
        return m38Z();
    }

    /* renamed from: W */
    public AbstractC0009a m35W(Priority priority) {
        if (this.f38v) {
            return mo49g().m35W(priority);
        }
        this.f20d = (Priority) AbstractC7837i.m12256d(priority);
        this.f17a |= 8;
        return m38Z();
    }

    /* renamed from: X */
    public final AbstractC0009a m36X(DownsampleStrategy downsampleStrategy, InterfaceC8087g interfaceC8087g, boolean z9) {
        AbstractC0009a abstractC0009aM46e0 = z9 ? m46e0(downsampleStrategy, interfaceC8087g) : m32T(downsampleStrategy, interfaceC8087g);
        abstractC0009aM46e0.f41y = true;
        return abstractC0009aM46e0;
    }

    /* renamed from: Z */
    public final AbstractC0009a m38Z() {
        if (this.f36t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m37Y();
    }

    /* renamed from: a0 */
    public AbstractC0009a m39a0(C8083c c8083c, Object obj) {
        if (this.f38v) {
            return mo49g().m39a0(c8083c, obj);
        }
        AbstractC7837i.m12256d(c8083c);
        AbstractC7837i.m12256d(obj);
        this.f33q.m12910e(c8083c, obj);
        return m38Z();
    }

    /* renamed from: b */
    public AbstractC0009a mo40b(AbstractC0009a abstractC0009a) {
        if (this.f38v) {
            return mo49g().mo40b(abstractC0009a);
        }
        if (m13J(abstractC0009a.f17a, 2)) {
            this.f18b = abstractC0009a.f18b;
        }
        if (m13J(abstractC0009a.f17a, 262144)) {
            this.f39w = abstractC0009a.f39w;
        }
        if (m13J(abstractC0009a.f17a, 1048576)) {
            this.f42z = abstractC0009a.f42z;
        }
        if (m13J(abstractC0009a.f17a, 4)) {
            this.f19c = abstractC0009a.f19c;
        }
        if (m13J(abstractC0009a.f17a, 8)) {
            this.f20d = abstractC0009a.f20d;
        }
        if (m13J(abstractC0009a.f17a, 16)) {
            this.f21e = abstractC0009a.f21e;
            this.f22f = 0;
            this.f17a &= -33;
        }
        if (m13J(abstractC0009a.f17a, 32)) {
            this.f22f = abstractC0009a.f22f;
            this.f21e = null;
            this.f17a &= -17;
        }
        if (m13J(abstractC0009a.f17a, 64)) {
            this.f23g = abstractC0009a.f23g;
            this.f24h = 0;
            this.f17a &= -129;
        }
        if (m13J(abstractC0009a.f17a, 128)) {
            this.f24h = abstractC0009a.f24h;
            this.f23g = null;
            this.f17a &= -65;
        }
        if (m13J(abstractC0009a.f17a, 256)) {
            this.f25i = abstractC0009a.f25i;
        }
        if (m13J(abstractC0009a.f17a, 512)) {
            this.f27k = abstractC0009a.f27k;
            this.f26j = abstractC0009a.f26j;
        }
        if (m13J(abstractC0009a.f17a, 1024)) {
            this.f28l = abstractC0009a.f28l;
        }
        if (m13J(abstractC0009a.f17a, 4096)) {
            this.f35s = abstractC0009a.f35s;
        }
        if (m13J(abstractC0009a.f17a, 8192)) {
            this.f31o = abstractC0009a.f31o;
            this.f32p = 0;
            this.f17a &= -16385;
        }
        if (m13J(abstractC0009a.f17a, 16384)) {
            this.f32p = abstractC0009a.f32p;
            this.f31o = null;
            this.f17a &= -8193;
        }
        if (m13J(abstractC0009a.f17a, 32768)) {
            this.f37u = abstractC0009a.f37u;
        }
        if (m13J(abstractC0009a.f17a, 65536)) {
            this.f30n = abstractC0009a.f30n;
        }
        if (m13J(abstractC0009a.f17a, 131072)) {
            this.f29m = abstractC0009a.f29m;
        }
        if (m13J(abstractC0009a.f17a, 2048)) {
            this.f34r.putAll(abstractC0009a.f34r);
            this.f41y = abstractC0009a.f41y;
        }
        if (m13J(abstractC0009a.f17a, 524288)) {
            this.f40x = abstractC0009a.f40x;
        }
        if (!this.f30n) {
            this.f34r.clear();
            int i9 = this.f17a;
            this.f29m = false;
            this.f17a = i9 & (-133121);
            this.f41y = true;
        }
        this.f17a |= abstractC0009a.f17a;
        this.f33q.m12909d(abstractC0009a.f33q);
        return m38Z();
    }

    /* renamed from: b0 */
    public AbstractC0009a m41b0(InterfaceC8082b interfaceC8082b) {
        if (this.f38v) {
            return mo49g().m41b0(interfaceC8082b);
        }
        this.f28l = (InterfaceC8082b) AbstractC7837i.m12256d(interfaceC8082b);
        this.f17a |= 1024;
        return m38Z();
    }

    /* renamed from: c0 */
    public AbstractC0009a m42c0(float f10) {
        if (this.f38v) {
            return mo49g().m42c0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f18b = f10;
        this.f17a |= 2;
        return m38Z();
    }

    /* renamed from: d */
    public AbstractC0009a m43d() {
        if (this.f36t && !this.f38v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f38v = true;
        return m27O();
    }

    /* renamed from: d0 */
    public AbstractC0009a m44d0(boolean z9) {
        if (this.f38v) {
            return mo49g().m44d0(true);
        }
        this.f25i = !z9;
        this.f17a |= 256;
        return m38Z();
    }

    /* renamed from: e */
    public AbstractC0009a m45e() {
        return m46e0(DownsampleStrategy.f3524e, new C9399i());
    }

    /* renamed from: e0 */
    public final AbstractC0009a m46e0(DownsampleStrategy downsampleStrategy, InterfaceC8087g interfaceC8087g) {
        if (this.f38v) {
            return mo49g().m46e0(downsampleStrategy, interfaceC8087g);
        }
        m55j(downsampleStrategy);
        return m48f0(interfaceC8087g);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0009a) {
            AbstractC0009a abstractC0009a = (AbstractC0009a) obj;
            if (Float.compare(abstractC0009a.f18b, this.f18b) == 0 && this.f22f == abstractC0009a.f22f && AbstractC7838j.m12260c(this.f21e, abstractC0009a.f21e) && this.f24h == abstractC0009a.f24h && AbstractC7838j.m12260c(this.f23g, abstractC0009a.f23g) && this.f32p == abstractC0009a.f32p && AbstractC7838j.m12260c(this.f31o, abstractC0009a.f31o) && this.f25i == abstractC0009a.f25i && this.f26j == abstractC0009a.f26j && this.f27k == abstractC0009a.f27k && this.f29m == abstractC0009a.f29m && this.f30n == abstractC0009a.f30n && this.f39w == abstractC0009a.f39w && this.f40x == abstractC0009a.f40x && this.f19c.equals(abstractC0009a.f19c) && this.f20d == abstractC0009a.f20d && this.f33q.equals(abstractC0009a.f33q) && this.f34r.equals(abstractC0009a.f34r) && this.f35s.equals(abstractC0009a.f35s) && AbstractC7838j.m12260c(this.f28l, abstractC0009a.f28l) && AbstractC7838j.m12260c(this.f37u, abstractC0009a.f37u)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC0009a m47f() {
        return m46e0(DownsampleStrategy.f3523d, new C9401k());
    }

    /* renamed from: f0 */
    public AbstractC0009a m48f0(InterfaceC8087g interfaceC8087g) {
        return m50g0(interfaceC8087g, true);
    }

    @Override // 
    /* renamed from: g */
    public AbstractC0009a mo49g() {
        try {
            AbstractC0009a abstractC0009a = (AbstractC0009a) super.clone();
            C8084d c8084d = new C8084d();
            abstractC0009a.f33q = c8084d;
            c8084d.m12909d(this.f33q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC0009a.f34r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f34r);
            abstractC0009a.f36t = false;
            abstractC0009a.f38v = false;
            return abstractC0009a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g0 */
    public AbstractC0009a m50g0(InterfaceC8087g interfaceC8087g, boolean z9) {
        if (this.f38v) {
            return mo49g().m50g0(interfaceC8087g, z9);
        }
        C9406p c9406p = new C9406p(interfaceC8087g, z9);
        m52h0(Bitmap.class, interfaceC8087g, z9);
        m52h0(Drawable.class, c9406p, z9);
        m52h0(BitmapDrawable.class, c9406p.m15476c(), z9);
        m52h0(GifDrawable.class, new C9744e(interfaceC8087g), z9);
        return m38Z();
    }

    /* renamed from: h */
    public AbstractC0009a m51h(Class cls) {
        if (this.f38v) {
            return mo49g().m51h(cls);
        }
        this.f35s = (Class) AbstractC7837i.m12256d(cls);
        this.f17a |= 4096;
        return m38Z();
    }

    /* renamed from: h0 */
    public AbstractC0009a m52h0(Class cls, InterfaceC8087g interfaceC8087g, boolean z9) {
        if (this.f38v) {
            return mo49g().m52h0(cls, interfaceC8087g, z9);
        }
        AbstractC7837i.m12256d(cls);
        AbstractC7837i.m12256d(interfaceC8087g);
        this.f34r.put(cls, interfaceC8087g);
        int i9 = this.f17a;
        this.f30n = true;
        this.f17a = 67584 | i9;
        this.f41y = false;
        if (z9) {
            this.f17a = i9 | 198656;
            this.f29m = true;
        }
        return m38Z();
    }

    public int hashCode() {
        return AbstractC7838j.m12270m(this.f37u, AbstractC7838j.m12270m(this.f28l, AbstractC7838j.m12270m(this.f35s, AbstractC7838j.m12270m(this.f34r, AbstractC7838j.m12270m(this.f33q, AbstractC7838j.m12270m(this.f20d, AbstractC7838j.m12270m(this.f19c, AbstractC7838j.m12271n(this.f40x, AbstractC7838j.m12271n(this.f39w, AbstractC7838j.m12271n(this.f30n, AbstractC7838j.m12271n(this.f29m, AbstractC7838j.m12269l(this.f27k, AbstractC7838j.m12269l(this.f26j, AbstractC7838j.m12271n(this.f25i, AbstractC7838j.m12270m(this.f31o, AbstractC7838j.m12269l(this.f32p, AbstractC7838j.m12270m(this.f23g, AbstractC7838j.m12269l(this.f24h, AbstractC7838j.m12270m(this.f21e, AbstractC7838j.m12269l(this.f22f, AbstractC7838j.m12267j(this.f18b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC0009a m53i(AbstractC8252c abstractC8252c) {
        if (this.f38v) {
            return mo49g().m53i(abstractC8252c);
        }
        this.f19c = (AbstractC8252c) AbstractC7837i.m12256d(abstractC8252c);
        this.f17a |= 4;
        return m38Z();
    }

    /* renamed from: i0 */
    public AbstractC0009a m54i0(boolean z9) {
        if (this.f38v) {
            return mo49g().m54i0(z9);
        }
        this.f42z = z9;
        this.f17a |= 1048576;
        return m38Z();
    }

    /* renamed from: j */
    public AbstractC0009a m55j(DownsampleStrategy downsampleStrategy) {
        return m39a0(DownsampleStrategy.f3527h, AbstractC7837i.m12256d(downsampleStrategy));
    }

    /* renamed from: l */
    public AbstractC0009a m56l(int i9) {
        if (this.f38v) {
            return mo49g().m56l(i9);
        }
        this.f22f = i9;
        int i10 = this.f17a | 32;
        this.f21e = null;
        this.f17a = i10 & (-17);
        return m38Z();
    }

    /* renamed from: m */
    public final AbstractC8252c m57m() {
        return this.f19c;
    }

    /* renamed from: n */
    public final int m58n() {
        return this.f22f;
    }

    /* renamed from: o */
    public final Drawable m59o() {
        return this.f21e;
    }

    /* renamed from: p */
    public final Drawable m60p() {
        return this.f31o;
    }

    /* renamed from: q */
    public final int m61q() {
        return this.f32p;
    }

    /* renamed from: r */
    public final boolean m62r() {
        return this.f40x;
    }

    /* renamed from: s */
    public final C8084d m63s() {
        return this.f33q;
    }

    /* renamed from: t */
    public final int m64t() {
        return this.f26j;
    }

    /* renamed from: u */
    public final int m65u() {
        return this.f27k;
    }

    /* renamed from: v */
    public final Drawable m66v() {
        return this.f23g;
    }

    /* renamed from: w */
    public final int m67w() {
        return this.f24h;
    }

    /* renamed from: x */
    public final Priority m68x() {
        return this.f20d;
    }

    /* renamed from: y */
    public final Class m69y() {
        return this.f35s;
    }

    /* renamed from: z */
    public final InterfaceC8082b m70z() {
        return this.f28l;
    }

    /* renamed from: Y */
    public final AbstractC0009a m37Y() {
        return this;
    }
}
