package p135i8;

import kotlinx.coroutines.CoroutineDispatcher;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* renamed from: i8.j */
/* loaded from: classes5.dex */
public interface InterfaceC8845j extends InterfaceC9324c {

    /* renamed from: i8.j$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m14876a(InterfaceC8845j interfaceC8845j, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC8845j.mo14871i(th);
        }
    }

    /* renamed from: g */
    void mo14870g(Object obj, InterfaceC10570l interfaceC10570l);

    /* renamed from: i */
    boolean mo14871i(Throwable th);

    boolean isActive();

    /* renamed from: q */
    void mo14872q(CoroutineDispatcher coroutineDispatcher, Object obj);

    /* renamed from: r */
    void mo14873r(InterfaceC10570l interfaceC10570l);

    /* renamed from: t */
    Object mo14874t(Object obj, Object obj2, InterfaceC10570l interfaceC10570l);

    /* renamed from: w */
    void mo14875w(Object obj);
}
