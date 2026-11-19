package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* renamed from: kotlin.coroutines.d */
/* loaded from: classes5.dex */
public interface InterfaceC9100d {

    /* renamed from: kotlin.coroutines.d$a */
    public static final class a {
        /* renamed from: b */
        public static InterfaceC9100d m16069b(InterfaceC9100d interfaceC9100d, InterfaceC9100d context) {
            AbstractC9133u.m16133g(context, "context");
            return context == EmptyCoroutineContext.f17438a ? interfaceC9100d : (InterfaceC9100d) context.fold(interfaceC9100d, new InterfaceC10574p() { // from class: m7.e
                @Override // p300x7.InterfaceC10574p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC9100d.a.m16070c((InterfaceC9100d) obj, (InterfaceC9100d.b) obj2);
                }
            });
        }

        /* renamed from: c */
        public static InterfaceC9100d m16070c(InterfaceC9100d acc, b element) {
            AbstractC9133u.m16133g(acc, "acc");
            AbstractC9133u.m16133g(element, "element");
            InterfaceC9100d interfaceC9100dMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17438a;
            if (interfaceC9100dMinusKey == emptyCoroutineContext) {
                return element;
            }
            InterfaceC9099c.b bVar = InterfaceC9099c.f17441b0;
            InterfaceC9099c interfaceC9099c = (InterfaceC9099c) interfaceC9100dMinusKey.get(bVar);
            if (interfaceC9099c == null) {
                return new CombinedContext(interfaceC9100dMinusKey, element);
            }
            InterfaceC9100d interfaceC9100dMinusKey2 = interfaceC9100dMinusKey.minusKey(bVar);
            return interfaceC9100dMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, interfaceC9099c) : new CombinedContext(new CombinedContext(interfaceC9100dMinusKey2, element), interfaceC9099c);
        }
    }

    /* renamed from: kotlin.coroutines.d$b */
    public interface b extends InterfaceC9100d {

        /* renamed from: kotlin.coroutines.d$b$a */
        public static final class a {
            /* renamed from: a */
            public static Object m16071a(b bVar, Object obj, InterfaceC10574p operation) {
                AbstractC9133u.m16133g(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            /* renamed from: b */
            public static b m16072b(b bVar, c key) {
                AbstractC9133u.m16133g(key, "key");
                if (!AbstractC9133u.m16128b(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC9133u.m16131e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static InterfaceC9100d m16073c(b bVar, c key) {
                AbstractC9133u.m16133g(key, "key");
                return AbstractC9133u.m16128b(bVar.getKey(), key) ? EmptyCoroutineContext.f17438a : bVar;
            }

            /* renamed from: d */
            public static InterfaceC9100d m16074d(b bVar, InterfaceC9100d context) {
                AbstractC9133u.m16133g(context, "context");
                return a.m16069b(bVar, context);
            }
        }

        @Override // kotlin.coroutines.InterfaceC9100d
        b get(c cVar);

        c getKey();
    }

    /* renamed from: kotlin.coroutines.d$c */
    public interface c {
    }

    Object fold(Object obj, InterfaceC10574p interfaceC10574p);

    b get(c cVar);

    InterfaceC9100d minusKey(c cVar);

    InterfaceC9100d plus(InterfaceC9100d interfaceC9100d);
}
