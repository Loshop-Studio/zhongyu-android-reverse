package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", m5192f = "ExposedDropdownMenu.kt", m5193i = {}, m5194l = {530}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$expandable$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1", m5192f = "ExposedDropdownMenu.kt", m5193i = {}, m5194l = {531}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1 */
    public static final class C09911 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5191c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1", m5192f = "ExposedDropdownMenu.kt", m5193i = {}, m5194l = {532}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$forEachGesture;
            final /* synthetic */ Function0<Unit> $onExpandedChange;
            int label;

            @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m5191c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1", m5192f = "ExposedDropdownMenu.kt", m5193i = {0}, m5194l = {535}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope"}, m5197s = {"L$0"})
            /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C47411 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C47411(Function0<Unit> function0, Continuation<? super C47411> continuation) {
                    super(2, continuation);
                    this.$onExpandedChange = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C47411 c47411 = new C47411(this.$onExpandedChange, continuation);
                    c47411.L$0 = obj;
                    return c47411;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C47411) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r9.label
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r10)
                        r3 = r1
                        r1 = r0
                        r0 = r9
                        goto L39
                    L16:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1e:
                        kotlin.ResultKt.throwOnFailure(r10)
                        java.lang.Object r10 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r10
                        r1 = r10
                        r10 = r9
                    L27:
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p006ui.input.pointer.PointerEventPass.Initial
                        r10.L$0 = r1
                        r10.label = r2
                        java.lang.Object r3 = r1.awaitPointerEvent(r3, r10)
                        if (r3 != r0) goto L34
                        return r0
                    L34:
                        r8 = r0
                        r0 = r10
                        r10 = r3
                        r3 = r1
                        r1 = r8
                    L39:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p006ui.input.pointer.PointerEvent) r10
                        java.util.List r10 = r10.getChanges()
                        int r4 = r10.size()
                        r5 = 0
                        r6 = r5
                    L45:
                        if (r6 >= r4) goto L57
                        java.lang.Object r7 = r10.get(r6)
                        androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r7
                        boolean r7 = androidx.compose.p006ui.input.pointer.PointerEventKt.changedToUp(r7)
                        if (r7 != 0) goto L54
                        goto L58
                    L54:
                        int r6 = r6 + 1
                        goto L45
                    L57:
                        r5 = r2
                    L58:
                        if (r5 == 0) goto L62
                        kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r0.$onExpandedChange
                        r10.invoke()
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    L62:
                        r10 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1.C09911.AnonymousClass1.C47411.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$forEachGesture = pointerInputScope;
                this.$onExpandedChange = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$$this$forEachGesture, this.$onExpandedChange, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                    C47411 c47411 = new C47411(this.$onExpandedChange, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c47411, this) == coroutine_suspended) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09911(Function0<Unit> function0, Continuation<? super C09911> continuation) {
            super(2, continuation);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09911 c09911 = new C09911(this.$onExpandedChange, continuation);
            c09911.L$0 = obj;
            return c09911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C09911) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$onExpandedChange, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
    public ExposedDropdownMenuKt$expandable$1$1(Function0<Unit> function0, Continuation<? super ExposedDropdownMenuKt$expandable$1$1> continuation) {
        super(2, continuation);
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExposedDropdownMenuKt$expandable$1$1 exposedDropdownMenuKt$expandable$1$1 = new ExposedDropdownMenuKt$expandable$1$1(this.$onExpandedChange, continuation);
        exposedDropdownMenuKt$expandable$1$1.L$0 = obj;
        return exposedDropdownMenuKt$expandable$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ExposedDropdownMenuKt$expandable$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C09911 c09911 = new C09911(this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(pointerInputScope, c09911, this) == coroutine_suspended) {
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
