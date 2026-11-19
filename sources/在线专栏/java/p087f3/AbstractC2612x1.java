package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.x1 */
/* loaded from: classes.dex */
public abstract class AbstractC2612x1 extends AbstractC2545e0 {
    @NotNull
    /* renamed from: L */
    public abstract AbstractC2612x1 mo8757L();

    @Nullable
    /* renamed from: M */
    protected final String m8758M() {
        AbstractC2612x1 abstractC2612x1Mo8757L;
        AbstractC2612x1 abstractC2612x1M8752c = C2605v0.m8752c();
        if (this == abstractC2612x1M8752c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC2612x1Mo8757L = abstractC2612x1M8752c.mo8757L();
        } catch (UnsupportedOperationException unused) {
            abstractC2612x1Mo8757L = null;
        }
        if (this == abstractC2612x1Mo8757L) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        String strM8758M = m8758M();
        if (strM8758M != null) {
            return strM8758M;
        }
        return C2573l0.m8591a(this) + '@' + C2573l0.m8592b(this);
    }
}
