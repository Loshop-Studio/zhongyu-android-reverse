package kotlinx.coroutines.selects;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9154b;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p179m7.InterfaceC9324c;
import p191n8.AbstractC9436a0;
import p224q8.InterfaceC9846b;
import p224q8.InterfaceC9847c;
import p224q8.InterfaceC9849e;
import p224q8.InterfaceC9854j;
import p224q8.InterfaceC9855k;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public class SelectImplementation implements InterfaceC9154b, InterfaceC9846b, InterfaceC9855k {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18134f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* renamed from: a */
    public final InterfaceC9100d f18135a;

    /* renamed from: c */
    public Object f18137c;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f18154b;

    /* renamed from: b */
    public List f18136b = new ArrayList(2);

    /* renamed from: d */
    public int f18138d = -1;

    /* renamed from: e */
    public Object f18139e = SelectKt.f18157e;

    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    public final class C9220a {

        /* renamed from: a */
        public final Object f18140a;

        /* renamed from: b */
        public final InterfaceC10575q f18141b;

        /* renamed from: c */
        public final InterfaceC10575q f18142c;

        /* renamed from: d */
        public final Object f18143d;

        /* renamed from: e */
        public final Object f18144e;

        /* renamed from: f */
        public final InterfaceC10575q f18145f;

        /* renamed from: g */
        public Object f18146g;

        /* renamed from: h */
        public int f18147h = -1;

        public C9220a(Object obj, InterfaceC10575q interfaceC10575q, InterfaceC10575q interfaceC10575q2, Object obj2, Object obj3, InterfaceC10575q interfaceC10575q3) {
            this.f18140a = obj;
            this.f18141b = interfaceC10575q;
            this.f18142c = interfaceC10575q2;
            this.f18143d = obj2;
            this.f18144e = obj3;
            this.f18145f = interfaceC10575q3;
        }

        /* renamed from: a */
        public final InterfaceC10570l m16856a(InterfaceC9854j interfaceC9854j, Object obj) {
            InterfaceC10575q interfaceC10575q = this.f18145f;
            if (interfaceC10575q != null) {
                return (InterfaceC10570l) interfaceC10575q.invoke(interfaceC9854j, this.f18143d, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m16857b() {
            Object obj = this.f18146g;
            SelectImplementation selectImplementation = SelectImplementation.this;
            if (obj instanceof AbstractC9436a0) {
                ((AbstractC9436a0) obj).mo15890s(this.f18147h, null, selectImplementation.getContext());
                return;
            }
            InterfaceC8849k0 interfaceC8849k0 = obj instanceof InterfaceC8849k0 ? (InterfaceC8849k0) obj : null;
            if (interfaceC8849k0 != null) {
                interfaceC8849k0.dispose();
            }
        }

        /* renamed from: c */
        public final Object m16858c(Object obj, InterfaceC9324c interfaceC9324c) {
            Object obj2 = this.f18144e;
            if (this.f18143d == SelectKt.m16869i()) {
                AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((InterfaceC10570l) obj2).invoke(interfaceC9324c);
            }
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((InterfaceC10574p) obj2).invoke(obj, interfaceC9324c);
        }

        /* renamed from: d */
        public final Object m16859d(Object obj) {
            return this.f18142c.invoke(this.f18140a, this.f18143d, obj);
        }

        /* renamed from: e */
        public final boolean m16860e(SelectImplementation selectImplementation) {
            this.f18141b.invoke(this.f18140a, selectImplementation, this.f18143d);
            return selectImplementation.f18139e == SelectKt.f18157e;
        }
    }

    public SelectImplementation(InterfaceC9100d interfaceC9100d) {
        this.f18135a = interfaceC9100d;
    }

    /* renamed from: p */
    public static /* synthetic */ Object m16836p(SelectImplementation selectImplementation, InterfaceC9324c interfaceC9324c) {
        return selectImplementation.m16838t() ? selectImplementation.m16847n(interfaceC9324c) : selectImplementation.m16849q(interfaceC9324c);
    }

    /* renamed from: t */
    private final boolean m16838t() {
        return f18134f.get(this) instanceof C9220a;
    }

    /* renamed from: v */
    public static /* synthetic */ void m16839v(SelectImplementation selectImplementation, C9220a c9220a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.m16851u(c9220a, z10);
    }

    @Override // kotlinx.coroutines.InterfaceC9154b
    /* renamed from: a */
    public void mo14865a(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18134f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f18155c) {
                return;
            }
        } while (!AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, obj, SelectKt.f18156d));
        List list = this.f18136b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C9220a) it.next()).m16857b();
        }
        this.f18139e = SelectKt.f18157e;
        this.f18136b = null;
    }

    @Override // p224q8.InterfaceC9846b
    /* renamed from: b */
    public void mo16840b(InterfaceC9849e interfaceC9849e, InterfaceC10574p interfaceC10574p) {
        m16839v(this, new C9220a(interfaceC9849e.mo18373d(), interfaceC9849e.mo18370a(), interfaceC9849e.mo18372c(), null, interfaceC10574p, interfaceC9849e.mo18371b()), false, 1, null);
    }

    @Override // p135i8.InterfaceC8895z1
    /* renamed from: c */
    public void mo14938c(AbstractC9436a0 abstractC9436a0, int i10) {
        this.f18137c = abstractC9436a0;
        this.f18138d = i10;
    }

    @Override // p224q8.InterfaceC9846b
    /* renamed from: d */
    public void mo16841d(InterfaceC9847c interfaceC9847c, InterfaceC10570l interfaceC10570l) {
        m16839v(this, new C9220a(interfaceC9847c.mo18373d(), interfaceC9847c.mo18370a(), interfaceC9847c.mo18372c(), SelectKt.m16869i(), interfaceC10570l, interfaceC9847c.mo18371b()), false, 1, null);
    }

    @Override // p224q8.InterfaceC9854j
    /* renamed from: e */
    public void mo16842e(Object obj) {
        this.f18139e = obj;
    }

    @Override // p224q8.InterfaceC9854j
    /* renamed from: f */
    public boolean mo16843f(Object obj, Object obj2) {
        return m16854y(obj, obj2) == 0;
    }

    @Override // p224q8.InterfaceC9854j
    /* renamed from: g */
    public void mo16844g(InterfaceC8849k0 interfaceC8849k0) {
        this.f18137c = interfaceC8849k0;
    }

    @Override // p224q8.InterfaceC9854j
    public InterfaceC9100d getContext() {
        return this.f18135a;
    }

    /* renamed from: l */
    public final void m16845l(Object obj) {
        List list = this.f18136b;
        AbstractC9133u.m16130d(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C9220a) it.next()).f18140a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    /* renamed from: m */
    public final void m16846m(C9220a c9220a) {
        List<C9220a> list = this.f18136b;
        if (list == null) {
            return;
        }
        for (C9220a c9220a2 : list) {
            if (c9220a2 != c9220a) {
                c9220a2.m16857b();
            }
        }
        f18134f.set(this, SelectKt.f18155c);
        this.f18139e = SelectKt.f18157e;
        this.f18136b = null;
    }

    /* renamed from: n */
    public final Object m16847n(InterfaceC9324c interfaceC9324c) {
        Object obj = f18134f.get(this);
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C9220a c9220a = (C9220a) obj;
        Object obj2 = this.f18139e;
        m16846m(c9220a);
        return c9220a.m16858c(c9220a.m16859d(obj2), interfaceC9324c);
    }

    /* renamed from: o */
    public Object m16848o(InterfaceC9324c interfaceC9324c) {
        return m16836p(this, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16849q(p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.f18152d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18152d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18150b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f18152d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f18149a
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4b
        L3c:
            kotlin.AbstractC9079b.m15926b(r6)
            r0.f18149a = r5
            r0.f18152d = r4
            java.lang.Object r6 = r5.m16855z(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f18149a = r6
            r0.f18152d = r3
            java.lang.Object r6 = r2.m16847n(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.m16849q(m7.c):java.lang.Object");
    }

    /* renamed from: r */
    public final C9220a m16850r(Object obj) {
        List list = this.f18136b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C9220a) next).f18140a == obj) {
                obj2 = next;
                break;
            }
        }
        C9220a c9220a = (C9220a) obj2;
        if (c9220a != null) {
            return c9220a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: u */
    public final void m16851u(C9220a c9220a, boolean z10) {
        if (f18134f.get(this) instanceof C9220a) {
            return;
        }
        if (!z10) {
            m16845l(c9220a.f18140a);
        }
        if (!c9220a.m16860e(this)) {
            f18134f.set(this, c9220a);
            return;
        }
        if (!z10) {
            List list = this.f18136b;
            AbstractC9133u.m16130d(list);
            list.add(c9220a);
        }
        c9220a.f18146g = this.f18137c;
        c9220a.f18147h = this.f18138d;
        this.f18137c = null;
        this.f18138d = -1;
    }

    /* renamed from: w */
    public final void m16852w(Object obj) {
        C9220a c9220aM16850r = m16850r(obj);
        AbstractC9133u.m16130d(c9220aM16850r);
        c9220aM16850r.f18146g = null;
        c9220aM16850r.f18147h = -1;
        m16851u(c9220aM16850r, true);
    }

    /* renamed from: x */
    public final TrySelectDetailedResult m16853x(Object obj, Object obj2) {
        return SelectKt.m16861a(m16854y(obj, obj2));
    }

    /* renamed from: y */
    public final int m16854y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f18134f.get(this);
            if (obj3 instanceof InterfaceC8845j) {
                C9220a c9220aM16850r = m16850r(obj);
                if (c9220aM16850r == null) {
                    continue;
                } else {
                    InterfaceC10570l interfaceC10570lM16856a = c9220aM16850r.m16856a(this, obj2);
                    if (AbstractC3193a.m1318a(f18134f, this, obj3, c9220aM16850r)) {
                        this.f18139e = obj2;
                        if (SelectKt.m16870j((InterfaceC8845j) obj3, interfaceC10570lM16856a)) {
                            return 0;
                        }
                        this.f18139e = SelectKt.f18157e;
                        return 2;
                    }
                }
            } else {
                if (AbstractC9133u.m16128b(obj3, SelectKt.f18155c) ? true : obj3 instanceof C9220a) {
                    return 3;
                }
                if (AbstractC9133u.m16128b(obj3, SelectKt.f18156d)) {
                    return 2;
                }
                if (AbstractC9133u.m16128b(obj3, SelectKt.f18154b)) {
                    if (AbstractC3193a.m1318a(f18134f, this, obj3, AbstractC8807u.m14755e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (AbstractC3193a.m1318a(f18134f, this, obj3, AbstractC8778f0.m14530G0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.m16372x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != p190n7.AbstractC9434a.m17291f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        p201o7.AbstractC9541f.m17811c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != p190n7.AbstractC9434a.m17291f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return p123h7.C8736p.f16368a;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16855z(p179m7.InterfaceC9324c r6) {
        /*
            r5 = this;
            kotlinx.coroutines.c r0 = new kotlinx.coroutines.c
            m7.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.m16343D()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m16834j()
        L11:
            java.lang.Object r2 = r1.get(r5)
            n8.d0 r3 = kotlinx.coroutines.selects.SelectKt.m16867g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = m16834j()
            boolean r2 = androidx.concurrent.futures.AbstractC3193a.m1318a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            p135i8.AbstractC8851l.m14880c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = m16834j()
            n8.d0 r4 = kotlinx.coroutines.selects.SelectKt.m16867g()
            boolean r3 = androidx.concurrent.futures.AbstractC3193a.m1318a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            m16835k(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.C9220a
            if (r1 == 0) goto L79
            h7.p r1 = p123h7.C8736p.f16368a
            kotlinx.coroutines.selects.SelectImplementation$a r2 = (kotlinx.coroutines.selects.SelectImplementation.C9220a) r2
            java.lang.Object r3 = m16833i(r5)
            x7.l r2 = r2.m16856a(r5, r3)
            r0.mo14870g(r1, r2)
        L62:
            java.lang.Object r0 = r0.m16372x()
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            if (r0 != r1) goto L6f
            p201o7.AbstractC9541f.m17811c(r6)
        L6f:
            java.lang.Object r6 = p190n7.AbstractC9434a.m17291f()
            if (r0 != r6) goto L76
            return r0
        L76:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.m16855z(m7.c):java.lang.Object");
    }
}
