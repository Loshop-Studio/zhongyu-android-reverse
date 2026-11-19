package androidx.compose.foundation.text;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p006ui.input.pointer.PointerEventPass;
import androidx.compose.p006ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m5175d2 = {"detectMoves", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerEventPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onMove", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m5192f = "PointerMoveDetector.kt", m5193i = {}, m5194l = {41}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2 */
    public static final class C08472 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        @Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
        @DebugMetadata(m5191c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m5192f = "PointerMoveDetector.kt", m5193i = {0, 0}, m5194l = {44}, m5195m = "invokeSuspend", m5196n = {"$this$awaitPointerEventScope", "previousPosition"}, m5197s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineContext $currentContext;
            final /* synthetic */ Function1<Offset, Unit> $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineContext coroutineContext, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentContext = coroutineContext;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
            /* JADX WARN: Type inference failed for: r10v15, types: [T, androidx.compose.ui.geometry.Offset] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:15:0x004e). Please report as a decompilation issue!!! */
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
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r9.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r3 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.ResultKt.throwOnFailure(r10)
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r9
                    goto L4e
                L1b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L23:
                    kotlin.ResultKt.throwOnFailure(r10)
                    java.lang.Object r10 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p006ui.input.pointer.AwaitPointerEventScope) r10
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r10
                    r10 = r9
                L31:
                    kotlin.coroutines.CoroutineContext r4 = r10.$currentContext
                    boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                    if (r4 == 0) goto Lb3
                    androidx.compose.ui.input.pointer.PointerEventPass r4 = r10.$pointerEventPass
                    r10.L$0 = r3
                    r10.L$1 = r1
                    r10.label = r2
                    java.lang.Object r4 = r3.awaitPointerEvent(r4, r10)
                    if (r4 != r0) goto L48
                    return r0
                L48:
                    r8 = r0
                    r0 = r10
                    r10 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r8
                L4e:
                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p006ui.input.pointer.PointerEvent) r10
                    int r5 = r10.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.p006ui.input.pointer.PointerEventType.INSTANCE
                    int r7 = r6.m10438getMove7fucELk()
                    boolean r7 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r5, r7)
                    if (r7 == 0) goto L62
                    r7 = r2
                    goto L6a
                L62:
                    int r7 = r6.m10436getEnter7fucELk()
                    boolean r7 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r5, r7)
                L6a:
                    if (r7 == 0) goto L6e
                    r5 = r2
                    goto L76
                L6e:
                    int r6 = r6.m10437getExit7fucELk()
                    boolean r5 = androidx.compose.p006ui.input.pointer.PointerEventType.m10432equalsimpl0(r5, r6)
                L76:
                    if (r5 == 0) goto Lad
                    java.util.List r10 = r10.getChanges()
                    java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)
                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p006ui.input.pointer.PointerInputChange) r10
                    long r5 = r10.getPosition()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.p006ui.geometry.Offset.m8934boximpl(r5)
                    long r5 = r10.getPackedValue()
                    T r7 = r3.element
                    boolean r5 = androidx.compose.p006ui.geometry.Offset.m8941equalsimpl(r5, r7)
                    if (r5 != 0) goto L97
                    goto L98
                L97:
                    r10 = 0
                L98:
                    if (r10 == 0) goto Lad
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r5 = r0.$onMove
                    long r6 = r10.getPackedValue()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.p006ui.geometry.Offset.m8934boximpl(r6)
                    r3.element = r10
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.p006ui.geometry.Offset.m8934boximpl(r6)
                    r5.invoke(r10)
                Lad:
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L31
                Lb3:
                    kotlin.Unit r10 = kotlin.Unit.INSTANCE
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.C08472.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08472(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super C08472> continuation) {
            super(2, continuation);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08472(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = get$context();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineContext, this.$pointerEventPass, this.$onMove, null);
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C08472(pointerInputScope, pointerEventPass, function1, null), continuation);
        return objCoroutineScope == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, Continuation continuation, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, continuation);
    }
}
