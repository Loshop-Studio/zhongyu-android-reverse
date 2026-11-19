package p135i8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9204h;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.internal.ThreadContextKt;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.C9473z;
import p201o7.AbstractC9541f;
import p202o8.AbstractC9544a;
import p202o8.AbstractC9545b;
import p300x7.InterfaceC10574p;

/* renamed from: i8.h */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC8839h {
    /* renamed from: a */
    public static final InterfaceC8831e0 m14858a(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p) {
        InterfaceC9100d interfaceC9100dM16215d = CoroutineContextKt.m16215d(interfaceC8822b0, interfaceC9100d);
        C8834f0 c8835f1 = coroutineStart.m16225c() ? new C8835f1(interfaceC9100dM16215d, interfaceC10574p) : new C8834f0(interfaceC9100dM16215d, true);
        c8835f1.m16331J0(coroutineStart, c8835f1, interfaceC10574p);
        return c8835f1;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8831e0 m14859b(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f17552a;
        }
        return AbstractC8833f.m14842a(interfaceC8822b0, interfaceC9100d, coroutineStart, interfaceC10574p);
    }

    /* renamed from: c */
    public static final InterfaceC9212n m14860c(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p) {
        InterfaceC9100d interfaceC9100dM16215d = CoroutineContextKt.m16215d(interfaceC8822b0, interfaceC9100d);
        C8865p1 c8838g1 = coroutineStart.m16225c() ? new C8838g1(interfaceC9100dM16215d, interfaceC10574p) : new C8865p1(interfaceC9100dM16215d, true);
        c8838g1.m16331J0(coroutineStart, c8838g1, interfaceC10574p);
        return c8838g1;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9212n m14861d(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f17552a;
        }
        return AbstractC8833f.m14844c(interfaceC8822b0, interfaceC9100d, coroutineStart, interfaceC10574p);
    }

    /* renamed from: e */
    public static final Object m14862e(InterfaceC9100d interfaceC9100d, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) throws Throwable {
        Object objM16722K0;
        InterfaceC9100d context = interfaceC9324c.getContext();
        InterfaceC9100d interfaceC9100dM16216e = CoroutineContextKt.m16216e(context, interfaceC9100d);
        AbstractC8823b1.m14814j(interfaceC9100dM16216e);
        if (interfaceC9100dM16216e == context) {
            C9473z c9473z = new C9473z(interfaceC9100dM16216e, interfaceC9324c);
            objM16722K0 = AbstractC9545b.m17820b(c9473z, c9473z, interfaceC10574p);
        } else {
            InterfaceC9099c.b bVar = InterfaceC9099c.f17441b0;
            if (AbstractC9133u.m16128b(interfaceC9100dM16216e.get(bVar), context.get(bVar))) {
                C8889x1 c8889x1 = new C8889x1(interfaceC9100dM16216e, interfaceC9324c);
                InterfaceC9100d context2 = c8889x1.getContext();
                Object objM16749c = ThreadContextKt.m16749c(context2, null);
                try {
                    Object objM17820b = AbstractC9545b.m17820b(c8889x1, c8889x1, interfaceC10574p);
                    ThreadContextKt.m16747a(context2, objM16749c);
                    objM16722K0 = objM17820b;
                } catch (Throwable th) {
                    ThreadContextKt.m16747a(context2, objM16749c);
                    throw th;
                }
            } else {
                C9204h c9204h = new C9204h(interfaceC9100dM16216e, interfaceC9324c);
                AbstractC9544a.m17818d(interfaceC10574p, c9204h, c9204h, null, 4, null);
                objM16722K0 = c9204h.m16722K0();
            }
        }
        if (objM16722K0 == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16722K0;
    }
}
