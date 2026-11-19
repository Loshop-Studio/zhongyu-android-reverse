package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.SubcomposeMeasureScope;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final InterfaceC10576r getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<InterfaceC10574p> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, InterfaceC10576r interfaceC10576r, AbstractC9126n abstractC9126n) {
        this(z10, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, i12, flowLayoutOverflowState, list, interfaceC10576r);
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<InterfaceC10574p> component11() {
        return this.overflowComposables;
    }

    private final InterfaceC10576r component12() {
        return this.getComposable;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m20793component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m20794component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m20795copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, InterfaceC10576r interfaceC10576r, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((i13 & 2) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((i13 & 4) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((i13 & 8) != 0) {
            f10 = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((i13 & 16) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((i13 & 32) != 0) {
            f11 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((i13 & 64) != 0) {
            i10 = flowMeasureLazyPolicy.itemCount;
        }
        if ((i13 & 128) != 0) {
            i11 = flowMeasureLazyPolicy.maxLines;
        }
        if ((i13 & 256) != 0) {
            i12 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((i13 & 512) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((i13 & 1024) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i13 & 2048) != 0) {
            interfaceC10576r = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        InterfaceC10576r interfaceC10576r2 = interfaceC10576r;
        int i14 = i12;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i15 = i10;
        int i16 = i11;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f12 = f11;
        return flowMeasureLazyPolicy.m20797copyE4Q9ldg(z10, horizontal, vertical, f10, crossAxisAlignment2, f12, i15, i16, i14, flowLayoutOverflowState2, list2, interfaceC10576r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m20796measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m26851getMaxHeightimpl(j10) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (FlowLineInfo) obj2);
            }

            public final List<Measurable> invoke(final int i10, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                Integer numValueOf = Integer.valueOf(i10);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(numValueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C8736p.f16368a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i11) {
                        if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-195060736, i11, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:496)");
                        }
                        flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i10), flowLineInfo, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        this.overflow.m20786setOverflowMeasurablesVKLhPVY$foundation_layout_release(this, j10, new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).intValue());
            }

            public final Measurable invoke(boolean z10, int i10) {
                InterfaceC10574p interfaceC10574p = (InterfaceC10574p) AbstractC8778f0.m14569o0(this.this$0.overflowComposables, !z10 ? 1 : 0);
                if (interfaceC10574p == null) {
                    return null;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append(z10);
                sb.append(flowMeasureLazyPolicy.itemCount);
                sb.append(i10);
                return (Measurable) AbstractC8778f0.m14569o0(subcomposeMeasureScope2.subcompose(sb.toString(), interfaceC10574p), 0);
            }
        });
        return FlowLayoutKt.m20780breakDownItemsdi9J0FM(subcomposeMeasureScope, this, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m20825constructorimpl(j10, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m20797copyE4Q9ldg(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends InterfaceC10574p> list, InterfaceC10576r interfaceC10576r) {
        return new FlowMeasureLazyPolicy(z10, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, i12, flowLayoutOverflowState, list, interfaceC10576r, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && AbstractC9133u.m16128b(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && AbstractC9133u.m16128b(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && C3156Dp.m26904equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && AbstractC9133u.m16128b(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && C3156Dp.m26904equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && AbstractC9133u.m16128b(this.overflow, flowMeasureLazyPolicy.overflow) && AbstractC9133u.m16128b(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && AbstractC9133u.m16128b(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final InterfaceC10574p getMeasurePolicy() {
        return new InterfaceC10574p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getMeasurePolicy.1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m20798invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m26858unboximpl());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m20798invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                return FlowMeasureLazyPolicy.this.m20796measure0kLqBqw(subcomposeMeasureScope, j10);
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) C3156Dp.m26910toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C3156Dp.m26910toStringimpl(this.crossAxisArrangementSpacing)) + ", itemCount=" + this.itemCount + ", maxLines=" + this.maxLines + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", overflow=" + this.overflow + ", overflowComposables=" + this.overflowComposables + ", getComposable=" + this.getComposable + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z10, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends InterfaceC10574p> list, InterfaceC10576r interfaceC10576r) {
        this.isHorizontal = z10;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f10;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f11;
        this.itemCount = i10;
        this.maxLines = i11;
        this.maxItemsInMainAxis = i12;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = interfaceC10576r;
    }
}
