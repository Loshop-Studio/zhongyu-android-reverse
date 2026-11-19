package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t10, InterfaceC9529a interfaceC9529a) {
        ObserverNodeOwnerScope ownerScope$ui_release = t10.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t10);
            t10.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t10).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), interfaceC9529a);
    }
}
