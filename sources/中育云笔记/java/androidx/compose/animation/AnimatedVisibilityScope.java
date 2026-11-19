package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {

    public static final class DefaultImpls {
        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
            return AnimatedVisibilityScope.super.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
    }

    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i10 & 1) != 0) {
            enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        }
        if ((i10 & 2) != 0) {
            exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        }
        if ((i10 & 4) != 0) {
            str = "animateEnterExit";
        }
        return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }

    default Modifier animateEnterExit(Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final String str) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("animateEnterExit");
                inspectorInfo.getProperties().set("enter", enterTransition);
                inspectorInfo.getProperties().set("exit", exitTransition);
                inspectorInfo.getProperties().set("label", str);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(1840112047);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1840112047, i10, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
                }
                Modifier modifierThen = modifier2.then(EnterExitTransitionKt.createModifier(AnimatedVisibilityScope.this.getTransition(), enterTransition, exitTransition, null, str, composer, 0, 4));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }
        });
    }

    Transition<EnterExitState> getTransition();
}
