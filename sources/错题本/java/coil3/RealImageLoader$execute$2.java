package coil3;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5867b0;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p154s.C6532f;
import p154s.InterfaceC6535i;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ls/i;", "<anonymous>", "(Lkotlinx/coroutines/v;)Ls/i;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.RealImageLoader$execute$2", m5303f = "RealImageLoader.kt", m5304i = {}, m5305l = {87}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class RealImageLoader$execute$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6532f $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3333r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(C6532f c6532f, C3333r c3333r, InterfaceC5631c<? super RealImageLoader$execute$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$request = c6532f;
        this.this$0 = c3333r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.$request, this.this$0, interfaceC5631c);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5867b0 c5867b0 = AbstractC3330o.m2266d(this.$request, AbstractC6014x.m5633d(interfaceC6009v, AbstractC5479k.f8471a.f8411d, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2)).f10893a;
        this.label = 1;
        Object objM5461u = c5867b0.m5461u(this);
        return objM5461u == coroutineSingletons ? coroutineSingletons : objM5461u;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6535i> interfaceC5631c) {
        return ((RealImageLoader$execute$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
