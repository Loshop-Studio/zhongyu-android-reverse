package androidx.compose.foundation.layout;

import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.AbstractC1421e;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aM\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0000\u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0002\u0010 \u001a<\u0010!\u001a\u00020\u0010*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, m5175d2 = {"DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "boxChildData", "Landroidx/compose/foundation/layout/BoxChildData;", "Landroidx/compose/ui/layout/Measurable;", "getBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildData;", "matchesParentSize", "", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "boxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "foundation-layout_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,287:1\n75#2:288\n76#2,11:290\n89#2:317\n75#2:326\n76#2,11:328\n89#2:355\n76#3:289\n76#3:327\n460#4,16:301\n50#4:318\n49#4:319\n460#4,16:339\n1057#5,6:320\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:288\n72#1:290,11\n72#1:317\n201#1:326\n201#1:328,11\n201#1:355\n72#1:289\n201#1:327\n72#1:301,16\n87#1:318\n87#1:319\n201#1:339,16\n87#1:320,6\n*E\n"})
/* loaded from: classes.dex */
public final class BoxKt {
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.p006ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
            return AbstractC1421e.m654a(this, intrinsicMeasureScope, list, i4);
        }

        @Override // androidx.compose.p006ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
            return AbstractC1421e.m655b(this, intrinsicMeasureScope, list, i4);
        }

        @Override // androidx.compose.p006ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo6928measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> list, long j4) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasureScope.CC.m634p(MeasurePolicy, Constraints.m11495getMinWidthimpl(j4), Constraints.m11494getMinHeightimpl(j4), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }

        @Override // androidx.compose.p006ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
            return AbstractC1421e.m656c(this, intrinsicMeasureScope, list, i4);
        }

        @Override // androidx.compose.p006ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
            return AbstractC1421e.m657d(this, intrinsicMeasureScope, list, i4);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(Modifier modifier, Alignment alignment, boolean z3, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i4, int i5) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(733328855);
        if ((i5 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            alignment = Alignment.INSTANCE.getTopStart();
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        int i6 = i4 >> 3;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z3, composer, (i6 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | (i6 & 14));
        int i7 = (i4 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
        int i8 = ((i7 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer);
        Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
        Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer)), composer, Integer.valueOf((i8 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        composer.startReplaceableGroup(2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i4 >> 6) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy boxMeasurePolicy(final Alignment alignment, final boolean z3) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt.boxMeasurePolicy.1
            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                return AbstractC1421e.m654a(this, intrinsicMeasureScope, list, i4);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                return AbstractC1421e.m655b(this, intrinsicMeasureScope, list, i4);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo6928measure3p2s80s(final MeasureScope MeasurePolicy, final List<? extends Measurable> measurables, long j4) {
                int iM11495getMinWidthimpl;
                final Placeable placeableMo10585measureBRTryo0;
                int iMax;
                Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.m634p(MeasurePolicy, Constraints.m11495getMinWidthimpl(j4), Constraints.m11494getMinHeightimpl(j4), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                long jM11484copyZbe2FdA$default = z3 ? j4 : Constraints.m11484copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
                if (measurables.size() == 1) {
                    final Measurable measurable = measurables.get(0);
                    if (BoxKt.getMatchesParentSize(measurable)) {
                        iM11495getMinWidthimpl = Constraints.m11495getMinWidthimpl(j4);
                        int iM11494getMinHeightimpl = Constraints.m11494getMinHeightimpl(j4);
                        placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(Constraints.INSTANCE.m11501fixedJhjzzOo(Constraints.m11495getMinWidthimpl(j4), Constraints.m11494getMinHeightimpl(j4)));
                        iMax = iM11494getMinHeightimpl;
                    } else {
                        Placeable placeableMo10585measureBRTryo02 = measurable.mo10585measureBRTryo0(jM11484copyZbe2FdA$default);
                        int iMax2 = Math.max(Constraints.m11495getMinWidthimpl(j4), placeableMo10585measureBRTryo02.getWidth());
                        iMax = Math.max(Constraints.m11494getMinHeightimpl(j4), placeableMo10585measureBRTryo02.getHeight());
                        placeableMo10585measureBRTryo0 = placeableMo10585measureBRTryo02;
                        iM11495getMinWidthimpl = iMax2;
                    }
                    final Alignment alignment2 = alignment;
                    final int i4 = iM11495getMinWidthimpl;
                    final int i5 = iMax;
                    return MeasureScope.CC.m634p(MeasurePolicy, iM11495getMinWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            BoxKt.placeInBox(layout, placeableMo10585measureBRTryo0, measurable, MeasurePolicy.getLayoutDirection(), i4, i5, alignment2);
                        }
                    }, 4, null);
                }
                final Placeable[] placeableArr = new Placeable[measurables.size()];
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = Constraints.m11495getMinWidthimpl(j4);
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = Constraints.m11494getMinHeightimpl(j4);
                int size = measurables.size();
                boolean z4 = false;
                for (int i6 = 0; i6 < size; i6++) {
                    Measurable measurable2 = measurables.get(i6);
                    if (BoxKt.getMatchesParentSize(measurable2)) {
                        z4 = true;
                    } else {
                        Placeable placeableMo10585measureBRTryo03 = measurable2.mo10585measureBRTryo0(jM11484copyZbe2FdA$default);
                        placeableArr[i6] = placeableMo10585measureBRTryo03;
                        intRef.element = Math.max(intRef.element, placeableMo10585measureBRTryo03.getWidth());
                        intRef2.element = Math.max(intRef2.element, placeableMo10585measureBRTryo03.getHeight());
                    }
                }
                if (z4) {
                    int i7 = intRef.element;
                    int i8 = i7 != Integer.MAX_VALUE ? i7 : 0;
                    int i9 = intRef2.element;
                    long jConstraints = ConstraintsKt.Constraints(i8, i7, i9 != Integer.MAX_VALUE ? i9 : 0, i9);
                    int size2 = measurables.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        Measurable measurable3 = measurables.get(i10);
                        if (BoxKt.getMatchesParentSize(measurable3)) {
                            placeableArr[i10] = measurable3.mo10585measureBRTryo0(jConstraints);
                        }
                    }
                }
                int i11 = intRef.element;
                int i12 = intRef2.element;
                final Alignment alignment3 = alignment;
                return MeasureScope.CC.m634p(MeasurePolicy, i11, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Placeable[] placeableArr2 = placeableArr;
                        List<Measurable> list = measurables;
                        MeasureScope measureScope = MeasurePolicy;
                        Ref.IntRef intRef3 = intRef;
                        Ref.IntRef intRef4 = intRef2;
                        Alignment alignment4 = alignment3;
                        int length = placeableArr2.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i14 < length) {
                            Placeable placeable = placeableArr2[i14];
                            Intrinsics.checkNotNull(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            BoxKt.placeInBox(layout, placeable, list.get(i13), measureScope.getLayoutDirection(), intRef3.element, intRef4.element, alignment4);
                            i14++;
                            i13++;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                return AbstractC1421e.m656c(this, intrinsicMeasureScope, list, i4);
            }

            @Override // androidx.compose.p006ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                return AbstractC1421e.m657d(this, intrinsicMeasureScope, list, i4);
            }
        };
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildData) {
            return (BoxChildData) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null) {
            return boxChildData.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i4, int i5, Alignment alignment) {
        Alignment alignment2;
        BoxChildData boxChildData = getBoxChildData(measurable);
        Placeable.PlacementScope.m10620place70tqf50$default(placementScope, placeable, ((boxChildData == null || (alignment2 = boxChildData.getAlignment()) == null) ? alignment : alignment2).mo8841alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i4, i5), layoutDirection), 0.0f, 2, null);
    }

    @Composable
    @PublishedApi
    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z3, Composer composer, int i4) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i4, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)");
        }
        if (!Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) || z3) {
            Boolean boolValueOf = Boolean.valueOf(z3);
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(boolValueOf) | composer.changed(alignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = boxMeasurePolicy(alignment, z3);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        } else {
            measurePolicy = DefaultBoxMeasurePolicy;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(final Modifier modifier, Composer composer, final int i4) {
        int i5;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i5, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            int i6 = ((i5 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 384;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i7 = ((i6 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.BoxKt.Box.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                BoxKt.Box(modifier, composer2, i4 | 1);
            }
        });
    }
}
