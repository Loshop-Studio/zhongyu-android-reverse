package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013\u0012;\u0010\u001e\u001a7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010'\u001a\u00020$*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0016\u0010*\u001a\u00020\bHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0016\u0010,\u001a\u00020\bHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0010\u0010-\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b0\u0010.J\u0010\u00101\u001a\u00020\u0011HÂ\u0003¢\u0006\u0004\b1\u00102J!\u00103\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u0013HÂ\u0003¢\u0006\u0004\b3\u00104JE\u00105\u001a7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016HÂ\u0003¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$0\u0018¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b?\u0010@JÑ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00132=\b\u0002\u0010\u001e\u001a7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0016HÆ\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bG\u0010.J\u001a\u0010J\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\b\u0003\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bN\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010>R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010QR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010@R\u001a\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010QR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010UR%\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010VRI\u0010\u001e\u001a7\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "isHorizontal", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "itemCount", "maxLines", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "overflowComposables", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "getComposable", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lr6/g;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "component4-D9Ej5fM", "()F", "component4", "component6-D9Ej5fM", "component6", "component7", "()I", "component8", "component9", "component10", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "component11", "()Ljava/util/List;", "component12", "()Lr6/g;", "getMeasurePolicy", "()Lr6/e;", "component1", "()Z", "component2", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "component3", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component5", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "copy-E4Q9ldg", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lr6/g;)Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "F", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "I", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Ljava/util/List;", "Lr6/g;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {

    @NotNull
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;

    @NotNull
    private final InterfaceC6475g getComposable;

    @NotNull
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @NotNull
    private final FlowLayoutOverflowState overflow;

    @NotNull
    private final List<InterfaceC6473e> overflowComposables;

    @NotNull
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, int i9, FlowLayoutOverflowState flowLayoutOverflowState, List list, InterfaceC6475g interfaceC6475g, AbstractC5824e abstractC5824e) {
        this(z8, horizontal, vertical, f, crossAxisAlignment, f7, i, i8, i9, flowLayoutOverflowState, list, interfaceC6475g);
    }

    /* renamed from: component10, reason: from getter */
    private final FlowLayoutOverflowState getOverflow() {
        return this.overflow;
    }

    private final List<InterfaceC6473e> component11() {
        return this.overflowComposables;
    }

    /* renamed from: component12, reason: from getter */
    private final InterfaceC6475g getGetComposable() {
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
    public static /* synthetic */ FlowMeasureLazyPolicy m7201copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, int i9, FlowLayoutOverflowState flowLayoutOverflowState, List list, InterfaceC6475g interfaceC6475g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((i10 & 2) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((i10 & 4) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((i10 & 8) != 0) {
            f = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((i10 & 16) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((i10 & 32) != 0) {
            f7 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((i10 & 64) != 0) {
            i = flowMeasureLazyPolicy.itemCount;
        }
        if ((i10 & 128) != 0) {
            i8 = flowMeasureLazyPolicy.maxLines;
        }
        if ((i10 & 256) != 0) {
            i9 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((i10 & 512) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((i10 & 1024) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i10 & 2048) != 0) {
            interfaceC6475g = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        InterfaceC6475g interfaceC6475g2 = interfaceC6475g;
        int i11 = i9;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i12 = i;
        int i13 = i8;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f8 = f7;
        return flowMeasureLazyPolicy.m7203copyE4Q9ldg(z8, horizontal, vertical, f, crossAxisAlignment2, f8, i12, i13, i11, flowLayoutOverflowState2, list2, interfaceC6475g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m7202measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j7) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m13257getMaxHeightimpl(j7) == 0 && this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (FlowLineInfo) obj2);
            }

            public final List<Measurable> invoke(final int i, final FlowLineInfo flowLineInfo) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                Integer numValueOf = Integer.valueOf(i);
                final FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                return subcomposeMeasureScope2.subcompose(numValueOf, ComposableLambdaKt.composableLambdaInstance(-195060736, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$measurablesIterator$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p152r6.InterfaceC6473e
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C5443s.f8405a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i8) {
                        if (!composer.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-195060736, i8, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:496)");
                        }
                        flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i), flowLineInfo, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        this.overflow.setItemCount$foundation_layout_release(this.itemCount);
        this.overflow.m7192setOverflowMeasurablesVKLhPVY$foundation_layout_release(this, j7, new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).intValue());
            }

            public final Measurable invoke(boolean z8, int i) {
                InterfaceC6473e interfaceC6473e = (InterfaceC6473e) AbstractC5805t.m5230j0(!z8 ? 1 : 0, this.this$0.overflowComposables);
                if (interfaceC6473e == null) {
                    return null;
                }
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = this.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append(z8);
                sb.append(flowMeasureLazyPolicy.itemCount);
                sb.append(i);
                return (Measurable) AbstractC5805t.m5230j0(0, subcomposeMeasureScope2.subcompose(sb.toString(), interfaceC6473e));
            }
        });
        return FlowLayoutKt.m7186breakDownItemsdi9J0FM(subcomposeMeasureScope, this, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m7231constructorimpl(j7, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m7203copyE4Q9ldg(boolean isHorizontal, @NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, float mainAxisSpacing, @NotNull CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int itemCount, int maxLines, int maxItemsInMainAxis, @NotNull FlowLayoutOverflowState overflow, @NotNull List<? extends InterfaceC6473e> overflowComposables, @NotNull InterfaceC6475g getComposable) {
        return new FlowMeasureLazyPolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, itemCount, maxLines, maxItemsInMainAxis, overflow, overflowComposables, getComposable, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) other;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && AbstractC5830k.m5325b(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && AbstractC5830k.m5325b(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && C2331Dp.m13310equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && AbstractC5830k.m5325b(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && C2331Dp.m13310equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && AbstractC5830k.m5325b(this.overflow, flowMeasureLazyPolicy.overflow) && AbstractC5830k.m5325b(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && AbstractC5830k.m5325b(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @NotNull
    public final InterfaceC6473e getMeasurePolicy() {
        return new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy.getMeasurePolicy.1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m7204invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
            }

            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final MeasureResult m7204invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j7) {
                return FlowMeasureLazyPolicy.this.m7202measure0kLqBqw(subcomposeMeasureScope, j7);
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    @NotNull
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return this.getComposable.hashCode() + AbstractC0584a.m907h(this.overflowComposables, (this.overflow.hashCode() + AbstractC0584a.m902c(this.maxItemsInMainAxis, AbstractC0584a.m902c(this.maxLines, AbstractC0584a.m902c(this.itemCount, AbstractC0584a.m896A(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + AbstractC0584a.m896A(this.mainAxisSpacing, (this.verticalArrangement.hashCode() + ((this.horizontalArrangement.hashCode() + (Boolean.hashCode(this.isHorizontal) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31), 31)) * 31, 31);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasureLazyPolicy(isHorizontal=");
        sb.append(this.isHorizontal);
        sb.append(", horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        AbstractC0584a.m922w(sb, ", crossAxisAlignment=", this.mainAxisSpacing);
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        AbstractC0584a.m922w(sb, ", itemCount=", this.crossAxisArrangementSpacing);
        sb.append(this.itemCount);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", maxItemsInMainAxis=");
        sb.append(this.maxItemsInMainAxis);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(", overflowComposables=");
        sb.append(this.overflowComposables);
        sb.append(", getComposable=");
        sb.append(this.getComposable);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z8, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, CrossAxisAlignment crossAxisAlignment, float f7, int i, int i8, int i9, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends InterfaceC6473e> list, InterfaceC6475g interfaceC6475g) {
        this.isHorizontal = z8;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f7;
        this.itemCount = i;
        this.maxLines = i8;
        this.maxItemsInMainAxis = i9;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = interfaceC6475g;
    }
}
