package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;
    private C3156Dp initialOffset;
    private C3156Dp initialWidth;
    private Animatable<C3156Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<C3156Dp, AnimationVector1D> widthAnimatable;

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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC10570l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        float fM22588getContentWidthD9Ej5fM = this.followContentSize ? this.tabPositionsState.getValue().get(this.selectedTabIndex).m22588getContentWidthD9Ej5fM() : this.tabPositionsState.getValue().get(this.selectedTabIndex).m22591getWidthD9Ej5fM();
        if (this.initialWidth != null) {
            Animatable<C3156Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                C3156Dp c3156Dp = this.initialWidth;
                AbstractC9133u.m16130d(c3156Dp);
                Animatable<C3156Dp, AnimationVector1D> animatable2 = new Animatable<>(c3156Dp, VectorConvertersKt.getVectorConverter(C3156Dp.Companion), null, null, 12, null);
                this.widthAnimatable = animatable2;
                animatable = animatable2;
            }
            if (!C3156Dp.m26904equalsimpl0(fM22588getContentWidthD9Ej5fM, animatable.getTargetValue().m26913unboximpl())) {
                AbstractC8839h.m14861d(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, fM22588getContentWidthD9Ej5fM, null), 3, null);
            }
        } else {
            this.initialWidth = C3156Dp.m26897boximpl(fM22588getContentWidthD9Ej5fM);
        }
        float fM22589getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m22589getLeftD9Ej5fM();
        if (this.initialOffset != null) {
            Animatable<C3156Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
            if (animatable3 == null) {
                C3156Dp c3156Dp2 = this.initialOffset;
                AbstractC9133u.m16130d(c3156Dp2);
                Animatable<C3156Dp, AnimationVector1D> animatable4 = new Animatable<>(c3156Dp2, VectorConvertersKt.getVectorConverter(C3156Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable4;
                animatable3 = animatable4;
            }
            if (!C3156Dp.m26904equalsimpl0(fM22589getLeftD9Ej5fM, animatable3.getTargetValue().m26913unboximpl())) {
                AbstractC8839h.m14861d(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable3, fM22589getLeftD9Ej5fM, null), 3, null);
            }
        } else {
            this.initialOffset = C3156Dp.m26897boximpl(fM22589getLeftD9Ej5fM);
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable<C3156Dp, AnimationVector1D> animatable5 = this.offsetAnimatable;
            if (animatable5 != null) {
                fM22589getLeftD9Ej5fM = animatable5.getValue().m26913unboximpl();
            }
        } else {
            Animatable<C3156Dp, AnimationVector1D> animatable6 = this.offsetAnimatable;
            if (animatable6 != null) {
                fM22589getLeftD9Ej5fM = animatable6.getValue().m26913unboximpl();
            }
            fM22589getLeftD9Ej5fM = C3156Dp.m26899constructorimpl(-fM22589getLeftD9Ej5fM);
        }
        Animatable<C3156Dp, AnimationVector1D> animatable7 = this.widthAnimatable;
        if (animatable7 != null) {
            fM22588getContentWidthD9Ej5fM = animatable7.getValue().m26913unboximpl();
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(Constraints.m26842copyZbe2FdA$default(j10, measureScope.mo20491roundToPx0680j_4(fM22588getContentWidthD9Ej5fM), measureScope.mo20491roundToPx0680j_4(fM22588getContentWidthD9Ej5fM), 0, 0, 12, null));
        final float f10 = fM22589getLeftD9Ej5fM;
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, measureScope.mo20491roundToPx0680j_4(f10), 0, 0.0f, 4, null);
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
