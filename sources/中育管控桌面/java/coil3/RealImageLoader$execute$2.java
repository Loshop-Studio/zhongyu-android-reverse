package coil3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import p187y.C7872e;
import p187y.InterfaceC7877j;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.RealImageLoader$execute$2", m7918f = "RealImageLoader.kt", m7919i = {0, 0}, m7920l = {87}, m7921m = "invokeSuspend", m7922n = {"$this$coroutineScope", "job"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC7877j>, Object> {

    /* renamed from: a */
    public Object f1461a;

    /* renamed from: b */
    public int f1462b;

    /* renamed from: c */
    public /* synthetic */ Object f1463c;

    /* renamed from: d */
    public final /* synthetic */ RealImageLoader f1464d;

    /* renamed from: e */
    public final /* synthetic */ C7872e f1465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(RealImageLoader realImageLoader, C7872e c7872e, Continuation continuation) {
        super(2, continuation);
        this.f1464d = realImageLoader;
        this.f1465e = c7872e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.f1464d, this.f1465e, continuation);
        realImageLoader$execute$2.f1463c = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC7877j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f1463c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1462b;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) this.f1464d.m1657i().m1667g().getValue(), null, new RealImageLoader$execute$2$job$1(this.f1464d, this.f1465e, null), 2, null);
        Deferred deferredMo9567a = AbstractC4578i.m1902c(this.f1465e, deferredAsync$default).mo9567a();
        this.f1463c = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.f1461a = SpillingKt.nullOutSpilledVariable(deferredAsync$default);
        this.f1462b = 1;
        Object objAwait = deferredMo9567a.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
