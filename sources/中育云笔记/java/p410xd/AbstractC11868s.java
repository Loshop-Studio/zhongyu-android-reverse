package p410xd;

import java.util.List;
import kotlin.KotlinNothingValueException;
import sd.AbstractC11164t1;

/* renamed from: xd.s */
/* loaded from: classes6.dex */
public abstract class AbstractC11868s {
    /* renamed from: a */
    public static final AbstractC11869t m26344a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m26347d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC11869t m26345b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m26344a(th, str);
    }

    /* renamed from: c */
    public static final boolean m26346c(AbstractC11164t1 abstractC11164t1) {
        return abstractC11164t1.mo24804i() instanceof AbstractC11869t;
    }

    /* renamed from: d */
    public static final Void m26347d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC11164t1 m26348e(InterfaceC11866q interfaceC11866q, List list) {
        try {
            return interfaceC11866q.mo25200b(list);
        } catch (Throwable th) {
            return m26344a(th, interfaceC11866q.mo25199a());
        }
    }
}
