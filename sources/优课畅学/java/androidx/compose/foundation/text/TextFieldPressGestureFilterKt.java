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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z10, final InterfaceC10570l interfaceC10570l) {
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC10575q() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17438a, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final MutableState mutableState = (MutableState) objRememberedValue2;
                final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC10570l, composer, 0);
                Object obj = mutableInteractionSource;
                boolean zChanged = composer.changed(obj);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
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
                EffectsKt.DisposableEffect(obj, (InterfaceC10570l) objRememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                boolean zChangedInstance = composer.changedInstance(interfaceC8822b0) | composer.changed(mutableInteractionSource) | composer.changed(stateRememberUpdatedState);
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m17801f = "TextFieldPressGestureFilter.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 */
                        public static final class C17181 extends SuspendLambda implements InterfaceC10575q {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            final /* synthetic */ InterfaceC8822b0 $scope;
                            /* synthetic */ long J$0;
                            private /* synthetic */ Object L$0;
                            int label;

                            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m17801f = "TextFieldPressGestureFilter.kt", m17802l = {C3721BR.webViewControlViewModel, 64}, m17803m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ long $it;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(MutableState<PressInteraction.Press> mutableState, long j10, MutableInteractionSource mutableInteractionSource, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                                    super(2, interfaceC9324c);
                                    this.$pressedInteraction = mutableState;
                                    this.$it = j10;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                    return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, interfaceC9324c);
                                }

                                @Override // p300x7.InterfaceC10574p
                                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                    return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                                    /*
                                        r7 = this;
                                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                                        int r1 = r7.label
                                        r2 = 0
                                        r3 = 2
                                        r4 = 1
                                        if (r1 == 0) goto L27
                                        if (r1 == r4) goto L1f
                                        if (r1 != r3) goto L17
                                        java.lang.Object r0 = r7.L$0
                                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                        kotlin.AbstractC9079b.m15926b(r8)
                                        goto L66
                                    L17:
                                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r8.<init>(r0)
                                        throw r8
                                    L1f:
                                        java.lang.Object r1 = r7.L$0
                                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                        kotlin.AbstractC9079b.m15926b(r8)
                                        goto L4b
                                    L27:
                                        kotlin.AbstractC9079b.m15926b(r8)
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
                                        h7.p r8 = p123h7.C8736p.f16368a
                                        return r8
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.C17181.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                }
                            }

                            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m17801f = "TextFieldPressGestureFilter.kt", m17802l = {76}, m17803m = "invokeSuspend")
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                final /* synthetic */ boolean $success;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z10, MutableInteractionSource mutableInteractionSource, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                                    super(2, interfaceC9324c);
                                    this.$pressedInteraction = mutableState;
                                    this.$success = z10;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                                    return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, interfaceC9324c);
                                }

                                @Override // p300x7.InterfaceC10574p
                                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                    return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) throws Throwable {
                                    MutableState<PressInteraction.Press> mutableState;
                                    MutableState<PressInteraction.Press> mutableState2;
                                    Object objM17291f = AbstractC9434a.m17291f();
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        AbstractC9079b.m15926b(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            boolean z10 = this.$success;
                                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                            mutableState = this.$pressedInteraction;
                                            Interaction release = z10 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                            if (mutableInteractionSource != null) {
                                                this.L$0 = mutableState;
                                                this.label = 1;
                                                if (mutableInteractionSource.emit(release, this) == objM17291f) {
                                                    return objM17291f;
                                                }
                                                mutableState2 = mutableState;
                                            }
                                            mutableState.setValue(null);
                                        }
                                        return C8736p.f16368a;
                                    }
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mutableState2 = (MutableState) this.L$0;
                                    AbstractC9079b.m15926b(obj);
                                    mutableState = mutableState2;
                                    mutableState.setValue(null);
                                    return C8736p.f16368a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C17181(InterfaceC8822b0 interfaceC8822b0, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, InterfaceC9324c<? super C17181> interfaceC9324c) {
                                super(3, interfaceC9324c);
                                this.$scope = interfaceC8822b0;
                                this.$pressedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // p300x7.InterfaceC10575q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return m21308invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
                            }

                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                            public final Object m21308invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                                C17181 c17181 = new C17181(this.$scope, this.$pressedInteraction, this.$interactionSource, interfaceC9324c);
                                c17181.L$0 = pressGestureScope;
                                c17181.J$0 = j10;
                                return c17181.invokeSuspend(C8736p.f16368a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Throwable {
                                Object objM17291f = AbstractC9434a.m17291f();
                                int i10 = this.label;
                                if (i10 == 0) {
                                    AbstractC9079b.m15926b(obj);
                                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                    AbstractC8839h.m14861d(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                                    this.label = 1;
                                    obj = pressGestureScope.tryAwaitRelease(this);
                                    if (obj == objM17291f) {
                                        return objM17291f;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC9079b.m15926b(obj);
                                }
                                AbstractC8839h.m14861d(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                                return C8736p.f16368a;
                            }
                        }

                        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            C17181 c17181 = new C17181(interfaceC8822b0, mutableState, mutableInteractionSource4, null);
                            final State<InterfaceC10570l> state = stateRememberUpdatedState;
                            Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, c17181, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // p300x7.InterfaceC10570l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m21309invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                                    return C8736p.f16368a;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m21309invokek4lQ0M(long j10) {
                                    state.getValue().invoke(Offset.m24024boximpl(j10));
                                }
                            }, interfaceC9324c);
                            return objDetectTapAndPress == AbstractC9434a.m17291f() ? objDetectTapAndPress : C8736p.f16368a;
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

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z10, interfaceC10570l);
    }
}
