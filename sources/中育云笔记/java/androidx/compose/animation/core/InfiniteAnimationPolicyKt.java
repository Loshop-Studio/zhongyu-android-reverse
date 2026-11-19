package androidx.compose.animation.core;

import androidx.compose.p014ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 */
    public static final class C11182 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11182(InterfaceC9540l interfaceC9540l) {
            super(1);
            this.$onFrame = interfaceC9540l;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / AnimationKt.MillisToNanos));
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m26211f = "InfiniteAnimationPolicy.kt", m26212l = {32}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
    public static final class C11192 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11192(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C11192> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$onFrame = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C11192(this.$onFrame, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC9540l interfaceC9540l = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(interfaceC9540l, this);
            return objWithFrameNanos == objM25952f ? objM25952f : objWithFrameNanos;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C11192) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <R> Object withInfiniteAnimationFrameMillis(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return withInfiniteAnimationFrameNanos(new C11182(interfaceC9540l), interfaceC11588c);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        C11182 c11182 = new C11182(interfaceC9540l);
        AbstractC9977s.m20287c(0);
        Object objWithInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(c11182, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        return objWithInfiniteAnimationFrameNanos;
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) interfaceC11588c.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(interfaceC9540l, interfaceC11588c) : infiniteAnimationPolicy.onInfiniteOperation(new C11192(interfaceC9540l, null), interfaceC11588c);
    }
}
