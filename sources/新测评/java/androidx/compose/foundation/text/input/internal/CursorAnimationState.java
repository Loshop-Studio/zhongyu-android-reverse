package androidx.compose.foundation.text.input.internal;

import androidx.camera.view.AbstractC0920q;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "animate", "", "(Z)V", "getAnimate", "()Z", "animationJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/AtomicReference;", "<set-?>", "", "cursorAlpha", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "cancelAndHide", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,99:1\n79#2:100\n112#2,2:101\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:100\n44#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;
    private AtomicReference<Job> animationJob = new AtomicReference<>(null);

    /* renamed from: cursorAlpha$delegate, reason: from kotlin metadata */
    private final MutableFloatState cursorAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m13596f = "CursorAnimationState.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 */
    public static final class C17312 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m13596f = "CursorAnimationState.kt", m13597i = {}, m13598l = {72, 77, 79, 81}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Job job, CursorAnimationState cursorAnimationState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$oldJob = job;
                this.this$0 = cursorAnimationState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r10.label
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r9) goto L2f
                    if (r1 == r8) goto L2b
                    if (r1 == r7) goto L27
                    if (r1 != r6) goto L1f
                    kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L76
                L1d:
                    r11 = move-exception
                    goto L7c
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    kotlin.ResultKt.throwOnFailure(r11)
                    goto L43
                L33:
                    kotlin.ResultKt.throwOnFailure(r11)
                    kotlinx.coroutines.Job r11 = r10.$oldJob
                    if (r11 == 0) goto L43
                    r10.label = r9
                    java.lang.Object r11 = kotlinx.coroutines.JobKt.cancelAndJoin(r11, r10)
                    if (r11 != r0) goto L43
                    goto L75
                L43:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.label = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.awaitCancellation(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    goto L75
                L59:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.label = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    goto L75
                L68:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.label = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L76
                L75:
                    return r0
                L76:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5f
                L7c:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.C17312.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C17312(Continuation<? super C17312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17312 c17312 = CursorAnimationState.this.new C17312(continuation);
            c17312.L$0 = obj;
            return c17312;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(AbstractC0920q.m1034a(CursorAnimationState.this.animationJob, null, BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1((Job) CursorAnimationState.this.animationJob.getAndSet(null), CursorAnimationState.this, null), 3, null)));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C17312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CursorAnimationState(boolean z9) {
        this.animate = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f10) {
        this.cursorAlpha.setFloatValue(f10);
    }

    public final void cancelAndHide() {
        Job andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            Job.DefaultImpls.cancel$default(andSet, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C17312(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
