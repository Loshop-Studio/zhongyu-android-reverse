package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8877t1;
import p191n8.C9442d0;
import p191n8.C9460m0;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class ThreadContextKt {

    /* renamed from: a */
    public static final C9442d0 f18077a = new C9442d0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final InterfaceC10574p f18078b = new InterfaceC10574p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // p300x7.InterfaceC10574p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC9100d.b bVar) {
            if (!(bVar instanceof InterfaceC8877t1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    };

    /* renamed from: c */
    public static final InterfaceC10574p f18079c = new InterfaceC10574p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // p300x7.InterfaceC10574p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8877t1 invoke(InterfaceC8877t1 interfaceC8877t1, InterfaceC9100d.b bVar) {
            if (interfaceC8877t1 != null) {
                return interfaceC8877t1;
            }
            if (bVar instanceof InterfaceC8877t1) {
                return (InterfaceC8877t1) bVar;
            }
            return null;
        }
    };

    /* renamed from: d */
    public static final InterfaceC10574p f18080d = new InterfaceC10574p() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // p300x7.InterfaceC10574p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9460m0 invoke(C9460m0 c9460m0, InterfaceC9100d.b bVar) {
            if (bVar instanceof InterfaceC8877t1) {
                InterfaceC8877t1 interfaceC8877t1 = (InterfaceC8877t1) bVar;
                c9460m0.m17378a(interfaceC8877t1, interfaceC8877t1.updateThreadContext(c9460m0.f18675a));
            }
            return c9460m0;
        }
    };

    /* renamed from: a */
    public static final void m16747a(InterfaceC9100d interfaceC9100d, Object obj) {
        if (obj == f18077a) {
            return;
        }
        if (obj instanceof C9460m0) {
            ((C9460m0) obj).m17379b(interfaceC9100d);
            return;
        }
        Object objFold = interfaceC9100d.fold(null, f18079c);
        AbstractC9133u.m16131e(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC8877t1) objFold).restoreThreadContext(interfaceC9100d, obj);
    }

    /* renamed from: b */
    public static final Object m16748b(InterfaceC9100d interfaceC9100d) {
        Object objFold = interfaceC9100d.fold(0, f18078b);
        AbstractC9133u.m16130d(objFold);
        return objFold;
    }

    /* renamed from: c */
    public static final Object m16749c(InterfaceC9100d interfaceC9100d, Object obj) {
        if (obj == null) {
            obj = m16748b(interfaceC9100d);
        }
        if (obj == 0) {
            return f18077a;
        }
        if (obj instanceof Integer) {
            return interfaceC9100d.fold(new C9460m0(interfaceC9100d, ((Number) obj).intValue()), f18080d);
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC8877t1) obj).updateThreadContext(interfaceC9100d);
    }
}
