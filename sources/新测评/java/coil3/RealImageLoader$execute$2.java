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
import p290y.C9886e;
import p290y.InterfaceC9889h;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/h;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/h;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.RealImageLoader$execute$2", m13596f = "RealImageLoader.kt", m13597i = {0, 0}, m13598l = {87}, m13599m = "invokeSuspend", m13600n = {"$this$coroutineScope", "job"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9889h>, Object> {

    /* renamed from: a */
    public Object f2777a;

    /* renamed from: b */
    public int f2778b;

    /* renamed from: c */
    public /* synthetic */ Object f2779c;

    /* renamed from: d */
    public final /* synthetic */ RealImageLoader f2780d;

    /* renamed from: e */
    public final /* synthetic */ C9886e f2781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(RealImageLoader realImageLoader, C9886e c9886e, Continuation continuation) {
        super(2, continuation);
        this.f2780d = realImageLoader;
        this.f2781e = c9886e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.f2780d, this.f2781e, continuation);
        realImageLoader$execute$2.f2779c = obj;
        return realImageLoader$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9889h> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f2779c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f2778b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, (CoroutineContext) this.f2780d.m2823i().m2833g().getValue(), null, new RealImageLoader$execute$2$job$1(this.f2780d, this.f2781e, null), 2, null);
        Deferred deferredMo16610a = AbstractC5197i.m3076c(this.f2781e, deferredAsync$default).mo16610a();
        this.f2779c = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.f2777a = SpillingKt.nullOutSpilledVariable(deferredAsync$default);
        this.f2778b = 1;
        Object objAwait = deferredMo16610a.await(this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
