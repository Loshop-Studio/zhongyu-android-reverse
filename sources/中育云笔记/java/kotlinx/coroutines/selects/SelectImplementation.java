package kotlinx.coroutines.selects;

import ae.AbstractC0117m;
import ae.InterfaceC0107c;
import ae.InterfaceC0108d;
import ae.InterfaceC0110f;
import ae.InterfaceC0115k;
import ae.InterfaceC0116l;
import androidx.concurrent.futures.AbstractC3223a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC9996b;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p410xd.AbstractC11875z;
import sd.InterfaceC11125j;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class SelectImplementation implements InterfaceC9996b, InterfaceC0107c, InterfaceC0116l {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24014h = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* renamed from: c */
    public final InterfaceC9945d f24015c;

    /* renamed from: e */
    public Object f24017e;
    private volatile /* synthetic */ Object state$volatile = AbstractC0117m.f129b;

    /* renamed from: d */
    public List f24016d = new ArrayList(2);

    /* renamed from: f */
    public int f24018f = -1;

    /* renamed from: g */
    public Object f24019g = AbstractC0117m.f132e;

    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$a */
    public final class C10051a {

        /* renamed from: a */
        public final Object f24020a;

        /* renamed from: b */
        public final InterfaceC9545q f24021b;

        /* renamed from: c */
        public final InterfaceC9545q f24022c;

        /* renamed from: d */
        public final Object f24023d;

        /* renamed from: e */
        public final Object f24024e;

        /* renamed from: f */
        public final InterfaceC9545q f24025f;

        /* renamed from: g */
        public Object f24026g;

        /* renamed from: h */
        public int f24027h = -1;

        public C10051a(Object obj, InterfaceC9545q interfaceC9545q, InterfaceC9545q interfaceC9545q2, Object obj2, Object obj3, InterfaceC9545q interfaceC9545q3) {
            this.f24020a = obj;
            this.f24021b = interfaceC9545q;
            this.f24022c = interfaceC9545q2;
            this.f24023d = obj2;
            this.f24024e = obj3;
            this.f24025f = interfaceC9545q3;
        }

        /* renamed from: a */
        public final InterfaceC9545q m20991a(InterfaceC0115k interfaceC0115k, Object obj) {
            InterfaceC9545q interfaceC9545q = this.f24025f;
            if (interfaceC9545q != null) {
                return (InterfaceC9545q) interfaceC9545q.invoke(interfaceC0115k, this.f24023d, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m20992b() {
            Object obj = this.f24026g;
            SelectImplementation selectImplementation = SelectImplementation.this;
            if (obj instanceof AbstractC11875z) {
                ((AbstractC11875z) obj).mo2761s(this.f24027h, null, selectImplementation.getContext());
                return;
            }
            InterfaceC11163t0 interfaceC11163t0 = obj instanceof InterfaceC11163t0 ? (InterfaceC11163t0) obj : null;
            if (interfaceC11163t0 != null) {
                interfaceC11163t0.dispose();
            }
        }

        /* renamed from: c */
        public final Object m20993c(Object obj, InterfaceC11588c interfaceC11588c) {
            Object obj2 = this.f24024e;
            if (this.f24023d == AbstractC0117m.m296i()) {
                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((InterfaceC9540l) obj2).invoke(interfaceC11588c);
            }
            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((InterfaceC9544p) obj2).invoke(obj, interfaceC11588c);
        }

        /* renamed from: d */
        public final Object m20994d(Object obj) {
            return this.f24022c.invoke(this.f24020a, this.f24023d, obj);
        }

        /* renamed from: e */
        public final boolean m20995e(SelectImplementation selectImplementation) {
            this.f24021b.invoke(this.f24020a, selectImplementation, this.f24023d);
            return selectImplementation.f24019g == AbstractC0117m.f132e;
        }
    }

    public SelectImplementation(InterfaceC9945d interfaceC9945d) {
        this.f24015c = interfaceC9945d;
    }

    /* renamed from: p */
    public static /* synthetic */ Object m20975p(SelectImplementation selectImplementation, InterfaceC11588c interfaceC11588c) {
        return selectImplementation.m20977t() ? selectImplementation.m20981m(interfaceC11588c) : selectImplementation.m20984q(interfaceC11588c);
    }

    /* renamed from: t */
    private final boolean m20977t() {
        return f24014h.get(this) instanceof C10051a;
    }

    /* renamed from: v */
    public static /* synthetic */ void m20978v(SelectImplementation selectImplementation, C10051a c10051a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.m20986u(c10051a, z10);
    }

    @Override // kotlinx.coroutines.InterfaceC9996b
    /* renamed from: a */
    public void mo20494a(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24014h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC0117m.f130c) {
                return;
            }
        } while (!AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, obj, AbstractC0117m.f131d));
        List list = this.f24016d;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C10051a) it.next()).m20992b();
        }
        this.f24019g = AbstractC0117m.f132e;
        this.f24016d = null;
    }

    @Override // ae.InterfaceC0115k
    /* renamed from: b */
    public void mo286b(Object obj) {
        this.f24019g = obj;
    }

    @Override // ae.InterfaceC0107c
    /* renamed from: c */
    public void mo280c(InterfaceC0110f interfaceC0110f, InterfaceC9544p interfaceC9544p) {
        m20978v(this, new C10051a(interfaceC0110f.mo285d(), interfaceC0110f.mo282a(), interfaceC0110f.mo284c(), null, interfaceC9544p, interfaceC0110f.mo283b()), false, 1, null);
    }

    @Override // ae.InterfaceC0115k
    /* renamed from: d */
    public boolean mo287d(Object obj, Object obj2) {
        return m20989y(obj, obj2) == 0;
    }

    @Override // ae.InterfaceC0107c
    /* renamed from: e */
    public void mo281e(InterfaceC0108d interfaceC0108d, InterfaceC9540l interfaceC9540l) {
        m20978v(this, new C10051a(interfaceC0108d.mo285d(), interfaceC0108d.mo282a(), interfaceC0108d.mo284c(), AbstractC0117m.m296i(), interfaceC9540l, interfaceC0108d.mo283b()), false, 1, null);
    }

    @Override // sd.InterfaceC11144n2
    /* renamed from: f */
    public void mo20523f(AbstractC11875z abstractC11875z, int i10) {
        this.f24017e = abstractC11875z;
        this.f24018f = i10;
    }

    @Override // ae.InterfaceC0115k
    public InterfaceC9945d getContext() {
        return this.f24015c;
    }

    /* renamed from: k */
    public final void m20979k(Object obj) {
        List list = this.f24016d;
        AbstractC9979u.m20291d(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((C10051a) it.next()).f24020a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final void m20980l(C10051a c10051a) {
        List<C10051a> list = this.f24016d;
        if (list == null) {
            return;
        }
        for (C10051a c10051a2 : list) {
            if (c10051a2 != c10051a) {
                c10051a2.m20992b();
            }
        }
        f24014h.set(this, AbstractC0117m.f130c);
        this.f24019g = AbstractC0117m.f132e;
        this.f24016d = null;
    }

    /* renamed from: m */
    public final Object m20981m(InterfaceC11588c interfaceC11588c) {
        Object obj = f24014h.get(this);
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C10051a c10051a = (C10051a) obj;
        Object obj2 = this.f24019g;
        m20980l(c10051a);
        return c10051a.m20993c(c10051a.m20994d(obj2), interfaceC11588c);
    }

    /* renamed from: n */
    public void m20982n(InterfaceC11163t0 interfaceC11163t0) {
        this.f24017e = interfaceC11163t0;
    }

    /* renamed from: o */
    public Object m20983o(InterfaceC11588c interfaceC11588c) {
        return m20975p(this, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20984q(vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.f24032f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24032f = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f24030d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f24032f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f24029c
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.AbstractC9924b.m20071b(r6)
            goto L4b
        L3c:
            kotlin.AbstractC9924b.m20071b(r6)
            r0.f24029c = r5
            r0.f24032f = r4
            java.lang.Object r6 = r5.m20990z(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f24029c = r6
            r0.f24032f = r3
            java.lang.Object r6 = r2.m20981m(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.m20984q(vc.c):java.lang.Object");
    }

    /* renamed from: r */
    public final C10051a m20985r(Object obj) {
        List list = this.f24016d;
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
            if (((C10051a) next).f24020a == obj) {
                obj2 = next;
                break;
            }
        }
        C10051a c10051a = (C10051a) obj2;
        if (c10051a != null) {
            return c10051a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: u */
    public final void m20986u(C10051a c10051a, boolean z10) {
        if (f24014h.get(this) instanceof C10051a) {
            return;
        }
        if (!z10) {
            m20979k(c10051a.f24020a);
        }
        if (!c10051a.m20995e(this)) {
            f24014h.set(this, c10051a);
            return;
        }
        if (!z10) {
            List list = this.f24016d;
            AbstractC9979u.m20291d(list);
            list.add(c10051a);
        }
        c10051a.f24026g = this.f24017e;
        c10051a.f24027h = this.f24018f;
        this.f24017e = null;
        this.f24018f = -1;
    }

    /* renamed from: w */
    public final void m20987w(Object obj) {
        C10051a c10051aM20985r = m20985r(obj);
        AbstractC9979u.m20291d(c10051aM20985r);
        c10051aM20985r.f24026g = null;
        c10051aM20985r.f24027h = -1;
        m20986u(c10051aM20985r, true);
    }

    /* renamed from: x */
    public final TrySelectDetailedResult m20988x(Object obj, Object obj2) {
        return AbstractC0117m.m288a(m20989y(obj, obj2));
    }

    /* renamed from: y */
    public final int m20989y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f24014h.get(this);
            if (obj3 instanceof InterfaceC11125j) {
                C10051a c10051aM20985r = m20985r(obj);
                if (c10051aM20985r == null) {
                    continue;
                } else {
                    InterfaceC9545q interfaceC9545qM20991a = c10051aM20985r.m20991a(this, obj2);
                    if (AbstractC3223a.m1395a(f24014h, this, obj3, c10051aM20985r)) {
                        this.f24019g = obj2;
                        if (AbstractC0117m.m297j((InterfaceC11125j) obj3, interfaceC9545qM20991a)) {
                            return 0;
                        }
                        this.f24019g = AbstractC0117m.f132e;
                        return 2;
                    }
                }
            } else {
                if (AbstractC9979u.m20289b(obj3, AbstractC0117m.f130c) || (obj3 instanceof C10051a)) {
                    return 3;
                }
                if (AbstractC9979u.m20289b(obj3, AbstractC0117m.f131d)) {
                    return 2;
                }
                if (AbstractC9979u.m20289b(obj3, AbstractC0117m.f129b)) {
                    if (AbstractC3223a.m1395a(f24014h, this, obj3, AbstractC10976v.m24126e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (AbstractC3223a.m1395a(f24014h, this, obj3, AbstractC10947g0.m23907I0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.m20538x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != p393wc.AbstractC11725a.m25952f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        p409xc.AbstractC11831f.m26221c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != p393wc.AbstractC11725a.m25952f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return p309qc.C10786q.f26013a;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20990z(vc.InterfaceC11588c r6) {
        /*
            r5 = this;
            kotlinx.coroutines.c r0 = new kotlinx.coroutines.c
            vc.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.m20503F()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m20973i()
        L11:
            java.lang.Object r2 = r1.get(r5)
            xd.c0 r3 = ae.AbstractC0117m.m294g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = m20973i()
            boolean r2 = androidx.concurrent.futures.AbstractC3223a.m1395a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            sd.AbstractC11137m.m24758c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = m20973i()
            xd.c0 r4 = ae.AbstractC0117m.m294g()
            boolean r3 = androidx.concurrent.futures.AbstractC3223a.m1395a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            m20974j(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.C10051a
            if (r1 == 0) goto L79
            qc.q r1 = p309qc.C10786q.f26013a
            kotlinx.coroutines.selects.SelectImplementation$a r2 = (kotlinx.coroutines.selects.SelectImplementation.C10051a) r2
            java.lang.Object r3 = m20972h(r5)
            hd.q r2 = r2.m20991a(r5, r3)
            r0.mo20526k(r1, r2)
        L62:
            java.lang.Object r0 = r0.m20538x()
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            if (r0 != r1) goto L6f
            p409xc.AbstractC11831f.m26221c(r6)
        L6f:
            java.lang.Object r6 = p393wc.AbstractC11725a.m25952f()
            if (r0 != r6) goto L76
            return r0
        L76:
            qc.q r6 = p309qc.C10786q.f26013a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.m20990z(vc.c):java.lang.Object");
    }
}
