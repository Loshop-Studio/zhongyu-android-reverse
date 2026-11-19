package coil3;

import coil3.intercept.RealInterceptorChain;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p087k.InterfaceC6611j;
import p187y.C7872e;
import p187y.InterfaceC7877j;
import p194z.C7923e;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.RealImageLoader$execute$result$1", m7918f = "RealImageLoader.kt", m7919i = {}, m7920l = {142}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC7877j>, Object> {

    /* renamed from: a */
    public int f1480a;

    /* renamed from: b */
    public final /* synthetic */ C7872e f1481b;

    /* renamed from: c */
    public final /* synthetic */ RealImageLoader f1482c;

    /* renamed from: d */
    public final /* synthetic */ C7923e f1483d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC4549b f1484e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6611j f1485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(C7872e c7872e, RealImageLoader realImageLoader, C7923e c7923e, AbstractC4549b abstractC4549b, InterfaceC6611j interfaceC6611j, Continuation continuation) {
        super(2, continuation);
        this.f1481b = c7872e;
        this.f1482c = realImageLoader;
        this.f1483d = c7923e;
        this.f1484e = abstractC4549b;
        this.f1485f = interfaceC6611j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$result$1(this.f1481b, this.f1482c, this.f1483d, this.f1484e, this.f1485f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC7877j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1480a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f1481b, this.f1482c.mo1654e().m1675g(), 0, this.f1481b, this.f1483d, this.f1484e, this.f1485f != null);
        this.f1480a = 1;
        Object objM1926g = realInterceptorChain.m1926g(this);
        return objM1926g == coroutine_suspended ? coroutine_suspended : objM1926g;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
