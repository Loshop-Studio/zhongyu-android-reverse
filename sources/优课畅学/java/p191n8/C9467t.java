package p191n8;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p101f8.AbstractC8476n;
import p101f8.AbstractC8479q;
import p135i8.AbstractC8841h1;

/* renamed from: n8.t */
/* loaded from: classes5.dex */
public final class C9467t {

    /* renamed from: a */
    public static final C9467t f18690a;

    /* renamed from: b */
    public static final AbstractC8841h1 f18691b;

    static {
        C9467t c9467t = new C9467t();
        f18690a = c9467t;
        AbstractC9444e0.m17326f("kotlinx.coroutines.fast.service.loader", true);
        f18691b = c9467t.m17405a();
    }

    /* renamed from: a */
    public final AbstractC8841h1 m17405a() {
        Object next;
        AbstractC8841h1 abstractC8841h1M17410e;
        try {
            List listM13843F = AbstractC8479q.m13843F(AbstractC8476n.m13830e(ServiceLoader.load(InterfaceC9466s.class, InterfaceC9466s.class.getClassLoader()).iterator()));
            Iterator it = listM13843F.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo15691c = ((InterfaceC9466s) next).mo15691c();
                    do {
                        Object next2 = it.next();
                        int iMo15691c2 = ((InterfaceC9466s) next2).mo15691c();
                        if (iMo15691c < iMo15691c2) {
                            next = next2;
                            iMo15691c = iMo15691c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC9466s interfaceC9466s = (InterfaceC9466s) next;
            if (interfaceC9466s != null && (abstractC8841h1M17410e = AbstractC9468u.m17410e(interfaceC9466s, listM13843F)) != null) {
                return abstractC8841h1M17410e;
            }
            return AbstractC9468u.m17407b(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC9468u.m17407b(th, null, 2, null);
        }
    }
}
