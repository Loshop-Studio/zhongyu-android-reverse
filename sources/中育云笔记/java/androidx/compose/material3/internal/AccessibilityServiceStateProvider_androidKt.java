package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ObserveState(final LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, Composer composer, final int i10, final int i11) {
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
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9529a) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.1
                    public final void invoke(Lifecycle.Event event) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Lifecycle.Event) obj);
                        return C10786q.f26013a;
                    }
                };
            }
            if (i14 != 0) {
                interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.2
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m29500invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m29500invoke();
                        return C10786q.f26013a;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i12, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
            }
            boolean zChangedInstance = ((i12 & 112) == 32) | composerStartRestartGroup.changedInstance(lifecycleOwner) | ((i12 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(lifecycleOwner, interfaceC9540l, interfaceC9529a);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        final InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.ObserveState.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AccessibilityServiceStateProvider_androidKt.ObserveState(lifecycleOwner, interfaceC9540l2, interfaceC9529a2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    @Composable
    public static final State<Boolean> rememberAccessibilityServiceState(boolean z10, boolean z11, Composer composer, int i10, int i11) {
        boolean z12 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1771705152, i10, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z13 = (((i10 & 14) ^ 6) > 4 && composer.changed(z10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !composer.changed(z11)) && (i10 & 48) != 32) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object objRememberedValue = composer.rememberedValue();
        if (z14 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Listener(z10, z11);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Listener listener = (Listener) objRememberedValue;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean zChanged = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Lifecycle.Event) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        listener.register(accessibilityManager);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        InterfaceC9540l interfaceC9540l = (InterfaceC9540l) objRememberedValue2;
        boolean zChanged2 = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new InterfaceC9529a() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m29501invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m29501invoke() {
                    listener.unregister(accessibilityManager);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ObserveState(lifecycleOwner, interfaceC9540l, (InterfaceC9529a) objRememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listener;
    }
}
