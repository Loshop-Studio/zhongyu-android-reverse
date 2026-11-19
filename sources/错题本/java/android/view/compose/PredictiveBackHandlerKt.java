package android.view.compose;

import android.annotation.SuppressLint;
import android.view.LifecycleOwner;
import android.view.OnBackPressedDispatcher;
import android.view.OnBackPressedDispatcherOwner;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\\\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002A\u0010\f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006G\u0010\u000f\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00028\nX\u008a\u0084\u0002"}, m5110d2 = {"", "enabled", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "Lh6/c;", "Ld6/s;", "", "onBack", "PredictiveBackHandler", "(ZLr6/e;Landroidx/compose/runtime/Composer;II)V", "currentOnBack", "activity-compose_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPredictiveBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,200:1\n481#2:201\n480#2,4:202\n484#2,2:209\n488#2:215\n1225#3,3:206\n1228#3,3:212\n1225#3,6:216\n1225#3,6:222\n1225#3,6:228\n1225#3,6:235\n480#4:211\n77#5:234\n81#6:241\n*S KotlinDebug\n*F\n+ 1 PredictiveBackHandler.kt\nandroidx/activity/compose/PredictiveBackHandlerKt\n*L\n80#1:201\n80#1:202,4\n80#1:209,2\n80#1:215\n80#1:206,3\n80#1:212,3\n82#1:216,6\n87#1:222,6\n92#1:228,6\n103#1:235,6\n80#1:211\n101#1:234\n79#1:241\n*E\n"})
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    @Composable
    @SuppressLint({"RememberReturnType"})
    public static final void PredictiveBackHandler(final boolean z8, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i9 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                z8 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642000585, i9, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC6473e, composerStartRestartGroup, (i9 >> 3) & 14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new PredictiveBackHandlerCallback(z8, coroutineScope, PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final PredictiveBackHandlerCallback predictiveBackHandlerCallback = (PredictiveBackHandlerCallback) objRememberedValue2;
            boolean zChanged = composerStartRestartGroup.changed(PredictiveBackHandler$lambda$0(stateRememberUpdatedState)) | composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                predictiveBackHandlerCallback.setCurrentOnBack(PredictiveBackHandler$lambda$0(stateRememberUpdatedState));
                predictiveBackHandlerCallback.setOnBackScope(coroutineScope);
                composerStartRestartGroup.updateRememberedValue(C5443s.f8405a);
            }
            Boolean boolValueOf = Boolean.valueOf(z8);
            int i11 = i9 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(predictiveBackHandlerCallback) | (i11 == 4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(predictiveBackHandlerCallback, z8, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (InterfaceC6473e) objRememberedValue4, composerStartRestartGroup, i11);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(onBackPressedDispatcher) | composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changedInstance(predictiveBackHandlerCallback);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new InterfaceC6471c() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        onBackPressedDispatcher.addCallback(lifecycleOwner, predictiveBackHandlerCallback);
                        final PredictiveBackHandlerCallback predictiveBackHandlerCallback2 = predictiveBackHandlerCallback;
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                predictiveBackHandlerCallback2.remove();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (InterfaceC6471c) objRememberedValue5, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.activity.compose.PredictiveBackHandlerKt.PredictiveBackHandler.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i12) {
                    PredictiveBackHandlerKt.PredictiveBackHandler(z8, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    private static final InterfaceC6473e PredictiveBackHandler$lambda$0(State<? extends InterfaceC6473e> state) {
        return state.getValue();
    }
}
