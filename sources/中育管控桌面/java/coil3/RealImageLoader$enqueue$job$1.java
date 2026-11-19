package coil3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p187y.C7872e;
import p187y.InterfaceC7877j;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.RealImageLoader$enqueue$job$1", m7918f = "RealImageLoader.kt", m7919i = {}, m7920l = {67}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC7877j>, Object> {

    /* renamed from: a */
    public int f1458a;

    /* renamed from: b */
    public final /* synthetic */ RealImageLoader f1459b;

    /* renamed from: c */
    public final /* synthetic */ C7872e f1460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, C7872e c7872e, Continuation continuation) {
        super(2, continuation);
        this.f1459b = realImageLoader;
        this.f1460c = c7872e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$enqueue$job$1(this.f1459b, this.f1460c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC7877j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1458a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealImageLoader realImageLoader = this.f1459b;
        C7872e c7872e = this.f1460c;
        this.f1458a = 1;
        Object objM1656h = realImageLoader.m1656h(c7872e, 0, this);
        return objM1656h == coroutine_suspended ? coroutine_suspended : objM1656h;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$enqueue$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
