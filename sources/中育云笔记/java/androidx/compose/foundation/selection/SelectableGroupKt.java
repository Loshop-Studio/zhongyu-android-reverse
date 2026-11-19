package androidx.compose.foundation.selection;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class SelectableGroupKt {
    @Stable
    public static final Modifier selectableGroup(Modifier modifier) {
        return SemanticsModifierKt.semantics$default(modifier, false, new InterfaceC9540l() { // from class: androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
            }
        }, 1, null);
    }
}
