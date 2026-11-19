package coil3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import p297y.C9924e;
import p297y.InterfaceC9929j;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.RealImageLoader$execute$2", m13451f = "RealImageLoader.kt", m13452i = {}, m13453l = {87}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9929j>, Object> {

    /* renamed from: a */
    public int f2717a;

    /* renamed from: b */
    public /* synthetic */ Object f2718b;

    /* renamed from: c */
    public final /* synthetic */ C9924e f2719c;

    /* renamed from: d */
    public final /* synthetic */ RealImageLoader f2720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(C9924e c9924e, RealImageLoader realImageLoader, Continuation continuation) {
        super(2, continuation);
        this.f2719c = c9924e;
        this.f2720d = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.f2719c, this.f2720d, continuation);
        realImageLoader$execute$2.f2718b = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9929j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f2717a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Deferred deferredMo17011a = AbstractC5332i.m2796c(this.f2719c, BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f2718b, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$execute$2$job$1(this.f2720d, this.f2719c, null), 2, null)).mo17011a();
        this.f2717a = 1;
        Object objAwait = deferredMo17011a.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
