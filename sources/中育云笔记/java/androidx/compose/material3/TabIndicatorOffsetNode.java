package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;
    private C3186Dp initialOffset;
    private C3186Dp initialWidth;
    private Animatable<C3186Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<C3186Dp, AnimationVector1D> widthAnimatable;

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> state, int i10, boolean z10) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i10;
        this.followContentSize = z10;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC9540l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        float fM29190getContentWidthD9Ej5fM = this.followContentSize ? this.tabPositionsState.getValue().get(this.selectedTabIndex).m29190getContentWidthD9Ej5fM() : this.tabPositionsState.getValue().get(this.selectedTabIndex).m29193getWidthD9Ej5fM();
        if (this.initialWidth != null) {
            Animatable<C3186Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                C3186Dp c3186Dp = this.initialWidth;
                AbstractC9979u.m20291d(c3186Dp);
                Animatable<C3186Dp, AnimationVector1D> animatable2 = new Animatable<>(c3186Dp, VectorConvertersKt.getVectorConverter(C3186Dp.Companion), null, null, 12, null);
                this.widthAnimatable = animatable2;
                animatable = animatable2;
            }
            if (!C3186Dp.m33506equalsimpl0(fM29190getContentWidthD9Ej5fM, animatable.getTargetValue().m33515unboximpl())) {
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, fM29190getContentWidthD9Ej5fM, null), 3, null);
            }
        } else {
            this.initialWidth = C3186Dp.m33499boximpl(fM29190getContentWidthD9Ej5fM);
        }
        float fM29191getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m29191getLeftD9Ej5fM();
        if (this.initialOffset != null) {
            Animatable<C3186Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
            if (animatable3 == null) {
                C3186Dp c3186Dp2 = this.initialOffset;
                AbstractC9979u.m20291d(c3186Dp2);
                Animatable<C3186Dp, AnimationVector1D> animatable4 = new Animatable<>(c3186Dp2, VectorConvertersKt.getVectorConverter(C3186Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable4;
                animatable3 = animatable4;
            }
            if (!C3186Dp.m33506equalsimpl0(fM29191getLeftD9Ej5fM, animatable3.getTargetValue().m33515unboximpl())) {
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable3, fM29191getLeftD9Ej5fM, null), 3, null);
            }
        } else {
            this.initialOffset = C3186Dp.m33499boximpl(fM29191getLeftD9Ej5fM);
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable<C3186Dp, AnimationVector1D> animatable5 = this.offsetAnimatable;
            if (animatable5 != null) {
                fM29191getLeftD9Ej5fM = animatable5.getValue().m33515unboximpl();
            }
        } else {
            Animatable<C3186Dp, AnimationVector1D> animatable6 = this.offsetAnimatable;
            if (animatable6 != null) {
                fM29191getLeftD9Ej5fM = animatable6.getValue().m33515unboximpl();
            }
            fM29191getLeftD9Ej5fM = C3186Dp.m33501constructorimpl(-fM29191getLeftD9Ej5fM);
        }
        Animatable<C3186Dp, AnimationVector1D> animatable7 = this.widthAnimatable;
        if (animatable7 != null) {
            fM29190getContentWidthD9Ej5fM = animatable7.getValue().m33515unboximpl();
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(Constraints.m33444copyZbe2FdA$default(j10, measureScope.mo27093roundToPx0680j_4(fM29190getContentWidthD9Ej5fM), measureScope.mo27093roundToPx0680j_4(fM29190getContentWidthD9Ej5fM), 0, 0, 12, null));
        final float f10 = fM29191getLeftD9Ej5fM;
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, measureScope.mo27093roundToPx0680j_4(f10), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setFollowContentSize(boolean z10) {
        this.followContentSize = z10;
    }

    public final void setSelectedTabIndex(int i10) {
        this.selectedTabIndex = i10;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }
}
