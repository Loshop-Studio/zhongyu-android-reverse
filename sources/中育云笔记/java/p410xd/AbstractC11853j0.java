package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import sd.InterfaceC11112f2;

/* renamed from: xd.j0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11853j0 {

    /* renamed from: a */
    public static final C11839c0 f28093a = new C11839c0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final InterfaceC9544p f28094b = new InterfaceC9544p() { // from class: xd.g0
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC11853j0.m26288d(obj, (InterfaceC9945d.b) obj2);
        }
    };

    /* renamed from: c */
    public static final InterfaceC9544p f28095c = new InterfaceC9544p() { // from class: xd.h0
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC11853j0.m26289e((InterfaceC11112f2) obj, (InterfaceC9945d.b) obj2);
        }
    };

    /* renamed from: d */
    public static final InterfaceC9544p f28096d = new InterfaceC9544p() { // from class: xd.i0
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Object obj, Object obj2) {
            return AbstractC11853j0.m26292h((C11865p0) obj, (InterfaceC9945d.b) obj2);
        }
    };

    /* renamed from: d */
    public static final Object m26288d(Object obj, InterfaceC9945d.b bVar) {
        if (!(bVar instanceof InterfaceC11112f2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* renamed from: e */
    public static final InterfaceC11112f2 m26289e(InterfaceC11112f2 interfaceC11112f2, InterfaceC9945d.b bVar) {
        if (interfaceC11112f2 != null) {
            return interfaceC11112f2;
        }
        if (bVar instanceof InterfaceC11112f2) {
            return (InterfaceC11112f2) bVar;
        }
        return null;
    }

    /* renamed from: f */
    public static final void m26290f(InterfaceC9945d interfaceC9945d, Object obj) {
        if (obj == f28093a) {
            return;
        }
        if (obj instanceof C11865p0) {
            ((C11865p0) obj).m26342b(interfaceC9945d);
            return;
        }
        Object objFold = interfaceC9945d.fold(null, f28095c);
        AbstractC9979u.m20292e(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC11112f2) objFold).restoreThreadContext(interfaceC9945d, obj);
    }

    /* renamed from: g */
    public static final Object m26291g(InterfaceC9945d interfaceC9945d) {
        Object objFold = interfaceC9945d.fold(0, f28094b);
        AbstractC9979u.m20291d(objFold);
        return objFold;
    }

    /* renamed from: h */
    public static final C11865p0 m26292h(C11865p0 c11865p0, InterfaceC9945d.b bVar) {
        if (bVar instanceof InterfaceC11112f2) {
            InterfaceC11112f2 interfaceC11112f2 = (InterfaceC11112f2) bVar;
            c11865p0.m26341a(interfaceC11112f2, interfaceC11112f2.updateThreadContext(c11865p0.f28123a));
        }
        return c11865p0;
    }

    /* renamed from: i */
    public static final Object m26293i(InterfaceC9945d interfaceC9945d, Object obj) {
        if (obj == null) {
            obj = m26291g(interfaceC9945d);
        }
        if (obj == 0) {
            return f28093a;
        }
        if (obj instanceof Integer) {
            return interfaceC9945d.fold(new C11865p0(interfaceC9945d, ((Number) obj).intValue()), f28096d);
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC11112f2) obj).updateThreadContext(interfaceC9945d);
    }
}
