package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.compose.p006ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
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
import com.p040uc.crashsdk.export.ExitType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m5175d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,116:1\n135#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n50#1:117\n*E\n"})
/* loaded from: classes.dex */
public final class HoverableKt {

    @Metadata(m5174d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m5175d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n474#2,4:117\n478#2,2:125\n482#2:131\n25#3:121\n25#3:132\n50#3:139\n49#3:140\n67#3,3:147\n66#3:150\n1114#4,3:122\n1117#4,3:128\n1114#4,6:133\n1114#4,6:141\n1114#4,6:151\n474#5:127\n76#6:157\n102#6,2:158\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n*L\n56#1:117,4\n56#1:125,2\n56#1:131\n56#1:121\n57#1:132\n83#1:139\n83#1:140\n86#1:147,3\n86#1:150\n56#1:122,3\n56#1:128,3\n57#1:133,6\n83#1:141,6\n86#1:151,6\n56#1:127\n57#1:157\n57#1:158,2\n*E\n"})
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2 */
    public static final class C04082 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;

        @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5191c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", m5192f = "Hoverable.kt", m5193i = {}, m5194l = {102}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,116:1\n329#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n*L\n101#1:117\n*E\n"})
        /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ CoroutineScope $scope;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", m5192f = "Hoverable.kt", m5193i = {0}, m5194l = {104}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope"}, m5197s = {"L$0"})
            /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineContext $currentContext;
                final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", m5192f = "Hoverable.kt", m5193i = {}, m5194l = {ExitType.UNEXP_REASON_RESTART}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C47201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C47201(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation<? super C47201> continuation) {
                        super(2, continuation);
                        this.$interactionSource = mutableInteractionSource;
                        this.$hoverInteraction$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C47201(this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i4 = this.label;
                        if (i4 == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            this.label = 1;
                            if (C04082.invoke$emitEnter(mutableInteractionSource, mutableState, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C47201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m5191c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", m5192f = "Hoverable.kt", m5193i = {}, m5194l = {ExitType.UNEXP_REASON_LOW_MEMORY}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
                /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$hoverInteraction$delegate = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$hoverInteraction$delegate, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i4 = this.label;
                        if (i4 == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            this.label = 1;
                            if (C04082.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(CoroutineContext coroutineContext, CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$currentContext = coroutineContext;
                    this.$scope = coroutineScope;
                    this.$interactionSource = mutableInteractionSource;
                    this.$hoverInteraction$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r14.label
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r15)
                        r4 = r1
                        r1 = r0
                        r0 = r14
                        goto L40
                    L17:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1f:
                        kotlin.ResultKt.throwOnFailure(r15)
                        java.lang.Object r15 = r14.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r15
                        r1 = r15
                        r15 = r14
                    L28:
                        kotlin.coroutines.CoroutineContext r4 = r15.$currentContext
                        boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                        if (r4 == 0) goto L85
                        r15.L$0 = r1
                        r15.label = r2
                        java.lang.Object r4 = androidx.compose.p006ui.input.pointer.AbstractC1394b.m590t(r1, r3, r15, r2, r3)
                        if (r4 != r0) goto L3b
                        return r0
                    L3b:
                        r13 = r0
                        r0 = r15
                        r15 = r4
                        r4 = r1
                        r1 = r13
                    L40:
                        androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.p006ui.input.pointer.PointerEvent) r15
                        int r15 = r15.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p006ui.input.pointer.PointerEventType.INSTANCE
                        int r6 = r5.m10436getEnter7fucELk()
                        boolean r6 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r15, r6)
                        if (r6 == 0) goto L65
                        kotlinx.coroutines.CoroutineScope r7 = r0.$scope
                        r8 = 0
                        r9 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1 r10 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1
                        androidx.compose.foundation.interaction.MutableInteractionSource r15 = r0.$interactionSource
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r5 = r0.$hoverInteraction$delegate
                        r10.<init>(r15, r5, r3)
                        r11 = 3
                        r12 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                        goto L81
                    L65:
                        int r5 = r5.m10437getExit7fucELk()
                        boolean r15 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r15, r5)
                        if (r15 == 0) goto L81
                        kotlinx.coroutines.CoroutineScope r5 = r0.$scope
                        r6 = 0
                        r7 = 0
                        androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2 r8 = new androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2
                        androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction$Enter> r15 = r0.$hoverInteraction$delegate
                        androidx.compose.foundation.interaction.MutableInteractionSource r9 = r0.$interactionSource
                        r8.<init>(r15, r9, r3)
                        r9 = 3
                        r10 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                    L81:
                        r15 = r0
                        r0 = r1
                        r1 = r4
                        goto L28
                    L85:
                        kotlin.Unit r15 = kotlin.Unit.INSTANCE
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.C04082.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$scope = coroutineScope;
                this.$interactionSource = mutableInteractionSource;
                this.$hoverInteraction$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04082(MutableInteractionSource mutableInteractionSource, boolean z3) {
            super(3);
            this.$interactionSource = mutableInteractionSource;
            this.$enabled = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.L$1
                androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r4
                java.lang.Object r5 = r0.L$0
                androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r5)
                if (r6 != 0) goto L58
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
                r6.<init>()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r4 = r4.emit(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                invoke$lambda$2(r5, r4)
            L58:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.C04082.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
                kotlin.ResultKt.throwOnFailure(r6)
                goto L4e
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.ResultKt.throwOnFailure(r6)
                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r4)
                if (r6 == 0) goto L52
                androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
                r2.<init>(r6)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L4e
                return r1
            L4e:
                r5 = 0
                invoke$lambda$2(r4, r5)
            L52:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt.C04082.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private static final HoverInteraction.Enter invoke$lambda$1(MutableState<HoverInteraction.Enter> mutableState) {
            return mutableState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
            HoverInteraction.Enter enterInvoke$lambda$1 = invoke$lambda$1(mutableState);
            if (enterInvoke$lambda$1 != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enterInvoke$lambda$1));
                mutableState.setValue(null);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        public final Modifier invoke(Modifier composed, Composer composer, int i4) {
            Modifier modifierPointerInput;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(1294013553);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1294013553, i4, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
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
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue2;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<HoverInteraction.Enter> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                HoverableKt.C04082.invoke$tryEmitExit(mutableState2, mutableInteractionSource2);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(this.$enabled);
            Object objValueOf = Boolean.valueOf(this.$enabled);
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            boolean z3 = this.$enabled;
            composer.startReplaceableGroup(1618982084);
            boolean zChanged2 = composer.changed(objValueOf) | composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new HoverableKt$hoverable$2$2$1(z3, mutableState, mutableInteractionSource2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 64);
            if (this.$enabled) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass3(coroutineScope, mutableInteractionSource3, mutableState, null));
            } else {
                modifierPointerInput = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInput;
        }
    }

    public static final Modifier hoverable(Modifier modifier, final MutableInteractionSource interactionSource, final boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("hoverable");
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new C04082(interactionSource, z3));
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z3);
    }
}
