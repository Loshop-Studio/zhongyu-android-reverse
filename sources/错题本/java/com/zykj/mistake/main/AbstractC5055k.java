package com.zykj.mistake.main;

import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.compose.BackHandlerKt;
import android.view.compose.C2750a;
import android.view.compose.FlowExtKt;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.C2857e;
import androidx.navigation.NavHostController;
import com.zykj.mistake.feature.notebook.detail.C4821k;
import com.zykj.mistake.main.drawer.AbstractC5034e;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p075h6.InterfaceC5636h;
import p129o2.C6268a;
import p150r4.AbstractC6463c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6594g;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6781e;

/* renamed from: com.zykj.mistake.main.k */
/* loaded from: classes3.dex */
public abstract class AbstractC5055k {
    /* renamed from: a */
    public static final void m4376a(final NavHostController navController, final MainShellViewModel shellViewModel, final C6268a webCaptureContainer, boolean z8, InterfaceC6469a onShellBack, InterfaceC6469a onFinishApp, Composer composer, int i) {
        int i8;
        boolean z9;
        AbstractC5830k.m5330g(navController, "navController");
        AbstractC5830k.m5330g(shellViewModel, "shellViewModel");
        AbstractC5830k.m5330g(webCaptureContainer, "webCaptureContainer");
        AbstractC5830k.m5330g(onShellBack, "onShellBack");
        AbstractC5830k.m5330g(onFinishApp, "onFinishApp");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1826066589);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(shellViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(webCaptureContainer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z9 = z8;
            i8 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        } else {
            z9 = z8;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onShellBack) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(onFinishApp) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i8) != 74898, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1826066589, i8, -1, "com.zykj.mistake.main.MainAppRoot (MainAppRoot.kt:25)");
            }
            final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(shellViewModel.f7810b, (LifecycleOwner) null, (Lifecycle.State) null, (InterfaceC5636h) null, composerStartRestartGroup, 0, 7);
            AbstractC5057l.m4377a(shellViewModel, composerStartRestartGroup, (i8 >> 3) & 14);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shellViewModel) | ((57344 & i8) == 16384) | ((i8 & 458752) == 131072);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2750a(shellViewModel, onShellBack, onFinishApp);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (InterfaceC6469a) objRememberedValue, composerStartRestartGroup, 0, 1);
            final boolean z10 = z9;
            AbstractC6675d.m6339a(composerStartRestartGroup, 6, ComposableLambdaKt.rememberComposableLambda(1319830864, true, new InterfaceC6473e() { // from class: com.zykj.mistake.main.i
                @Override // p152r6.InterfaceC6473e
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    final int i9 = 1;
                    final int i10 = 0;
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1319830864, iIntValue, -1, "com.zykj.mistake.main.MainAppRoot.<anonymous> (MainAppRoot.kt:39)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        InterfaceC6469a constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer2);
                        InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                        if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                        }
                        Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        NavHostController navHostController = navController;
                        final MainShellViewModel mainShellViewModel = shellViewModel;
                        AbstractC6594g.m6225a(navHostController, mainShellViewModel, null, composer2, 0);
                        State state = stateCollectAsStateWithLifecycle;
                        AbstractC5057l abstractC5057l = ((C5060m) state.getValue()).f7930a;
                        boolean zChangedInstance2 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final int i11 = 3;
                            objRememberedValue2 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
                        boolean zChangedInstance3 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new InterfaceC6473e() { // from class: com.zykj.mistake.main.h
                                @Override // p152r6.InterfaceC6473e
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i9) {
                                        case 0:
                                            long jLongValue = ((Long) obj3).longValue();
                                            String name = (String) obj4;
                                            AbstractC5830k.m5330g(name, "name");
                                            mainShellViewModel.m4354b(new C5067p0(jLongValue, name));
                                            break;
                                        default:
                                            C5021a1 state2 = (C5021a1) obj3;
                                            C5087z0 selection = (C5087z0) obj4;
                                            AbstractC5830k.m5330g(state2, "state");
                                            AbstractC5830k.m5330g(selection, "selection");
                                            mainShellViewModel.m4354b(new C5052i0(state2.f7828a, selection));
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        InterfaceC6473e interfaceC6473e = (InterfaceC6473e) objRememberedValue3;
                        boolean zChangedInstance4 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final int i12 = 6;
                            objRememberedValue4 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue4;
                        boolean zChangedInstance5 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new C5045f(mainShellViewModel, 2);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue5;
                        boolean zChangedInstance6 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new MainAppRootKt$MainAppRoot$2$1$5$1(mainShellViewModel);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) ((InterfaceC6781e) objRememberedValue6);
                        boolean zChangedInstance7 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new C5045f(mainShellViewModel, 0);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) objRememberedValue7;
                        boolean zChangedInstance8 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        InterfaceC6469a interfaceC6469a3 = (InterfaceC6469a) objRememberedValue8;
                        boolean zChangedInstance9 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        InterfaceC6469a interfaceC6469a4 = (InterfaceC6469a) objRememberedValue9;
                        boolean zChangedInstance10 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new InterfaceC6473e() { // from class: com.zykj.mistake.main.h
                                @Override // p152r6.InterfaceC6473e
                                public final Object invoke(Object obj3, Object obj4) {
                                    switch (i10) {
                                        case 0:
                                            long jLongValue = ((Long) obj3).longValue();
                                            String name = (String) obj4;
                                            AbstractC5830k.m5330g(name, "name");
                                            mainShellViewModel.m4354b(new C5067p0(jLongValue, name));
                                            break;
                                        default:
                                            C5021a1 state2 = (C5021a1) obj3;
                                            C5087z0 selection = (C5087z0) obj4;
                                            AbstractC5830k.m5330g(state2, "state");
                                            AbstractC5830k.m5330g(selection, "selection");
                                            mainShellViewModel.m4354b(new C5052i0(state2.f7828a, selection));
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        InterfaceC6473e interfaceC6473e2 = (InterfaceC6473e) objRememberedValue10;
                        boolean zChangedInstance11 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChangedInstance11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new C5045f(mainShellViewModel, 1);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        InterfaceC6471c interfaceC6471c4 = (InterfaceC6471c) objRememberedValue11;
                        boolean zChangedInstance12 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChangedInstance12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            final int i13 = 2;
                            objRememberedValue12 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        InterfaceC6469a interfaceC6469a5 = (InterfaceC6469a) objRememberedValue12;
                        boolean zChangedInstance13 = composer2.changedInstance(mainShellViewModel);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChangedInstance13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            final int i14 = 4;
                            objRememberedValue13 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                @Override // p152r6.InterfaceC6469a
                                public final Object invoke() {
                                    switch (i14) {
                                        case 0:
                                            mainShellViewModel.m4354b(C5075t0.f7963a);
                                            break;
                                        case 1:
                                            mainShellViewModel.m4354b(C5063n0.f7935a);
                                            break;
                                        case 2:
                                            mainShellViewModel.m4354b(C5058l0.f7928a);
                                            break;
                                        case 3:
                                            mainShellViewModel.m4354b(C5026c0.f7837a);
                                            break;
                                        case 4:
                                            mainShellViewModel.m4354b(C5044e0.f7907a);
                                            break;
                                        case 5:
                                            mainShellViewModel.m4354b(C5061m0.f7932a);
                                            break;
                                        default:
                                            mainShellViewModel.m4354b(C5081w0.f7970a);
                                            break;
                                    }
                                    return C5443s.f8405a;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        AbstractC5034e.m4362a(abstractC5057l, interfaceC6469a, interfaceC6473e, interfaceC6469a2, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6469a3, interfaceC6469a4, interfaceC6473e2, interfaceC6471c4, interfaceC6469a5, (InterfaceC6469a) objRememberedValue13, composer2, 0, 0);
                        AbstractC5027c1.m4361a(webCaptureContainer, null, composer2, 0);
                        RemoveDialogTarget removeDialogTarget = ((C5060m) state.getValue()).f7931b;
                        if (removeDialogTarget == null) {
                            composer2.startReplaceGroup(753474044);
                        } else {
                            composer2.startReplaceGroup(753474045);
                            boolean zChangedInstance14 = composer2.changedInstance(mainShellViewModel);
                            Object objRememberedValue14 = composer2.rememberedValue();
                            if (zChangedInstance14 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                final int i15 = 5;
                                objRememberedValue14 = new InterfaceC6469a() { // from class: com.zykj.mistake.main.g
                                    @Override // p152r6.InterfaceC6469a
                                    public final Object invoke() {
                                        switch (i15) {
                                            case 0:
                                                mainShellViewModel.m4354b(C5075t0.f7963a);
                                                break;
                                            case 1:
                                                mainShellViewModel.m4354b(C5063n0.f7935a);
                                                break;
                                            case 2:
                                                mainShellViewModel.m4354b(C5058l0.f7928a);
                                                break;
                                            case 3:
                                                mainShellViewModel.m4354b(C5026c0.f7837a);
                                                break;
                                            case 4:
                                                mainShellViewModel.m4354b(C5044e0.f7907a);
                                                break;
                                            case 5:
                                                mainShellViewModel.m4354b(C5061m0.f7932a);
                                                break;
                                            default:
                                                mainShellViewModel.m4354b(C5081w0.f7970a);
                                                break;
                                        }
                                        return C5443s.f8405a;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue14);
                            }
                            InterfaceC6469a interfaceC6469a6 = (InterfaceC6469a) objRememberedValue14;
                            boolean zChanged = composer2.changed(removeDialogTarget.ordinal()) | composer2.changedInstance(mainShellViewModel);
                            Object objRememberedValue15 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue15 = new C2857e(15, removeDialogTarget, mainShellViewModel);
                                composer2.updateRememberedValue(objRememberedValue15);
                            }
                            AbstractC6463c.m6126b(removeDialogTarget, interfaceC6469a6, (InterfaceC6469a) objRememberedValue15, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        AbstractC0000a.m0a(z10, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return C5443s.f8405a;
                }
            }, composerStartRestartGroup, 54));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C4821k(navController, shellViewModel, webCaptureContainer, z8, onShellBack, onFinishApp, i));
        }
    }
}
