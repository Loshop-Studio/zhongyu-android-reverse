package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p070b.p074b.p105b.AbstractC0773n;
import p070b.p074b.p105b.C0770k;
import p070b.p074b.p105b.C0775p;
import p070b.p074b.p105b.C0776q;
import p070b.p074b.p105b.C0778s;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.f */
/* loaded from: classes.dex */
public final class C0741f extends C0761c {

    /* renamed from: n */
    public static final Writer f4276n = new a();

    /* renamed from: o */
    public static final C0778s f4277o = new C0778s("closed");

    /* renamed from: k */
    public final List<AbstractC0773n> f4278k;

    /* renamed from: l */
    public String f4279l;

    /* renamed from: m */
    public AbstractC0773n f4280m;

    /* renamed from: b.b.b.a0.z.f$a */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C0741f() {
        super(f4276n);
        this.f4278k = new ArrayList();
        this.f4280m = C0775p.f4442a;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: b */
    public C0761c mo2404b() {
        C0770k c0770k = new C0770k();
        m2416t(c0770k);
        this.f4278k.add(c0770k);
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: c */
    public C0761c mo2405c() {
        C0776q c0776q = new C0776q();
        m2416t(c0776q);
        this.f4278k.add(c0776q);
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f4278k.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f4278k.add(f4277o);
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: e */
    public C0761c mo2406e() {
        if (this.f4278k.isEmpty() || this.f4279l != null) {
            throw new IllegalStateException();
        }
        if (!(m2415s() instanceof C0770k)) {
            throw new IllegalStateException();
        }
        this.f4278k.remove(r0.size() - 1);
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: f */
    public C0761c mo2407f() {
        if (this.f4278k.isEmpty() || this.f4279l != null) {
            throw new IllegalStateException();
        }
        if (!(m2415s() instanceof C0776q)) {
            throw new IllegalStateException();
        }
        this.f4278k.remove(r0.size() - 1);
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c, java.io.Flushable
    public void flush() {
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: g */
    public C0761c mo2408g(String str) {
        if (this.f4278k.isEmpty() || this.f4279l != null) {
            throw new IllegalStateException();
        }
        if (!(m2415s() instanceof C0776q)) {
            throw new IllegalStateException();
        }
        this.f4279l = str;
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: h */
    public C0761c mo2409h() {
        m2416t(C0775p.f4442a);
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: m */
    public C0761c mo2410m(long j) {
        m2416t(new C0778s(Long.valueOf(j)));
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: n */
    public C0761c mo2411n(Boolean bool) {
        if (bool == null) {
            m2416t(C0775p.f4442a);
            return this;
        }
        m2416t(new C0778s(bool));
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: o */
    public C0761c mo2412o(Number number) {
        if (number == null) {
            m2416t(C0775p.f4442a);
            return this;
        }
        if (!this.f4429f) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m2416t(new C0778s(number));
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: p */
    public C0761c mo2413p(String str) {
        if (str == null) {
            m2416t(C0775p.f4442a);
            return this;
        }
        m2416t(new C0778s(str));
        return this;
    }

    @Override // p070b.p074b.p105b.p111c0.C0761c
    /* renamed from: q */
    public C0761c mo2414q(boolean z) {
        m2416t(new C0778s(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: s */
    public final AbstractC0773n m2415s() {
        return this.f4278k.get(r0.size() - 1);
    }

    /* renamed from: t */
    public final void m2416t(AbstractC0773n abstractC0773n) {
        if (this.f4279l != null) {
            if (!(abstractC0773n instanceof C0775p) || this.f4431h) {
                C0776q c0776q = (C0776q) m2415s();
                c0776q.f4443a.put(this.f4279l, abstractC0773n);
            }
            this.f4279l = null;
            return;
        }
        if (this.f4278k.isEmpty()) {
            this.f4280m = abstractC0773n;
            return;
        }
        AbstractC0773n abstractC0773nM2415s = m2415s();
        if (!(abstractC0773nM2415s instanceof C0770k)) {
            throw new IllegalStateException();
        }
        ((C0770k) abstractC0773nM2415s).f4441b.add(abstractC0773n);
    }
}
