package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10409n;
import p265nd.AbstractC10410o;
import p265nd.InterfaceC10401f;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    public static final Modifier progressSemantics(Modifier modifier, final float f10, final InterfaceC10401f interfaceC10401f, @IntRange(from = 0) final int i10) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC9540l() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) AbstractC10410o.m21764q(Float.valueOf(f10), interfaceC10401f)).floatValue(), interfaceC10401f, i10));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f10, InterfaceC10401f interfaceC10401f, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC10401f = AbstractC10409n.m21749b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return progressSemantics(modifier, f10, interfaceC10401f, i10);
    }

    @Stable
    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC9540l() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
            }
        });
    }
}
