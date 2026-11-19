package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m17801f = "FlowCoroutine.kt", m17802l = {47}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f18047a;

    /* renamed from: b */
    public /* synthetic */ Object f18048b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10575q f18049c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9267d f18050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC10575q interfaceC10575q, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f18049c = interfaceC10575q;
        this.f18050d = interfaceC9267d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f18049c, this.f18050d, interfaceC9324c);
        flowCoroutineKt$scopedFlow$1$1.f18048b = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f18047a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f18048b;
            InterfaceC10575q interfaceC10575q = this.f18049c;
            InterfaceC9267d interfaceC9267d = this.f18050d;
            this.f18047a = 1;
            if (interfaceC10575q.invoke(interfaceC8822b0, interfaceC9267d, this) == objM17291f) {
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
