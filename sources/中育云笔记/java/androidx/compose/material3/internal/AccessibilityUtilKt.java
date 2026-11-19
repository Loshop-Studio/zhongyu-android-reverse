package androidx.compose.material3.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding;
    private static final Modifier IncreaseHorizontalSemanticsBounds;

    static {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(10);
        HorizontalSemanticsBoundsPadding = fM33501constructorimpl;
        IncreaseHorizontalSemanticsBounds = PaddingKt.m27460paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new InterfaceC9545q() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1
            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m29502invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m29502invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                final int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(AccessibilityUtilKt.getHorizontalSemanticsBoundsPadding());
                int i10 = iMo27093roundToPx0680j_4 * 2;
                final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j10, i10, 0));
                return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth() - i10, placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, -iMo27093roundToPx0680j_4, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$2
            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }
        }), fM33501constructorimpl, 0.0f, 2, null);
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    @VisibleForTesting
    public static /* synthetic */ void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }
}
