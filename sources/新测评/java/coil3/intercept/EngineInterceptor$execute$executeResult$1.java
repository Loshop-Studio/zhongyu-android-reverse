package coil3.intercept;

import coil3.AbstractC5168b;
import coil3.C5167a;
import coil3.intercept.EngineInterceptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import p194p.C8800p;
import p290y.C9886e;
import p290y.C9892k;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcoil3/intercept/EngineInterceptor$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcoil3/intercept/EngineInterceptor$b;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m13596f = "EngineInterceptor.kt", m13597i = {}, m13598l = {131}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.C5199b>, Object> {

    /* renamed from: a */
    public int f3052a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f3053b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f3054c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f3055d;

    /* renamed from: e */
    public final /* synthetic */ C9886e f3056e;

    /* renamed from: f */
    public final /* synthetic */ Object f3057f;

    /* renamed from: g */
    public final /* synthetic */ Ref.ObjectRef f3058g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC5168b f3059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C9886e c9886e, Object obj, Ref.ObjectRef objectRef3, AbstractC5168b abstractC5168b, Continuation continuation) {
        super(2, continuation);
        this.f3053b = engineInterceptor;
        this.f3054c = objectRef;
        this.f3055d = objectRef2;
        this.f3056e = c9886e;
        this.f3057f = obj;
        this.f3058g = objectRef3;
        this.f3059h = abstractC5168b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.f3053b, this.f3054c, this.f3055d, this.f3056e, this.f3057f, this.f3058g, this.f3059h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super EngineInterceptor.C5199b> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f3052a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        EngineInterceptor engineInterceptor = this.f3053b;
        C8800p c8800p = (C8800p) this.f3054c.element;
        C5167a c5167a = (C5167a) this.f3055d.element;
        C9886e c9886e = this.f3056e;
        Object obj2 = this.f3057f;
        C9892k c9892k = (C9892k) this.f3058g.element;
        AbstractC5168b abstractC5168b = this.f3059h;
        this.f3052a = 1;
        Object objM3084g = engineInterceptor.m3084g(c8800p, c5167a, c9886e, obj2, c9892k, abstractC5168b, this);
        return objM3084g == coroutine_suspended ? coroutine_suspended : objM3084g;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
