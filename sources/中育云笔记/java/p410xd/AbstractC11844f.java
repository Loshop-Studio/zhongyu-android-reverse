package p410xd;

import java.util.Collection;
import java.util.ServiceLoader;
import p296pd.AbstractC10666n;
import p296pd.AbstractC10669q;
import sd.InterfaceC11110f0;

/* renamed from: xd.f */
/* loaded from: classes6.dex */
public abstract class AbstractC11844f {

    /* renamed from: a */
    public static final Collection f28085a = AbstractC10669q.m22574F(AbstractC10666n.m22561e(ServiceLoader.load(InterfaceC11110f0.class, InterfaceC11110f0.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final Collection m26259a() {
        return f28085a;
    }

    /* renamed from: b */
    public static final void m26260b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
