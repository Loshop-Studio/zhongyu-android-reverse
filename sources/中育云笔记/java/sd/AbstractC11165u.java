package sd;

import kotlin.Result;
import kotlinx.coroutines.InterfaceC10045g;

/* renamed from: sd.u */
/* loaded from: classes6.dex */
public abstract class AbstractC11165u {
    /* renamed from: a */
    public static final InterfaceC11159s m24806a(InterfaceC10045g interfaceC10045g) {
        return new C11162t(interfaceC10045g);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11159s m24807b(InterfaceC10045g interfaceC10045g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10045g = null;
        }
        return m24806a(interfaceC10045g);
    }

    /* renamed from: c */
    public static final boolean m24808c(InterfaceC11159s interfaceC11159s, Object obj) {
        Throwable thM20056e = Result.m20056e(obj);
        return thM20056e == null ? interfaceC11159s.mo24803n(obj) : interfaceC11159s.mo24802a(thM20056e);
    }
}
