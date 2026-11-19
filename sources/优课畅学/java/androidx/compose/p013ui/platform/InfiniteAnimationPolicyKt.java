package androidx.compose.p013ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class InfiniteAnimationPolicyKt {

    @InterfaceC9539d(m17800c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m17801f = "InfiniteAnimationPolicy.kt", m17802l = {66}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 */
    public static final class C29652 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29652(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C29652> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$onFrame = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C29652(this.$onFrame, interfaceC9324c);
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
            return ((C29652) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public static final <R> Object withInfiniteAnimationFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) interfaceC9324c.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy == null ? MonotonicFrameClockKt.withFrameNanos(interfaceC10570l, interfaceC9324c) : infiniteAnimationPolicy.onInfiniteOperation(new C29652(interfaceC10570l, null), interfaceC9324c);
    }
}
