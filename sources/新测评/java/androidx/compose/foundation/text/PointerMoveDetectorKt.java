package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0080@¢\u0006\u0002\u0010\b¨\u0006\t"}, m13558d2 = {"detectMoves", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "pointerEventPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onMove", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m13596f = "PointerMoveDetector.kt", m13597i = {}, m13598l = {41}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,61:1\n329#2:62\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:62\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2 */
    public static final class C16732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Offset, Unit> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m13596f = "PointerMoveDetector.kt", m13597i = {0, 0}, m13598l = {44}, m13599m = "invokeSuspend", m13600n = {"$this$awaitPointerEventScope", "previousPosition"}, m13601s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
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

            /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.ui.geometry.Offset] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:14:0x0043). Please report as a decompilation issue!!! */
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
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r3 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L43
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    kotlin.ResultKt.throwOnFailure(r8)
                    java.lang.Object r8 = r7.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r8
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r8
                L2c:
                    kotlin.coroutines.CoroutineContext r8 = r7.$currentContext
                    boolean r8 = kotlinx.coroutines.JobKt.isActive(r8)
                    if (r8 == 0) goto La3
                    androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p013ui.input.pointer.PointerEvent) r8
                    int r4 = r8.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p013ui.input.pointer.PointerEventType.INSTANCE
                    int r6 = r5.m22154getMove7fucELk()
                    boolean r6 = androidx.compose.p013ui.input.pointer.PointerEventType.m22148equalsimpl0(r4, r6)
                    if (r6 == 0) goto L57
                    r6 = r2
                    goto L5f
                L57:
                    int r6 = r5.m22152getEnter7fucELk()
                    boolean r6 = androidx.compose.p013ui.input.pointer.PointerEventType.m22148equalsimpl0(r4, r6)
                L5f:
                    if (r6 == 0) goto L63
                    r4 = r2
                    goto L6b
                L63:
                    int r5 = r5.m22153getExit7fucELk()
                    boolean r4 = androidx.compose.p013ui.input.pointer.PointerEventType.m22148equalsimpl0(r4, r5)
                L6b:
                    if (r4 == 0) goto L2c
                    java.util.List r8 = r8.getChanges()
                    java.lang.Object r8 = kotlin.collections.CollectionsKt.first(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r8
                    long r4 = r8.getPosition()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r4)
                    long r4 = r8.m20745unboximpl()
                    T r6 = r1.element
                    boolean r4 = androidx.compose.p013ui.geometry.Offset.m20731equalsimpl(r4, r6)
                    if (r4 != 0) goto L8c
                    goto L8d
                L8c:
                    r8 = 0
                L8d:
                    if (r8 == 0) goto L2c
                    kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> r4 = r7.$onMove
                    long r5 = r8.m20745unboximpl()
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r5)
                    r1.element = r8
                    androidx.compose.ui.geometry.Offset r8 = androidx.compose.p013ui.geometry.Offset.m20724boximpl(r5)
                    r4.invoke(r8)
                    goto L2c
                La3:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.C16732.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16732(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super C16732> continuation) {
            super(2, continuation);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16732(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = get$context();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineContext, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C16732(pointerInputScope, pointerEventPass, function1, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, continuation);
    }
}
