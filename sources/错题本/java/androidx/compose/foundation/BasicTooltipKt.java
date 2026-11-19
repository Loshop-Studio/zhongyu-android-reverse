package androidx.compose.foundation;

import android.content.res.Resources;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.LiveRegionMode;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupPositionProvider;
import androidx.compose.p011ui.window.PopupProperties;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"\u001a-\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, m5110d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/foundation/BasicTooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lr6/e;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLr6/e;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/coroutines/v;", "scope", "TooltipPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/v;ZLr6/e;Landroidx/compose/runtime/Composer;I)V", "enabled", "handleGestures", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/BasicTooltipState;)Landroidx/compose/ui/Modifier;", "", "label", "anchorSemantics", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/v;)Landroidx/compose/ui/Modifier;", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "BasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;)Landroidx/compose/foundation/BasicTooltipState;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n557#2:391\n554#2,6:392\n557#2:453\n554#2,6:454\n1247#3,3:398\n1250#3,3:402\n1247#3,6:447\n1247#3,3:460\n1250#3,3:464\n1247#3,6:508\n1247#3,6:514\n555#4:401\n555#4:463\n70#5:405\n66#5,10:406\n77#5:446\n70#5:467\n67#5,9:468\n77#5:507\n79#6,6:416\n86#6,3:431\n89#6,2:440\n93#6:445\n79#6,6:477\n86#6,3:492\n89#6,2:501\n93#6:506\n347#7,9:422\n356#7,3:442\n347#7,9:483\n356#7,3:503\n4206#8,6:434\n4206#8,6:495\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:391\n83#1:392,6\n114#1:453\n114#1:454,6\n83#1:398,3\n83#1:402,3\n103#1:447,6\n114#1:460,3\n114#1:464,3\n138#1:508,6\n246#1:514,6\n83#1:401\n114#1:463\n84#1:405\n84#1:406,10\n84#1:446\n116#1:467\n116#1:468,9\n116#1:507\n84#1:416,6\n84#1:431,3\n84#1:440,2\n84#1:445\n116#1:477,6\n116#1:492,3\n116#1:501,2\n116#1:506\n84#1:422,9\n84#1:442,3\n116#1:483,9\n116#1:503,3\n84#1:434,6\n116#1:495,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
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
    public static final void BasicTooltipBox(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.window.PopupPositionProvider r19, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r20, @org.jetbrains.annotations.NotNull androidx.compose.foundation.BasicTooltipState r21, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r22, boolean r23, boolean r24, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, r6.e, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final BasicTooltipState BasicTooltipState(boolean z8, boolean z9, @NotNull MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z8, z9, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z8, boolean z9, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        if ((i & 2) != 0) {
            z9 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z8, z9, mutatorMutex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final InterfaceC6009v interfaceC6009v, final boolean z8, final InterfaceC6473e interfaceC6473e, Composer composer, final int i) throws Resources.NotFoundException {
        PopupPositionProvider popupPositionProvider2;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-487341126);
        if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i8 = (composerStartRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6009v) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-487341126, i8, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            final String strDescription = BasicTooltipStrings.INSTANCE.description(composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(interfaceC6009v) | ((i8 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1 */
                    public static final class C07391 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C07391(BasicTooltipState basicTooltipState, InterfaceC5631c<? super C07391> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C07391(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                            this.$state.dismiss();
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C07391) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m6763invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m6763invoke() {
                        if (basicTooltipState.isVisible()) {
                            AbstractC6014x.m5651v(interfaceC6009v, null, null, new C07391(basicTooltipState, null), 3);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (InterfaceC6469a) objRememberedValue, new PopupProperties(z8, false, false, false, 14, (AbstractC5824e) null), ComposableLambdaKt.rememberComposableLambda(-2085908648, true, new InterfaceC6473e() { // from class: androidx.compose.foundation.BasicTooltipKt.TooltipPopup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i9) {
                    if (!composer2.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2085908648, i9, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composer2.changed(strDescription);
                    final String str = strDescription;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.BasicTooltipKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p152r6.InterfaceC6471c
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((SemanticsPropertyReceiver) obj);
                                return C5443s.f8405a;
                            }

                            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m12550setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m12523getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (InterfaceC6471c) objRememberedValue2, 1, null);
                    InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion2.getConstructor();
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
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (AbstractC0584a.m924y(composer2, 0, interfaceC6473e2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.BasicTooltipKt.TooltipPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) throws Resources.NotFoundException {
                    BasicTooltipKt.TooltipPopup(popupPositionProvider, basicTooltipState, interfaceC6009v, z8, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(final boolean z8, final BasicTooltipState basicTooltipState, Modifier modifier, final InterfaceC6473e interfaceC6473e, Composer composer, final int i, final int i8) throws Resources.NotFoundException {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-111661630);
        if ((i8 & 1) != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i10 = i8 & 4;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 1171) != 1170, i9 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111661630, i9, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier, z8, basicTooltipState), BasicTooltipStrings.INSTANCE.label(composerStartRestartGroup, 6), z8, basicTooltipState, (InterfaceC6009v) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (AbstractC0584a.m924y(composerStartRestartGroup, (i9 >> 9) & 14, interfaceC6473e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.foundation.BasicTooltipKt.WrappedAnchor.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i11) throws Resources.NotFoundException {
                    BasicTooltipKt.WrappedAnchor(z8, basicTooltipState, modifier2, interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z8, final BasicTooltipState basicTooltipState, final InterfaceC6009v interfaceC6009v) {
        return z8 ? SemanticsModifierKt.semantics(modifier, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.BasicTooltipKt.anchorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final InterfaceC6009v interfaceC6009v2 = interfaceC6009v;
                final BasicTooltipState basicTooltipState2 = basicTooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new InterfaceC6469a() { // from class: androidx.compose.foundation.BasicTooltipKt.anchorSemantics.1.1

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {220}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68441 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68441(BasicTooltipState basicTooltipState, InterfaceC5631c<? super C68441> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C68441(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                this.label = 1;
                                if (BasicTooltipState.show$default(basicTooltipState, null, this, 1, null) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC5774b.m5119b(obj);
                            }
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C68441) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public final Boolean invoke() {
                        AbstractC6014x.m5651v(interfaceC6009v2, null, null, new C68441(basicTooltipState2, null), 3);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z8, final BasicTooltipState basicTooltipState) {
        return z8 ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.1

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {162}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", m5303f = "BasicTooltip.kt", m5304i = {0, 0, 1, 1}, m5305l = {166, 169, 175}, m5306m = "invokeSuspend", m5307n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, m5308s = {"L$0", "L$1", "L$0", "L$1"})
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68451 extends RestrictedSuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {172}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68461 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68461(BasicTooltipState basicTooltipState, InterfaceC5631c<? super C68461> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C68461(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC5774b.m5119b(obj);
                            }
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C68461) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68451(InterfaceC6009v interfaceC6009v, BasicTooltipState basicTooltipState, InterfaceC5631c<? super C68451> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$$this$coroutineScope = interfaceC6009v;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68451 c68451 = new C68451(this.$$this$coroutineScope, this.$state, interfaceC5631c);
                        c68451.L$0 = obj;
                        return c68451;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68451) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
                    
                        if (r12 == r0) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r11.label
                            r2 = 3
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L37
                            if (r1 == r4) goto L2a
                            if (r1 == r3) goto L1d
                            if (r1 != r2) goto L15
                            kotlin.AbstractC5774b.m5119b(r12)
                            r8 = r11
                            goto L9e
                        L15:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1d:
                            java.lang.Object r1 = r11.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r11.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.AbstractC5774b.m5119b(r12)
                            r8 = r11
                            goto L7e
                        L2a:
                            java.lang.Object r1 = r11.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r4 = r11.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r4
                            kotlin.AbstractC5774b.m5119b(r12)
                            r8 = r11
                            goto L54
                        L37:
                            kotlin.AbstractC5774b.m5119b(r12)
                            java.lang.Object r12 = r11.L$0
                            r5 = r12
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.p011ui.input.pointer.PointerEventPass.Initial
                            r11.L$0 = r5
                            r11.L$1 = r7
                            r11.label = r4
                            r6 = 0
                            r9 = 1
                            r10 = 0
                            r8 = r11
                            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                            if (r12 != r0) goto L52
                            goto L9d
                        L52:
                            r4 = r5
                            r1 = r7
                        L54:
                            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r12
                            int r12 = r12.getType()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p011ui.input.pointer.PointerType.INSTANCE
                            int r6 = r5.m11986getTouchT8wyACA()
                            boolean r6 = androidx.compose.p011ui.input.pointer.PointerType.m11979equalsimpl0(r12, r6)
                            if (r6 != 0) goto L70
                            int r5 = r5.m11985getStylusT8wyACA()
                            boolean r12 = androidx.compose.p011ui.input.pointer.PointerType.m11979equalsimpl0(r12, r5)
                            if (r12 == 0) goto Lb7
                        L70:
                            r8.L$0 = r4
                            r8.L$1 = r1
                            r8.label = r3
                            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(r4, r1, r11)
                            if (r12 != r0) goto L7d
                            goto L9d
                        L7d:
                            r3 = r4
                        L7e:
                            androidx.compose.foundation.gestures.LongPressResult r12 = (androidx.compose.foundation.gestures.LongPressResult) r12
                            boolean r12 = r12 instanceof androidx.compose.foundation.gestures.LongPressResult.Success
                            if (r12 == 0) goto Lb7
                            kotlinx.coroutines.v r12 = r8.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1 r4 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1
                            androidx.compose.foundation.BasicTooltipState r5 = r8.$state
                            r6 = 0
                            r4.<init>(r5, r6)
                            kotlinx.coroutines.AbstractC6014x.m5651v(r12, r6, r6, r4, r2)
                            r8.L$0 = r6
                            r8.L$1 = r6
                            r8.label = r2
                            java.lang.Object r12 = r3.awaitPointerEvent(r1, r11)
                            if (r12 != r0) goto L9e
                        L9d:
                            return r0
                        L9e:
                            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.p011ui.input.pointer.PointerEvent) r12
                            java.util.List r12 = r12.getChanges()
                            int r0 = r12.size()
                            r1 = 0
                        La9:
                            if (r1 >= r0) goto Lb7
                            java.lang.Object r2 = r12.get(r1)
                            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r2
                            r2.consume()
                            int r1 = r1 + 1
                            goto La9
                        Lb7:
                            d6.s r12 = p045d6.C5443s.f8405a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.C07441.AnonymousClass1.C68451.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C68451 c68451 = new C68451(interfaceC6009v, this.$state, null);
                        this.label = 1;
                        if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c68451, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objM5637h = AbstractC6014x.m5637h(new AnonymousClass1(pointerInputScope, basicTooltipState, null), interfaceC5631c);
                return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
            }
        }), basicTooltipState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.BasicTooltipKt.handleGestures.2

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
            @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {186}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ BasicTooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", m5303f = "BasicTooltip.kt", m5304i = {0, 0}, m5305l = {190}, m5306m = "invokeSuspend", m5307n = {"$this$awaitPointerEventScope", "pass"}, m5308s = {"L$0", "L$1"})
                /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68471 extends RestrictedSuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                    final /* synthetic */ BasicTooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                    @DebugMetadata(m5302c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", m5303f = "BasicTooltip.kt", m5304i = {}, m5305l = {195}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C68481 extends SuspendLambda implements InterfaceC6473e {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C68481(BasicTooltipState basicTooltipState, InterfaceC5631c<? super C68481> interfaceC5631c) {
                            super(2, interfaceC5631c);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                            return new C68481(this.$state, interfaceC5631c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AbstractC5774b.m5119b(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                if (basicTooltipState.show(mutatePriority, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC5774b.m5119b(obj);
                            }
                            return C5443s.f8405a;
                        }

                        @Override // p152r6.InterfaceC6473e
                        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            return ((C68481) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68471(InterfaceC6009v interfaceC6009v, BasicTooltipState basicTooltipState, InterfaceC5631c<? super C68471> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.$$this$coroutineScope = interfaceC6009v;
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68471 c68471 = new C68471(this.$$this$coroutineScope, this.$state, interfaceC5631c);
                        c68471.L$0 = obj;
                        return c68471;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68471) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r7.label
                            r2 = 1
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r1 = r7.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p011ui.input.pointer.PointerEventPass) r1
                            java.lang.Object r3 = r7.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r3
                            kotlin.AbstractC5774b.m5119b(r8)
                            goto L34
                        L15:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1d:
                            kotlin.AbstractC5774b.m5119b(r8)
                            java.lang.Object r8 = r7.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r8
                            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p011ui.input.pointer.PointerEventPass.Main
                            r3 = r8
                        L27:
                            r7.L$0 = r3
                            r7.L$1 = r1
                            r7.label = r2
                            java.lang.Object r8 = r3.awaitPointerEvent(r1, r7)
                            if (r8 != r0) goto L34
                            return r0
                        L34:
                            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p011ui.input.pointer.PointerEvent) r8
                            java.util.List r4 = r8.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.getType()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.p011ui.input.pointer.PointerType.INSTANCE
                            int r5 = r5.m11984getMouseT8wyACA()
                            boolean r4 = androidx.compose.p011ui.input.pointer.PointerType.m11979equalsimpl0(r4, r5)
                            if (r4 == 0) goto L27
                            int r8 = r8.getType()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                            int r5 = r4.m11861getEnter7fucELk()
                            boolean r5 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r8, r5)
                            if (r5 == 0) goto L70
                            kotlinx.coroutines.v r8 = r7.$$this$coroutineScope
                            androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1 r4 = new androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.foundation.BasicTooltipState r5 = r7.$state
                            r6 = 0
                            r4.<init>(r5, r6)
                            r5 = 3
                            kotlinx.coroutines.AbstractC6014x.m5651v(r8, r6, r6, r4, r5)
                            goto L27
                        L70:
                            int r4 = r4.m11862getExit7fucELk()
                            boolean r8 = androidx.compose.p011ui.input.pointer.PointerEventType.m11857equalsimpl0(r8, r4)
                            if (r8 == 0) goto L27
                            androidx.compose.foundation.BasicTooltipState r8 = r7.$state
                            r8.dismiss()
                            goto L27
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltipKt.C07452.AnonymousClass1.C68471.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, interfaceC5631c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C68471 c68471 = new C68471(interfaceC6009v, this.$state, null);
                        this.label = 1;
                        if (pointerInputScope.awaitPointerEventScope(c68471, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                Object objM5637h = AbstractC6014x.m5637h(new AnonymousClass1(pointerInputScope, basicTooltipState, null), interfaceC5631c);
                return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
            }
        }) : modifier;
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final BasicTooltipState rememberBasicTooltipState(boolean z8, boolean z9, @Nullable MutatorMutex mutatorMutex, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = true;
        }
        if ((i8 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z10 = ((((i & 112) ^ 48) > 32 && composer.changed(z9)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new BasicTooltipStateImpl(z8, z9, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }
}
