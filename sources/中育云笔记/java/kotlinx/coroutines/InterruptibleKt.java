package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9529a;
import sd.AbstractC11109f;
import sd.AbstractC11147o1;
import sd.C11124i2;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class InterruptibleKt {
    /* renamed from: b */
    public static final Object m20380b(InterfaceC9945d interfaceC9945d, InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c) {
        return AbstractC11109f.m24709g(interfaceC9945d, new InterruptibleKt$runInterruptible$2(interfaceC9529a, null), interfaceC11588c);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m20381c(InterfaceC9945d interfaceC9945d, InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        return m20380b(interfaceC9945d, interfaceC9529a, interfaceC11588c);
    }

    /* renamed from: d */
    public static final Object m20382d(InterfaceC9945d interfaceC9945d, InterfaceC9529a interfaceC9529a) throws Throwable {
        try {
            C11124i2 c11124i2 = new C11124i2();
            c11124i2.m24734A(AbstractC11147o1.m24777k(interfaceC9945d));
            try {
                return interfaceC9529a.invoke();
            } finally {
                c11124i2.m24735x();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
