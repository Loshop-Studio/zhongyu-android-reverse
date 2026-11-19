package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
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
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Ld6/s;", "onTap", "tapPressTextFieldModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLr6/c;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    @NotNull
    public static final Modifier tapPressTextFieldModifier(@NotNull Modifier modifier, @Nullable final MutableInteractionSource mutableInteractionSource, boolean z8, @NotNull final InterfaceC6471c interfaceC6471c) {
        return z8 ? ComposedModifierKt.composed$default(modifier, null, new InterfaceC6474f() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(-102778667);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final InterfaceC6009v interfaceC6009v = (InterfaceC6009v) objRememberedValue;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final MutableState mutableState = (MutableState) objRememberedValue2;
                final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC6471c, composer, 0);
                Object obj = mutableInteractionSource;
                boolean zChanged = composer.changed(obj);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
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
                EffectsKt.DisposableEffect(obj, (InterfaceC6471c) objRememberedValue3, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                boolean zChangedInstance = composer.changedInstance(interfaceC6009v) | composer.changed(mutableInteractionSource) | composer.changed(stateRememberUpdatedState);
                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1

                        @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                        @DebugMetadata(m5302c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m5303f = "TextFieldPressGestureFilter.kt", m5304i = {}, m5305l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                        /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 */
                        public static final class C12881 extends SuspendLambda implements InterfaceC6474f {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                            final /* synthetic */ InterfaceC6009v $scope;
                            /* synthetic */ long J$0;
                            private /* synthetic */ Object L$0;
                            int label;

                            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                            @DebugMetadata(m5302c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m5303f = "TextFieldPressGestureFilter.kt", m5304i = {1}, m5305l = {60, 64}, m5306m = "invokeSuspend", m5307n = {"interaction"}, m5308s = {"L$0"})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ long $it;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(MutableState<PressInteraction.Press> mutableState, long j7, MutableInteractionSource mutableInteractionSource, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                                    super(2, interfaceC5631c);
                                    this.$pressedInteraction = mutableState;
                                    this.$it = j7;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                                    return new AnonymousClass1(this.$pressedInteraction, this.$it, this.$interactionSource, interfaceC5631c);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
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
                                        r2 = 0
                                        r3 = 2
                                        r4 = 1
                                        if (r1 == 0) goto L25
                                        if (r1 == r4) goto L1d
                                        if (r1 != r3) goto L15
                                        java.lang.Object r0 = r7.L$0
                                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                                        kotlin.AbstractC5774b.m5119b(r8)
                                        goto L64
                                    L15:
                                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r8.<init>(r0)
                                        throw r8
                                    L1d:
                                        java.lang.Object r1 = r7.L$0
                                        androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                                        kotlin.AbstractC5774b.m5119b(r8)
                                        goto L49
                                    L25:
                                        kotlin.AbstractC5774b.m5119b(r8)
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r8 = r7.$pressedInteraction
                                        java.lang.Object r8 = r8.getValue()
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = (androidx.compose.foundation.interaction.PressInteraction.Press) r8
                                        if (r8 == 0) goto L4d
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r5 = r7.$pressedInteraction
                                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                                        r6.<init>(r8)
                                        if (r1 == 0) goto L4a
                                        r7.L$0 = r5
                                        r7.label = r4
                                        java.lang.Object r8 = r1.emit(r6, r7)
                                        if (r8 != r0) goto L48
                                        goto L62
                                    L48:
                                        r1 = r5
                                    L49:
                                        r5 = r1
                                    L4a:
                                        r5.setValue(r2)
                                    L4d:
                                        androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                        long r4 = r7.$it
                                        r8.<init>(r4, r2)
                                        androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.$interactionSource
                                        if (r1 == 0) goto L65
                                        r7.L$0 = r8
                                        r7.label = r3
                                        java.lang.Object r1 = r1.emit(r8, r7)
                                        if (r1 != r0) goto L63
                                    L62:
                                        return r0
                                    L63:
                                        r0 = r8
                                    L64:
                                        r8 = r0
                                    L65:
                                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r7.$pressedInteraction
                                        r0.setValue(r8)
                                        d6.s r8 = p045d6.C5443s.f8405a
                                        return r8
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.C12881.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                }

                                @Override // p152r6.InterfaceC6473e
                                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                    return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                }
                            }

                            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
                            @DebugMetadata(m5302c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m5303f = "TextFieldPressGestureFilter.kt", m5304i = {}, m5305l = {76}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                                final /* synthetic */ boolean $success;
                                Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(MutableState<PressInteraction.Press> mutableState, boolean z8, MutableInteractionSource mutableInteractionSource, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                                    super(2, interfaceC5631c);
                                    this.$pressedInteraction = mutableState;
                                    this.$success = z8;
                                    this.$interactionSource = mutableInteractionSource;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                                    return new AnonymousClass2(this.$pressedInteraction, this.$success, this.$interactionSource, interfaceC5631c);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    MutableState<PressInteraction.Press> mutableState;
                                    MutableState<PressInteraction.Press> mutableState2;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i = this.label;
                                    if (i == 0) {
                                        AbstractC5774b.m5119b(obj);
                                        PressInteraction.Press value = this.$pressedInteraction.getValue();
                                        if (value != null) {
                                            boolean z8 = this.$success;
                                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                            mutableState = this.$pressedInteraction;
                                            Interaction release = z8 ? new PressInteraction.Release(value) : new PressInteraction.Cancel(value);
                                            if (mutableInteractionSource != null) {
                                                this.L$0 = mutableState;
                                                this.label = 1;
                                                if (mutableInteractionSource.emit(release, this) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                mutableState2 = mutableState;
                                            }
                                            mutableState.setValue(null);
                                        }
                                        return C5443s.f8405a;
                                    }
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mutableState2 = (MutableState) this.L$0;
                                    AbstractC5774b.m5119b(obj);
                                    mutableState = mutableState2;
                                    mutableState.setValue(null);
                                    return C5443s.f8405a;
                                }

                                @Override // p152r6.InterfaceC6473e
                                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C12881(InterfaceC6009v interfaceC6009v, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, InterfaceC5631c<? super C12881> interfaceC5631c) {
                                super(3, interfaceC5631c);
                                this.$scope = interfaceC6009v;
                                this.$pressedInteraction = mutableState;
                                this.$interactionSource = mutableInteractionSource;
                            }

                            @Override // p152r6.InterfaceC6474f
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return m7714invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m10451unboximpl(), (InterfaceC5631c) obj3);
                            }

                            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                            public final Object m7714invoked4ec7I(PressGestureScope pressGestureScope, long j7, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                                C12881 c12881 = new C12881(this.$scope, this.$pressedInteraction, this.$interactionSource, interfaceC5631c);
                                c12881.L$0 = pressGestureScope;
                                c12881.J$0 = j7;
                                return c12881.invokeSuspend(C5443s.f8405a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i = this.label;
                                if (i == 0) {
                                    AbstractC5774b.m5119b(obj);
                                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                    AbstractC6014x.m5651v(this.$scope, null, null, new AnonymousClass1(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
                                    this.label = 1;
                                    obj = pressGestureScope.tryAwaitRelease(this);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC5774b.m5119b(obj);
                                }
                                AbstractC6014x.m5651v(this.$scope, null, null, new AnonymousClass2(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
                                return C5443s.f8405a;
                            }
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                            C12881 c12881 = new C12881(interfaceC6009v, mutableState, mutableInteractionSource4, null);
                            final State<InterfaceC6471c> state = stateRememberUpdatedState;
                            Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, c12881, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // p152r6.InterfaceC6471c
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m7715invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                                    return C5443s.f8405a;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m7715invokek4lQ0M(long j7) {
                                    state.getValue().invoke(Offset.m10430boximpl(j7));
                                }
                            }, interfaceC5631c);
                            return objDetectTapAndPress == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapAndPress : C5443s.f8405a;
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

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z8, interfaceC6471c);
    }
}
