package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\n"}, m13558d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z9, final Function1<? super Offset, Unit> function1) {
        return z9 ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final MutableState mutableState = (MutableState) objRememberedValue2;
                final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, 0);
                Object obj = mutableInteractionSource;
                boolean zChanged = composer.changed(obj);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                                    if (press != null) {
                                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(cancel);
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.DisposableEffect(obj, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(mutableInteractionSource) | composer.changed(stateRememberUpdatedState);
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                        @DebugMetadata(m13595c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m13596f = "TextFieldPressGestureFilter.kt", m13597i = {}, m13598l = {67}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 */
                        public static final class C16891 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            final /* synthetic */ CoroutineScope $scope;
                            /* synthetic */ long J$0;
                            private /* synthetic */ Object L$0;
                            int label;

                            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                            @DebugMetadata(m13595c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m13596f = "TextFieldPressGestureFilter.kt", m13597i = {1}, m13598l = {60, 64}, m13599m = "invokeSuspend", m13600n = {"interaction"}, m13601s = {"L$0"})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ long $it;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(MutableState<PressInteraction.Press> mutableState, long j10, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$pressedInteraction = mutableState;
                                    this.$it = j10;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                                    /*
                                        r7 = this;
                                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r1 = r7.label
                                        r2 = 0
                                        r3 = 2
                                        r4 = 1
                                        if (r1 == 0) goto L27
                                        if (r1 == r4) goto L1f
                                        if (r1 != r3) goto L17
                                        java.lang.Object r0 = r7.L$0
                                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                        kotlin.ResultKt.throwOnFailure(r8)
                                        goto L66
                                    L17:
                                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r8.<init>(r0)
                                        throw r8
                                    L1f:
                                        java.lang.Object r1 = r7.L$0
                                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                        kotlin.ResultKt.throwOnFailure(r8)
                                        goto L4b
                                    L27:
                                        kotlin.ResultKt.throwOnFailure(r8)
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                        java.lang.Object r8 = r8.getValue()
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                        if (r8 == 0) goto L4f
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                        r6.<init>(r8)
                                        if (r1 == 0) goto L4c
                                        r7.L$0 = r5
                                        r7.label = r4
                                        java.lang.Object r8 = r1.emit(r6, r7)
                                        if (r8 != r0) goto L4a
                                        goto L64
                                    L4a:
                                        r1 = r5
                                    L4b:
                                        r5 = r1
                                    L4c:
                                        r5.setValue(r2)
                                    L4f:
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                        long r4 = r7.$it
                                        r8.<init>(r4, r2)
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        if (r1 == 0) goto L67
                                        r7.L$0 = r8
                                        r7.label = r3
                                        java.lang.Object r1 = r1.emit(r8, r7)
                                        if (r1 != r0) goto L65
                                    L64:
                                        return r0
                                    L65:
                                        r0 = r8
                                    L66:
                                        r8 = r0
                                    L67:
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                                        r0.setValue(r8)
                                        kotlin.Unit r8 = kotlin.Unit.INSTANCE
                                        return r8
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.C16891.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }
                            }

                            @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
                            @DebugMetadata(m13595c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m13596f = "TextFieldPressGestureFilter.kt", m13597i = {}, m13598l = {76}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                final /* synthetic */ boolean $success;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z9, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                    this.$pressedInteraction = mutableState;
                                    this.$success = z9;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    MutableState<PressInteraction.Press> mutableState;
                                    MutableState<PressInteraction.Press> mutableState2;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            boolean z9 = this.$success;
                                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                            mutableState = this.$pressedInteraction;
                                            Interaction release = z9 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                            if (mutableInteractionSource != null) {
                                                this.L$0 = mutableState;
                                                this.label = 1;
                                                if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                mutableState2 = mutableState;
                                            }
                                            mutableState.setValue(null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    if (i10 != 1) {
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
                            public C16891(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super C16891> continuation) {
                                super(3, continuation);
                                this.$scope = coroutineScope;
                                this.$pressedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                                return m18109invoked4ec7I(pressGestureScope, offset.m20745unboximpl(), continuation);
                            }

                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                            public final Object m18109invoked4ec7I(PressGestureScope pressGestureScope, long j10, Continuation<? super Unit> continuation) {
                                C16891 c16891 = new C16891(this.$scope, this.$pressedInteraction, this.$interactionSource, continuation);
                                c16891.L$0 = pressGestureScope;
                                c16891.J$0 = j10;
                                return c16891.invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                                    this.label = 1;
                                    obj = pressGestureScope.tryAwaitRelease(this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            C16891 c16891 = new C16891(coroutineScope, mutableState, mutableInteractionSource4, null);
                            final State<Function1<Offset, Unit>> state = stateRememberUpdatedState;
                            Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, c16891, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m18110invokek4lQ0M(offset.m20745unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m18110invokek4lQ0M(long j10) {
                                    state.getValue().invoke(Offset.m20724boximpl(j10));
                                }
                            }, continuation);
                            return objDetectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, (PointerInputEventHandler) objRememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierPointerInput;
            }
        }, 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z9, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z9, function1);
    }
}
