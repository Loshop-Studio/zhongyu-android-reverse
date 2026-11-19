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
import p290y.C9886e;
import p290y.InterfaceC9889h;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/h;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/h;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.RealImageLoader$execute$2$job$1", m13596f = "RealImageLoader.kt", m13597i = {}, m13598l = {83}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9889h>, Object> {

    /* renamed from: a */
    public int f2782a;

    /* renamed from: b */
    public final /* synthetic */ RealImageLoader f2783b;

    /* renamed from: c */
    public final /* synthetic */ C9886e f2784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(RealImageLoader realImageLoader, C9886e c9886e, Continuation continuation) {
        super(2, continuation);
        this.f2783b = realImageLoader;
        this.f2784c = c9886e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$execute$2$job$1(this.f2783b, this.f2784c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9889h> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f2782a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RealImageLoader realImageLoader = this.f2783b;
        C9886e c9886e = this.f2784c;
        this.f2782a = 1;
        Object objM2822h = realImageLoader.m2822h(c9886e, 1, this);
        return objM2822h == coroutine_suspended ? coroutine_suspended : objM2822h;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RealImageLoader$execute$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
