package p426yd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.DispatchException;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p410xd.AbstractC11850i;
import vc.InterfaceC11588c;

/* renamed from: yd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC11944a {
    /* renamed from: a */
    public static final void m26501a(InterfaceC11588c interfaceC11588c, Throwable th) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11588c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m26502b(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c interfaceC11588c) {
        try {
            InterfaceC11588c interfaceC11588cM20224d = IntrinsicsKt__IntrinsicsJvmKt.m20224d(IntrinsicsKt__IntrinsicsJvmKt.m20222b(interfaceC9544p, obj, interfaceC11588c));
            Result.C9921a c9921a = Result.f23263d;
            AbstractC11850i.m26278b(interfaceC11588cM20224d, Result.m20054c(C10786q.f26013a));
        } catch (Throwable th) {
            m26501a(interfaceC11588c, th);
        }
    }

    /* renamed from: c */
    public static final void m26503c(InterfaceC11588c interfaceC11588c, InterfaceC11588c interfaceC11588c2) throws Throwable {
        try {
            InterfaceC11588c interfaceC11588cM20224d = IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c);
            Result.C9921a c9921a = Result.f23263d;
            AbstractC11850i.m26278b(interfaceC11588cM20224d, Result.m20054c(C10786q.f26013a));
        } catch (Throwable th) {
            m26501a(interfaceC11588c2, th);
        }
    }
}
