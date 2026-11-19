package p410xd;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p296pd.AbstractC10666n;
import p296pd.AbstractC10669q;
import sd.AbstractC11164t1;

/* renamed from: xd.r */
/* loaded from: classes6.dex */
public final class C11867r {

    /* renamed from: a */
    public static final C11867r f28127a;

    /* renamed from: b */
    public static final AbstractC11164t1 f28128b;

    static {
        C11867r c11867r = new C11867r();
        f28127a = c11867r;
        AbstractC11841d0.m26254f("kotlinx.coroutines.fast.service.loader", true);
        f28128b = c11867r.m26343a();
    }

    /* renamed from: a */
    public final AbstractC11164t1 m26343a() {
        Object next;
        AbstractC11164t1 abstractC11164t1M26348e;
        try {
            List listM22574F = AbstractC10669q.m22574F(AbstractC10666n.m22561e(ServiceLoader.load(InterfaceC11866q.class, InterfaceC11866q.class.getClassLoader()).iterator()));
            Iterator it = listM22574F.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo25201c = ((InterfaceC11866q) next).mo25201c();
                    do {
                        Object next2 = it.next();
                        int iMo25201c2 = ((InterfaceC11866q) next2).mo25201c();
                        if (iMo25201c < iMo25201c2) {
                            next = next2;
                            iMo25201c = iMo25201c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC11866q interfaceC11866q = (InterfaceC11866q) next;
            if (interfaceC11866q != null && (abstractC11164t1M26348e = AbstractC11868s.m26348e(interfaceC11866q, listM22574F)) != null) {
                return abstractC11164t1M26348e;
            }
            return AbstractC11868s.m26345b(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC11868s.m26345b(th, null, 2, null);
        }
    }
}
