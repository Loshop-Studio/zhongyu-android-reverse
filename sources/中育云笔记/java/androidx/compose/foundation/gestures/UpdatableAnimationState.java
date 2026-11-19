package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.C9974p;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.UpdatableAnimationState", m26211f = "UpdatableAnimationState.kt", m26212l = {102, Opcodes.IFEQ}, m26213m = "animateToZero")
    /* renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 */
    public static final class C13711 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C13711(InterfaceC11588c<? super C13711> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(C9974p.f23424a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r2) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x00b3, PHI: r0 r2 r12 r13 r14
      0x0087: PHI (r0v9 hd.a) = (r0v3 hd.a), (r0v10 hd.a) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r12v6 float) = (r12v3 float), (r12v7 float) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r13v6 hd.l) = (r13v3 hd.l), (r13v7 hd.l) binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v9 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:31:0x0080, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:37:0x00a7, B:32:0x0087, B:34:0x0091), top: B:54:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[PHI: r0 r2 r13 r14
      0x00ae: PHI (r0v4 hd.a) = (r0v9 hd.a), (r0v10 hd.a) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r2v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r2v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r13v4 hd.l) = (r13v6 hd.l), (r13v7 hd.l) binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r14v12 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
      (r14v16 androidx.compose.foundation.gestures.UpdatableAnimationState)
      (r14v17 androidx.compose.foundation.gestures.UpdatableAnimationState)
     binds: [B:33:0x008f, B:39:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:54:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(p181hd.InterfaceC9540l r12, p181hd.InterfaceC9529a r13, vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(hd.l, hd.a, vc.c):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f10) {
        this.value = f10;
    }
}
