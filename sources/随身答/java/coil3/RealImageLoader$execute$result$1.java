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
import p151k.InterfaceC8239j;
import p297y.C9924e;
import p297y.InterfaceC9929j;
import p307z.C9975e;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.RealImageLoader$execute$result$1", m13451f = "RealImageLoader.kt", m13452i = {}, m13453l = {142}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9929j>, Object> {

    /* renamed from: a */
    public int f2731a;

    /* renamed from: b */
    public final /* synthetic */ C9924e f2732b;

    /* renamed from: c */
    public final /* synthetic */ RealImageLoader f2733c;

    /* renamed from: d */
    public final /* synthetic */ C9975e f2734d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC5303b f2735e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC8239j f2736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(C9924e c9924e, RealImageLoader realImageLoader, C9975e c9975e, AbstractC5303b abstractC5303b, InterfaceC8239j interfaceC8239j, Continuation continuation) {
        super(2, continuation);
        this.f2732b = c9924e;
        this.f2733c = realImageLoader;
        this.f2734d = c9975e;
        this.f2735e = abstractC5303b;
        this.f2736f = interfaceC8239j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$result$1(this.f2732b, this.f2733c, this.f2734d, this.f2735e, this.f2736f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9929j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f2731a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f2732b, this.f2733c.mo2549e().m2569g(), 0, this.f2732b, this.f2734d, this.f2735e, this.f2736f != null);
        this.f2731a = 1;
        Object objM2820g = realInterceptorChain.m2820g(this);
        return objM2820g == coroutine_suspended ? coroutine_suspended : objM2820g;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
