package androidx.compose.foundation;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusChangedModifierKt;
import androidx.compose.p006ui.focus.FocusModifierKt;
import androidx.compose.p006ui.focus.FocusProperties;
import androidx.compose.p006ui.focus.FocusPropertiesKt;
import androidx.compose.p006ui.focus.FocusRequester;
import androidx.compose.p006ui.focus.FocusRequesterModifierKt;
import androidx.compose.p006ui.focus.FocusState;
import androidx.compose.p006ui.input.InputMode;
import androidx.compose.p006ui.input.InputModeManager;
import androidx.compose.p006ui.layout.PinnableContainer;
import androidx.compose.p006ui.layout.PinnableContainerKt;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.InspectableModifier;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0007\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m5175d2 = {"focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"})
/* loaded from: classes.dex */
public final class FocusableKt {
    private static final InspectableModifier focusGroupInspectorInfo;

    @Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m5175d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n474#2,4:228\n478#2,2:236\n482#2:242\n25#3:232\n25#3:243\n25#3:250\n25#3:257\n25#3:264\n50#3:271\n49#3:272\n25#3:279\n25#3:287\n67#3,3:294\n66#3:297\n50#3:304\n49#3:305\n1114#4,3:233\n1117#4,3:239\n1114#4,6:244\n1114#4,6:251\n1114#4,6:258\n1114#4,6:265\n1114#4,6:273\n1114#4,6:280\n1114#4,6:288\n1114#4,6:298\n1114#4,6:306\n474#5:238\n76#6:286\n76#7:312\n102#7,2:313\n76#7:315\n102#7,2:316\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n*L\n69#1:228,4\n69#1:236,2\n69#1:242\n69#1:232\n70#1:243\n71#1:250\n72#1:257\n84#1:264\n85#1:271\n85#1:272\n109#1:279\n118#1:287\n119#1:294,3\n119#1:297\n130#1:304\n130#1:305\n69#1:233,3\n69#1:239,3\n70#1:244,6\n71#1:251,6\n72#1:258,6\n84#1:265,6\n85#1:273,6\n109#1:280,6\n118#1:288,6\n119#1:298,6\n130#1:306,6\n69#1:238\n117#1:286\n71#1:312\n71#1:313,2\n118#1:315\n118#1:316,2\n*E\n"})
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2 */
    public static final class C04032 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04032(MutableInteractionSource mutableInteractionSource, boolean z3) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$10(MutableState<PinnableContainer.PinnedHandle> mutableState, PinnableContainer.PinnedHandle pinnedHandle) {
            mutableState.setValue(pinnedHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$2(MutableState<Boolean> mutableState) {
            return mutableState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$3(MutableState<Boolean> mutableState, boolean z3) {
            mutableState.setValue(Boolean.valueOf(z3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PinnableContainer.PinnedHandle invoke$lambda$9(MutableState<PinnableContainer.PinnedHandle> mutableState) {
            return mutableState.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        public final Modifier invoke(Modifier composed, Composer composer, int i4) {
            Modifier modifierFocusTarget;
            Modifier modifier;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(1871352361);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1871352361, i4, -1, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:67)");
            }
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FocusRequester();
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue4;
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue5;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<FocusInteraction.Focus> mutableState3 = mutableState;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                FocusInteraction.Focus focus = (FocusInteraction.Focus) mutableState3.getValue();
                                if (focus != null) {
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    if (mutableInteractionSource3 != null) {
                                        mutableInteractionSource3.tryEmit(unfocus);
                                    }
                                    mutableState3.setValue(null);
                                }
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue6, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            final boolean z3 = this.$enabled;
            final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            EffectsKt.DisposableEffect(boolValueOf, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.2

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", m5192f = "Focusable.kt", m5193i = {}, m5194l = {99}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i4 = this.label;
                        if (i4 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                            if (value != null) {
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                if (mutableInteractionSource != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            return Unit.INSTANCE;
                        }
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    if (!z3) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource2, null), 3, null);
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composer, 0);
            if (this.$enabled) {
                composer.startReplaceableGroup(1407540673);
                if (invoke$lambda$2(mutableState2)) {
                    composer.startReplaceableGroup(-492369756);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new FocusedBoundsModifier();
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    composer.endReplaceableGroup();
                    modifier = (Modifier) objRememberedValue7;
                } else {
                    modifier = Modifier.INSTANCE;
                }
                composer.endReplaceableGroup();
                final PinnableContainer pinnableContainer = (PinnableContainer) composer.consume(PinnableContainerKt.getLocalPinnableContainer());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState3 = (MutableState) objRememberedValue8;
                composer.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer.changed(mutableState2) | composer.changed(mutableState3) | composer.changed(pinnableContainer);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            if (FocusableKt.C04032.invoke$lambda$2(mutableState2)) {
                                MutableState<PinnableContainer.PinnedHandle> mutableState4 = mutableState3;
                                PinnableContainer pinnableContainer2 = pinnableContainer;
                                FocusableKt.C04032.invoke$lambda$10(mutableState4, pinnableContainer2 != null ? pinnableContainer2.pin() : null);
                            }
                            final MutableState<PinnableContainer.PinnedHandle> mutableState5 = mutableState3;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PinnableContainer.PinnedHandle pinnedHandleInvoke$lambda$9 = FocusableKt.C04032.invoke$lambda$9(mutableState5);
                                    if (pinnedHandleInvoke$lambda$9 != null) {
                                        pinnedHandleInvoke$lambda$9.release();
                                    }
                                    FocusableKt.C04032.invoke$lambda$10(mutableState5, null);
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue9);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(pinnableContainer, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer.startReplaceableGroup(511388516);
                boolean zChanged3 = composer.changed(mutableState2) | composer.changed(focusRequester);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.setFocused(semantics, FocusableKt.C04032.invoke$lambda$2(mutableState2));
                            final FocusRequester focusRequester2 = focusRequester;
                            final MutableState<Boolean> mutableState4 = mutableState2;
                            SemanticsPropertiesKt.requestFocus$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    focusRequester2.requestFocus();
                                    return Boolean.valueOf(FocusableKt.C04032.invoke$lambda$2(mutableState4));
                                }
                            }, 1, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue10);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue10, 1, null), bringIntoViewRequester), focusRequester).then(modifier);
                final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierFocusTarget = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(modifierThen, new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.5

                    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                    @DebugMetadata(m5191c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", m5192f = "Focusable.kt", m5193i = {1}, m5194l = {147, 151, 154}, m5195m = "invokeSuspend", m5196n = {"interaction"}, m5197s = {"L$0"})
                    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                        final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, BringIntoViewRequester bringIntoViewRequester, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                            this.$bringIntoViewRequester = bringIntoViewRequester;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, this.$bringIntoViewRequester, continuation);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                            /*
                                r8 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r8.label
                                r2 = 3
                                r3 = 2
                                r4 = 1
                                r5 = 0
                                if (r1 == 0) goto L2e
                                if (r1 == r4) goto L26
                                if (r1 == r3) goto L1e
                                if (r1 != r2) goto L16
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L7c
                            L16:
                                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r9.<init>(r0)
                                throw r9
                            L1e:
                                java.lang.Object r1 = r8.L$0
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r1
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L6a
                            L26:
                                java.lang.Object r1 = r8.L$0
                                androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                kotlin.ResultKt.throwOnFailure(r9)
                                goto L52
                            L2e:
                                kotlin.ResultKt.throwOnFailure(r9)
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                                java.lang.Object r9 = r9.getValue()
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r9 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r9
                                if (r9 == 0) goto L56
                                androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.$interactionSource
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r6 = r8.$focusedInteraction
                                androidx.compose.foundation.interaction.FocusInteraction$Unfocus r7 = new androidx.compose.foundation.interaction.FocusInteraction$Unfocus
                                r7.<init>(r9)
                                if (r1 == 0) goto L53
                                r8.L$0 = r6
                                r8.label = r4
                                java.lang.Object r9 = r1.emit(r7, r8)
                                if (r9 != r0) goto L51
                                return r0
                            L51:
                                r1 = r6
                            L52:
                                r6 = r1
                            L53:
                                r6.setValue(r5)
                            L56:
                                androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
                                r1.<init>()
                                androidx.compose.foundation.interaction.MutableInteractionSource r9 = r8.$interactionSource
                                if (r9 == 0) goto L6a
                                r8.L$0 = r1
                                r8.label = r3
                                java.lang.Object r9 = r9.emit(r1, r8)
                                if (r9 != r0) goto L6a
                                return r0
                            L6a:
                                androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                                r9.setValue(r1)
                                androidx.compose.foundation.relocation.BringIntoViewRequester r9 = r8.$bringIntoViewRequester
                                r8.L$0 = r5
                                r8.label = r2
                                java.lang.Object r9 = androidx.compose.foundation.relocation.AbstractC0792a.m259a(r9, r5, r8, r4, r5)
                                if (r9 != r0) goto L7c
                                return r0
                            L7c:
                                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.FocusableKt.C04032.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                    @DebugMetadata(m5191c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", m5192f = "Focusable.kt", m5193i = {}, m5194l = {162}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$focusedInteraction = mutableState;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState<FocusInteraction.Focus> mutableState;
                            MutableState<FocusInteraction.Focus> mutableState2;
                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i4 = this.label;
                            if (i4 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                                if (value != null) {
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$focusedInteraction;
                                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                return Unit.INSTANCE;
                            }
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(FocusState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        C04032.invoke$lambda$3(mutableState2, it.isFocused());
                        if (C04032.invoke$lambda$2(mutableState2)) {
                            MutableState<PinnableContainer.PinnedHandle> mutableState4 = mutableState3;
                            PinnableContainer pinnableContainer2 = pinnableContainer;
                            C04032.invoke$lambda$10(mutableState4, pinnableContainer2 != null ? pinnableContainer2.pin() : null);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource3, bringIntoViewRequester, null), 3, null);
                            return;
                        }
                        PinnableContainer.PinnedHandle pinnedHandleInvoke$lambda$9 = C04032.invoke$lambda$9(mutableState3);
                        if (pinnedHandleInvoke$lambda$9 != null) {
                            pinnedHandleInvoke$lambda$9.release();
                        }
                        C04032.invoke$lambda$10(mutableState3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(mutableState, mutableInteractionSource3, null), 3, null);
                    }
                }));
            } else {
                modifierFocusTarget = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierFocusTarget;
        }
    }

    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
    }

    @ExperimentalFoundationApi
    public static final Modifier focusGroup(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), new Function1<FocusProperties, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusGroup.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
                invoke2(focusProperties);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusProperties focusProperties) {
                Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                focusProperties.setCanFocus(false);
            }
        }));
    }

    public static final Modifier focusable(Modifier modifier, final boolean z3, final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new C04032(mutableInteractionSource, z3));
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        if ((i4 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z3, mutableInteractionSource);
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, final boolean z3, final MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-618949501);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-618949501, i4, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
                }
                final InputModeManager inputModeManager = (InputModeManager) composer.consume(CompositionLocalsKt.getLocalInputModeManager());
                Modifier modifierFocusable = FocusableKt.focusable(FocusPropertiesKt.focusProperties(Modifier.INSTANCE, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
                        invoke2(focusProperties);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(FocusProperties focusProperties) {
                        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                        focusProperties.setCanFocus(!InputMode.m9759equalsimpl0(inputModeManager.mo9765getInputModeaOaMEAU(), InputMode.INSTANCE.m9764getTouchaOaMEAU()));
                    }
                }), z3, mutableInteractionSource);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierFocusable;
            }
        });
    }
}
