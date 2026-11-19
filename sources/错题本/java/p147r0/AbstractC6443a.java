package p147r0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.Map;
import p016b0.AbstractC3085o;
import p077i0.AbstractC5648d;
import p077i0.C5655k;
import p077i0.C5660p;
import p111m0.C6079b;
import p172u0.C6609a;
import p172u0.C6610b;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;
import p202y.C6762e;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6766i;

/* renamed from: r0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6443a implements Cloneable {

    /* renamed from: a */
    public int f10563a;

    /* renamed from: d */
    public int f10566d;

    /* renamed from: e */
    public int f10567e;

    /* renamed from: j */
    public boolean f10572j;

    /* renamed from: n */
    public boolean f10576n;

    /* renamed from: o */
    public boolean f10577o;

    /* renamed from: q */
    public boolean f10579q;

    /* renamed from: b */
    public AbstractC3085o f10564b = AbstractC3085o.f1482d;

    /* renamed from: c */
    public Priority f10565c = Priority.NORMAL;

    /* renamed from: f */
    public boolean f10568f = true;

    /* renamed from: g */
    public int f10569g = -1;

    /* renamed from: h */
    public int f10570h = -1;

    /* renamed from: i */
    public InterfaceC6760c f10571i = C6609a.f11039b;

    /* renamed from: k */
    public C6763f f10573k = new C6763f();

    /* renamed from: l */
    public CachedHashCodeArrayMap f10574l = new CachedHashCodeArrayMap();

    /* renamed from: m */
    public Class f10575m = Object.class;

    /* renamed from: p */
    public boolean f10578p = true;

    /* renamed from: i */
    public static boolean m6084i(int i, int i8) {
        return (i & i8) != 0;
    }

    /* renamed from: c */
    public AbstractC6443a mo2374c(AbstractC6443a abstractC6443a) {
        if (this.f10577o) {
            return clone().mo2374c(abstractC6443a);
        }
        int i = abstractC6443a.f10563a;
        if (m6084i(abstractC6443a.f10563a, 1048576)) {
            this.f10579q = abstractC6443a.f10579q;
        }
        if (m6084i(abstractC6443a.f10563a, 4)) {
            this.f10564b = abstractC6443a.f10564b;
        }
        if (m6084i(abstractC6443a.f10563a, 8)) {
            this.f10565c = abstractC6443a.f10565c;
        }
        if (m6084i(abstractC6443a.f10563a, 16)) {
            this.f10566d = 0;
            this.f10563a &= -33;
        }
        if (m6084i(abstractC6443a.f10563a, 32)) {
            this.f10566d = abstractC6443a.f10566d;
            this.f10563a &= -17;
        }
        if (m6084i(abstractC6443a.f10563a, 64)) {
            this.f10567e = 0;
            this.f10563a &= -129;
        }
        if (m6084i(abstractC6443a.f10563a, 128)) {
            this.f10567e = abstractC6443a.f10567e;
            this.f10563a &= -65;
        }
        if (m6084i(abstractC6443a.f10563a, 256)) {
            this.f10568f = abstractC6443a.f10568f;
        }
        if (m6084i(abstractC6443a.f10563a, 512)) {
            this.f10570h = abstractC6443a.f10570h;
            this.f10569g = abstractC6443a.f10569g;
        }
        if (m6084i(abstractC6443a.f10563a, 1024)) {
            this.f10571i = abstractC6443a.f10571i;
        }
        if (m6084i(abstractC6443a.f10563a, 4096)) {
            this.f10575m = abstractC6443a.f10575m;
        }
        if (m6084i(abstractC6443a.f10563a, 8192)) {
            this.f10563a &= -16385;
        }
        if (m6084i(abstractC6443a.f10563a, 16384)) {
            this.f10563a &= -8193;
        }
        if (m6084i(abstractC6443a.f10563a, 131072)) {
            this.f10572j = abstractC6443a.f10572j;
        }
        if (m6084i(abstractC6443a.f10563a, 2048)) {
            this.f10574l.putAll((Map) abstractC6443a.f10574l);
            this.f10578p = abstractC6443a.f10578p;
        }
        this.f10563a |= abstractC6443a.f10563a;
        this.f10573k.f11435b.putAll((SimpleArrayMap) abstractC6443a.f10573k.f11435b);
        m6093o();
        return this;
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC6443a clone() {
        try {
            AbstractC6443a abstractC6443a = (AbstractC6443a) super.clone();
            C6763f c6763f = new C6763f();
            abstractC6443a.f10573k = c6763f;
            c6763f.f11435b.putAll((SimpleArrayMap) this.f10573k.f11435b);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            abstractC6443a.f10574l = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll((Map) this.f10574l);
            abstractC6443a.f10576n = false;
            abstractC6443a.f10577o = false;
            return abstractC6443a;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC6443a)) {
            return false;
        }
        AbstractC6443a abstractC6443a = (AbstractC6443a) obj;
        abstractC6443a.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f10566d != abstractC6443a.f10566d) {
            return false;
        }
        char[] cArr = AbstractC6664k.f11243a;
        return this.f10567e == abstractC6443a.f10567e && this.f10568f == abstractC6443a.f10568f && this.f10569g == abstractC6443a.f10569g && this.f10570h == abstractC6443a.f10570h && this.f10572j == abstractC6443a.f10572j && this.f10564b.equals(abstractC6443a.f10564b) && this.f10565c == abstractC6443a.f10565c && this.f10573k.equals(abstractC6443a.f10573k) && this.f10574l.equals(abstractC6443a.f10574l) && this.f10575m.equals(abstractC6443a.f10575m) && this.f10571i.equals(abstractC6443a.f10571i);
    }

    /* renamed from: f */
    public final AbstractC6443a m6085f(Class cls) {
        if (this.f10577o) {
            return clone().m6085f(cls);
        }
        this.f10575m = cls;
        this.f10563a |= 4096;
        m6093o();
        return this;
    }

    /* renamed from: g */
    public final AbstractC6443a m6086g(AbstractC3085o abstractC3085o) {
        if (this.f10577o) {
            return clone().m6086g(abstractC3085o);
        }
        this.f10564b = abstractC3085o;
        this.f10563a |= 4;
        m6093o();
        return this;
    }

    /* renamed from: h */
    public final AbstractC6443a m6087h(int i) {
        if (this.f10577o) {
            return clone().m6087h(i);
        }
        this.f10566d = i;
        this.f10563a = (this.f10563a | 32) & (-17);
        m6093o();
        return this;
    }

    public final int hashCode() {
        char[] cArr = AbstractC6664k.f11243a;
        return AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6326f(AbstractC6664k.m6325e(0, AbstractC6664k.m6325e(0, AbstractC6664k.m6325e(1, AbstractC6664k.m6325e(this.f10572j ? 1 : 0, AbstractC6664k.m6325e(this.f10570h, AbstractC6664k.m6325e(this.f10569g, AbstractC6664k.m6325e(this.f10568f ? 1 : 0, AbstractC6664k.m6326f(AbstractC6664k.m6325e(0, AbstractC6664k.m6326f(AbstractC6664k.m6325e(this.f10567e, AbstractC6664k.m6326f(AbstractC6664k.m6325e(this.f10566d, AbstractC6664k.m6325e(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f10564b), this.f10565c), this.f10573k), this.f10574l), this.f10575m), this.f10571i), null);
    }

    /* renamed from: j */
    public final AbstractC6443a m6088j(C5655k c5655k, AbstractC5648d abstractC5648d) {
        if (this.f10577o) {
            return clone().m6088j(c5655k, abstractC5648d);
        }
        m6094p(C5655k.f8799g, c5655k);
        return m6099u(abstractC5648d, false);
    }

    /* renamed from: k */
    public final AbstractC6443a m6089k(int i, int i8) {
        if (this.f10577o) {
            return clone().m6089k(i, i8);
        }
        this.f10570h = i;
        this.f10569g = i8;
        this.f10563a |= 512;
        m6093o();
        return this;
    }

    /* renamed from: l */
    public final AbstractC6443a m6090l(int i) {
        if (this.f10577o) {
            return clone().m6090l(i);
        }
        this.f10567e = i;
        this.f10563a = (this.f10563a | 128) & (-65);
        m6093o();
        return this;
    }

    /* renamed from: m */
    public final AbstractC6443a m6091m(Priority priority) {
        if (this.f10577o) {
            return clone().m6091m(priority);
        }
        AbstractC6675d.m6344f(priority, "Argument must not be null");
        this.f10565c = priority;
        this.f10563a |= 8;
        m6093o();
        return this;
    }

    /* renamed from: n */
    public final AbstractC6443a m6092n(C5655k c5655k, AbstractC5648d abstractC5648d, boolean z8) {
        AbstractC6443a abstractC6443aM6097s = z8 ? m6097s(c5655k, abstractC5648d) : m6088j(c5655k, abstractC5648d);
        abstractC6443aM6097s.f10578p = true;
        return abstractC6443aM6097s;
    }

    /* renamed from: o */
    public final void m6093o() {
        if (this.f10576n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* renamed from: p */
    public final AbstractC6443a m6094p(C6762e c6762e, Object obj) {
        if (this.f10577o) {
            return clone().m6094p(c6762e, obj);
        }
        AbstractC6675d.m6343e(c6762e);
        this.f10573k.f11435b.put(c6762e, obj);
        m6093o();
        return this;
    }

    /* renamed from: q */
    public final AbstractC6443a m6095q(C6610b c6610b) {
        if (this.f10577o) {
            return clone().m6095q(c6610b);
        }
        this.f10571i = c6610b;
        this.f10563a |= 1024;
        m6093o();
        return this;
    }

    /* renamed from: r */
    public final AbstractC6443a m6096r() {
        if (this.f10577o) {
            return clone().m6096r();
        }
        this.f10568f = false;
        this.f10563a |= 256;
        m6093o();
        return this;
    }

    /* renamed from: s */
    public final AbstractC6443a m6097s(C5655k c5655k, AbstractC5648d abstractC5648d) {
        if (this.f10577o) {
            return clone().m6097s(c5655k, abstractC5648d);
        }
        m6094p(C5655k.f8799g, c5655k);
        return m6099u(abstractC5648d, true);
    }

    /* renamed from: t */
    public final AbstractC6443a m6098t(Class cls, InterfaceC6766i interfaceC6766i, boolean z8) {
        if (this.f10577o) {
            return clone().m6098t(cls, interfaceC6766i, z8);
        }
        AbstractC6675d.m6343e(interfaceC6766i);
        this.f10574l.put(cls, interfaceC6766i);
        int i = this.f10563a;
        this.f10563a = 67584 | i;
        this.f10578p = false;
        if (z8) {
            this.f10563a = i | 198656;
            this.f10572j = true;
        }
        m6093o();
        return this;
    }

    /* renamed from: u */
    public final AbstractC6443a m6099u(InterfaceC6766i interfaceC6766i, boolean z8) {
        if (this.f10577o) {
            return clone().m6099u(interfaceC6766i, z8);
        }
        C5660p c5660p = new C5660p(interfaceC6766i, z8);
        m6098t(Bitmap.class, interfaceC6766i, z8);
        m6098t(Drawable.class, c5660p, z8);
        m6098t(BitmapDrawable.class, c5660p, z8);
        m6098t(GifDrawable.class, new C6079b(interfaceC6766i), z8);
        m6093o();
        return this;
    }

    /* renamed from: v */
    public final AbstractC6443a m6100v() {
        if (this.f10577o) {
            return clone().m6100v();
        }
        this.f10579q = true;
        this.f10563a |= 1048576;
        m6093o();
        return this;
    }
}
