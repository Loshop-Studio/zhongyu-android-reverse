package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ&\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m5110d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "tabPositionsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "selectedTabIndex", "", "followContentSize", "", "(Landroidx/compose/runtime/State;IZ)V", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "initialOffset", "Landroidx/compose/ui/unit/Dp;", "initialWidth", "offsetAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "widthAnimatable", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1361:1\n1#2:1362\n62#3:1363\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabIndicatorOffsetNode\n*L\n927#1:1363\n*E\n"})
/* loaded from: classes.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;

    @Nullable
    private C2331Dp initialOffset;

    @Nullable
    private C2331Dp initialWidth;

    @Nullable
    private Animatable<C2331Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;

    @NotNull
    private State<? extends List<TabPosition>> tabPositionsState;

    @Nullable
    private Animatable<C2331Dp, AnimationVector1D> widthAnimatable;

    public TabIndicatorOffsetNode(@NotNull State<? extends List<TabPosition>> state, int i, boolean z8) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z8;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @NotNull
    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        float contentWidth = this.followContentSize ? this.tabPositionsState.getValue().get(this.selectedTabIndex).getContentWidth() : this.tabPositionsState.getValue().get(this.selectedTabIndex).getWidth();
        C2331Dp c2331Dp = this.initialWidth;
        if (c2331Dp != null) {
            Animatable<C2331Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                animatable = new Animatable<>(c2331Dp, VectorConvertersKt.getVectorConverter(C2331Dp.INSTANCE), null, null, 12, null);
                this.widthAnimatable = animatable;
            }
            if (!C2331Dp.m13310equalsimpl0(contentWidth, animatable.getTargetValue().m13319unboximpl())) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, contentWidth, null), 3);
            }
        } else {
            this.initialWidth = C2331Dp.m13303boximpl(contentWidth);
        }
        final float left = this.tabPositionsState.getValue().get(this.selectedTabIndex).getLeft();
        C2331Dp c2331Dp2 = this.initialOffset;
        if (c2331Dp2 != null) {
            Animatable<C2331Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Animatable<C2331Dp, AnimationVector1D> animatable3 = new Animatable<>(c2331Dp2, VectorConvertersKt.getVectorConverter(C2331Dp.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = animatable3;
                animatable2 = animatable3;
            }
            if (!C2331Dp.m13310equalsimpl0(left, animatable2.getTargetValue().m13319unboximpl())) {
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, left, null), 3);
            }
        } else {
            this.initialOffset = C2331Dp.m13303boximpl(left);
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable<C2331Dp, AnimationVector1D> animatable4 = this.offsetAnimatable;
            if (animatable4 != null) {
                left = animatable4.getValue().m13319unboximpl();
            }
        } else {
            Animatable<C2331Dp, AnimationVector1D> animatable5 = this.offsetAnimatable;
            if (animatable5 != null) {
                left = animatable5.getValue().m13319unboximpl();
            }
            left = C2331Dp.m13305constructorimpl(-left);
        }
        Animatable<C2331Dp, AnimationVector1D> animatable6 = this.widthAnimatable;
        if (animatable6 != null) {
            contentWidth = animatable6.getValue().m13319unboximpl();
        }
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, measureScope.mo6897roundToPx0680j_4(contentWidth), measureScope.mo6897roundToPx0680j_4(contentWidth), 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, measureScope.mo6897roundToPx0680j_4(left), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setFollowContentSize(boolean z8) {
        this.followContentSize = z8;
    }

    public final void setSelectedTabIndex(int i) {
        this.selectedTabIndex = i;
    }

    public final void setTabPositionsState(@NotNull State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }
}
