package coil3;

import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p297y.C9924e;
import p297y.InterfaceC9929j;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/j;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.RealImageLoader$execute$2$job$1", m13451f = "RealImageLoader.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9929j>, Object> {

    /* renamed from: a */
    public int f2721a;

    /* renamed from: b */
    public final /* synthetic */ RealImageLoader f2722b;

    /* renamed from: c */
    public final /* synthetic */ C9924e f2723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(RealImageLoader realImageLoader, C9924e c9924e, Continuation continuation) {
        super(2, continuation);
        this.f2722b = realImageLoader;
        this.f2723c = c9924e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$2$job$1(this.f2722b, this.f2723c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9929j> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f2721a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealImageLoader realImageLoader = this.f2722b;
        C9924e c9924e = this.f2723c;
        this.f2721a = 1;
        Object objM2551h = realImageLoader.m2551h(c9924e, 1, this);
        return objM2551h == coroutine_suspended ? coroutine_suspended : objM2551h;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
