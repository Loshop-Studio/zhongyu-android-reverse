package p394wd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11853j0;
import vc.InterfaceC11588c;

/* renamed from: wd.d */
/* loaded from: classes6.dex */
public abstract class AbstractC11729d {
    /* renamed from: b */
    public static final Object m25961b(InterfaceC9945d interfaceC9945d, Object obj, Object obj2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        Object objM26293i = AbstractC11853j0.m26293i(interfaceC9945d, obj2);
        try {
            C11742q c11742q = new C11742q(interfaceC11588c, interfaceC9945d);
            Object objM20225e = !(interfaceC9544p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m20225e(interfaceC9544p, obj, c11742q) : ((InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2)).invoke(obj, c11742q);
            AbstractC11853j0.m26290f(interfaceC9945d, objM26293i);
            if (objM20225e == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20225e;
        } catch (Throwable th) {
            AbstractC11853j0.m26290f(interfaceC9945d, objM26293i);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m25962c(InterfaceC9945d interfaceC9945d, Object obj, Object obj2, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = AbstractC11853j0.m26291g(interfaceC9945d);
        }
        return m25961b(interfaceC9945d, obj, obj2, interfaceC9544p, interfaceC11588c);
    }

    /* renamed from: d */
    public static final InterfaceC11595d m25963d(InterfaceC11595d interfaceC11595d, InterfaceC9945d interfaceC9945d) {
        return ((interfaceC11595d instanceof C11741p) || (interfaceC11595d instanceof C11736k)) ? interfaceC11595d : new UndispatchedContextCollector(interfaceC11595d, interfaceC9945d);
    }
}
