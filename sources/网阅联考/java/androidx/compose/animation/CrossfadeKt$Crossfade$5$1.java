package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p006ui.graphics.GraphicsLayerScope;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n936#2,4:148\n857#2,5:152\n36#3:157\n460#3,13:183\n473#3,3:197\n1057#4,6:158\n67#5,6:164\n73#5:196\n77#5:201\n75#6:170\n76#6,11:172\n89#6:200\n76#7:171\n76#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157\n132#1:183,13\n132#1:197,3\n132#1:158,6\n132#1:164,6\n132#1:196\n132#1:201\n132#1:170\n132#1:172,11\n132#1:200\n132#1:171\n129#1:202\n*E\n"})
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function3<T, Composer, Integer, Unit> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, int i4, FiniteAnimationSpec<Float> finiteAnimationSpec, T t3, Function3<? super T, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i4;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t3;
        this.$content = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i4) {
        if ((i4 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1426421288, i4, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        Transition<T> transition = this.$this_Crossfade;
        final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        Function3<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Object obj, Composer composer2, Integer num) {
                return invoke((Transition.Segment) obj, composer2, num.intValue());
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> animateFloat, Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                composer2.startReplaceableGroup(438406499);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(438406499, i5, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return finiteAnimationSpec2;
            }
        };
        T t3 = this.$stateForContent;
        int i5 = this.$$dirty & 14;
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i6 = i5 & 14;
        int i7 = i5 << 3;
        int i8 = (i7 & 57344) | i6 | (i7 & 896) | (i7 & 7168);
        composer.startReplaceableGroup(-142660079);
        Object currentState = transition.getCurrentState();
        int i9 = (i8 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        composer.startReplaceableGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, i9, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f4 = Intrinsics.areEqual(currentState, t3) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f4);
        Object targetState = transition.getTargetState();
        composer.startReplaceableGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, i9, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f5 = Intrinsics.areEqual(targetState, t3) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        final State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f5), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i8 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED)), vectorConverter, "FloatAnimation", composer, (i8 & 14) | (57344 & (i8 << 9)) | ((i8 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(stateCreateTransitionAnimation);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setAlpha(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(stateCreateTransitionAnimation));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue);
        Function3<T, Composer, Integer, Unit> function32 = this.$content;
        T t4 = this.$stateForContent;
        int i10 = this.$$dirty;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierGraphicsLayer);
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
        Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m8831setimpl(composerM8824constructorimpl, density, companion2.getSetDensity());
        Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        function32.invoke(t4, composer, Integer.valueOf((i10 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
