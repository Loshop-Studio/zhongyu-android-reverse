package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    @InterfaceC9539d(m17800c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", m17801f = "MonotonicFrameClock.android.kt", m17802l = {40}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2 */
    public static final class C25192 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10570l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25192(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C25192> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$onFrame = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C25192(this.$onFrame, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C25192) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.label = 1;
                if (DelayKt.m16227b(16L, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return this.$onFrame.invoke(AbstractC9536a.m17799d(System.nanoTime()));
        }
    }

    private FallbackFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r10, interfaceC10574p);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return MonotonicFrameClock.DefaultImpls.plus(this, interfaceC9100d);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC8833f.m14848g(C8843i0.m14868c(), new C25192(interfaceC10570l, null), interfaceC9324c);
    }
}
