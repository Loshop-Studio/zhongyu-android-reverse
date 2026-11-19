package p069d0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p105g0.C8513a;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p160l.C9229c;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p160l.InterfaceC9233g;
import p182n.AbstractC9350c;
import p259u.C10147k;
import p259u.C10148l;
import p259u.C10149m;
import p259u.C10156t;
import p259u.C10158v;
import p303y.C10595e;

/* renamed from: d0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8269a implements Cloneable {

    /* renamed from: a */
    public int f15639a;

    /* renamed from: e */
    public Drawable f15643e;

    /* renamed from: f */
    public int f15644f;

    /* renamed from: g */
    public Drawable f15645g;

    /* renamed from: h */
    public int f15646h;

    /* renamed from: m */
    public boolean f15651m;

    /* renamed from: o */
    public Drawable f15653o;

    /* renamed from: p */
    public int f15654p;

    /* renamed from: t */
    public boolean f15658t;

    /* renamed from: u */
    public Resources.Theme f15659u;

    /* renamed from: v */
    public boolean f15660v;

    /* renamed from: w */
    public boolean f15661w;

    /* renamed from: x */
    public boolean f15662x;

    /* renamed from: z */
    public boolean f15664z;

    /* renamed from: b */
    public float f15640b = 1.0f;

    /* renamed from: c */
    public AbstractC9350c f15641c = AbstractC9350c.f18468e;

    /* renamed from: d */
    public Priority f15642d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f15647i = true;

    /* renamed from: j */
    public int f15648j = -1;

    /* renamed from: k */
    public int f15649k = -1;

    /* renamed from: l */
    public InterfaceC9228b f15650l = C8513a.m13882c();

    /* renamed from: n */
    public boolean f15652n = true;

    /* renamed from: q */
    public C9230d f15655q = new C9230d();

    /* renamed from: r */
    public Map f15656r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f15657s = Object.class;

    /* renamed from: y */
    public boolean f15663y = true;

    /* renamed from: L */
    public static boolean m13354L(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: A */
    public final float m13355A() {
        return this.f15640b;
    }

    /* renamed from: B */
    public final Resources.Theme m13356B() {
        return this.f15659u;
    }

    /* renamed from: C */
    public final Map m13357C() {
        return this.f15656r;
    }

    /* renamed from: D */
    public final boolean m13358D() {
        return this.f15664z;
    }

    /* renamed from: E */
    public final boolean m13359E() {
        return this.f15661w;
    }

    /* renamed from: F */
    public final boolean m13360F() {
        return this.f15660v;
    }

    /* renamed from: G */
    public final boolean m13361G(AbstractC8269a abstractC8269a) {
        return Float.compare(abstractC8269a.f15640b, this.f15640b) == 0 && this.f15644f == abstractC8269a.f15644f && AbstractC8707k.m14186d(this.f15643e, abstractC8269a.f15643e) && this.f15646h == abstractC8269a.f15646h && AbstractC8707k.m14186d(this.f15645g, abstractC8269a.f15645g) && this.f15654p == abstractC8269a.f15654p && AbstractC8707k.m14186d(this.f15653o, abstractC8269a.f15653o) && this.f15647i == abstractC8269a.f15647i && this.f15648j == abstractC8269a.f15648j && this.f15649k == abstractC8269a.f15649k && this.f15651m == abstractC8269a.f15651m && this.f15652n == abstractC8269a.f15652n && this.f15661w == abstractC8269a.f15661w && this.f15662x == abstractC8269a.f15662x && this.f15641c.equals(abstractC8269a.f15641c) && this.f15642d == abstractC8269a.f15642d && this.f15655q.equals(abstractC8269a.f15655q) && this.f15656r.equals(abstractC8269a.f15656r) && this.f15657s.equals(abstractC8269a.f15657s) && AbstractC8707k.m14186d(this.f15650l, abstractC8269a.f15650l) && AbstractC8707k.m14186d(this.f15659u, abstractC8269a.f15659u);
    }

    /* renamed from: H */
    public final boolean m13362H() {
        return this.f15647i;
    }

    /* renamed from: I */
    public final boolean m13363I() {
        return m13365K(8);
    }

    /* renamed from: J */
    public boolean m13364J() {
        return this.f15663y;
    }

    /* renamed from: K */
    public final boolean m13365K(int i10) {
        return m13354L(this.f15639a, i10);
    }

    /* renamed from: M */
    public final boolean m13366M() {
        return this.f15652n;
    }

    /* renamed from: N */
    public final boolean m13367N() {
        return this.f15651m;
    }

    /* renamed from: O */
    public final boolean m13368O() {
        return m13365K(2048);
    }

    /* renamed from: P */
    public final boolean m13369P() {
        return AbstractC8707k.m14203u(this.f15649k, this.f15648j);
    }

    /* renamed from: Q */
    public AbstractC8269a m13370Q() {
        this.f15658t = true;
        return m13380a0();
    }

    /* renamed from: R */
    public AbstractC8269a m13371R() {
        return m13375V(DownsampleStrategy.f3161e, new C10147k());
    }

    /* renamed from: S */
    public AbstractC8269a m13372S() {
        return m13374U(DownsampleStrategy.f3160d, new C10148l());
    }

    /* renamed from: T */
    public AbstractC8269a m13373T() {
        return m13374U(DownsampleStrategy.f3159c, new C10158v());
    }

    /* renamed from: U */
    public final AbstractC8269a m13374U(DownsampleStrategy downsampleStrategy, InterfaceC9233g interfaceC9233g) {
        return m13379Z(downsampleStrategy, interfaceC9233g, false);
    }

    /* renamed from: V */
    public final AbstractC8269a m13375V(DownsampleStrategy downsampleStrategy, InterfaceC9233g interfaceC9233g) {
        if (this.f15660v) {
            return clone().m13375V(downsampleStrategy, interfaceC9233g);
        }
        m13395k(downsampleStrategy);
        return m13394j0(interfaceC9233g, false);
    }

    /* renamed from: W */
    public AbstractC8269a m13376W(int i10, int i11) {
        if (this.f15660v) {
            return clone().m13376W(i10, i11);
        }
        this.f15649k = i10;
        this.f15648j = i11;
        this.f15639a |= 512;
        return m13381b0();
    }

    /* renamed from: X */
    public AbstractC8269a m13377X(int i10) {
        if (this.f15660v) {
            return clone().m13377X(i10);
        }
        this.f15646h = i10;
        int i11 = this.f15639a | 128;
        this.f15645g = null;
        this.f15639a = i11 & (-65);
        return m13381b0();
    }

    /* renamed from: Y */
    public AbstractC8269a m13378Y(Priority priority) {
        if (this.f15660v) {
            return clone().m13378Y(priority);
        }
        this.f15642d = (Priority) AbstractC8706j.m14181d(priority);
        this.f15639a |= 8;
        return m13381b0();
    }

    /* renamed from: Z */
    public final AbstractC8269a m13379Z(DownsampleStrategy downsampleStrategy, InterfaceC9233g interfaceC9233g, boolean z10) {
        AbstractC8269a abstractC8269aM13389g0 = z10 ? m13389g0(downsampleStrategy, interfaceC9233g) : m13375V(downsampleStrategy, interfaceC9233g);
        abstractC8269aM13389g0.f15663y = true;
        return abstractC8269aM13389g0;
    }

    /* renamed from: b0 */
    public final AbstractC8269a m13381b0() {
        if (this.f15658t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m13380a0();
    }

    /* renamed from: c */
    public AbstractC8269a mo2777c(AbstractC8269a abstractC8269a) {
        if (this.f15660v) {
            return clone().mo2777c(abstractC8269a);
        }
        if (m13354L(abstractC8269a.f15639a, 2)) {
            this.f15640b = abstractC8269a.f15640b;
        }
        if (m13354L(abstractC8269a.f15639a, 262144)) {
            this.f15661w = abstractC8269a.f15661w;
        }
        if (m13354L(abstractC8269a.f15639a, 1048576)) {
            this.f15664z = abstractC8269a.f15664z;
        }
        if (m13354L(abstractC8269a.f15639a, 4)) {
            this.f15641c = abstractC8269a.f15641c;
        }
        if (m13354L(abstractC8269a.f15639a, 8)) {
            this.f15642d = abstractC8269a.f15642d;
        }
        if (m13354L(abstractC8269a.f15639a, 16)) {
            this.f15643e = abstractC8269a.f15643e;
            this.f15644f = 0;
            this.f15639a &= -33;
        }
        if (m13354L(abstractC8269a.f15639a, 32)) {
            this.f15644f = abstractC8269a.f15644f;
            this.f15643e = null;
            this.f15639a &= -17;
        }
        if (m13354L(abstractC8269a.f15639a, 64)) {
            this.f15645g = abstractC8269a.f15645g;
            this.f15646h = 0;
            this.f15639a &= -129;
        }
        if (m13354L(abstractC8269a.f15639a, 128)) {
            this.f15646h = abstractC8269a.f15646h;
            this.f15645g = null;
            this.f15639a &= -65;
        }
        if (m13354L(abstractC8269a.f15639a, 256)) {
            this.f15647i = abstractC8269a.f15647i;
        }
        if (m13354L(abstractC8269a.f15639a, 512)) {
            this.f15649k = abstractC8269a.f15649k;
            this.f15648j = abstractC8269a.f15648j;
        }
        if (m13354L(abstractC8269a.f15639a, 1024)) {
            this.f15650l = abstractC8269a.f15650l;
        }
        if (m13354L(abstractC8269a.f15639a, 4096)) {
            this.f15657s = abstractC8269a.f15657s;
        }
        if (m13354L(abstractC8269a.f15639a, 8192)) {
            this.f15653o = abstractC8269a.f15653o;
            this.f15654p = 0;
            this.f15639a &= -16385;
        }
        if (m13354L(abstractC8269a.f15639a, 16384)) {
            this.f15654p = abstractC8269a.f15654p;
            this.f15653o = null;
            this.f15639a &= -8193;
        }
        if (m13354L(abstractC8269a.f15639a, 32768)) {
            this.f15659u = abstractC8269a.f15659u;
        }
        if (m13354L(abstractC8269a.f15639a, 65536)) {
            this.f15652n = abstractC8269a.f15652n;
        }
        if (m13354L(abstractC8269a.f15639a, 131072)) {
            this.f15651m = abstractC8269a.f15651m;
        }
        if (m13354L(abstractC8269a.f15639a, 2048)) {
            this.f15656r.putAll(abstractC8269a.f15656r);
            this.f15663y = abstractC8269a.f15663y;
        }
        if (m13354L(abstractC8269a.f15639a, 524288)) {
            this.f15662x = abstractC8269a.f15662x;
        }
        if (!this.f15652n) {
            this.f15656r.clear();
            int i10 = this.f15639a;
            this.f15651m = false;
            this.f15639a = i10 & (-133121);
            this.f15663y = true;
        }
        this.f15639a |= abstractC8269a.f15639a;
        this.f15655q.m16941d(abstractC8269a.f15655q);
        return m13381b0();
    }

    /* renamed from: c0 */
    public AbstractC8269a m13382c0(C9229c c9229c, Object obj) {
        if (this.f15660v) {
            return clone().m13382c0(c9229c, obj);
        }
        AbstractC8706j.m14181d(c9229c);
        AbstractC8706j.m14181d(obj);
        this.f15655q.m16942e(c9229c, obj);
        return m13381b0();
    }

    /* renamed from: d0 */
    public AbstractC8269a m13383d0(InterfaceC9228b interfaceC9228b) {
        if (this.f15660v) {
            return clone().m13383d0(interfaceC9228b);
        }
        this.f15650l = (InterfaceC9228b) AbstractC8706j.m14181d(interfaceC9228b);
        this.f15639a |= 1024;
        return m13381b0();
    }

    /* renamed from: e */
    public AbstractC8269a m13384e() {
        if (this.f15658t && !this.f15660v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f15660v = true;
        return m13370Q();
    }

    /* renamed from: e0 */
    public AbstractC8269a m13385e0(float f10) {
        if (this.f15660v) {
            return clone().m13385e0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f15640b = f10;
        this.f15639a |= 2;
        return m13381b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC8269a) {
            return m13361G((AbstractC8269a) obj);
        }
        return false;
    }

    /* renamed from: f */
    public AbstractC8269a m13386f() {
        return m13389g0(DownsampleStrategy.f3161e, new C10147k());
    }

    /* renamed from: f0 */
    public AbstractC8269a m13387f0(boolean z10) {
        if (this.f15660v) {
            return clone().m13387f0(true);
        }
        this.f15647i = !z10;
        this.f15639a |= 256;
        return m13381b0();
    }

    /* renamed from: g */
    public AbstractC8269a m13388g() {
        return m13389g0(DownsampleStrategy.f3160d, new C10149m());
    }

    /* renamed from: g0 */
    public final AbstractC8269a m13389g0(DownsampleStrategy downsampleStrategy, InterfaceC9233g interfaceC9233g) {
        if (this.f15660v) {
            return clone().m13389g0(downsampleStrategy, interfaceC9233g);
        }
        m13395k(downsampleStrategy);
        return m13392i0(interfaceC9233g);
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC8269a clone() {
        try {
            AbstractC8269a abstractC8269a = (AbstractC8269a) super.clone();
            C9230d c9230d = new C9230d();
            abstractC8269a.f15655q = c9230d;
            c9230d.m16941d(this.f15655q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC8269a.f15656r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f15656r);
            abstractC8269a.f15658t = false;
            abstractC8269a.f15660v = false;
            return abstractC8269a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: h0 */
    public AbstractC8269a m13390h0(Class cls, InterfaceC9233g interfaceC9233g, boolean z10) {
        if (this.f15660v) {
            return clone().m13390h0(cls, interfaceC9233g, z10);
        }
        AbstractC8706j.m14181d(cls);
        AbstractC8706j.m14181d(interfaceC9233g);
        this.f15656r.put(cls, interfaceC9233g);
        int i10 = this.f15639a;
        this.f15652n = true;
        this.f15639a = 67584 | i10;
        this.f15663y = false;
        if (z10) {
            this.f15639a = i10 | 198656;
            this.f15651m = true;
        }
        return m13381b0();
    }

    public int hashCode() {
        return AbstractC8707k.m14198p(this.f15659u, AbstractC8707k.m14198p(this.f15650l, AbstractC8707k.m14198p(this.f15657s, AbstractC8707k.m14198p(this.f15656r, AbstractC8707k.m14198p(this.f15655q, AbstractC8707k.m14198p(this.f15642d, AbstractC8707k.m14198p(this.f15641c, AbstractC8707k.m14199q(this.f15662x, AbstractC8707k.m14199q(this.f15661w, AbstractC8707k.m14199q(this.f15652n, AbstractC8707k.m14199q(this.f15651m, AbstractC8707k.m14197o(this.f15649k, AbstractC8707k.m14197o(this.f15648j, AbstractC8707k.m14199q(this.f15647i, AbstractC8707k.m14198p(this.f15653o, AbstractC8707k.m14197o(this.f15654p, AbstractC8707k.m14198p(this.f15645g, AbstractC8707k.m14197o(this.f15646h, AbstractC8707k.m14198p(this.f15643e, AbstractC8707k.m14197o(this.f15644f, AbstractC8707k.m14194l(this.f15640b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC8269a m13391i(Class cls) {
        if (this.f15660v) {
            return clone().m13391i(cls);
        }
        this.f15657s = (Class) AbstractC8706j.m14181d(cls);
        this.f15639a |= 4096;
        return m13381b0();
    }

    /* renamed from: i0 */
    public AbstractC8269a m13392i0(InterfaceC9233g interfaceC9233g) {
        return m13394j0(interfaceC9233g, true);
    }

    /* renamed from: j */
    public AbstractC8269a m13393j(AbstractC9350c abstractC9350c) {
        if (this.f15660v) {
            return clone().m13393j(abstractC9350c);
        }
        this.f15641c = (AbstractC9350c) AbstractC8706j.m14181d(abstractC9350c);
        this.f15639a |= 4;
        return m13381b0();
    }

    /* renamed from: j0 */
    public AbstractC8269a m13394j0(InterfaceC9233g interfaceC9233g, boolean z10) {
        if (this.f15660v) {
            return clone().m13394j0(interfaceC9233g, z10);
        }
        C10156t c10156t = new C10156t(interfaceC9233g, z10);
        m13390h0(Bitmap.class, interfaceC9233g, z10);
        m13390h0(Drawable.class, c10156t, z10);
        m13390h0(BitmapDrawable.class, c10156t.m19011c(), z10);
        m13390h0(GifDrawable.class, new C10595e(interfaceC9233g), z10);
        return m13381b0();
    }

    /* renamed from: k */
    public AbstractC8269a m13395k(DownsampleStrategy downsampleStrategy) {
        return m13382c0(DownsampleStrategy.f3164h, AbstractC8706j.m14181d(downsampleStrategy));
    }

    /* renamed from: k0 */
    public AbstractC8269a m13396k0(boolean z10) {
        if (this.f15660v) {
            return clone().m13396k0(z10);
        }
        this.f15664z = z10;
        this.f15639a |= 1048576;
        return m13381b0();
    }

    /* renamed from: l */
    public AbstractC8269a m13397l(int i10) {
        if (this.f15660v) {
            return clone().m13397l(i10);
        }
        this.f15644f = i10;
        int i11 = this.f15639a | 32;
        this.f15643e = null;
        this.f15639a = i11 & (-17);
        return m13381b0();
    }

    /* renamed from: m */
    public final AbstractC9350c m13398m() {
        return this.f15641c;
    }

    /* renamed from: n */
    public final int m13399n() {
        return this.f15644f;
    }

    /* renamed from: o */
    public final Drawable m13400o() {
        return this.f15643e;
    }

    /* renamed from: p */
    public final Drawable m13401p() {
        return this.f15653o;
    }

    /* renamed from: q */
    public final int m13402q() {
        return this.f15654p;
    }

    /* renamed from: r */
    public final boolean m13403r() {
        return this.f15662x;
    }

    /* renamed from: s */
    public final C9230d m13404s() {
        return this.f15655q;
    }

    /* renamed from: t */
    public final int m13405t() {
        return this.f15648j;
    }

    /* renamed from: u */
    public final int m13406u() {
        return this.f15649k;
    }

    /* renamed from: v */
    public final Drawable m13407v() {
        return this.f15645g;
    }

    /* renamed from: w */
    public final int m13408w() {
        return this.f15646h;
    }

    /* renamed from: x */
    public final Priority m13409x() {
        return this.f15642d;
    }

    /* renamed from: y */
    public final Class m13410y() {
        return this.f15657s;
    }

    /* renamed from: z */
    public final InterfaceC9228b m13411z() {
        return this.f15650l;
    }

    /* renamed from: a0 */
    public final AbstractC8269a m13380a0() {
        return this;
    }
}
