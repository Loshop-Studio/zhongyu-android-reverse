package p135i8;

import kotlinx.coroutines.CoroutineDispatcher;
import p191n8.AbstractC9461n;

/* renamed from: i8.h1 */
/* loaded from: classes5.dex */
public abstract class AbstractC8841h1 extends CoroutineDispatcher {
    /* renamed from: i */
    public abstract AbstractC8841h1 mo14863i();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return this;
    }

    /* renamed from: m */
    public final String m14864m() {
        AbstractC8841h1 abstractC8841h1Mo14863i;
        AbstractC8841h1 abstractC8841h1M14868c = C8843i0.m14868c();
        if (this == abstractC8841h1M14868c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC8841h1Mo14863i = abstractC8841h1M14868c.mo14863i();
        } catch (UnsupportedOperationException unused) {
            abstractC8841h1Mo14863i = null;
        }
        if (this == abstractC8841h1Mo14863i) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
