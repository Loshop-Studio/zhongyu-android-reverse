package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9974p;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements InterfaceC9544p {
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ InterfaceC9545q $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, T t10, InterfaceC9545q interfaceC9545q) {
        super(2);
        this.$this_Crossfade = transition;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t10;
        this.$content = interfaceC9545q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C10786q.f26013a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i10) {
        if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
        }
        Transition<T> transition = this.$this_Crossfade;
        final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        InterfaceC9545q interfaceC9545q = new InterfaceC9545q() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> segment, Composer composer2, int i11) {
                composer2.startReplaceGroup(438406499);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(438406499, i11, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return finiteAnimationSpec2;
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        T t10 = this.$stateForContent;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C9974p.f23424a);
        Object currentState = transition.getCurrentState();
        composer.startReplaceGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f10 = AbstractC9979u.m20289b(currentState, t10) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float fValueOf = Float.valueOf(f10);
        Object targetState = transition.getTargetState();
        composer.startReplaceGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        float f11 = AbstractC9979u.m20289b(targetState, t10) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        final State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f11), (FiniteAnimationSpec) interfaceC9545q.invoke(transition.getSegment(), composer, 0), vectorConverter, "FloatAnimation", composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        boolean zChanged = composer.changed(stateCreateTransitionAnimation);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new InterfaceC9540l() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setAlpha(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(stateCreateTransitionAnimation));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (InterfaceC9540l) objRememberedValue);
        InterfaceC9545q interfaceC9545q2 = this.$content;
        Object obj = this.$stateForContent;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        InterfaceC9529a constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer);
        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        interfaceC9545q2.invoke(obj, composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
