package coil3.intercept;

import coil3.AbstractC5303b;
import coil3.C5302a;
import coil3.intercept.EngineInterceptor;
import com.taobao.sophix.PatchStatus;
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
import p207p.C9303p;
import p297y.C9924e;
import p297y.C9932m;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcoil3/intercept/EngineInterceptor$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcoil3/intercept/EngineInterceptor$b;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", m13451f = "EngineInterceptor.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.C5334b>, Object> {

    /* renamed from: a */
    public int f2976a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f2977b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f2978c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f2979d;

    /* renamed from: e */
    public final /* synthetic */ C9924e f2980e;

    /* renamed from: f */
    public final /* synthetic */ Object f2981f;

    /* renamed from: g */
    public final /* synthetic */ Ref.ObjectRef f2982g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC5303b f2983h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C9924e c9924e, Object obj, Ref.ObjectRef objectRef3, AbstractC5303b abstractC5303b, Continuation continuation) {
        super(2, continuation);
        this.f2977b = engineInterceptor;
        this.f2978c = objectRef;
        this.f2979d = objectRef2;
        this.f2980e = c9924e;
        this.f2981f = obj;
        this.f2982g = objectRef3;
        this.f2983h = abstractC5303b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.f2977b, this.f2978c, this.f2979d, this.f2980e, this.f2981f, this.f2982g, this.f2983h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super EngineInterceptor.C5334b> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f2976a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        EngineInterceptor engineInterceptor = this.f2977b;
        C9303p c9303p = (C9303p) this.f2978c.element;
        C5302a c5302a = (C5302a) this.f2979d.element;
        C9924e c9924e = this.f2980e;
        Object obj2 = this.f2981f;
        C9932m c9932m = (C9932m) this.f2982g.element;
        AbstractC5303b abstractC5303b = this.f2983h;
        this.f2976a = 1;
        Object objM2804g = engineInterceptor.m2804g(c9303p, c5302a, c9924e, obj2, c9932m, abstractC5303b, this);
        return objM2804g == coroutine_suspended ? coroutine_suspended : objM2804g;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
