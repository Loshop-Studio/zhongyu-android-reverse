package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final InterfaceC9540l readObserver;
    private final InterfaceC9540l writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final InterfaceC9540l getReadObserver() {
        return this.readObserver;
    }

    public final InterfaceC9540l getWriteObserver() {
        return this.writeObserver;
    }

    public SnapshotInstanceObservers(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.readObserver = interfaceC9540l;
        this.writeObserver = interfaceC9540l2;
    }

    public /* synthetic */ SnapshotInstanceObservers(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9540l, (i10 & 2) != 0 ? null : interfaceC9540l2);
    }
}
