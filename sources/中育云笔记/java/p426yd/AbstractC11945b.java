package p426yd;

import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import p181hd.InterfaceC9544p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11853j0;
import p410xd.C11874y;
import sd.AbstractC11155q1;
import sd.C11174x;
import vc.InterfaceC11588c;

/* renamed from: yd.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11945b {
    /* renamed from: a */
    public static final Void m26504a(C11874y c11874y, DispatchException dispatchException) throws Throwable {
        c11874y.m20441i0(new C11174x(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    /* renamed from: b */
    public static final boolean m26505b(C11874y c11874y, Throwable th) {
        return ((th instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th).f23506c == c11874y) ? false : true;
    }

    /* renamed from: c */
    public static final void m26506c(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c interfaceC11588c) {
        InterfaceC11588c interfaceC11588cM26219a = AbstractC11831f.m26219a(interfaceC11588c);
        try {
            InterfaceC9945d context = interfaceC11588cM26219a.getContext();
            Object objM26293i = AbstractC11853j0.m26293i(context, null);
            try {
                AbstractC11831f.m26220b(interfaceC11588cM26219a);
                Object objM20225e = !(interfaceC9544p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m20225e(interfaceC9544p, obj, interfaceC11588cM26219a) : ((InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2)).invoke(obj, interfaceC11588cM26219a);
                AbstractC11853j0.m26290f(context, objM26293i);
                if (objM20225e != AbstractC11725a.m25952f()) {
                    interfaceC11588cM26219a.resumeWith(Result.m20054c(objM20225e));
                }
            } catch (Throwable th) {
                AbstractC11853j0.m26290f(context, objM26293i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588cM26219a.resumeWith(Result.m20054c(AbstractC9924b.m20070a(th)));
        }
    }

    /* renamed from: d */
    public static final Object m26507d(C11874y c11874y, Object obj, InterfaceC9544p interfaceC9544p) {
        return m26509f(c11874y, true, obj, interfaceC9544p);
    }

    /* renamed from: e */
    public static final Object m26508e(C11874y c11874y, Object obj, InterfaceC9544p interfaceC9544p) {
        return m26509f(c11874y, false, obj, interfaceC9544p);
    }

    /* renamed from: f */
    public static final Object m26509f(C11874y c11874y, boolean z10, Object obj, InterfaceC9544p interfaceC9544p) throws Throwable {
        Object c11174x;
        try {
            c11174x = !(interfaceC9544p instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.m20225e(interfaceC9544p, obj, c11874y) : ((InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2)).invoke(obj, c11874y);
        } catch (DispatchException e10) {
            m26504a(c11874y, e10);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            c11174x = new C11174x(th, false, 2, null);
        }
        if (c11174x == AbstractC11725a.m25952f()) {
            return AbstractC11725a.m25952f();
        }
        Object objM20442j0 = c11874y.m20442j0(c11174x);
        if (objM20442j0 == AbstractC11155q1.f26815b) {
            return AbstractC11725a.m25952f();
        }
        c11874y.mo24752J0();
        if (!(objM20442j0 instanceof C11174x)) {
            return AbstractC11155q1.m24797h(objM20442j0);
        }
        if (z10 || m26505b(c11874y, ((C11174x) objM20442j0).f26837a)) {
            throw ((C11174x) objM20442j0).f26837a;
        }
        if (c11174x instanceof C11174x) {
            throw ((C11174x) c11174x).f26837a;
        }
        return c11174x;
    }
}
