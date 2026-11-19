package sd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import vc.InterfaceC11588c;

/* renamed from: sd.y */
/* loaded from: classes6.dex */
public abstract class AbstractC11177y {
    /* renamed from: a */
    public static final Object m24828a(Object obj, InterfaceC11588c interfaceC11588c) {
        if (!(obj instanceof C11174x)) {
            return Result.m20054c(obj);
        }
        Result.C9921a c9921a = Result.f23263d;
        return Result.m20054c(AbstractC9924b.m20070a(((C11174x) obj).f26837a));
    }

    /* renamed from: b */
    public static final Object m24829b(Object obj) {
        Throwable thM20056e = Result.m20056e(obj);
        return thM20056e == null ? obj : new C11174x(thM20056e, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m24830c(Object obj, InterfaceC11125j interfaceC11125j) {
        Throwable thM20056e = Result.m20056e(obj);
        return thM20056e == null ? obj : new C11174x(thM20056e, false, 2, null);
    }
}
