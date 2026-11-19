package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.compose.runtime.snapshots.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C2071a implements ObserverHandle {

    /* renamed from: a */
    public final /* synthetic */ int f792a;

    /* renamed from: b */
    public final /* synthetic */ Object f793b;

    public /* synthetic */ C2071a(Object obj, int i) {
        this.f792a = i;
        this.f793b = obj;
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public final void dispose() {
        switch (this.f792a) {
            case 0:
                Snapshot.Companion.registerApplyObserver$lambda$4((InterfaceC6473e) this.f793b);
                break;
            case 1:
                Snapshot.Companion.registerGlobalWriteObserver$lambda$7((InterfaceC6471c) this.f793b);
                break;
            default:
                SnapshotObserverKt.observeSnapshots$lambda$3((SnapshotObserver) this.f793b);
                break;
        }
    }
}
