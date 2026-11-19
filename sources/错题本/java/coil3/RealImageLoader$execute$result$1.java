package coil3;

import coil3.intercept.C3303e;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p154s.C6532f;
import p154s.InterfaceC6535i;
import p162t.C6576f;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ls/i;", "<anonymous>", "(Lkotlinx/coroutines/v;)Ls/i;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.RealImageLoader$execute$result$1", m5303f = "RealImageLoader.kt", m5304i = {}, m5305l = {142}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class RealImageLoader$execute$result$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC3305k $cachedPlaceholder;
    final /* synthetic */ AbstractC3297h $eventListener;
    final /* synthetic */ C6532f $request;
    final /* synthetic */ C6576f $size;
    int label;
    final /* synthetic */ C3333r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(C6532f c6532f, C3333r c3333r, C6576f c6576f, AbstractC3297h abstractC3297h, InterfaceC3305k interfaceC3305k, InterfaceC5631c<? super RealImageLoader$execute$result$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$request = c6532f;
        this.this$0 = c3333r;
        this.$size = c6576f;
        this.$eventListener = abstractC3297h;
        this.$cachedPlaceholder = interfaceC3305k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new RealImageLoader$execute$result$1(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, interfaceC5631c);
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
        C6532f c6532f = this.$request;
        C3303e c3303e = new C3303e(c6532f, this.this$0.f2048d.f1881a, 0, c6532f, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object objM2231a = c3303e.m2231a(this);
        return objM2231a == coroutineSingletons ? coroutineSingletons : objM2231a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6535i> interfaceC5631c) {
        return ((RealImageLoader$execute$result$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
