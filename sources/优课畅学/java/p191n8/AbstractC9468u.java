package p191n8;

import java.util.List;
import kotlin.KotlinNothingValueException;
import p135i8.AbstractC8841h1;

/* renamed from: n8.u */
/* loaded from: classes5.dex */
public abstract class AbstractC9468u {
    /* renamed from: a */
    public static final AbstractC9469v m17406a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m17409d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC9469v m17407b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m17406a(th, str);
    }

    /* renamed from: c */
    public static final boolean m17408c(AbstractC8841h1 abstractC8841h1) {
        return abstractC8841h1.mo14863i() instanceof AbstractC9469v;
    }

    /* renamed from: d */
    public static final Void m17409d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC8841h1 m17410e(InterfaceC9466s interfaceC9466s, List list) {
        try {
            return interfaceC9466s.mo15690b(list);
        } catch (Throwable th) {
            return m17406a(th, interfaceC9466s.mo15689a());
        }
    }
}
