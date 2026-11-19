package p246s8;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8377e;
import p089e8.InterfaceC8387o;
import p257t8.AbstractC10124a;
import p290w8.AbstractC10427o;
import p290w8.AbstractC10461w1;
import p290w8.InterfaceC10430o2;
import p290w8.InterfaceC10457v1;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p301x8.AbstractC10584b;

/* renamed from: s8.p */
/* loaded from: classes5.dex */
public abstract class AbstractC10066p {

    /* renamed from: a */
    public static final InterfaceC10430o2 f20113a = AbstractC10427o.m19480a(new InterfaceC10570l() { // from class: s8.j
        @Override // p300x7.InterfaceC10570l
        public final Object invoke(Object obj) {
            return AbstractC10066p.m18773k((InterfaceC8375c) obj);
        }
    });

    /* renamed from: b */
    public static final InterfaceC10430o2 f20114b = AbstractC10427o.m19480a(new InterfaceC10570l() { // from class: s8.k
        @Override // p300x7.InterfaceC10570l
        public final Object invoke(Object obj) {
            return AbstractC10066p.m18774l((InterfaceC8375c) obj);
        }
    });

    /* renamed from: c */
    public static final InterfaceC10457v1 f20115c = AbstractC10427o.m19481b(new InterfaceC10574p() { // from class: s8.l
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC10066p.m18769g((InterfaceC8375c) obj, (List) obj2);
        }
    });

    /* renamed from: d */
    public static final InterfaceC10457v1 f20116d = AbstractC10427o.m19481b(new InterfaceC10574p() { // from class: s8.m
        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC10066p.m18771i((InterfaceC8375c) obj, (List) obj2);
        }
    });

    /* renamed from: g */
    public static final InterfaceC10052b m18769g(InterfaceC8375c clazz, final List types) {
        AbstractC9133u.m16133g(clazz, "clazz");
        AbstractC9133u.m16133g(types, "types");
        List listM18784h = AbstractC10067q.m18784h(AbstractC10584b.m19742a(), types, true);
        AbstractC9133u.m16130d(listM18784h);
        return AbstractC10067q.m18777a(clazz, listM18784h, new InterfaceC10559a() { // from class: s8.n
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC10066p.m18770h(types);
            }
        });
    }

    /* renamed from: h */
    public static final InterfaceC8377e m18770h(List list) {
        return ((InterfaceC8387o) list.get(0)).mo13676b();
    }

    /* renamed from: i */
    public static final InterfaceC10052b m18771i(InterfaceC8375c clazz, final List types) {
        InterfaceC10052b interfaceC10052bM18907s;
        AbstractC9133u.m16133g(clazz, "clazz");
        AbstractC9133u.m16133g(types, "types");
        List listM18784h = AbstractC10067q.m18784h(AbstractC10584b.m19742a(), types, true);
        AbstractC9133u.m16130d(listM18784h);
        InterfaceC10052b interfaceC10052bM18777a = AbstractC10067q.m18777a(clazz, listM18784h, new InterfaceC10559a() { // from class: s8.o
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AbstractC10066p.m18772j(types);
            }
        });
        if (interfaceC10052bM18777a == null || (interfaceC10052bM18907s = AbstractC10124a.m18907s(interfaceC10052bM18777a)) == null) {
            return null;
        }
        return interfaceC10052bM18907s;
    }

    /* renamed from: j */
    public static final InterfaceC8377e m18772j(List list) {
        return ((InterfaceC8387o) list.get(0)).mo13676b();
    }

    /* renamed from: k */
    public static final InterfaceC10052b m18773k(InterfaceC8375c it) {
        AbstractC9133u.m16133g(it, "it");
        InterfaceC10052b interfaceC10052bM18781e = AbstractC10067q.m18781e(it);
        if (interfaceC10052bM18781e != null) {
            return interfaceC10052bM18781e;
        }
        if (AbstractC10461w1.m19554l(it)) {
            return new C10056f(it);
        }
        return null;
    }

    /* renamed from: l */
    public static final InterfaceC10052b m18774l(InterfaceC8375c it) {
        InterfaceC10052b interfaceC10052bM18907s;
        AbstractC9133u.m16133g(it, "it");
        InterfaceC10052b interfaceC10052bM18781e = AbstractC10067q.m18781e(it);
        if (interfaceC10052bM18781e == null) {
            interfaceC10052bM18781e = AbstractC10461w1.m19554l(it) ? new C10056f(it) : null;
        }
        if (interfaceC10052bM18781e == null || (interfaceC10052bM18907s = AbstractC10124a.m18907s(interfaceC10052bM18781e)) == null) {
            return null;
        }
        return interfaceC10052bM18907s;
    }

    /* renamed from: m */
    public static final InterfaceC10052b m18775m(InterfaceC8375c clazz, boolean z10) {
        AbstractC9133u.m16133g(clazz, "clazz");
        if (z10) {
            return f20114b.mo19482a(clazz);
        }
        InterfaceC10052b interfaceC10052bMo19482a = f20113a.mo19482a(clazz);
        if (interfaceC10052bMo19482a != null) {
            return interfaceC10052bMo19482a;
        }
        return null;
    }

    /* renamed from: n */
    public static final Object m18776n(InterfaceC8375c clazz, List types, boolean z10) {
        AbstractC9133u.m16133g(clazz, "clazz");
        AbstractC9133u.m16133g(types, "types");
        return !z10 ? f20115c.mo19528a(clazz, types) : f20116d.mo19528a(clazz, types);
    }
}
