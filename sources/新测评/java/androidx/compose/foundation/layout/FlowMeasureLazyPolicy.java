package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.SubcomposeMeasureScope;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014\u0012;\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u001fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0012HÂ\u0003J\u001a\u0010+\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014HÂ\u0003JC\u0010,\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017HÂ\u0003¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0016\u00100\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u0016\u00104\u001a\u00020\tHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00102J\t\u00106\u001a\u00020\u000eHÂ\u0003J\t\u00107\u001a\u00020\u000eHÂ\u0003J\t\u00108\u001a\u00020\u000eHÂ\u0003JÑ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u00142=\b\u0002\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0\u0019J\t\u0010C\u001a\u00020\u000eHÖ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001J\u001e\u0010F\u001a\u00020B*\u00020@2\u0006\u0010G\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010IR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"RE\u0010\u0018\u001a7\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010&R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, m13558d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "itemCount", "", "maxLines", "maxItemsInMainAxis", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "Lkotlin/jvm/functions/Function4;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component10", "component11", "component12", "()Lkotlin/jvm/functions/Function4;", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-E4Q9ldg", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "equals", "other", "", "getMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "hashCode", "toString", "", "measure", "constraints", "measure-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final /* data */ class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<Function2<Composer, Integer, Unit>> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, horizontal, vertical, f10, crossAxisAlignment, f11, i10, i11, i12, flowLayoutOverflowState, list, function4);
    }

    /* renamed from: component10, reason: from getter */
    private final FlowLayoutOverflowState getOverflow() {
        return this.overflow;
    }

    private final List<Function2<Composer, Integer, Unit>> component11() {
        return this.overflowComposables;
    }

    private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> component12() {
        return this.getComposable;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    private final float getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    private final float getCrossAxisArrangementSpacing() {
        return this.crossAxisArrangementSpacing;
    }

    /* renamed from: component7, reason: from getter */
    private final int getItemCount() {
        return this.itemCount;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component9, reason: from getter */
    private final int getMaxItemsInMainAxis() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m17620copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List list, Function4 function4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z9 = flowMeasureLazyPolicy.isHorizontal;
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
            function4 = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        Function4 function42 = function4;
        int i14 = i12;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i15 = i10;
        int i16 = i11;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f12 = f11;
        return flowMeasureLazyPolicy.m17622copyE4Q9ldg(z9, horizontal, vertical, f10, crossAxisAlignment2, f12, i15, i16, i14, flowLayoutOverflowState2, list2, function42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m17621measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m23513getMaxHeightimpl(j10) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new Function2<Integer, FlowLineInfo, List<? extends Measurable>>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ List<? extends Measurable> invoke(Integer num, FlowLineInfo flowLineInfo) {
                return invoke(num.intValue(), flowLineInfo);
            }

            public final List<Measurable> invoke(final int i10, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                Integer numValueOf = Integer.valueOf(i10);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(numValueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
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
        this.overflow.m17611setOverflowMeasurablesVKLhPVY$foundation_layout_release(this, j10, new Function2<Boolean, Integer, Measurable>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Measurable invoke(Boolean bool, Integer num) {
                return invoke(bool.booleanValue(), num.intValue());
            }

            public final Measurable invoke(boolean z9, int i10) {
                Function2<? super Composer, ? super Integer, Unit> function2 = (Function2) CollectionsKt.getOrNull(this.this$0.overflowComposables, !z9 ? 1 : 0);
                if (function2 == null) {
                    return null;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append(z9);
                sb.append(flowMeasureLazyPolicy.itemCount);
                sb.append(i10);
                return (Measurable) CollectionsKt.getOrNull(subcomposeMeasureScope2.subcompose(sb.toString(), function2), 0);
            }
        });
        return FlowLayoutKt.m17605breakDownItemsdi9J0FM(subcomposeMeasureScope, this, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m17650constructorimpl(j10, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    /* renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component5, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m17622copyE4Q9ldg(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int itemCount, int maxLines, int maxItemsInMainAxis, FlowLayoutOverflowState overflow, List<? extends Function2<? super Composer, ? super Integer, Unit>> overflowComposables, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> getComposable) {
        return new FlowMeasureLazyPolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, itemCount, maxLines, maxItemsInMainAxis, overflow, overflowComposables, getComposable, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) other;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && Intrinsics.areEqual(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && Intrinsics.areEqual(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && C3127Dp.m23566equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && Intrinsics.areEqual(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && C3127Dp.m23566equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && Intrinsics.areEqual(this.overflow, flowMeasureLazyPolicy.overflow) && Intrinsics.areEqual(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && Intrinsics.areEqual(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getMeasurePolicy.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                return m17623invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m17623invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j10) {
                return FlowMeasureLazyPolicy.this.m17621measure0kLqBqw(subcomposeMeasureScope, j10);
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + C3127Dp.m23567hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + C3127Dp.m23567hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.itemCount)) * 31) + Integer.hashCode(this.maxLines)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) C3127Dp.m23572toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) C3127Dp.m23572toStringimpl(this.crossAxisArrangementSpacing)) + ", itemCount=" + this.itemCount + ", maxLines=" + this.maxLines + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", overflow=" + this.overflow + ", overflowComposables=" + this.overflowComposables + ", getComposable=" + this.getComposable + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z9, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f10, CrossAxisAlignment crossAxisAlignment, float f11, int i10, int i11, int i12, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4) {
        this.isHorizontal = z9;
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
        this.getComposable = function4;
    }
}
