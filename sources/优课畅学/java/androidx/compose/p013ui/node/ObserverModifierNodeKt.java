package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t10, InterfaceC10559a interfaceC10559a) {
        ObserverNodeOwnerScope ownerScope$ui_release = t10.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t10);
            t10.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t10).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), interfaceC10559a);
    }
}
