package p135i8;

import kotlinx.coroutines.InterfaceC9203g;
import kotlinx.coroutines.RunnableC9166f;
import p191n8.AbstractC9444e0;
import p191n8.AbstractC9468u;

/* renamed from: i8.d0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8828d0 {

    /* renamed from: a */
    public static final boolean f16498a = AbstractC9444e0.m17326f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    public static final InterfaceC9203g f16499b = m14828b();

    /* renamed from: a */
    public static final InterfaceC9203g m14827a() {
        return f16499b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final InterfaceC9203g m14828b() {
        if (!f16498a) {
            return RunnableC9166f.f17681g;
        }
        AbstractC8841h1 abstractC8841h1M14868c = C8843i0.m14868c();
        return (AbstractC9468u.m17408c(abstractC8841h1M14868c) || !(abstractC8841h1M14868c instanceof InterfaceC9203g)) ? RunnableC9166f.f17681g : (InterfaceC9203g) abstractC8841h1M14868c;
    }
}
