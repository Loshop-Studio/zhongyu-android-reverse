package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m30443isReadInh_f27i8$runtime_release(int i10) {
        return (i10 & ReaderKind.m30427constructorimpl(this.readerKind.get())) != 0;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m30444recordReadInh_f27i8$runtime_release(int i10) {
        int iM30427constructorimpl;
        do {
            iM30427constructorimpl = ReaderKind.m30427constructorimpl(this.readerKind.get());
            if ((iM30427constructorimpl & i10) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iM30427constructorimpl, ReaderKind.m30427constructorimpl(iM30427constructorimpl | i10)));
    }
}
