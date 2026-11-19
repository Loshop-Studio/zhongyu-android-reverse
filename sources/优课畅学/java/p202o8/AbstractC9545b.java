package p202o8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ThreadContextKt;
import p135i8.AbstractC8832e1;
import p135i8.C8884w;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.C9473z;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10574p;

/* renamed from: o8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9545b {
    /* renamed from: a */
    public static final void m17819a(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c interfaceC9324c) {
        InterfaceC9324c interfaceC9324cM17809a = AbstractC9541f.m17809a(interfaceC9324c);
        try {
            InterfaceC9100d context = interfaceC9324c.getContext();
            Object objM16749c = ThreadContextKt.m16749c(context, null);
            try {
                Object objM16080e = !(interfaceC10574p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m16080e(interfaceC10574p, obj, interfaceC9324cM17809a) : ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(obj, interfaceC9324cM17809a);
                ThreadContextKt.m16747a(context, objM16749c);
                if (objM16080e != AbstractC9434a.m17291f()) {
                    interfaceC9324cM17809a.resumeWith(Result.m15909b(objM16080e));
                }
            } catch (Throwable th) {
                ThreadContextKt.m16747a(context, objM16749c);
                throw th;
            }
        } catch (Throwable th2) {
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324cM17809a.resumeWith(Result.m15909b(AbstractC9079b.m15925a(th2)));
        }
    }

    /* renamed from: b */
    public static final Object m17820b(C9473z c9473z, Object obj, InterfaceC10574p interfaceC10574p) {
        Object c8884w;
        try {
            c8884w = !(interfaceC10574p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m16080e(interfaceC10574p, obj, c9473z) : ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(obj, c9473z);
        } catch (Throwable th) {
            c8884w = new C8884w(th, false, 2, null);
        }
        if (c8884w == AbstractC9434a.m17291f()) {
            return AbstractC9434a.m17291f();
        }
        Object objM16286j0 = c9473z.m16286j0(c8884w);
        if (objM16286j0 == AbstractC8832e1.f16503b) {
            return AbstractC9434a.m17291f();
        }
        if (objM16286j0 instanceof C8884w) {
            throw ((C8884w) objM16286j0).f16545a;
        }
        return AbstractC8832e1.m14841h(objM16286j0);
    }

    /* renamed from: c */
    public static final Object m17821c(C9473z c9473z, Object obj, InterfaceC10574p interfaceC10574p) throws Throwable {
        Object c8884w;
        try {
            c8884w = !(interfaceC10574p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m16080e(interfaceC10574p, obj, c9473z) : ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(obj, c9473z);
        } catch (Throwable th) {
            c8884w = new C8884w(th, false, 2, null);
        }
        if (c8884w == AbstractC9434a.m17291f()) {
            return AbstractC9434a.m17291f();
        }
        Object objM16286j0 = c9473z.m16286j0(c8884w);
        if (objM16286j0 == AbstractC8832e1.f16503b) {
            return AbstractC9434a.m17291f();
        }
        if (objM16286j0 instanceof C8884w) {
            Throwable th2 = ((C8884w) objM16286j0).f16545a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f17582a != c9473z) {
                throw th2;
            }
            if (c8884w instanceof C8884w) {
                throw ((C8884w) c8884w).f16545a;
            }
        } else {
            c8884w = AbstractC8832e1.m14841h(objM16286j0);
        }
        return c8884w;
    }
}
