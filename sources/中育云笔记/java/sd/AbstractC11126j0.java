package sd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import p410xd.C11848h;
import vc.InterfaceC11588c;

/* renamed from: sd.j0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11126j0 {
    /* renamed from: a */
    public static final String m24738a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m24739b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m24740c(InterfaceC11588c interfaceC11588c) {
        Object objM20054c;
        if (interfaceC11588c instanceof C11848h) {
            return ((C11848h) interfaceC11588c).toString();
        }
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(interfaceC11588c + '@' + m24739b(interfaceC11588c));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20056e(objM20054c) != null) {
            objM20054c = interfaceC11588c.getClass().getName() + '@' + m24739b(interfaceC11588c);
        }
        return (String) objM20054c;
    }
}
