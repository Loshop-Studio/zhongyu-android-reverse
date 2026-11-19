package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"SwitchAccessActivityName", "", "ObserveState", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "handleEvent", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "onDispose", "Lkotlin/Function0;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "rememberAccessibilityServiceState", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "(ZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,183:1\n77#2:184\n77#2:191\n1223#3,6:185\n1223#3,6:192\n1223#3,6:198\n1223#3,6:204\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n*L\n48#1:184\n58#1:191\n53#1:185,6\n59#1:192,6\n64#1:198,6\n76#1:204,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ObserveState(final LifecycleOwner lifecycleOwner, Function1<? super Lifecycle.Event, Unit> function1, Function0<Unit> function0, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868327245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                function1 = new Function1<Lifecycle.Event, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Lifecycle.Event event) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
                        invoke2(event);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (i14 != 0) {
                function0 = new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i12, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            boolean zChangedInstance = ((i12 & 112) == 32) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((i12 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(lifecycleOwner, function1, function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Function1<? super Lifecycle.Event, Unit> function12 = function1;
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    AccessibilityServiceStateProvider_androidKt.ObserveState(lifecycleOwner, function12, function02, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    @Composable
    public static final State<Boolean> rememberAccessibilityServiceState(boolean z9, boolean z10, Composer composer, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z9 = true;
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1771705152, i10, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z12 = (((i10 & 14) ^ 6) > 4 && composer.changed(z9)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !composer.changed(z10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objRememberedValue = composer.rememberedValue();
        if (z13 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Listener(z9, z10);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Listener listener = (Listener) objRememberedValue;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean zChanged = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1<Lifecycle.Event, Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
                    invoke2(event);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        listener.register(accessibilityManager);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        boolean zChanged2 = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    listener.unregister(accessibilityManager);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ObserveState(lifecycleOwner, function1, (Function0) objRememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listener;
    }
}
