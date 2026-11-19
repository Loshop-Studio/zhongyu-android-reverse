package p135i8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* renamed from: i8.y */
/* loaded from: classes5.dex */
public abstract class AbstractC8890y {
    /* renamed from: a */
    public static final Object m14934a(Object obj, InterfaceC9324c interfaceC9324c) {
        if (!(obj instanceof C8884w)) {
            return Result.m15909b(obj);
        }
        Result.C9076a c9076a = Result.f17350b;
        return Result.m15909b(AbstractC9079b.m15925a(((C8884w) obj).f16545a));
    }

    /* renamed from: b */
    public static final Object m14935b(Object obj, InterfaceC8845j interfaceC8845j) {
        Throwable thM15911d = Result.m15911d(obj);
        return thM15911d == null ? obj : new C8884w(thM15911d, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m14936c(Object obj, InterfaceC10570l interfaceC10570l) {
        Throwable thM15911d = Result.m15911d(obj);
        return thM15911d == null ? interfaceC10570l != null ? new C8887x(obj, interfaceC10570l) : obj : new C8884w(thM15911d, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m14937d(Object obj, InterfaceC10570l interfaceC10570l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = null;
        }
        return m14936c(obj, interfaceC10570l);
    }
}
