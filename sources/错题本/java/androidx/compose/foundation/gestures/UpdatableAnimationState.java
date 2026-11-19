package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m5110d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "valueDelta", "Ld6/s;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lr6/c;Lr6/a;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "lastFrameTime", "J", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "", "isRunning", "Z", "value", "F", "getValue", "()F", "setValue", "(F)V", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,176:1\n50#2,5:177\n*S KotlinDebug\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n*L\n92#1:177,5\n*E\n"})
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;

    @NotNull
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    @NotNull
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return Math.abs(f) < 0.01f;
        }

        private Companion() {
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m5303f = "UpdatableAnimationState.kt", m5304i = {0, 0, 0, 0, 1, 1}, m5305l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 153}, m5306m = "animateToZero", m5307n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, m5308s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 */
    public static final class C09261 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C09261(InterfaceC5631c<? super C09261> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(@NotNull AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(C5825f.f9219a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[Catch: all -> 0x00b1, PHI: r0 r2 r12 r13 r14
      0x0085: PHI (r0v9 r6.a) = (r0v3 r6.a), (r0v10 r6.a) binds: [B:31:0x007e, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:31:0x007e, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r12v6 float) = (r12v3 float), (r12v7 float) binds: [B:31:0x007e, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r13v6 r6.c) = (r13v3 r6.c), (r13v7 r6.c) binds: [B:31:0x007e, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:31:0x007e, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:37:0x00a5, B:32:0x0085, B:34:0x008f), top: B:54:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:37:0x00a5, B:32:0x0085, B:34:0x008f), top: B:54:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[PHI: r0 r2 r13 r14
      0x00ac: PHI (r0v4 r6.a) = (r0v9 r6.a), (r0v10 r6.a) binds: [B:33:0x008d, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:33:0x008d, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r13v4 r6.c) = (r13v6 r6.c), (r13v7 r6.c) binds: [B:33:0x008d, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r14v12 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:33:0x008d, B:39:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a2 -> B:54:0x00a5). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r12, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6469a r13, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(r6.c, r6.a, h6.c):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }
}
