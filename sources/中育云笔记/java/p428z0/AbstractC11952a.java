package p428z0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p039c1.C5221c;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p168h0.C9436c;
import p168h0.C9437d;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p168h0.InterfaceC9441h;
import p198j0.AbstractC9650c;
import p298q0.C10701j;
import p298q0.C10702k;
import p298q0.C10707p;
import p298q0.C10709r;
import p328s0.C11032k;
import p353u0.C11317e;

/* renamed from: z0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11952a implements Cloneable {

    /* renamed from: B */
    public boolean f28309B;

    /* renamed from: c */
    public int f28310c;

    /* renamed from: g */
    public Drawable f28314g;

    /* renamed from: h */
    public int f28315h;

    /* renamed from: i */
    public Drawable f28316i;

    /* renamed from: j */
    public int f28317j;

    /* renamed from: o */
    public boolean f28322o;

    /* renamed from: q */
    public Drawable f28324q;

    /* renamed from: r */
    public int f28325r;

    /* renamed from: v */
    public boolean f28329v;

    /* renamed from: w */
    public Resources.Theme f28330w;

    /* renamed from: x */
    public boolean f28331x;

    /* renamed from: y */
    public boolean f28332y;

    /* renamed from: z */
    public boolean f28333z;

    /* renamed from: d */
    public float f28311d = 1.0f;

    /* renamed from: e */
    public AbstractC9650c f28312e = AbstractC9650c.f22359e;

    /* renamed from: f */
    public Priority f28313f = Priority.NORMAL;

    /* renamed from: k */
    public boolean f28318k = true;

    /* renamed from: l */
    public int f28319l = -1;

    /* renamed from: m */
    public int f28320m = -1;

    /* renamed from: n */
    public InterfaceC9435b f28321n = C5221c.m2802c();

    /* renamed from: p */
    public boolean f28323p = true;

    /* renamed from: s */
    public C9438e f28326s = new C9438e();

    /* renamed from: t */
    public Map f28327t = new CachedHashCodeArrayMap();

    /* renamed from: u */
    public Class f28328u = Object.class;

    /* renamed from: A */
    public boolean f28308A = true;

    /* renamed from: K */
    public static boolean m26513K(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: A */
    public final Resources.Theme m26514A() {
        return this.f28330w;
    }

    /* renamed from: B */
    public final Map m26515B() {
        return this.f28327t;
    }

    /* renamed from: C */
    public final boolean m26516C() {
        return this.f28309B;
    }

    /* renamed from: D */
    public final boolean m26517D() {
        return this.f28332y;
    }

    /* renamed from: E */
    public final boolean m26518E() {
        return this.f28331x;
    }

    /* renamed from: F */
    public final boolean m26519F(AbstractC11952a abstractC11952a) {
        return Float.compare(abstractC11952a.f28311d, this.f28311d) == 0 && this.f28315h == abstractC11952a.f28315h && AbstractC8910k.m17473d(this.f28314g, abstractC11952a.f28314g) && this.f28317j == abstractC11952a.f28317j && AbstractC8910k.m17473d(this.f28316i, abstractC11952a.f28316i) && this.f28325r == abstractC11952a.f28325r && AbstractC8910k.m17473d(this.f28324q, abstractC11952a.f28324q) && this.f28318k == abstractC11952a.f28318k && this.f28319l == abstractC11952a.f28319l && this.f28320m == abstractC11952a.f28320m && this.f28322o == abstractC11952a.f28322o && this.f28323p == abstractC11952a.f28323p && this.f28332y == abstractC11952a.f28332y && this.f28333z == abstractC11952a.f28333z && this.f28312e.equals(abstractC11952a.f28312e) && this.f28313f == abstractC11952a.f28313f && this.f28326s.equals(abstractC11952a.f28326s) && this.f28327t.equals(abstractC11952a.f28327t) && this.f28328u.equals(abstractC11952a.f28328u) && AbstractC8910k.m17473d(this.f28321n, abstractC11952a.f28321n) && AbstractC8910k.m17473d(this.f28330w, abstractC11952a.f28330w);
    }

    /* renamed from: G */
    public final boolean m26520G() {
        return this.f28318k;
    }

    /* renamed from: H */
    public final boolean m26521H() {
        return m26523J(8);
    }

    /* renamed from: I */
    public boolean m26522I() {
        return this.f28308A;
    }

    /* renamed from: J */
    public final boolean m26523J(int i10) {
        return m26513K(this.f28310c, i10);
    }

    /* renamed from: L */
    public final boolean m26524L() {
        return this.f28323p;
    }

    /* renamed from: M */
    public final boolean m26525M() {
        return this.f28322o;
    }

    /* renamed from: N */
    public final boolean m26526N() {
        return m26523J(2048);
    }

    /* renamed from: O */
    public final boolean m26527O() {
        return AbstractC8910k.m17490u(this.f28320m, this.f28319l);
    }

    /* renamed from: P */
    public AbstractC11952a m26528P() {
        this.f28329v = true;
        return m26540b0();
    }

    /* renamed from: Q */
    public AbstractC11952a m26529Q() {
        return m26533U(DownsampleStrategy.f4931e, new C10701j());
    }

    /* renamed from: R */
    public AbstractC11952a m26530R() {
        return m26532T(DownsampleStrategy.f4930d, new C10702k());
    }

    /* renamed from: S */
    public AbstractC11952a m26531S() {
        return m26532T(DownsampleStrategy.f4929c, new C10709r());
    }

    /* renamed from: T */
    public final AbstractC11952a m26532T(DownsampleStrategy downsampleStrategy, InterfaceC9441h interfaceC9441h) {
        return m26539a0(downsampleStrategy, interfaceC9441h, false);
    }

    /* renamed from: U */
    public final AbstractC11952a m26533U(DownsampleStrategy downsampleStrategy, InterfaceC9441h interfaceC9441h) {
        if (this.f28331x) {
            return clone().m26533U(downsampleStrategy, interfaceC9441h);
        }
        m26551i(downsampleStrategy);
        return m26556k0(interfaceC9441h, false);
    }

    /* renamed from: V */
    public AbstractC11952a m26534V(int i10, int i11) {
        if (this.f28331x) {
            return clone().m26534V(i10, i11);
        }
        this.f28320m = i10;
        this.f28319l = i11;
        this.f28310c |= 512;
        return m26541c0();
    }

    /* renamed from: W */
    public AbstractC11952a m26535W(int i10) {
        if (this.f28331x) {
            return clone().m26535W(i10);
        }
        this.f28317j = i10;
        int i11 = this.f28310c | 128;
        this.f28316i = null;
        this.f28310c = i11 & (-65);
        return m26541c0();
    }

    /* renamed from: X */
    public AbstractC11952a m26536X(Priority priority) {
        if (this.f28331x) {
            return clone().m26536X(priority);
        }
        this.f28313f = (Priority) AbstractC8909j.m17468d(priority);
        this.f28310c |= 8;
        return m26541c0();
    }

    /* renamed from: Y */
    public AbstractC11952a m26537Y(C9437d c9437d) {
        if (this.f28331x) {
            return clone().m26537Y(c9437d);
        }
        this.f28326s.m18628e(c9437d);
        return m26541c0();
    }

    /* renamed from: Z */
    public final AbstractC11952a m26538Z(DownsampleStrategy downsampleStrategy, InterfaceC9441h interfaceC9441h) {
        return m26539a0(downsampleStrategy, interfaceC9441h, true);
    }

    /* renamed from: a0 */
    public final AbstractC11952a m26539a0(DownsampleStrategy downsampleStrategy, InterfaceC9441h interfaceC9441h, boolean z10) {
        AbstractC11952a abstractC11952aM26552i0 = z10 ? m26552i0(downsampleStrategy, interfaceC9441h) : m26533U(downsampleStrategy, interfaceC9441h);
        abstractC11952aM26552i0.f28308A = true;
        return abstractC11952aM26552i0;
    }

    /* renamed from: b */
    public AbstractC11952a mo3989b(AbstractC11952a abstractC11952a) {
        if (this.f28331x) {
            return clone().mo3989b(abstractC11952a);
        }
        if (m26513K(abstractC11952a.f28310c, 2)) {
            this.f28311d = abstractC11952a.f28311d;
        }
        if (m26513K(abstractC11952a.f28310c, 262144)) {
            this.f28332y = abstractC11952a.f28332y;
        }
        if (m26513K(abstractC11952a.f28310c, 1048576)) {
            this.f28309B = abstractC11952a.f28309B;
        }
        if (m26513K(abstractC11952a.f28310c, 4)) {
            this.f28312e = abstractC11952a.f28312e;
        }
        if (m26513K(abstractC11952a.f28310c, 8)) {
            this.f28313f = abstractC11952a.f28313f;
        }
        if (m26513K(abstractC11952a.f28310c, 16)) {
            this.f28314g = abstractC11952a.f28314g;
            this.f28315h = 0;
            this.f28310c &= -33;
        }
        if (m26513K(abstractC11952a.f28310c, 32)) {
            this.f28315h = abstractC11952a.f28315h;
            this.f28314g = null;
            this.f28310c &= -17;
        }
        if (m26513K(abstractC11952a.f28310c, 64)) {
            this.f28316i = abstractC11952a.f28316i;
            this.f28317j = 0;
            this.f28310c &= -129;
        }
        if (m26513K(abstractC11952a.f28310c, 128)) {
            this.f28317j = abstractC11952a.f28317j;
            this.f28316i = null;
            this.f28310c &= -65;
        }
        if (m26513K(abstractC11952a.f28310c, 256)) {
            this.f28318k = abstractC11952a.f28318k;
        }
        if (m26513K(abstractC11952a.f28310c, 512)) {
            this.f28320m = abstractC11952a.f28320m;
            this.f28319l = abstractC11952a.f28319l;
        }
        if (m26513K(abstractC11952a.f28310c, 1024)) {
            this.f28321n = abstractC11952a.f28321n;
        }
        if (m26513K(abstractC11952a.f28310c, 4096)) {
            this.f28328u = abstractC11952a.f28328u;
        }
        if (m26513K(abstractC11952a.f28310c, 8192)) {
            this.f28324q = abstractC11952a.f28324q;
            this.f28325r = 0;
            this.f28310c &= -16385;
        }
        if (m26513K(abstractC11952a.f28310c, 16384)) {
            this.f28325r = abstractC11952a.f28325r;
            this.f28324q = null;
            this.f28310c &= -8193;
        }
        if (m26513K(abstractC11952a.f28310c, 32768)) {
            this.f28330w = abstractC11952a.f28330w;
        }
        if (m26513K(abstractC11952a.f28310c, 65536)) {
            this.f28323p = abstractC11952a.f28323p;
        }
        if (m26513K(abstractC11952a.f28310c, 131072)) {
            this.f28322o = abstractC11952a.f28322o;
        }
        if (m26513K(abstractC11952a.f28310c, 2048)) {
            this.f28327t.putAll(abstractC11952a.f28327t);
            this.f28308A = abstractC11952a.f28308A;
        }
        if (m26513K(abstractC11952a.f28310c, 524288)) {
            this.f28333z = abstractC11952a.f28333z;
        }
        if (!this.f28323p) {
            this.f28327t.clear();
            int i10 = this.f28310c;
            this.f28322o = false;
            this.f28310c = i10 & (-133121);
            this.f28308A = true;
        }
        this.f28310c |= abstractC11952a.f28310c;
        this.f28326s.m18627d(abstractC11952a.f28326s);
        return m26541c0();
    }

    /* renamed from: c0 */
    public final AbstractC11952a m26541c0() {
        if (this.f28329v) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m26540b0();
    }

    /* renamed from: d */
    public AbstractC11952a m26542d() {
        if (this.f28329v && !this.f28331x) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f28331x = true;
        return m26528P();
    }

    /* renamed from: d0 */
    public AbstractC11952a m26543d0(C9437d c9437d, Object obj) {
        if (this.f28331x) {
            return clone().m26543d0(c9437d, obj);
        }
        AbstractC8909j.m17468d(c9437d);
        AbstractC8909j.m17468d(obj);
        this.f28326s.m18629f(c9437d, obj);
        return m26541c0();
    }

    /* renamed from: e */
    public AbstractC11952a m26544e() {
        return m26552i0(DownsampleStrategy.f4931e, new C10701j());
    }

    /* renamed from: e0 */
    public AbstractC11952a m26545e0(InterfaceC9435b interfaceC9435b) {
        if (this.f28331x) {
            return clone().m26545e0(interfaceC9435b);
        }
        this.f28321n = (InterfaceC9435b) AbstractC8909j.m17468d(interfaceC9435b);
        this.f28310c |= 1024;
        return m26541c0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC11952a) {
            return m26519F((AbstractC11952a) obj);
        }
        return false;
    }

    @Override // 
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC11952a clone() {
        try {
            AbstractC11952a abstractC11952a = (AbstractC11952a) super.clone();
            C9438e c9438e = new C9438e();
            abstractC11952a.f28326s = c9438e;
            c9438e.m18627d(this.f28326s);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC11952a.f28327t = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f28327t);
            abstractC11952a.f28329v = false;
            abstractC11952a.f28331x = false;
            return abstractC11952a;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: f0 */
    public AbstractC11952a m26546f0(float f10) {
        if (this.f28331x) {
            return clone().m26546f0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f28311d = f10;
        this.f28310c |= 2;
        return m26541c0();
    }

    /* renamed from: g */
    public AbstractC11952a m26547g(Class cls) {
        if (this.f28331x) {
            return clone().m26547g(cls);
        }
        this.f28328u = (Class) AbstractC8909j.m17468d(cls);
        this.f28310c |= 4096;
        return m26541c0();
    }

    /* renamed from: g0 */
    public AbstractC11952a m26548g0(boolean z10) {
        if (this.f28331x) {
            return clone().m26548g0(true);
        }
        this.f28318k = !z10;
        this.f28310c |= 256;
        return m26541c0();
    }

    /* renamed from: h */
    public AbstractC11952a m26549h(AbstractC9650c abstractC9650c) {
        if (this.f28331x) {
            return clone().m26549h(abstractC9650c);
        }
        this.f28312e = (AbstractC9650c) AbstractC8909j.m17468d(abstractC9650c);
        this.f28310c |= 4;
        return m26541c0();
    }

    /* renamed from: h0 */
    public AbstractC11952a m26550h0(Resources.Theme theme) {
        if (this.f28331x) {
            return clone().m26550h0(theme);
        }
        this.f28330w = theme;
        if (theme != null) {
            this.f28310c |= 32768;
            return m26543d0(C11032k.f26606b, theme);
        }
        this.f28310c &= -32769;
        return m26537Y(C11032k.f26606b);
    }

    public int hashCode() {
        return AbstractC8910k.m17485p(this.f28330w, AbstractC8910k.m17485p(this.f28321n, AbstractC8910k.m17485p(this.f28328u, AbstractC8910k.m17485p(this.f28327t, AbstractC8910k.m17485p(this.f28326s, AbstractC8910k.m17485p(this.f28313f, AbstractC8910k.m17485p(this.f28312e, AbstractC8910k.m17486q(this.f28333z, AbstractC8910k.m17486q(this.f28332y, AbstractC8910k.m17486q(this.f28323p, AbstractC8910k.m17486q(this.f28322o, AbstractC8910k.m17484o(this.f28320m, AbstractC8910k.m17484o(this.f28319l, AbstractC8910k.m17486q(this.f28318k, AbstractC8910k.m17485p(this.f28324q, AbstractC8910k.m17484o(this.f28325r, AbstractC8910k.m17485p(this.f28316i, AbstractC8910k.m17484o(this.f28317j, AbstractC8910k.m17485p(this.f28314g, AbstractC8910k.m17484o(this.f28315h, AbstractC8910k.m17481l(this.f28311d)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC11952a m26551i(DownsampleStrategy downsampleStrategy) {
        return m26543d0(DownsampleStrategy.f4934h, AbstractC8909j.m17468d(downsampleStrategy));
    }

    /* renamed from: i0 */
    public final AbstractC11952a m26552i0(DownsampleStrategy downsampleStrategy, InterfaceC9441h interfaceC9441h) {
        if (this.f28331x) {
            return clone().m26552i0(downsampleStrategy, interfaceC9441h);
        }
        m26551i(downsampleStrategy);
        return m26554j0(interfaceC9441h);
    }

    /* renamed from: j */
    public AbstractC11952a m26553j(int i10) {
        if (this.f28331x) {
            return clone().m26553j(i10);
        }
        this.f28315h = i10;
        int i11 = this.f28310c | 32;
        this.f28314g = null;
        this.f28310c = i11 & (-17);
        return m26541c0();
    }

    /* renamed from: j0 */
    public AbstractC11952a m26554j0(InterfaceC9441h interfaceC9441h) {
        return m26556k0(interfaceC9441h, true);
    }

    /* renamed from: k */
    public AbstractC11952a m26555k() {
        return m26538Z(DownsampleStrategy.f4929c, new C10709r());
    }

    /* renamed from: k0 */
    public AbstractC11952a m26556k0(InterfaceC9441h interfaceC9441h, boolean z10) {
        if (this.f28331x) {
            return clone().m26556k0(interfaceC9441h, z10);
        }
        C10707p c10707p = new C10707p(interfaceC9441h, z10);
        m26558l0(Bitmap.class, interfaceC9441h, z10);
        m26558l0(Drawable.class, c10707p, z10);
        m26558l0(BitmapDrawable.class, c10707p.m22671c(), z10);
        m26558l0(GifDrawable.class, new C11317e(interfaceC9441h), z10);
        return m26541c0();
    }

    /* renamed from: l */
    public final AbstractC9650c m26557l() {
        return this.f28312e;
    }

    /* renamed from: l0 */
    public AbstractC11952a m26558l0(Class cls, InterfaceC9441h interfaceC9441h, boolean z10) {
        if (this.f28331x) {
            return clone().m26558l0(cls, interfaceC9441h, z10);
        }
        AbstractC8909j.m17468d(cls);
        AbstractC8909j.m17468d(interfaceC9441h);
        this.f28327t.put(cls, interfaceC9441h);
        int i10 = this.f28310c;
        this.f28323p = true;
        this.f28310c = 67584 | i10;
        this.f28308A = false;
        if (z10) {
            this.f28310c = i10 | 198656;
            this.f28322o = true;
        }
        return m26541c0();
    }

    /* renamed from: m */
    public final int m26559m() {
        return this.f28315h;
    }

    /* renamed from: m0 */
    public AbstractC11952a m26560m0(InterfaceC9441h... interfaceC9441hArr) {
        return interfaceC9441hArr.length > 1 ? m26556k0(new C9436c(interfaceC9441hArr), true) : interfaceC9441hArr.length == 1 ? m26554j0(interfaceC9441hArr[0]) : m26541c0();
    }

    /* renamed from: n */
    public final Drawable m26561n() {
        return this.f28314g;
    }

    /* renamed from: n0 */
    public AbstractC11952a m26562n0(boolean z10) {
        if (this.f28331x) {
            return clone().m26562n0(z10);
        }
        this.f28309B = z10;
        this.f28310c |= 1048576;
        return m26541c0();
    }

    /* renamed from: o */
    public final Drawable m26563o() {
        return this.f28324q;
    }

    /* renamed from: p */
    public final int m26564p() {
        return this.f28325r;
    }

    /* renamed from: q */
    public final boolean m26565q() {
        return this.f28333z;
    }

    /* renamed from: r */
    public final C9438e m26566r() {
        return this.f28326s;
    }

    /* renamed from: s */
    public final int m26567s() {
        return this.f28319l;
    }

    /* renamed from: t */
    public final int m26568t() {
        return this.f28320m;
    }

    /* renamed from: u */
    public final Drawable m26569u() {
        return this.f28316i;
    }

    /* renamed from: v */
    public final int m26570v() {
        return this.f28317j;
    }

    /* renamed from: w */
    public final Priority m26571w() {
        return this.f28313f;
    }

    /* renamed from: x */
    public final Class m26572x() {
        return this.f28328u;
    }

    /* renamed from: y */
    public final InterfaceC9435b m26573y() {
        return this.f28321n;
    }

    /* renamed from: z */
    public final float m26574z() {
        return this.f28311d;
    }

    /* renamed from: b0 */
    public final AbstractC11952a m26540b0() {
        return this;
    }
}
