package androidx.compose.foundation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes.dex */
public interface OverscrollEffect {
    @InterfaceC8721a
    static /* synthetic */ void getEffectModifier$annotations() {
    }

    /* renamed from: applyToFling-BMRW4eQ */
    Object mo20326applyToFlingBMRW4eQ(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo20327applyToScrollRhakbz0(long j10, int i10, InterfaceC10570l interfaceC10570l);

    default Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    default DelegatableNode getNode() {
        return new Modifier.Node() { // from class: androidx.compose.foundation.OverscrollEffect$node$1
        };
    }

    boolean isInProgress();
}
