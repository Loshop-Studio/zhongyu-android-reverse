package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final InterfaceC10570l readObserver;
    private final InterfaceC10570l writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final InterfaceC10570l getReadObserver() {
        return this.readObserver;
    }

    public final InterfaceC10570l getWriteObserver() {
        return this.writeObserver;
    }

    public SnapshotInstanceObservers(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.readObserver = interfaceC10570l;
        this.writeObserver = interfaceC10570l2;
    }

    public /* synthetic */ SnapshotInstanceObservers(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : interfaceC10570l, (i10 & 2) != 0 ? null : interfaceC10570l2);
    }
}
