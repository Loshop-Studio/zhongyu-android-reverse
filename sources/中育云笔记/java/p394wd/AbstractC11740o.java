package p394wd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.flow.internal.SafeCollector;
import p181hd.InterfaceC9544p;
import p410xd.C11874y;

/* renamed from: wd.o */
/* loaded from: classes6.dex */
public abstract class AbstractC11740o {
    /* renamed from: b */
    public static final void m25967b(final SafeCollector safeCollector, InterfaceC9945d interfaceC9945d) {
        if (((Number) interfaceC9945d.fold(0, new InterfaceC9544p() { // from class: wd.n
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(AbstractC11740o.m25968c(safeCollector, ((Integer) obj).intValue(), (InterfaceC9945d.b) obj2));
            }
        })).intValue() == safeCollector.f23965e) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.f23964d + ",\n\t\tbut emission happened in " + interfaceC9945d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: c */
    public static final int m25968c(SafeCollector safeCollector, int i10, InterfaceC9945d.b bVar) {
        InterfaceC9945d.c key = bVar.getKey();
        InterfaceC9945d.b bVar2 = safeCollector.f23964d.get(key);
        if (key != InterfaceC10045g.f23976b0) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) bVar2;
        AbstractC9979u.m20292e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC10045g interfaceC10045gM25969d = m25969d((InterfaceC10045g) bVar, interfaceC10045g);
        if (interfaceC10045gM25969d == interfaceC10045g) {
            return interfaceC10045g == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC10045gM25969d + ", expected child of " + interfaceC10045g + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    /* renamed from: d */
    public static final InterfaceC10045g m25969d(InterfaceC10045g interfaceC10045g, InterfaceC10045g interfaceC10045g2) {
        while (interfaceC10045g != null) {
            if (interfaceC10045g == interfaceC10045g2 || !(interfaceC10045g instanceof C11874y)) {
                return interfaceC10045g;
            }
            interfaceC10045g = ((C11874y) interfaceC10045g).m20428V();
        }
        return null;
    }
}
