package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.o1 */
/* loaded from: classes4.dex */
public abstract class AbstractC5988o1 {

    /* renamed from: a */
    public static final ThreadLocal f9484a = new ThreadLocal();

    /* renamed from: a */
    public static AbstractC5987o0 m5608a() {
        ThreadLocal threadLocal = f9484a;
        AbstractC5987o0 abstractC5987o0 = (AbstractC5987o0) threadLocal.get();
        if (abstractC5987o0 != null) {
            return abstractC5987o0;
        }
        C5889d c5889d = new C5889d(Thread.currentThread());
        threadLocal.set(c5889d);
        return c5889d;
    }
}
