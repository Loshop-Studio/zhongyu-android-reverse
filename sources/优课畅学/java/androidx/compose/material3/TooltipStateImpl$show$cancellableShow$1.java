package androidx.compose.material3;

import kotlin.AbstractC9079b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9541f;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", m17801f = "Tooltip.kt", m17802l = {646}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements InterfaceC10570l {
    Object L$0;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, InterfaceC9324c<? super TooltipStateImpl$show$cancellableShow$1> interfaceC9324c) {
        super(1, interfaceC9324c);
        this.this$0 = tooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
        return new TooltipStateImpl$show$cancellableShow$1(this.this$0, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TooltipStateImpl tooltipStateImpl = this.this$0;
            this.L$0 = tooltipStateImpl;
            this.label = 1;
            C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(this), 1);
            c9155c.m16343D();
            tooltipStateImpl.getTransition().setTargetState$animation_core_release(AbstractC9536a.m17796a(true));
            tooltipStateImpl.job = c9155c;
            Object objM16372x = c9155c.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(this);
            }
            if (objM16372x == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TooltipStateImpl$show$cancellableShow$1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
