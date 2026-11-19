package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m17801f = "Collect.kt", m17802l = {46}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17716a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9266c f17717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17717b = interfaceC9266c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new FlowKt__CollectKt$launchIn$1(this.f17717b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__CollectKt$launchIn$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17716a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interfaceC9266c = this.f17717b;
            this.f17716a = 1;
            if (AbstractC9268e.m17018h(interfaceC9266c, this) == objM17291f) {
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
}
