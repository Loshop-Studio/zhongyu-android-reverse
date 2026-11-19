package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Stable;
import p077d8.AbstractC8322g;
import p077d8.AbstractC8323h;
import p077d8.InterfaceC8317b;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    public static final Modifier progressSemantics(Modifier modifier, final float f10, final InterfaceC8317b interfaceC8317b, @IntRange(from = 0) final int i10) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C8736p.f16368a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) AbstractC8323h.m13521p(Float.valueOf(f10), interfaceC8317b)).floatValue(), interfaceC8317b, i10));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f10, InterfaceC8317b interfaceC8317b, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC8317b = AbstractC8322g.m13507b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return progressSemantics(modifier, f10, interfaceC8317b, i10);
    }

    @Stable
    public static final Modifier progressSemantics(Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC10570l() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C8736p.f16368a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
            }
        });
    }
}
