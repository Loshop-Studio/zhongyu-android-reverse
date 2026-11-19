package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p191n8.C9473z;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class SafeCollector_commonKt {
    /* renamed from: a */
    public static final void m16715a(final SafeCollector safeCollector, InterfaceC9100d interfaceC9100d) {
        if (((Number) interfaceC9100d.fold(0, new InterfaceC10574p() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            {
                super(2);
            }

            /* renamed from: a */
            public final Integer m16717a(int i10, InterfaceC9100d.b bVar) {
                InterfaceC9100d.c key = bVar.getKey();
                InterfaceC9100d.b bVar2 = safeCollector.f18052b.get(key);
                if (key != InterfaceC9212n.f18095c0) {
                    return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i10 + 1);
                }
                InterfaceC9212n interfaceC9212n = (InterfaceC9212n) bVar2;
                AbstractC9133u.m16131e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                InterfaceC9212n interfaceC9212nM16716b = SafeCollector_commonKt.m16716b((InterfaceC9212n) bVar, interfaceC9212n);
                if (interfaceC9212nM16716b == interfaceC9212n) {
                    if (interfaceC9212n != null) {
                        i10++;
                    }
                    return Integer.valueOf(i10);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC9212nM16716b + ", expected child of " + interfaceC9212n + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m16717a(((Number) obj).intValue(), (InterfaceC9100d.b) obj2);
            }
        })).intValue() == safeCollector.f18053c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.f18052b + ",\n\t\tbut emission happened in " + interfaceC9100d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* renamed from: b */
    public static final InterfaceC9212n m16716b(InterfaceC9212n interfaceC9212n, InterfaceC9212n interfaceC9212n2) {
        while (interfaceC9212n != null) {
            if (interfaceC9212n == interfaceC9212n2 || !(interfaceC9212n instanceof C9473z)) {
                return interfaceC9212n;
            }
            interfaceC9212n = interfaceC9212n.getParent();
        }
        return null;
    }
}
