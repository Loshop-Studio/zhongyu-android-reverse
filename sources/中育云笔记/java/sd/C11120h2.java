package sd;

import p410xd.AbstractC11859m0;
import p410xd.C11839c0;

/* renamed from: sd.h2 */
/* loaded from: classes6.dex */
public final class C11120h2 {

    /* renamed from: a */
    public static final C11120h2 f26785a = new C11120h2();

    /* renamed from: b */
    public static final ThreadLocal f26786b = AbstractC11859m0.m26303a(new C11839c0("ThreadLocalEventLoop"));

    /* renamed from: a */
    public final AbstractC11175x0 m24729a() {
        return (AbstractC11175x0) f26786b.get();
    }

    /* renamed from: b */
    public final AbstractC11175x0 m24730b() {
        ThreadLocal threadLocal = f26786b;
        AbstractC11175x0 abstractC11175x0 = (AbstractC11175x0) threadLocal.get();
        if (abstractC11175x0 != null) {
            return abstractC11175x0;
        }
        AbstractC11175x0 abstractC11175x0M24674a = AbstractC11091a1.m24674a();
        threadLocal.set(abstractC11175x0M24674a);
        return abstractC11175x0M24674a;
    }

    /* renamed from: c */
    public final void m24731c() {
        f26786b.set(null);
    }

    /* renamed from: d */
    public final void m24732d(AbstractC11175x0 abstractC11175x0) {
        f26786b.set(abstractC11175x0);
    }
}
