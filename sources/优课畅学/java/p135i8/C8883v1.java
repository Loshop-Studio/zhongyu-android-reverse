package p135i8;

import p191n8.AbstractC9454j0;
import p191n8.C9442d0;

/* renamed from: i8.v1 */
/* loaded from: classes5.dex */
public final class C8883v1 {

    /* renamed from: a */
    public static final C8883v1 f16542a = new C8883v1();

    /* renamed from: b */
    public static final ThreadLocal f16543b = AbstractC9454j0.m17351a(new C9442d0("ThreadLocalEventLoop"));

    /* renamed from: a */
    public final AbstractC8861o0 m14922a() {
        return (AbstractC8861o0) f16543b.get();
    }

    /* renamed from: b */
    public final AbstractC8861o0 m14923b() {
        ThreadLocal threadLocal = f16543b;
        AbstractC8861o0 abstractC8861o0 = (AbstractC8861o0) threadLocal.get();
        if (abstractC8861o0 != null) {
            return abstractC8861o0;
        }
        AbstractC8861o0 abstractC8861o0M14897a = AbstractC8864p0.m14897a();
        threadLocal.set(abstractC8861o0M14897a);
        return abstractC8861o0M14897a;
    }

    /* renamed from: c */
    public final void m14924c() {
        f16543b.set(null);
    }

    /* renamed from: d */
    public final void m14925d(AbstractC8861o0 abstractC8861o0) {
        f16543b.set(abstractC8861o0);
    }
}
