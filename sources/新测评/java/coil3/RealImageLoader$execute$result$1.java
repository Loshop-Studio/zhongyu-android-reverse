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
import p137k.InterfaceC7838j;
import p290y.C9886e;
import p290y.InterfaceC9889h;
import p300z.C9958e;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/h;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/h;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.RealImageLoader$execute$result$1", m13596f = "RealImageLoader.kt", m13597i = {}, m13598l = {142}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9889h>, Object> {

    /* renamed from: a */
    public int f2796a;

    /* renamed from: b */
    public final /* synthetic */ C9886e f2797b;

    /* renamed from: c */
    public final /* synthetic */ RealImageLoader f2798c;

    /* renamed from: d */
    public final /* synthetic */ C9958e f2799d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC5168b f2800e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC7838j f2801f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(C9886e c9886e, RealImageLoader realImageLoader, C9958e c9958e, AbstractC5168b abstractC5168b, InterfaceC7838j interfaceC7838j, Continuation continuation) {
        super(2, continuation);
        this.f2797b = c9886e;
        this.f2798c = realImageLoader;
        this.f2799d = c9958e;
        this.f2800e = abstractC5168b;
        this.f2801f = interfaceC7838j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$result$1(this.f2797b, this.f2798c, this.f2799d, this.f2800e, this.f2801f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9889h> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f2796a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f2797b, this.f2798c.mo2820e().m2841g(), 0, this.f2797b, this.f2799d, this.f2800e, this.f2801f != null);
        this.f2796a = 1;
        Object objMo3096b = realInterceptorChain.mo3096b(this);
        return objMo3096b == coroutine_suspended ? coroutine_suspended : objMo3096b;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
