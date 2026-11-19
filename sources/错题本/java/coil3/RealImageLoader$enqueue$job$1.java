package coil3;

import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ls/i;", "<anonymous>", "(Lkotlinx/coroutines/v;)Ls/i;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.RealImageLoader$enqueue$job$1", m5303f = "RealImageLoader.kt", m5304i = {}, m5305l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C6532f $request;
    int label;
    final /* synthetic */ C3333r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(C3333r c3333r, C6532f c6532f, InterfaceC5631c<? super RealImageLoader$enqueue$job$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3333r;
        this.$request = c6532f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new RealImageLoader$enqueue$job$1(this.this$0, this.$request, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        C3333r c3333r = this.this$0;
        C6532f c6532f = this.$request;
        this.label = 1;
        int i8 = C3333r.f2044f;
        Object objM2275b = c3333r.m2275b(c6532f, 0, this);
        return objM2275b == coroutineSingletons ? coroutineSingletons : objM2275b;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super InterfaceC6535i> interfaceC5631c) {
        return ((RealImageLoader$enqueue$job$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
