package p135i8;

import kotlin.Result;
import kotlinx.coroutines.InterfaceC9212n;

/* renamed from: i8.t */
/* loaded from: classes5.dex */
public abstract class AbstractC8875t {
    /* renamed from: a */
    public static final InterfaceC8869r m14912a(InterfaceC9212n interfaceC9212n) {
        return new C8872s(interfaceC9212n);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8869r m14913b(InterfaceC9212n interfaceC9212n, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9212n = null;
        }
        return m14912a(interfaceC9212n);
    }

    /* renamed from: c */
    public static final boolean m14914c(InterfaceC8869r interfaceC8869r, Object obj) {
        Throwable thM15911d = Result.m15911d(obj);
        return thM15911d == null ? interfaceC8869r.mo14905h(obj) : interfaceC8869r.mo14904a(thM15911d);
    }
}
