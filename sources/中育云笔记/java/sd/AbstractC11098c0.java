package sd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C10007e;
import p181hd.InterfaceC9544p;
import p409xc.InterfaceC11828c;
import vc.InterfaceC11588c;

/* renamed from: sd.c0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11098c0 {
    /* renamed from: d */
    public static final InterfaceC9945d m24682d(InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, final boolean z10) {
        boolean zM24686h = m24686h(interfaceC9945d);
        boolean zM24686h2 = m24686h(interfaceC9945d2);
        if (!zM24686h && !zM24686h2) {
            return interfaceC9945d.plus(interfaceC9945d2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = interfaceC9945d2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23351c;
        InterfaceC9945d interfaceC9945d3 = (InterfaceC9945d) interfaceC9945d.fold(emptyCoroutineContext, new InterfaceC9544p() { // from class: sd.a0
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC11098c0.m24683e(ref$ObjectRef, z10, (InterfaceC9945d) obj, (InterfaceC9945d.b) obj2);
            }
        });
        if (zM24686h2) {
            ref$ObjectRef.f23402c = ((InterfaceC9945d) ref$ObjectRef.f23402c).fold(emptyCoroutineContext, new InterfaceC9544p() { // from class: sd.b0
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC11098c0.m24684f((InterfaceC9945d) obj, (InterfaceC9945d.b) obj2);
                }
            });
        }
        return interfaceC9945d3.plus((InterfaceC9945d) ref$ObjectRef.f23402c);
    }

    /* renamed from: e */
    public static final InterfaceC9945d m24683e(Ref$ObjectRef ref$ObjectRef, boolean z10, InterfaceC9945d interfaceC9945d, InterfaceC9945d.b bVar) {
        return interfaceC9945d.plus(bVar);
    }

    /* renamed from: f */
    public static final InterfaceC9945d m24684f(InterfaceC9945d interfaceC9945d, InterfaceC9945d.b bVar) {
        return interfaceC9945d.plus(bVar);
    }

    /* renamed from: g */
    public static final String m24685g(InterfaceC9945d interfaceC9945d) {
        return null;
    }

    /* renamed from: h */
    public static final boolean m24686h(InterfaceC9945d interfaceC9945d) {
        return ((Boolean) interfaceC9945d.fold(Boolean.FALSE, new InterfaceC9544p() { // from class: sd.z
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AbstractC11098c0.m24687i(((Boolean) obj).booleanValue(), (InterfaceC9945d.b) obj2));
            }
        })).booleanValue();
    }

    /* renamed from: i */
    public static final boolean m24687i(boolean z10, InterfaceC9945d.b bVar) {
        return z10;
    }

    /* renamed from: j */
    public static final InterfaceC9945d m24688j(InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2) {
        return !m24686h(interfaceC9945d2) ? interfaceC9945d.plus(interfaceC9945d2) : m24682d(interfaceC9945d, interfaceC9945d2, false);
    }

    /* renamed from: k */
    public static final InterfaceC9945d m24689k(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d) {
        InterfaceC9945d interfaceC9945dM24682d = m24682d(interfaceC11122i0.getCoroutineContext(), interfaceC9945d, true);
        return (interfaceC9945dM24682d == C11157r0.m24798a() || interfaceC9945dM24682d.get(InterfaceC9944c.f23354a0) != null) ? interfaceC9945dM24682d : interfaceC9945dM24682d.plus(C11157r0.m24798a());
    }

    /* renamed from: l */
    public static final C11136l2 m24690l(InterfaceC11828c interfaceC11828c) {
        while (!(interfaceC11828c instanceof C10007e) && (interfaceC11828c = interfaceC11828c.getCallerFrame()) != null) {
            if (interfaceC11828c instanceof C11136l2) {
                return (C11136l2) interfaceC11828c;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static final C11136l2 m24691m(InterfaceC11588c interfaceC11588c, InterfaceC9945d interfaceC9945d, Object obj) {
        if (!(interfaceC11588c instanceof InterfaceC11828c) || interfaceC9945d.get(C11140m2.f26805c) == null) {
            return null;
        }
        C11136l2 c11136l2M24690l = m24690l((InterfaceC11828c) interfaceC11588c);
        if (c11136l2M24690l != null) {
            c11136l2M24690l.m24755M0(interfaceC9945d, obj);
        }
        return c11136l2M24690l;
    }
}
