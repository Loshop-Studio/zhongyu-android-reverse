package androidx.compose.foundation;

import android.content.res.Resources;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.semantics.LiveRegionMode;
import androidx.compose.p014ui.semantics.SemanticsModifierKt;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.window.AndroidPopup_androidKt;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.p014ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(final androidx.compose.p014ui.window.PopupPositionProvider r20, final p181hd.InterfaceC9544p r21, androidx.compose.foundation.BasicTooltipState r22, androidx.compose.p014ui.Modifier r23, boolean r24, boolean r25, final p181hd.InterfaceC9544p r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, hd.p, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, hd.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @Stable
    @ExperimentalFoundationApi
    public static final BasicTooltipState BasicTooltipState(boolean z10, boolean z11, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z10, z11, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z10, boolean z11, MutatorMutex mutatorMutex, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z10, z11, mutatorMutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final InterfaceC11122i0 interfaceC11122i0, final boolean z10, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) throws Resources.NotFoundException {
        PopupPositionProvider popupPositionProvider2;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-487341126);
        if ((i10 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i11 = (composerStartRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i10;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC11122i0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487341126, i11, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            final String strDescription = BasicTooltipStrings.INSTANCE.description(composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC11122i0) | ((i11 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InterfaceC9529a() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", m26211f = "BasicTooltip.kt", m26212l = {}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1 */
                    public static final class C11781 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11781(BasicTooltipState basicTooltipState, InterfaceC11588c<? super C11781> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C11781(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            AbstractC11725a.m25952f();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                            this.$state.dismiss();
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C11781) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m26959invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26959invoke() {
                        if (basicTooltipState.isVisible()) {
                            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C11781(basicTooltipState, null), 3, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (InterfaceC9529a) objRememberedValue, new PopupProperties(z10, false, false, false, 14, (AbstractC9972n) null), ComposableLambdaKt.rememberComposableLambda(-2085908648, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.BasicTooltipKt.TooltipPopup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i12) {
                    if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2085908648, i12, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    boolean zChanged = composer2.changed(strDescription);
                    final String str = strDescription;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m32746setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m32719getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (InterfaceC9540l) objRememberedValue2, 1, null);
                    InterfaceC9544p interfaceC9544p2 = interfaceC9544p;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    InterfaceC9529a constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composer2);
                    Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    interfaceC9544p2.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.BasicTooltipKt.TooltipPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) throws Resources.NotFoundException {
                    BasicTooltipKt.TooltipPopup(popupPositionProvider, basicTooltipState, interfaceC11122i0, z10, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(final boolean z10, final BasicTooltipState basicTooltipState, Modifier modifier, final InterfaceC9544p interfaceC9544p, Composer composer, final int i10, final int i11) throws Resources.NotFoundException {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-111661630);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111661630, i12, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier, z10, basicTooltipState), BasicTooltipStrings.INSTANCE.label(composerStartRestartGroup, 6), z10, basicTooltipState, (InterfaceC11122i0) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.BasicTooltipKt.WrappedAnchor.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i14) throws Resources.NotFoundException {
                    BasicTooltipKt.WrappedAnchor(z10, basicTooltipState, modifier2, interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z10, final BasicTooltipState basicTooltipState, final InterfaceC11122i0 interfaceC11122i0) {
        return z10 ? SemanticsModifierKt.semantics(modifier, true, new InterfaceC9540l() { // from class: androidx.compose.foundation.BasicTooltipKt.anchorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C10786q.f26013a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final InterfaceC11122i0 interfaceC11122i02 = interfaceC11122i0;
                final BasicTooltipState basicTooltipState2 = basicTooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new InterfaceC9529a() { // from class: androidx.compose.foundation.BasicTooltipKt.anchorSemantics.1.1

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", m26211f = "BasicTooltip.kt", m26212l = {220}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C120601 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C120601(BasicTooltipState basicTooltipState, InterfaceC11588c<? super C120601> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C120601(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                this.label = 1;
                                if (BasicTooltipState.show$default(basicTooltipState, null, this, 1, null) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C120601) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        AbstractC11117h.m24726d(interfaceC11122i02, null, null, new C120601(basicTooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z10, final BasicTooltipState basicTooltipState) {
        return z10 ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", m26211f = "BasicTooltip.kt", m26212l = {Opcodes.IF_ICMPGE}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", m26211f = "BasicTooltip.kt", m26212l = {Opcodes.IF_ACMPNE, Opcodes.RET, 175}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120611 extends RestrictedSuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", m26211f = "BasicTooltip.kt", m26212l = {172}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C120621 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C120621(BasicTooltipState basicTooltipState, InterfaceC11588c<? super C120621> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C120621(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C120621) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120611(InterfaceC11122i0 interfaceC11122i0, BasicTooltipState basicTooltipState, InterfaceC11588c<? super C120611> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$$this$coroutineScope = interfaceC11122i0;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        C120611 c120611 = new C120611(this.$$this$coroutineScope, this.$state, interfaceC11588c);
                        c120611.L$0 = obj;
                        return c120611;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((C120611) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
                    
                        if (r1 == r0) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
                        /*
                            r15 = this;
                            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                            int r1 = r15.label
                            r2 = 3
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L3e
                            if (r1 == r4) goto L2f
                            if (r1 == r3) goto L20
                            if (r1 != r2) goto L18
                            kotlin.AbstractC9924b.m20071b(r16)
                            r1 = r16
                            goto La8
                        L18:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r1)
                            throw r0
                        L20:
                            java.lang.Object r1 = r15.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r15.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.AbstractC9924b.m20071b(r16)
                            r7 = r1
                            r1 = r16
                            goto L84
                        L2f:
                            java.lang.Object r1 = r15.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r4 = r15.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r4
                            kotlin.AbstractC9924b.m20071b(r16)
                            r7 = r1
                            r1 = r16
                            goto L5a
                        L3e:
                            kotlin.AbstractC9924b.m20071b(r16)
                            java.lang.Object r1 = r15.L$0
                            r5 = r1
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                            r15.L$0 = r5
                            r15.L$1 = r7
                            r15.label = r4
                            r6 = 0
                            r9 = 1
                            r10 = 0
                            r8 = r15
                            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                            if (r1 != r0) goto L59
                            goto La7
                        L59:
                            r4 = r5
                        L5a:
                            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r1
                            int r1 = r1.m32107getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p014ui.input.pointer.PointerType.Companion
                            int r6 = r5.m32182getTouchT8wyACA()
                            boolean r6 = androidx.compose.p014ui.input.pointer.PointerType.m32175equalsimpl0(r1, r6)
                            if (r6 != 0) goto L76
                            int r5 = r5.m32181getStylusT8wyACA()
                            boolean r1 = androidx.compose.p014ui.input.pointer.PointerType.m32175equalsimpl0(r1, r5)
                            if (r1 == 0) goto Lc1
                        L76:
                            r15.L$0 = r4
                            r15.L$1 = r7
                            r15.label = r3
                            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(r4, r7, r15)
                            if (r1 != r0) goto L83
                            goto La7
                        L83:
                            r3 = r4
                        L84:
                            androidx.compose.foundation.gestures.LongPressResult r1 = (androidx.compose.foundation.gestures.LongPressResult) r1
                            boolean r1 = r1 instanceof androidx.compose.foundation.gestures.LongPressResult.Success
                            if (r1 == 0) goto Lc1
                            sd.i0 r9 = r15.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r12 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                            androidx.compose.foundation.BasicTooltipState r1 = r15.$state
                            r4 = 0
                            r12.<init>(r1, r4)
                            r13 = 3
                            r14 = 0
                            r10 = 0
                            r11 = 0
                            sd.AbstractC11109f.m24706d(r9, r10, r11, r12, r13, r14)
                            r15.L$0 = r4
                            r15.L$1 = r4
                            r15.label = r2
                            java.lang.Object r1 = r3.awaitPointerEvent(r7, r15)
                            if (r1 != r0) goto La8
                        La7:
                            return r0
                        La8:
                            androidx.compose.ui.input.pointer.PointerEvent r1 = (androidx.compose.p014ui.input.pointer.PointerEvent) r1
                            java.util.List r0 = r1.getChanges()
                            int r1 = r0.size()
                            r2 = 0
                        Lb3:
                            if (r2 >= r1) goto Lc1
                            java.lang.Object r3 = r0.get(r2)
                            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r3
                            r3.consume()
                            int r2 = r2 + 1
                            goto Lb3
                        Lc1:
                            qc.q r0 = p309qc.C10786q.f26013a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.C11831.AnonymousClass1.C120611.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C120611 c120611 = new C120611(interfaceC11122i0, this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c120611, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objM20748e = AbstractC10006d.m20748e(new AnonymousClass1(pointerInputScope, basicTooltipState, null), interfaceC11588c);
                return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.2

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", m26211f = "BasicTooltip.kt", m26212l = {186}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", m26211f = "BasicTooltip.kt", m26212l = {190}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C120631 extends RestrictedSuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", m26211f = "BasicTooltip.kt", m26212l = {195}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C120641 extends SuspendLambda implements InterfaceC9544p {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C120641(BasicTooltipState basicTooltipState, InterfaceC11588c<? super C120641> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new C120641(this.$state, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((C120641) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C120631(InterfaceC11122i0 interfaceC11122i0, BasicTooltipState basicTooltipState, InterfaceC11588c<? super C120631> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$$this$coroutineScope = interfaceC11122i0;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        C120631 c120631 = new C120631(this.$$this$coroutineScope, this.$state, interfaceC11588c);
                        c120631.L$0 = obj;
                        return c120631;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((C120631) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                            int r1 = r12.label
                            r2 = 1
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r1 = r12.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p014ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.AbstractC9924b.m20071b(r13)
                            goto L36
                        L17:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L1f:
                            kotlin.AbstractC9924b.m20071b(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r13
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p014ui.input.pointer.PointerEventPass.Main
                            r3 = r13
                        L29:
                            r12.L$0 = r3
                            r12.L$1 = r1
                            r12.label = r2
                            java.lang.Object r13 = r3.awaitPointerEvent(r1, r12)
                            if (r13 != r0) goto L36
                            return r0
                        L36:
                            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p014ui.input.pointer.PointerEvent) r13
                            java.util.List r4 = r13.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p014ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.m32107getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p014ui.input.pointer.PointerType.Companion
                            int r5 = r5.m32180getMouseT8wyACA()
                            boolean r4 = androidx.compose.p014ui.input.pointer.PointerType.m32175equalsimpl0(r4, r5)
                            if (r4 == 0) goto L29
                            int r13 = r13.m32046getType7fucELk()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p014ui.input.pointer.PointerEventType.Companion
                            int r5 = r4.m32057getEnter7fucELk()
                            boolean r5 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r13, r5)
                            if (r5 == 0) goto L75
                            sd.i0 r6 = r12.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r9 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                            r4 = 0
                            r9.<init>(r13, r4)
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            sd.AbstractC11109f.m24706d(r6, r7, r8, r9, r10, r11)
                            goto L29
                        L75:
                            int r4 = r4.m32058getExit7fucELk()
                            boolean r13 = androidx.compose.p014ui.input.pointer.PointerEventType.m32053equalsimpl0(r13, r4)
                            if (r13 == 0) goto L29
                            androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                            r13.dismiss()
                            goto L29
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.C11842.AnonymousClass1.C120631.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C120631 c120631 = new C120631(interfaceC11122i0, this.$state, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c120631, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objM20748e = AbstractC10006d.m20748e(new AnonymousClass1(pointerInputScope, basicTooltipState, null), interfaceC11588c);
                return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
            }
        }) : modifier;
    }

    @Composable
    @ExperimentalFoundationApi
    public static final BasicTooltipState rememberBasicTooltipState(boolean z10, boolean z11, MutatorMutex mutatorMutex, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i10, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z12 = ((((i10 & 112) ^ 48) > 32 && composer.changed(z11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z12 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new BasicTooltipStateImpl(z10, z11, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }
}
