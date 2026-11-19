package p016c0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p057f0.C3730a;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p076j.C3793c;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p076j.InterfaceC3797g;
import p093m.AbstractC4354c;
import p122t.C4564j;
import p122t.C4565k;
import p122t.C4566l;
import p122t.C4573s;
import p122t.C4575u;
import p138x.C4653e;

/* renamed from: c0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2750a implements Cloneable {

    /* renamed from: a */
    public int f495a;

    /* renamed from: e */
    public Drawable f499e;

    /* renamed from: f */
    public int f500f;

    /* renamed from: g */
    public Drawable f501g;

    /* renamed from: h */
    public int f502h;

    /* renamed from: m */
    public boolean f507m;

    /* renamed from: o */
    public Drawable f509o;

    /* renamed from: p */
    public int f510p;

    /* renamed from: t */
    public boolean f514t;

    /* renamed from: u */
    public Resources.Theme f515u;

    /* renamed from: v */
    public boolean f516v;

    /* renamed from: w */
    public boolean f517w;

    /* renamed from: x */
    public boolean f518x;

    /* renamed from: z */
    public boolean f520z;

    /* renamed from: b */
    public float f496b = 1.0f;

    /* renamed from: c */
    public AbstractC4354c f497c = AbstractC4354c.f4869e;

    /* renamed from: d */
    public Priority f498d = Priority.NORMAL;

    /* renamed from: i */
    public boolean f503i = true;

    /* renamed from: j */
    public int f504j = -1;

    /* renamed from: k */
    public int f505k = -1;

    /* renamed from: l */
    public InterfaceC3792b f506l = C3730a.m4728c();

    /* renamed from: n */
    public boolean f508n = true;

    /* renamed from: q */
    public C3794d f511q = new C3794d();

    /* renamed from: r */
    public Map f512r = new CachedHashCodeArrayMap();

    /* renamed from: s */
    public Class f513s = Object.class;

    /* renamed from: y */
    public boolean f519y = true;

    /* renamed from: H */
    public static boolean m1556H(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    /* renamed from: A */
    public final Map m1557A() {
        return this.f512r;
    }

    /* renamed from: B */
    public final boolean m1558B() {
        return this.f520z;
    }

    /* renamed from: C */
    public final boolean m1559C() {
        return this.f517w;
    }

    /* renamed from: D */
    public final boolean m1560D() {
        return this.f503i;
    }

    /* renamed from: E */
    public final boolean m1561E() {
        return m1563G(8);
    }

    /* renamed from: F */
    public boolean m1562F() {
        return this.f519y;
    }

    /* renamed from: G */
    public final boolean m1563G(int i4) {
        return m1556H(this.f495a, i4);
    }

    /* renamed from: I */
    public final boolean m1564I() {
        return this.f508n;
    }

    /* renamed from: J */
    public final boolean m1565J() {
        return this.f507m;
    }

    /* renamed from: K */
    public final boolean m1566K() {
        return m1563G(2048);
    }

    /* renamed from: L */
    public final boolean m1567L() {
        return AbstractC3750j.m4787r(this.f505k, this.f504j);
    }

    /* renamed from: M */
    public AbstractC2750a m1568M() {
        this.f514t = true;
        return m1578Z();
    }

    /* renamed from: N */
    public AbstractC2750a m1569N() {
        return m1573R(DownsampleStrategy.f870e, new C4564j());
    }

    /* renamed from: O */
    public AbstractC2750a m1570O() {
        return m1572Q(DownsampleStrategy.f869d, new C4565k());
    }

    /* renamed from: P */
    public AbstractC2750a m1571P() {
        return m1572Q(DownsampleStrategy.f868c, new C4575u());
    }

    /* renamed from: Q */
    public final AbstractC2750a m1572Q(DownsampleStrategy downsampleStrategy, InterfaceC3797g interfaceC3797g) {
        return m1577Y(downsampleStrategy, interfaceC3797g, false);
    }

    /* renamed from: R */
    public final AbstractC2750a m1573R(DownsampleStrategy downsampleStrategy, InterfaceC3797g interfaceC3797g) {
        if (this.f516v) {
            return mo1588f().m1573R(downsampleStrategy, interfaceC3797g);
        }
        m1594i(downsampleStrategy);
        return m1593h0(interfaceC3797g, false);
    }

    /* renamed from: V */
    public AbstractC2750a m1574V(int i4, int i5) {
        if (this.f516v) {
            return mo1588f().m1574V(i4, i5);
        }
        this.f505k = i4;
        this.f504j = i5;
        this.f495a |= 512;
        return m1580a0();
    }

    /* renamed from: W */
    public AbstractC2750a m1575W(int i4) {
        if (this.f516v) {
            return mo1588f().m1575W(i4);
        }
        this.f502h = i4;
        int i5 = this.f495a | 128;
        this.f501g = null;
        this.f495a = i5 & (-65);
        return m1580a0();
    }

    /* renamed from: X */
    public AbstractC2750a m1576X(Priority priority) {
        if (this.f516v) {
            return mo1588f().m1576X(priority);
        }
        this.f498d = (Priority) AbstractC3749i.m4768d(priority);
        this.f495a |= 8;
        return m1580a0();
    }

    /* renamed from: Y */
    public final AbstractC2750a m1577Y(DownsampleStrategy downsampleStrategy, InterfaceC3797g interfaceC3797g, boolean z3) {
        AbstractC2750a abstractC2750aM1589f0 = z3 ? m1589f0(downsampleStrategy, interfaceC3797g) : m1573R(downsampleStrategy, interfaceC3797g);
        abstractC2750aM1589f0.f519y = true;
        return abstractC2750aM1589f0;
    }

    /* renamed from: Z */
    public final AbstractC2750a m1578Z() {
        return this;
    }

    /* renamed from: a */
    public AbstractC2750a mo1579a(AbstractC2750a abstractC2750a) {
        if (this.f516v) {
            return mo1588f().mo1579a(abstractC2750a);
        }
        if (m1556H(abstractC2750a.f495a, 2)) {
            this.f496b = abstractC2750a.f496b;
        }
        if (m1556H(abstractC2750a.f495a, 262144)) {
            this.f517w = abstractC2750a.f517w;
        }
        if (m1556H(abstractC2750a.f495a, 1048576)) {
            this.f520z = abstractC2750a.f520z;
        }
        if (m1556H(abstractC2750a.f495a, 4)) {
            this.f497c = abstractC2750a.f497c;
        }
        if (m1556H(abstractC2750a.f495a, 8)) {
            this.f498d = abstractC2750a.f498d;
        }
        if (m1556H(abstractC2750a.f495a, 16)) {
            this.f499e = abstractC2750a.f499e;
            this.f500f = 0;
            this.f495a &= -33;
        }
        if (m1556H(abstractC2750a.f495a, 32)) {
            this.f500f = abstractC2750a.f500f;
            this.f499e = null;
            this.f495a &= -17;
        }
        if (m1556H(abstractC2750a.f495a, 64)) {
            this.f501g = abstractC2750a.f501g;
            this.f502h = 0;
            this.f495a &= -129;
        }
        if (m1556H(abstractC2750a.f495a, 128)) {
            this.f502h = abstractC2750a.f502h;
            this.f501g = null;
            this.f495a &= -65;
        }
        if (m1556H(abstractC2750a.f495a, 256)) {
            this.f503i = abstractC2750a.f503i;
        }
        if (m1556H(abstractC2750a.f495a, 512)) {
            this.f505k = abstractC2750a.f505k;
            this.f504j = abstractC2750a.f504j;
        }
        if (m1556H(abstractC2750a.f495a, 1024)) {
            this.f506l = abstractC2750a.f506l;
        }
        if (m1556H(abstractC2750a.f495a, 4096)) {
            this.f513s = abstractC2750a.f513s;
        }
        if (m1556H(abstractC2750a.f495a, 8192)) {
            this.f509o = abstractC2750a.f509o;
            this.f510p = 0;
            this.f495a &= -16385;
        }
        if (m1556H(abstractC2750a.f495a, 16384)) {
            this.f510p = abstractC2750a.f510p;
            this.f509o = null;
            this.f495a &= -8193;
        }
        if (m1556H(abstractC2750a.f495a, 32768)) {
            this.f515u = abstractC2750a.f515u;
        }
        if (m1556H(abstractC2750a.f495a, 65536)) {
            this.f508n = abstractC2750a.f508n;
        }
        if (m1556H(abstractC2750a.f495a, 131072)) {
            this.f507m = abstractC2750a.f507m;
        }
        if (m1556H(abstractC2750a.f495a, 2048)) {
            this.f512r.putAll(abstractC2750a.f512r);
            this.f519y = abstractC2750a.f519y;
        }
        if (m1556H(abstractC2750a.f495a, 524288)) {
            this.f518x = abstractC2750a.f518x;
        }
        if (!this.f508n) {
            this.f512r.clear();
            int i4 = this.f495a & (-2049);
            this.f507m = false;
            this.f495a = i4 & (-131073);
            this.f519y = true;
        }
        this.f495a |= abstractC2750a.f495a;
        this.f511q.m4952d(abstractC2750a.f511q);
        return m1580a0();
    }

    /* renamed from: a0 */
    public final AbstractC2750a m1580a0() {
        if (this.f514t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m1578Z();
    }

    /* renamed from: b0 */
    public AbstractC2750a m1581b0(C3793c c3793c, Object obj) {
        if (this.f516v) {
            return mo1588f().m1581b0(c3793c, obj);
        }
        AbstractC3749i.m4768d(c3793c);
        AbstractC3749i.m4768d(obj);
        this.f511q.m4953e(c3793c, obj);
        return m1580a0();
    }

    /* renamed from: c */
    public AbstractC2750a m1582c() {
        if (this.f514t && !this.f516v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f516v = true;
        return m1568M();
    }

    /* renamed from: c0 */
    public AbstractC2750a m1583c0(InterfaceC3792b interfaceC3792b) {
        if (this.f516v) {
            return mo1588f().m1583c0(interfaceC3792b);
        }
        this.f506l = (InterfaceC3792b) AbstractC3749i.m4768d(interfaceC3792b);
        this.f495a |= 1024;
        return m1580a0();
    }

    /* renamed from: d */
    public AbstractC2750a m1584d() {
        return m1589f0(DownsampleStrategy.f870e, new C4564j());
    }

    /* renamed from: d0 */
    public AbstractC2750a m1585d0(float f4) {
        if (this.f516v) {
            return mo1588f().m1585d0(f4);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f496b = f4;
        this.f495a |= 2;
        return m1580a0();
    }

    /* renamed from: e */
    public AbstractC2750a m1586e() {
        return m1589f0(DownsampleStrategy.f869d, new C4566l());
    }

    /* renamed from: e0 */
    public AbstractC2750a m1587e0(boolean z3) {
        if (this.f516v) {
            return mo1588f().m1587e0(true);
        }
        this.f503i = !z3;
        this.f495a |= 256;
        return m1580a0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2750a)) {
            return false;
        }
        AbstractC2750a abstractC2750a = (AbstractC2750a) obj;
        return Float.compare(abstractC2750a.f496b, this.f496b) == 0 && this.f500f == abstractC2750a.f500f && AbstractC3750j.m4772c(this.f499e, abstractC2750a.f499e) && this.f502h == abstractC2750a.f502h && AbstractC3750j.m4772c(this.f501g, abstractC2750a.f501g) && this.f510p == abstractC2750a.f510p && AbstractC3750j.m4772c(this.f509o, abstractC2750a.f509o) && this.f503i == abstractC2750a.f503i && this.f504j == abstractC2750a.f504j && this.f505k == abstractC2750a.f505k && this.f507m == abstractC2750a.f507m && this.f508n == abstractC2750a.f508n && this.f517w == abstractC2750a.f517w && this.f518x == abstractC2750a.f518x && this.f497c.equals(abstractC2750a.f497c) && this.f498d == abstractC2750a.f498d && this.f511q.equals(abstractC2750a.f511q) && this.f512r.equals(abstractC2750a.f512r) && this.f513s.equals(abstractC2750a.f513s) && AbstractC3750j.m4772c(this.f506l, abstractC2750a.f506l) && AbstractC3750j.m4772c(this.f515u, abstractC2750a.f515u);
    }

    @Override // 
    /* renamed from: f */
    public AbstractC2750a mo1588f() {
        try {
            AbstractC2750a abstractC2750a = (AbstractC2750a) super.clone();
            C3794d c3794d = new C3794d();
            abstractC2750a.f511q = c3794d;
            c3794d.m4952d(this.f511q);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC2750a.f512r = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f512r);
            abstractC2750a.f514t = false;
            abstractC2750a.f516v = false;
            return abstractC2750a;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: f0 */
    public final AbstractC2750a m1589f0(DownsampleStrategy downsampleStrategy, InterfaceC3797g interfaceC3797g) {
        if (this.f516v) {
            return mo1588f().m1589f0(downsampleStrategy, interfaceC3797g);
        }
        m1594i(downsampleStrategy);
        return m1591g0(interfaceC3797g);
    }

    /* renamed from: g */
    public AbstractC2750a m1590g(Class cls) {
        if (this.f516v) {
            return mo1588f().m1590g(cls);
        }
        this.f513s = (Class) AbstractC3749i.m4768d(cls);
        this.f495a |= 4096;
        return m1580a0();
    }

    /* renamed from: g0 */
    public AbstractC2750a m1591g0(InterfaceC3797g interfaceC3797g) {
        return m1593h0(interfaceC3797g, true);
    }

    /* renamed from: h */
    public AbstractC2750a m1592h(AbstractC4354c abstractC4354c) {
        if (this.f516v) {
            return mo1588f().m1592h(abstractC4354c);
        }
        this.f497c = (AbstractC4354c) AbstractC3749i.m4768d(abstractC4354c);
        this.f495a |= 4;
        return m1580a0();
    }

    /* renamed from: h0 */
    public AbstractC2750a m1593h0(InterfaceC3797g interfaceC3797g, boolean z3) {
        if (this.f516v) {
            return mo1588f().m1593h0(interfaceC3797g, z3);
        }
        C4573s c4573s = new C4573s(interfaceC3797g, z3);
        m1595i0(Bitmap.class, interfaceC3797g, z3);
        m1595i0(Drawable.class, c4573s, z3);
        m1595i0(BitmapDrawable.class, c4573s.m6295c(), z3);
        m1595i0(GifDrawable.class, new C4653e(interfaceC3797g), z3);
        return m1580a0();
    }

    public int hashCode() {
        return AbstractC3750j.m4782m(this.f515u, AbstractC3750j.m4782m(this.f506l, AbstractC3750j.m4782m(this.f513s, AbstractC3750j.m4782m(this.f512r, AbstractC3750j.m4782m(this.f511q, AbstractC3750j.m4782m(this.f498d, AbstractC3750j.m4782m(this.f497c, AbstractC3750j.m4783n(this.f518x, AbstractC3750j.m4783n(this.f517w, AbstractC3750j.m4783n(this.f508n, AbstractC3750j.m4783n(this.f507m, AbstractC3750j.m4781l(this.f505k, AbstractC3750j.m4781l(this.f504j, AbstractC3750j.m4783n(this.f503i, AbstractC3750j.m4782m(this.f509o, AbstractC3750j.m4781l(this.f510p, AbstractC3750j.m4782m(this.f501g, AbstractC3750j.m4781l(this.f502h, AbstractC3750j.m4782m(this.f499e, AbstractC3750j.m4781l(this.f500f, AbstractC3750j.m4779j(this.f496b)))))))))))))))))))));
    }

    /* renamed from: i */
    public AbstractC2750a m1594i(DownsampleStrategy downsampleStrategy) {
        return m1581b0(DownsampleStrategy.f873h, AbstractC3749i.m4768d(downsampleStrategy));
    }

    /* renamed from: i0 */
    public AbstractC2750a m1595i0(Class cls, InterfaceC3797g interfaceC3797g, boolean z3) {
        if (this.f516v) {
            return mo1588f().m1595i0(cls, interfaceC3797g, z3);
        }
        AbstractC3749i.m4768d(cls);
        AbstractC3749i.m4768d(interfaceC3797g);
        this.f512r.put(cls, interfaceC3797g);
        int i4 = this.f495a | 2048;
        this.f508n = true;
        int i5 = i4 | 65536;
        this.f495a = i5;
        this.f519y = false;
        if (z3) {
            this.f495a = i5 | 131072;
            this.f507m = true;
        }
        return m1580a0();
    }

    /* renamed from: j */
    public AbstractC2750a m1596j(int i4) {
        if (this.f516v) {
            return mo1588f().m1596j(i4);
        }
        this.f500f = i4;
        int i5 = this.f495a | 32;
        this.f499e = null;
        this.f495a = i5 & (-17);
        return m1580a0();
    }

    /* renamed from: j0 */
    public AbstractC2750a m1597j0(boolean z3) {
        if (this.f516v) {
            return mo1588f().m1597j0(z3);
        }
        this.f520z = z3;
        this.f495a |= 1048576;
        return m1580a0();
    }

    /* renamed from: k */
    public final AbstractC4354c m1598k() {
        return this.f497c;
    }

    /* renamed from: l */
    public final int m1599l() {
        return this.f500f;
    }

    /* renamed from: m */
    public final Drawable m1600m() {
        return this.f499e;
    }

    /* renamed from: n */
    public final Drawable m1601n() {
        return this.f509o;
    }

    /* renamed from: o */
    public final int m1602o() {
        return this.f510p;
    }

    /* renamed from: p */
    public final boolean m1603p() {
        return this.f518x;
    }

    /* renamed from: q */
    public final C3794d m1604q() {
        return this.f511q;
    }

    /* renamed from: r */
    public final int m1605r() {
        return this.f504j;
    }

    /* renamed from: s */
    public final int m1606s() {
        return this.f505k;
    }

    /* renamed from: t */
    public final Drawable m1607t() {
        return this.f501g;
    }

    /* renamed from: u */
    public final int m1608u() {
        return this.f502h;
    }

    /* renamed from: v */
    public final Priority m1609v() {
        return this.f498d;
    }

    /* renamed from: w */
    public final Class m1610w() {
        return this.f513s;
    }

    /* renamed from: x */
    public final InterfaceC3792b m1611x() {
        return this.f506l;
    }

    /* renamed from: y */
    public final float m1612y() {
        return this.f496b;
    }

    /* renamed from: z */
    public final Resources.Theme m1613z() {
        return this.f515u;
    }
}
