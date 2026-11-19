package p135i8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import p179m7.InterfaceC9324c;
import p191n8.C9453j;

/* renamed from: i8.c0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8825c0 {
    /* renamed from: a */
    public static final String m14820a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m14821b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m14822c(InterfaceC9324c interfaceC9324c) {
        Object objM15909b;
        if (interfaceC9324c instanceof C9453j) {
            return interfaceC9324c.toString();
        }
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(interfaceC9324c + '@' + m14821b(interfaceC9324c));
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15911d(objM15909b) != null) {
            objM15909b = interfaceC9324c.getClass().getName() + '@' + m14821b(interfaceC9324c);
        }
        return (String) objM15909b;
    }
}
