package androidx.compose.foundation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public interface OverscrollEffect {
    @InterfaceC10770a
    static /* synthetic */ void getEffectModifier$annotations() {
    }

    /* renamed from: applyToFling-BMRW4eQ */
    Object mo26928applyToFlingBMRW4eQ(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo26929applyToScrollRhakbz0(long j10, int i10, InterfaceC9540l interfaceC9540l);

    default Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    default DelegatableNode getNode() {
        return new Modifier.Node() { // from class: androidx.compose.foundation.OverscrollEffect$node$1
        };
    }

    boolean isInProgress();
}
