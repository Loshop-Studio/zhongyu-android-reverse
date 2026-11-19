package androidx.compose.animation.core;

import androidx.compose.p013ui.platform.InfiniteAnimationPolicy;
import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {

    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 */
    public static final class C10882 extends Lambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10882(InterfaceC10570l interfaceC10570l) {
            super(1);
            this.$onFrame = interfaceC10570l;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [R, java.lang.Object] */
        public final R invoke(long j10) {
            return this.$onFrame.invoke(Long.valueOf(j10 / AnimationKt.MillisToNanos));
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m17801f = "InfiniteAnimationPolicy.kt", m17802l = {32}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
    public static final class C10892 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10892(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C10892> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$onFrame = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C10892(this.$onFrame, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC10570l interfaceC10570l = this.$onFrame;
            this.label = 1;
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(interfaceC10570l, this);
            return objWithFrameNanos == objM17291f ? objM17291f : objWithFrameNanos;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C10892) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public static final <R> Object withInfiniteAnimationFrameMillis(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return withInfiniteAnimationFrameNanos(new C10882(interfaceC10570l), interfaceC9324c);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        C10882 c10882 = new C10882(interfaceC10570l);
        AbstractC9131s.m16126c(0);
        Object objWithInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(c10882, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        return objWithInfiniteAnimationFrameNanos;
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) interfaceC9324c.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(interfaceC10570l, interfaceC9324c) : infiniteAnimationPolicy.onInfiniteOperation(new C10892(interfaceC10570l, null), interfaceC9324c);
    }
}
