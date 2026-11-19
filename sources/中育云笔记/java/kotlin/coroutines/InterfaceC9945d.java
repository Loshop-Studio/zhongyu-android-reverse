package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* renamed from: kotlin.coroutines.d */
/* loaded from: classes6.dex */
public interface InterfaceC9945d {

    /* renamed from: kotlin.coroutines.d$a */
    public static final class a {
        /* renamed from: b */
        public static InterfaceC9945d m20214b(InterfaceC9945d interfaceC9945d, InterfaceC9945d context) {
            AbstractC9979u.m20294g(context, "context");
            return context == EmptyCoroutineContext.f23351c ? interfaceC9945d : (InterfaceC9945d) context.fold(interfaceC9945d, new InterfaceC9544p() { // from class: vc.e
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return InterfaceC9945d.a.m20215c((InterfaceC9945d) obj, (InterfaceC9945d.b) obj2);
                }
            });
        }

        /* renamed from: c */
        public static InterfaceC9945d m20215c(InterfaceC9945d acc, b element) {
            AbstractC9979u.m20294g(acc, "acc");
            AbstractC9979u.m20294g(element, "element");
            InterfaceC9945d interfaceC9945dMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23351c;
            if (interfaceC9945dMinusKey == emptyCoroutineContext) {
                return element;
            }
            InterfaceC9944c.b bVar = InterfaceC9944c.f23354a0;
            InterfaceC9944c interfaceC9944c = (InterfaceC9944c) interfaceC9945dMinusKey.get(bVar);
            if (interfaceC9944c == null) {
                return new CombinedContext(interfaceC9945dMinusKey, element);
            }
            InterfaceC9945d interfaceC9945dMinusKey2 = interfaceC9945dMinusKey.minusKey(bVar);
            return interfaceC9945dMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, interfaceC9944c) : new CombinedContext(new CombinedContext(interfaceC9945dMinusKey2, element), interfaceC9944c);
        }
    }

    /* renamed from: kotlin.coroutines.d$b */
    public interface b extends InterfaceC9945d {

        /* renamed from: kotlin.coroutines.d$b$a */
        public static final class a {
            /* renamed from: a */
            public static Object m20216a(b bVar, Object obj, InterfaceC9544p operation) {
                AbstractC9979u.m20294g(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            /* renamed from: b */
            public static b m20217b(b bVar, c key) {
                AbstractC9979u.m20294g(key, "key");
                if (!AbstractC9979u.m20289b(bVar.getKey(), key)) {
                    return null;
                }
                AbstractC9979u.m20292e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static InterfaceC9945d m20218c(b bVar, c key) {
                AbstractC9979u.m20294g(key, "key");
                return AbstractC9979u.m20289b(bVar.getKey(), key) ? EmptyCoroutineContext.f23351c : bVar;
            }

            /* renamed from: d */
            public static InterfaceC9945d m20219d(b bVar, InterfaceC9945d context) {
                AbstractC9979u.m20294g(context, "context");
                return a.m20214b(bVar, context);
            }
        }

        @Override // kotlin.coroutines.InterfaceC9945d
        b get(c cVar);

        c getKey();
    }

    /* renamed from: kotlin.coroutines.d$c */
    public interface c {
    }

    Object fold(Object obj, InterfaceC9544p interfaceC9544p);

    b get(c cVar);

    InterfaceC9945d minusKey(c cVar);

    InterfaceC9945d plus(InterfaceC9945d interfaceC9945d);
}
