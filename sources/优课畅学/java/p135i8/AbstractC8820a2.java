package p135i8;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C9215q;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9455k;
import p191n8.C9453j;
import p201o7.AbstractC9541f;

/* renamed from: i8.a2 */
/* loaded from: classes5.dex */
public abstract class AbstractC8820a2 {
    /* renamed from: a */
    public static final Object m14803a(InterfaceC9324c interfaceC9324c) {
        Object objM17291f;
        InterfaceC9100d context = interfaceC9324c.getContext();
        AbstractC8823b1.m14814j(context);
        InterfaceC9324c interfaceC9324cM16079d = IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c);
        C9453j c9453j = interfaceC9324cM16079d instanceof C9453j ? (C9453j) interfaceC9324cM16079d : null;
        if (c9453j == null) {
            objM17291f = C8736p.f16368a;
        } else {
            if (c9453j.f18659d.isDispatchNeeded(context)) {
                c9453j.m17345l(context, C8736p.f16368a);
            } else {
                C9215q c9215q = new C9215q();
                InterfaceC9100d interfaceC9100dPlus = context.plus(c9215q);
                C8736p c8736p = C8736p.f16368a;
                c9453j.m17345l(interfaceC9100dPlus, c8736p);
                objM17291f = (!c9215q.f18100a || AbstractC9455k.m17355d(c9453j)) ? AbstractC9434a.m17291f() : c8736p;
            }
            objM17291f = AbstractC9434a.m17291f();
        }
        if (objM17291f == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17291f == AbstractC9434a.m17291f() ? objM17291f : C8736p.f16368a;
    }
}
