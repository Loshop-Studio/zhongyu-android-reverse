package coil3.intercept;

import coil3.AbstractC4549b;
import coil3.C4548a;
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
import p124p.C7587p;
import p187y.C7872e;
import p187y.C7880m;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcoil3/intercept/EngineInterceptor$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcoil3/intercept/EngineInterceptor$b;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m7918f = "EngineInterceptor.kt", m7919i = {}, m7920l = {131}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.C4580b>, Object> {

    /* renamed from: a */
    public int f1736a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f1737b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f1738c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f1739d;

    /* renamed from: e */
    public final /* synthetic */ C7872e f1740e;

    /* renamed from: f */
    public final /* synthetic */ Object f1741f;

    /* renamed from: g */
    public final /* synthetic */ Ref.ObjectRef f1742g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC4549b f1743h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C7872e c7872e, Object obj, Ref.ObjectRef objectRef3, AbstractC4549b abstractC4549b, Continuation continuation) {
        super(2, continuation);
        this.f1737b = engineInterceptor;
        this.f1738c = objectRef;
        this.f1739d = objectRef2;
        this.f1740e = c7872e;
        this.f1741f = obj;
        this.f1742g = objectRef3;
        this.f1743h = abstractC4549b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.f1737b, this.f1738c, this.f1739d, this.f1740e, this.f1741f, this.f1742g, this.f1743h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super EngineInterceptor.C4580b> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1736a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        EngineInterceptor engineInterceptor = this.f1737b;
        C7587p c7587p = (C7587p) this.f1738c.element;
        C4548a c4548a = (C4548a) this.f1739d.element;
        C7872e c7872e = this.f1740e;
        Object obj2 = this.f1741f;
        C7880m c7880m = (C7880m) this.f1742g.element;
        AbstractC4549b abstractC4549b = this.f1743h;
        this.f1736a = 1;
        Object objM1910g = engineInterceptor.m1910g(c7587p, c4548a, c7872e, obj2, c7880m, abstractC4549b, this);
        return objM1910g == coroutine_suspended ? coroutine_suspended : objM1910g;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
