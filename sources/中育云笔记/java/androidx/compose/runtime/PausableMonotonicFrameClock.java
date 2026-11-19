package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch = new Latch();

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.PausableMonotonicFrameClock", m26211f = "PausableMonotonicFrameClock.kt", m26212l = {61, 62}, m26213m = "withFrameNanos")
    /* renamed from: androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 */
    public static final class C25601<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C25601(InterfaceC11588c<? super C25601> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PausableMonotonicFrameClock.this.withFrameNanos(null, this);
        }
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC9544p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9945d);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object withFrameNanos(p181hd.InterfaceC9540l r6, vc.InterfaceC11588c<? super R> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock.C25601
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock.C25601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            hd.l r6 = (p181hd.InterfaceC9540l) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            kotlin.AbstractC9924b.m20071b(r7)
            goto L53
        L40:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.compose.runtime.Latch r7 = r5.latch
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            r2 = r5
        L53:
            androidx.compose.runtime.MonotonicFrameClock r7 = r2.frameClock
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r7.withFrameNanos(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos(hd.l, vc.c):java.lang.Object");
    }
}
