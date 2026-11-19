package p181x0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p002a1.C0006a;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p053f0.C6284c;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p053f0.InterfaceC6288g;
import p067h0.AbstractC6433c;
import p118o0.C7499j;
import p118o0.C7500k;
import p118o0.C7501l;
import p118o0.C7506q;
import p118o0.C7508s;
import p146s0.C7683e;

/* renamed from: x0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7823a implements Cloneable {

    /* renamed from: a */
    public int f10384a;

    /* renamed from: e */
    public Drawable f10388e;

    /* renamed from: f */
    public int f10389f;

    /* renamed from: g */
    public Drawable f10390g;

    /* renamed from: h */
    public int f10391h;

    /* renamed from: m */
    public boolean f10396m;

    /* renamed from: o */
    public Drawable f10398o;

    /* renamed from: p */
    public int f10399p;

    /* renamed from: t */
    public boolean f10403t;

    /* renamed from: u */
    public Resources.Theme f10404u;

    /* renamed from: v */
    public boolean f10405v;

    /* renamed from: w */
    public boolean f10406w;

    /* renamed from: x */
    public boolean f10407x;

    /* renamed from: z */
    public boolean f10409z;

    /* renamed from: b */
    public float f10385b = 1.0f;

    /* renamed from: c */
    public AbstractC6433c f10386c = AbstractC6433c.f8116e;

    /* renamed from: d */
    public Priority f10387d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f10392i = true;

    /* renamed from: j */
    public int f10393j = -1;

    /* renamed from: k */
    public int f10394k = -1;

    /* renamed from: l */
    public InterfaceC6283b f10395l = C0006a.m8c();

    /* renamed from: n */
    public boolean f10397n = true;

    /* renamed from: q */
    public C6285d f10400q = new C6285d();

    /* renamed from: r */
    public Map f10401r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f10402s = Object.class;

    /* renamed from: y */
    public boolean f10408y = true;

    /* renamed from: L */
    public static boolean m9412L(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    /* renamed from: A */
    public final float m9413A() {
        return this.f10385b;
    }

    /* renamed from: B */
    public final Resources.Theme m9414B() {
        return this.f10404u;
    }

    /* renamed from: C */
    public final Map m9415C() {
        return this.f10401r;
    }

    /* renamed from: D */
    public final boolean m9416D() {
        return this.f10409z;
    }

    /* renamed from: E */
    public final boolean m9417E() {
        return this.f10406w;
    }

    /* renamed from: F */
    public final boolean m9418F() {
        return this.f10405v;
    }

    /* renamed from: G */
    public final boolean m9419G(AbstractC7823a abstractC7823a) {
        return Float.compare(abstractC7823a.f10385b, this.f10385b) == 0 && this.f10389f == abstractC7823a.f10389f && AbstractC4409k.m1443d(this.f10388e, abstractC7823a.f10388e) && this.f10391h == abstractC7823a.f10391h && AbstractC4409k.m1443d(this.f10390g, abstractC7823a.f10390g) && this.f10399p == abstractC7823a.f10399p && AbstractC4409k.m1443d(this.f10398o, abstractC7823a.f10398o) && this.f10392i == abstractC7823a.f10392i && this.f10393j == abstractC7823a.f10393j && this.f10394k == abstractC7823a.f10394k && this.f10396m == abstractC7823a.f10396m && this.f10397n == abstractC7823a.f10397n && this.f10406w == abstractC7823a.f10406w && this.f10407x == abstractC7823a.f10407x && this.f10386c.equals(abstractC7823a.f10386c) && this.f10387d == abstractC7823a.f10387d && this.f10400q.equals(abstractC7823a.f10400q) && this.f10401r.equals(abstractC7823a.f10401r) && this.f10402s.equals(abstractC7823a.f10402s) && AbstractC4409k.m1443d(this.f10395l, abstractC7823a.f10395l) && AbstractC4409k.m1443d(this.f10404u, abstractC7823a.f10404u);
    }

    /* renamed from: H */
    public final boolean m9420H() {
        return this.f10392i;
    }

    /* renamed from: I */
    public final boolean m9421I() {
        return m9423K(8);
    }

    /* renamed from: J */
    public boolean m9422J() {
        return this.f10408y;
    }

    /* renamed from: K */
    public final boolean m9423K(int i6) {
        return m9412L(this.f10384a, i6);
    }

    /* renamed from: M */
    public final boolean m9424M() {
        return this.f10397n;
    }

    /* renamed from: N */
    public final boolean m9425N() {
        return this.f10396m;
    }

    /* renamed from: O */
    public final boolean m9426O() {
        return m9423K(2048);
    }

    /* renamed from: P */
    public final boolean m9427P() {
        return AbstractC4409k.m1459t(this.f10394k, this.f10393j);
    }

    /* renamed from: Q */
    public AbstractC7823a mo7341Q() {
        this.f10403t = true;
        return m9431a0();
    }

    /* renamed from: R */
    public AbstractC7823a mo7342R() {
        return m9429V(DownsampleStrategy.f2519e, new C7499j());
    }

    /* renamed from: S */
    public AbstractC7823a mo7343S() {
        return m9428U(DownsampleStrategy.f2518d, new C7500k());
    }

    /* renamed from: T */
    public AbstractC7823a mo7344T() {
        return m9428U(DownsampleStrategy.f2517c, new C7508s());
    }

    /* renamed from: U */
    public final AbstractC7823a m9428U(DownsampleStrategy downsampleStrategy, InterfaceC6288g interfaceC6288g) {
        return m9430Z(downsampleStrategy, interfaceC6288g, false);
    }

    /* renamed from: V */
    public final AbstractC7823a m9429V(DownsampleStrategy downsampleStrategy, InterfaceC6288g interfaceC6288g) {
        if (this.f10405v) {
            return clone().m9429V(downsampleStrategy, interfaceC6288g);
        }
        mo7357k(downsampleStrategy);
        return m9434i0(interfaceC6288g, false);
    }

    /* renamed from: W */
    public AbstractC7823a mo7345W(int i6, int i7) {
        if (this.f10405v) {
            return clone().mo7345W(i6, i7);
        }
        this.f10394k = i6;
        this.f10393j = i7;
        this.f10384a |= 512;
        return m9432b0();
    }

    /* renamed from: X */
    public AbstractC7823a mo7346X(int i6) {
        if (this.f10405v) {
            return clone().mo7346X(i6);
        }
        this.f10391h = i6;
        int i7 = this.f10384a | 128;
        this.f10390g = null;
        this.f10384a = i7 & (-65);
        return m9432b0();
    }

    /* renamed from: Y */
    public AbstractC7823a mo7347Y(Priority priority) {
        if (this.f10405v) {
            return clone().mo7347Y(priority);
        }
        this.f10387d = (Priority) AbstractC4408j.m1438d(priority);
        this.f10384a |= 8;
        return m9432b0();
    }

    /* renamed from: Z */
    public final AbstractC7823a m9430Z(DownsampleStrategy downsampleStrategy, InterfaceC6288g interfaceC6288g, boolean z6) {
        AbstractC7823a abstractC7823aM9433g0 = z6 ? m9433g0(downsampleStrategy, interfaceC6288g) : m9429V(downsampleStrategy, interfaceC6288g);
        abstractC7823aM9433g0.f10408y = true;
        return abstractC7823aM9433g0;
    }

    /* renamed from: b */
    public AbstractC7823a mo2514b(AbstractC7823a abstractC7823a) {
        if (this.f10405v) {
            return clone().mo2514b(abstractC7823a);
        }
        if (m9412L(abstractC7823a.f10384a, 2)) {
            this.f10385b = abstractC7823a.f10385b;
        }
        if (m9412L(abstractC7823a.f10384a, 262144)) {
            this.f10406w = abstractC7823a.f10406w;
        }
        if (m9412L(abstractC7823a.f10384a, 1048576)) {
            this.f10409z = abstractC7823a.f10409z;
        }
        if (m9412L(abstractC7823a.f10384a, 4)) {
            this.f10386c = abstractC7823a.f10386c;
        }
        if (m9412L(abstractC7823a.f10384a, 8)) {
            this.f10387d = abstractC7823a.f10387d;
        }
        if (m9412L(abstractC7823a.f10384a, 16)) {
            this.f10388e = abstractC7823a.f10388e;
            this.f10389f = 0;
            this.f10384a &= -33;
        }
        if (m9412L(abstractC7823a.f10384a, 32)) {
            this.f10389f = abstractC7823a.f10389f;
            this.f10388e = null;
            this.f10384a &= -17;
        }
        if (m9412L(abstractC7823a.f10384a, 64)) {
            this.f10390g = abstractC7823a.f10390g;
            this.f10391h = 0;
            this.f10384a &= -129;
        }
        if (m9412L(abstractC7823a.f10384a, 128)) {
            this.f10391h = abstractC7823a.f10391h;
            this.f10390g = null;
            this.f10384a &= -65;
        }
        if (m9412L(abstractC7823a.f10384a, 256)) {
            this.f10392i = abstractC7823a.f10392i;
        }
        if (m9412L(abstractC7823a.f10384a, 512)) {
            this.f10394k = abstractC7823a.f10394k;
            this.f10393j = abstractC7823a.f10393j;
        }
        if (m9412L(abstractC7823a.f10384a, 1024)) {
            this.f10395l = abstractC7823a.f10395l;
        }
        if (m9412L(abstractC7823a.f10384a, 4096)) {
            this.f10402s = abstractC7823a.f10402s;
        }
        if (m9412L(abstractC7823a.f10384a, 8192)) {
            this.f10398o = abstractC7823a.f10398o;
            this.f10399p = 0;
            this.f10384a &= -16385;
        }
        if (m9412L(abstractC7823a.f10384a, 16384)) {
            this.f10399p = abstractC7823a.f10399p;
            this.f10398o = null;
            this.f10384a &= -8193;
        }
        if (m9412L(abstractC7823a.f10384a, 32768)) {
            this.f10404u = abstractC7823a.f10404u;
        }
        if (m9412L(abstractC7823a.f10384a, 65536)) {
            this.f10397n = abstractC7823a.f10397n;
        }
        if (m9412L(abstractC7823a.f10384a, 131072)) {
            this.f10396m = abstractC7823a.f10396m;
        }
        if (m9412L(abstractC7823a.f10384a, 2048)) {
            this.f10401r.putAll(abstractC7823a.f10401r);
            this.f10408y = abstractC7823a.f10408y;
        }
        if (m9412L(abstractC7823a.f10384a, 524288)) {
            this.f10407x = abstractC7823a.f10407x;
        }
        if (!this.f10397n) {
            this.f10401r.clear();
            int i6 = this.f10384a;
            this.f10396m = false;
            this.f10384a = i6 & (-133121);
            this.f10408y = true;
        }
        this.f10384a |= abstractC7823a.f10384a;
        this.f10400q.m6421d(abstractC7823a.f10400q);
        return m9432b0();
    }

    /* renamed from: b0 */
    public final AbstractC7823a m9432b0() {
        if (this.f10403t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m9431a0();
    }

    /* renamed from: c0 */
    public AbstractC7823a mo7348c0(C6284c c6284c, Object obj) {
        if (this.f10405v) {
            return clone().mo7348c0(c6284c, obj);
        }
        AbstractC4408j.m1438d(c6284c);
        AbstractC4408j.m1438d(obj);
        this.f10400q.m6422e(c6284c, obj);
        return m9432b0();
    }

    /* renamed from: d */
    public AbstractC7823a mo7349d() {
        if (this.f10403t && !this.f10405v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f10405v = true;
        return mo7341Q();
    }

    /* renamed from: d0 */
    public AbstractC7823a mo7350d0(InterfaceC6283b interfaceC6283b) {
        if (this.f10405v) {
            return clone().mo7350d0(interfaceC6283b);
        }
        this.f10395l = (InterfaceC6283b) AbstractC4408j.m1438d(interfaceC6283b);
        this.f10384a |= 1024;
        return m9432b0();
    }

    /* renamed from: e */
    public AbstractC7823a mo7396e() {
        return m9433g0(DownsampleStrategy.f2519e, new C7499j());
    }

    /* renamed from: e0 */
    public AbstractC7823a mo7351e0(float f6) {
        if (this.f10405v) {
            return clone().mo7351e0(f6);
        }
        if (f6 < 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f10385b = f6;
        this.f10384a |= 2;
        return m9432b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC7823a) {
            return m9419G((AbstractC7823a) obj);
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC7823a mo7352f() {
        return m9433g0(DownsampleStrategy.f2518d, new C7501l());
    }

    /* renamed from: f0 */
    public AbstractC7823a mo7353f0(boolean z6) {
        if (this.f10405v) {
            return clone().mo7353f0(true);
        }
        this.f10392i = !z6;
        this.f10384a |= 256;
        return m9432b0();
    }

    /* renamed from: g0 */
    public final AbstractC7823a m9433g0(DownsampleStrategy downsampleStrategy, InterfaceC6288g interfaceC6288g) {
        if (this.f10405v) {
            return clone().m9433g0(downsampleStrategy, interfaceC6288g);
        }
        mo7357k(downsampleStrategy);
        return mo7354h0(interfaceC6288g);
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC7823a clone() {
        try {
            AbstractC7823a abstractC7823a = (AbstractC7823a) super.clone();
            C6285d c6285d = new C6285d();
            abstractC7823a.f10400q = c6285d;
            c6285d.m6421d(this.f10400q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC7823a.f10401r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f10401r);
            abstractC7823a.f10403t = false;
            abstractC7823a.f10405v = false;
            return abstractC7823a;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* renamed from: h0 */
    public AbstractC7823a mo7354h0(InterfaceC6288g interfaceC6288g) {
        return m9434i0(interfaceC6288g, true);
    }

    public int hashCode() {
        return AbstractC4409k.m1454o(this.f10404u, AbstractC4409k.m1454o(this.f10395l, AbstractC4409k.m1454o(this.f10402s, AbstractC4409k.m1454o(this.f10401r, AbstractC4409k.m1454o(this.f10400q, AbstractC4409k.m1454o(this.f10387d, AbstractC4409k.m1454o(this.f10386c, AbstractC4409k.m1455p(this.f10407x, AbstractC4409k.m1455p(this.f10406w, AbstractC4409k.m1455p(this.f10397n, AbstractC4409k.m1455p(this.f10396m, AbstractC4409k.m1453n(this.f10394k, AbstractC4409k.m1453n(this.f10393j, AbstractC4409k.m1455p(this.f10392i, AbstractC4409k.m1454o(this.f10398o, AbstractC4409k.m1453n(this.f10399p, AbstractC4409k.m1454o(this.f10390g, AbstractC4409k.m1453n(this.f10391h, AbstractC4409k.m1454o(this.f10388e, AbstractC4409k.m1453n(this.f10389f, AbstractC4409k.m1451l(this.f10385b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC7823a mo7355i(Class cls) {
        if (this.f10405v) {
            return clone().mo7355i(cls);
        }
        this.f10402s = (Class) AbstractC4408j.m1438d(cls);
        this.f10384a |= 4096;
        return m9432b0();
    }

    /* renamed from: i0 */
    public AbstractC7823a m9434i0(InterfaceC6288g interfaceC6288g, boolean z6) {
        if (this.f10405v) {
            return clone().m9434i0(interfaceC6288g, z6);
        }
        C7506q c7506q = new C7506q(interfaceC6288g, z6);
        m9435j0(Bitmap.class, interfaceC6288g, z6);
        m9435j0(Drawable.class, c7506q, z6);
        m9435j0(BitmapDrawable.class, c7506q.m8631c(), z6);
        m9435j0(GifDrawable.class, new C7683e(interfaceC6288g), z6);
        return m9432b0();
    }

    /* renamed from: j */
    public AbstractC7823a mo7356j(AbstractC6433c abstractC6433c) {
        if (this.f10405v) {
            return clone().mo7356j(abstractC6433c);
        }
        this.f10386c = (AbstractC6433c) AbstractC4408j.m1438d(abstractC6433c);
        this.f10384a |= 4;
        return m9432b0();
    }

    /* renamed from: j0 */
    public AbstractC7823a m9435j0(Class cls, InterfaceC6288g interfaceC6288g, boolean z6) {
        if (this.f10405v) {
            return clone().m9435j0(cls, interfaceC6288g, z6);
        }
        AbstractC4408j.m1438d(cls);
        AbstractC4408j.m1438d(interfaceC6288g);
        this.f10401r.put(cls, interfaceC6288g);
        int i6 = this.f10384a;
        this.f10397n = true;
        this.f10384a = 67584 | i6;
        this.f10408y = false;
        if (z6) {
            this.f10384a = i6 | 198656;
            this.f10396m = true;
        }
        return m9432b0();
    }

    /* renamed from: k */
    public AbstractC7823a mo7357k(DownsampleStrategy downsampleStrategy) {
        return mo7348c0(DownsampleStrategy.f2522h, AbstractC4408j.m1438d(downsampleStrategy));
    }

    /* renamed from: k0 */
    public AbstractC7823a mo7358k0(boolean z6) {
        if (this.f10405v) {
            return clone().mo7358k0(z6);
        }
        this.f10409z = z6;
        this.f10384a |= 1048576;
        return m9432b0();
    }

    /* renamed from: l */
    public AbstractC7823a mo7359l(int i6) {
        if (this.f10405v) {
            return clone().mo7359l(i6);
        }
        this.f10389f = i6;
        int i7 = this.f10384a | 32;
        this.f10388e = null;
        this.f10384a = i7 & (-17);
        return m9432b0();
    }

    /* renamed from: m */
    public final AbstractC6433c m9436m() {
        return this.f10386c;
    }

    /* renamed from: n */
    public final int m9437n() {
        return this.f10389f;
    }

    /* renamed from: o */
    public final Drawable m9438o() {
        return this.f10388e;
    }

    /* renamed from: p */
    public final Drawable m9439p() {
        return this.f10398o;
    }

    /* renamed from: q */
    public final int m9440q() {
        return this.f10399p;
    }

    /* renamed from: r */
    public final boolean m9441r() {
        return this.f10407x;
    }

    /* renamed from: s */
    public final C6285d m9442s() {
        return this.f10400q;
    }

    /* renamed from: t */
    public final int m9443t() {
        return this.f10393j;
    }

    /* renamed from: u */
    public final int m9444u() {
        return this.f10394k;
    }

    /* renamed from: v */
    public final Drawable m9445v() {
        return this.f10390g;
    }

    /* renamed from: w */
    public final int m9446w() {
        return this.f10391h;
    }

    /* renamed from: x */
    public final Priority m9447x() {
        return this.f10387d;
    }

    /* renamed from: y */
    public final Class m9448y() {
        return this.f10402s;
    }

    /* renamed from: z */
    public final InterfaceC6283b m9449z() {
        return this.f10395l;
    }

    /* renamed from: a0 */
    public final AbstractC7823a m9431a0() {
        return this;
    }
}
