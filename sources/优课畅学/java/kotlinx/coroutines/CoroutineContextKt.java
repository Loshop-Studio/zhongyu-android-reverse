package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.Ref$ObjectRef;
import p135i8.C8843i0;
import p135i8.C8889x1;
import p135i8.C8892y1;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9538c;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class CoroutineContextKt {
    /* renamed from: a */
    public static final InterfaceC9100d m16212a(InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2, final boolean z10) {
        boolean zM16214c = m16214c(interfaceC9100d);
        boolean zM16214c2 = m16214c(interfaceC9100d2);
        if (!zM16214c && !zM16214c2) {
            return interfaceC9100d.plus(interfaceC9100d2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = interfaceC9100d2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17438a;
        InterfaceC9100d interfaceC9100d3 = (InterfaceC9100d) interfaceC9100d.fold(emptyCoroutineContext, new InterfaceC10574p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC9100d invoke(InterfaceC9100d interfaceC9100d4, InterfaceC9100d.b bVar) {
                return interfaceC9100d4.plus(bVar);
            }
        });
        if (zM16214c2) {
            ref$ObjectRef.f17473a = ((InterfaceC9100d) ref$ObjectRef.f17473a).fold(emptyCoroutineContext, new InterfaceC10574p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // p300x7.InterfaceC10574p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InterfaceC9100d invoke(InterfaceC9100d interfaceC9100d4, InterfaceC9100d.b bVar) {
                    return interfaceC9100d4.plus(bVar);
                }
            });
        }
        return interfaceC9100d3.plus((InterfaceC9100d) ref$ObjectRef.f17473a);
    }

    /* renamed from: b */
    public static final String m16213b(InterfaceC9100d interfaceC9100d) {
        return null;
    }

    /* renamed from: c */
    public static final boolean m16214c(InterfaceC9100d interfaceC9100d) {
        return ((Boolean) interfaceC9100d.fold(Boolean.FALSE, new InterfaceC10574p() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            /* renamed from: a */
            public final Boolean m16221a(boolean z10, InterfaceC9100d.b bVar) {
                return Boolean.valueOf(z10);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m16221a(((Boolean) obj).booleanValue(), (InterfaceC9100d.b) obj2);
            }
        })).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC9100d m16215d(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d) {
        InterfaceC9100d interfaceC9100dM16212a = m16212a(interfaceC8822b0.getCoroutineContext(), interfaceC9100d, true);
        return (interfaceC9100dM16212a == C8843i0.m14866a() || interfaceC9100dM16212a.get(InterfaceC9099c.f17441b0) != null) ? interfaceC9100dM16212a : interfaceC9100dM16212a.plus(C8843i0.m14866a());
    }

    /* renamed from: e */
    public static final InterfaceC9100d m16216e(InterfaceC9100d interfaceC9100d, InterfaceC9100d interfaceC9100d2) {
        return !m16214c(interfaceC9100d2) ? interfaceC9100d.plus(interfaceC9100d2) : m16212a(interfaceC9100d, interfaceC9100d2, false);
    }

    /* renamed from: f */
    public static final C8889x1 m16217f(InterfaceC9538c interfaceC9538c) {
        while (!(interfaceC9538c instanceof C9204h) && (interfaceC9538c = interfaceC9538c.getCallerFrame()) != null) {
            if (interfaceC9538c instanceof C8889x1) {
                return (C8889x1) interfaceC9538c;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C8889x1 m16218g(InterfaceC9324c interfaceC9324c, InterfaceC9100d interfaceC9100d, Object obj) {
        if (!(interfaceC9324c instanceof InterfaceC9538c) || interfaceC9100d.get(C8892y1.f16554a) == null) {
            return null;
        }
        C8889x1 c8889x1M16217f = m16217f((InterfaceC9538c) interfaceC9324c);
        if (c8889x1M16217f != null) {
            c8889x1M16217f.m14933L0(interfaceC9100d, obj);
        }
        return c8889x1M16217f;
    }
}
