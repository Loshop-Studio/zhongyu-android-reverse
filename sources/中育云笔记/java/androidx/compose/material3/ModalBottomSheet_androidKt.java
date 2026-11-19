package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class ModalBottomSheet_androidKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m28846ModalBottomSheetdYc4hso(final p181hd.InterfaceC9529a r30, androidx.compose.p014ui.Modifier r31, androidx.compose.material3.SheetState r32, float r33, androidx.compose.p014ui.graphics.Shape r34, long r35, long r37, float r39, long r40, p181hd.InterfaceC9544p r42, androidx.compose.foundation.layout.WindowInsets r43, androidx.compose.material3.ModalBottomSheetProperties r44, final p181hd.InterfaceC9545q r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m28846ModalBottomSheetdYc4hso(hd.a, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, hd.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.ModalBottomSheetProperties, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalBottomSheetDialog(final InterfaceC9529a interfaceC9529a, final ModalBottomSheetProperties modalBottomSheetProperties, final Animatable<Float, AnimationVector1D> animatable, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
        int i11;
        final LayoutDirection layoutDirection;
        int i12;
        int i13;
        Object obj;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1254951810);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(interfaceC9529a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1254951810, i11, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC9544p, composerStartRestartGroup, (i11 >> 9) & 14);
            Composer composer3 = composerStartRestartGroup;
            UUID uuid = (UUID) RememberSaveableKt.m30420rememberSaveable(new Object[0], (Saver) null, (String) null, (InterfaceC9529a) new InterfaceC9529a() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialogId$1
                @Override // p181hd.InterfaceC9529a
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, composerStartRestartGroup, 3072, 6);
            Object objRememberedValue = composer3.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composer3));
                composer3.updateRememberedValue(objRememberedValue);
            }
            InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            boolean zIsSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer3, 0);
            boolean zChanged = composer3.changed(view) | composer3.changed(density);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                layoutDirection = layoutDirection2;
                i12 = 0;
                i13 = i11;
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new ModalBottomSheetDialogWrapper(interfaceC9529a, modalBottomSheetProperties, view, layoutDirection, density, uuid, animatable, coroutineScope, zIsSystemInDarkTheme);
                modalBottomSheetDialogWrapper.setContent(compositionContextRememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-1560960657, true, new InterfaceC9544p() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return C10786q.f26013a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer4, int i14) {
                        if ((i14 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1560960657, i14, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:296)");
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1.1
                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((SemanticsPropertyReceiver) obj2);
                                return C10786q.f26013a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                            }
                        }, 1, null);
                        State<InterfaceC9544p> state = stateRememberUpdatedState;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierSemantics$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        InterfaceC9529a constructor = companion2.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer4);
                        Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ModalBottomSheet_androidKt.ModalBottomSheetDialog$lambda$0(state).invoke(composer4, 0);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                composer3.updateRememberedValue(modalBottomSheetDialogWrapper);
                obj = modalBottomSheetDialogWrapper;
            } else {
                obj = objRememberedValue2;
                i13 = i11;
                layoutDirection = layoutDirection2;
                i12 = 0;
            }
            final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = (ModalBottomSheetDialogWrapper) obj;
            boolean zChangedInstance = composer3.changedInstance(modalBottomSheetDialogWrapper2);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new InterfaceC9540l() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        modalBottomSheetDialogWrapper2.show();
                        final ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper3 = modalBottomSheetDialogWrapper2;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                modalBottomSheetDialogWrapper3.dismiss();
                                modalBottomSheetDialogWrapper3.disposeComposition();
                            }
                        };
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(modalBottomSheetDialogWrapper2, (InterfaceC9540l) objRememberedValue3, composer3, i12);
            int i14 = (composer3.changedInstance(modalBottomSheetDialogWrapper2) ? 1 : 0) | ((i13 & 14) == 4 ? 1 : i12) | ((i13 & 112) == 32 ? 1 : i12) | (composer3.changed(layoutDirection) ? 1 : 0);
            Object objRememberedValue4 = composer3.rememberedValue();
            if (i14 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new InterfaceC9529a() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m28847invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m28847invoke() {
                        modalBottomSheetDialogWrapper2.updateParameters(interfaceC9529a, modalBottomSheetProperties, layoutDirection);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.SideEffect((InterfaceC9529a) objRememberedValue4, composer3, i12);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheetDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer4, int i15) {
                    ModalBottomSheet_androidKt.ModalBottomSheetDialog(interfaceC9529a, modalBottomSheetProperties, animatable, interfaceC9544p, composer4, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9544p ModalBottomSheetDialog$lambda$0(State<? extends InterfaceC9544p> state) {
        return state.getValue();
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
