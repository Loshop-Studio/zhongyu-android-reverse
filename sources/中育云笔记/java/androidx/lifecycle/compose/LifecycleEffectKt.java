package androidx.lifecycle.compose;

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
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleEventEffect(final androidx.lifecycle.Lifecycle.Event r7, final androidx.lifecycle.LifecycleOwner r8, final p181hd.InterfaceC9529a r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, hd.a, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final InterfaceC9529a LifecycleEventEffect$lambda$0(State<? extends InterfaceC9529a> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleEventEffect$lambda$4$lambda$3(final LifecycleOwner lifecycleOwner, final Lifecycle.Event event, final State state, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.i
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event2) {
                LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3$lambda$1(event, state, lifecycleOwner2, event2);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleEventEffect$lambda$4$lambda$3$lambda$1(Lifecycle.Event event, State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        if (event2 == event) {
            LifecycleEventEffect$lambda$0(state).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleEventEffect$lambda$5(Lifecycle.Event event, LifecycleOwner lifecycleOwner, InterfaceC9529a interfaceC9529a, int i10, int i11, Composer composer, int i12) {
        LifecycleEventEffect(event, lifecycleOwner, interfaceC9529a, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r7, androidx.lifecycle.LifecycleOwner r8, final p181hd.InterfaceC9540l r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffect$lambda$22(Object obj, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleResumeEffect(obj, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffect$lambda$24(Object obj, Object obj2, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleResumeEffect(obj, obj2, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffect$lambda$26(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffect$lambda$28(Object[] objArr, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleResumeEffect(objArr, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffect$lambda$29(LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleResumeEffect(lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    @Composable
    private static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final InterfaceC9540l interfaceC9540l, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i11, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i11 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.lifecycle.compose.s
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33(lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC9540l, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, i11 & Opcodes.IAND);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.lifecycle.compose.t
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$35(lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC9540l, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleResumeEffectImpl$lambda$34$lambda$33(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final InterfaceC9540l interfaceC9540l, DisposableEffectScope disposableEffectScope) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.n
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31(lifecycleResumePauseEffectScope, ref$ObjectRef, interfaceC9540l, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ref$ObjectRef.f23402c;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Ref$ObjectRef ref$ObjectRef, InterfaceC9540l interfaceC9540l, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 3) {
            ref$ObjectRef.f23402c = interfaceC9540l.invoke(lifecycleResumePauseEffectScope);
        } else {
            if (i10 != 4) {
                return;
            }
            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ref$ObjectRef.f23402c;
            if (lifecyclePauseOrDisposeEffectResult != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
            }
            ref$ObjectRef.f23402c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleResumeEffectImpl$lambda$35(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, InterfaceC9540l interfaceC9540l, int i10, Composer composer, int i11) {
        LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(final java.lang.Object r7, androidx.lifecycle.LifecycleOwner r8, final p181hd.InterfaceC9540l r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffect$lambda$11(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffect$lambda$13(Object[] objArr, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleStartEffect(objArr, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffect$lambda$14(LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleStartEffect(lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffect$lambda$7(Object obj, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleStartEffect(obj, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffect$lambda$9(Object obj, Object obj2, LifecycleOwner lifecycleOwner, InterfaceC9540l interfaceC9540l, int i10, int i11, Composer composer, int i12) {
        LifecycleStartEffect(obj, obj2, lifecycleOwner, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return C10786q.f26013a;
    }

    @Composable
    private static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final InterfaceC9540l interfaceC9540l, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9540l) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i11, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i11 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9540l() { // from class: androidx.lifecycle.compose.j
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj) {
                        return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18(lifecycleOwner, lifecycleStartStopEffectScope, interfaceC9540l, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (InterfaceC9540l) objRememberedValue, composerStartRestartGroup, i11 & Opcodes.IAND);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.lifecycle.compose.k
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj, Object obj2) {
                    return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$20(lifecycleOwner, lifecycleStartStopEffectScope, interfaceC9540l, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleStartEffectImpl$lambda$19$lambda$18(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final InterfaceC9540l interfaceC9540l, DisposableEffectScope disposableEffectScope) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.g
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16(lifecycleStartStopEffectScope, ref$ObjectRef, interfaceC9540l, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ref$ObjectRef.f23402c;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Ref$ObjectRef ref$ObjectRef, InterfaceC9540l interfaceC9540l, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            ref$ObjectRef.f23402c = interfaceC9540l.invoke(lifecycleStartStopEffectScope);
        } else {
            if (i10 != 2) {
                return;
            }
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ref$ObjectRef.f23402c;
            if (lifecycleStopOrDisposeEffectResult != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
            ref$ObjectRef.f23402c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q LifecycleStartEffectImpl$lambda$20(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, InterfaceC9540l interfaceC9540l, int i10, Composer composer, int i11) {
        LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, interfaceC9540l, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r8, final java.lang.Object r9, androidx.lifecycle.LifecycleOwner r10, final p181hd.InterfaceC9540l r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(final java.lang.Object r8, final java.lang.Object r9, androidx.lifecycle.LifecycleOwner r10, final p181hd.InterfaceC9540l r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r8, final java.lang.Object r9, final java.lang.Object r10, androidx.lifecycle.LifecycleOwner r11, final p181hd.InterfaceC9540l r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(final java.lang.Object r8, final java.lang.Object r9, final java.lang.Object r10, androidx.lifecycle.LifecycleOwner r11, final p181hd.InterfaceC9540l r12, androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb A[LOOP:1: B:58:0x00c9->B:59:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(final java.lang.Object[] r7, androidx.lifecycle.LifecycleOwner r8, final p181hd.InterfaceC9540l r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb A[LOOP:1: B:58:0x00c9->B:59:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(final java.lang.Object[] r7, androidx.lifecycle.LifecycleOwner r8, final p181hd.InterfaceC9540l r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @InterfaceC10770a
    public static final void LifecycleResumeEffect(final LifecycleOwner lifecycleOwner, final InterfaceC9540l interfaceC9540l, Composer composer, final int i10, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-747476210);
        int i12 = i10 & 1;
        if (i12 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.lifecycle.compose.p
                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(Object obj, Object obj2) {
                        return LifecycleEffectKt.LifecycleResumeEffect$lambda$29(lifecycleOwner, interfaceC9540l, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i12 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
            composerStartRestartGroup.skipToGroupEnd();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747476210, i10, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
        }
        throw new IllegalStateException(LifecycleResumeEffectNoParamError);
    }

    @Composable
    @InterfaceC10770a
    public static final void LifecycleStartEffect(final LifecycleOwner lifecycleOwner, final InterfaceC9540l interfaceC9540l, Composer composer, final int i10, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-50807951);
        int i12 = i10 & 1;
        if (i12 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.lifecycle.compose.c
                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(Object obj, Object obj2) {
                        return LifecycleEffectKt.LifecycleStartEffect$lambda$14(lifecycleOwner, interfaceC9540l, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i12 != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
            composerStartRestartGroup.skipToGroupEnd();
            if ((i11 & 1) != 0) {
                i10 &= -15;
            }
        } else if ((i11 & 1) != 0) {
            i10 &= -15;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-50807951, i10, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:333)");
        }
        throw new IllegalStateException(LifecycleStartEffectNoParamError);
    }
}
