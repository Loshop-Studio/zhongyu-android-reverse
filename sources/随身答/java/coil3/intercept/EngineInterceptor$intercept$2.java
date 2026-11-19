package coil3.intercept;

import coil3.AbstractC5303b;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5335a;
import coil3.util.AbstractC5348c;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;
import p297y.C9924e;
import p297y.C9932m;
import p297y.C9936q;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/q;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/q;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor$intercept$2", m13451f = "EngineInterceptor.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C9936q>, Object> {

    /* renamed from: a */
    public int f2998a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f2999b;

    /* renamed from: c */
    public final /* synthetic */ C9924e f3000c;

    /* renamed from: d */
    public final /* synthetic */ Object f3001d;

    /* renamed from: e */
    public final /* synthetic */ C9932m f3002e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC5303b f3003f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9595d.b f3004g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC5335a.a f3005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, C9924e c9924e, Object obj, C9932m c9932m, AbstractC5303b abstractC5303b, InterfaceC9595d.b bVar, InterfaceC5335a.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f2999b = engineInterceptor;
        this.f3000c = c9924e;
        this.f3001d = obj;
        this.f3002e = c9932m;
        this.f3003f = abstractC5303b;
        this.f3004g = bVar;
        this.f3005h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.f2999b, this.f3000c, this.f3001d, this.f3002e, this.f3003f, this.f3004g, this.f3005h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super C9936q> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2805h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f2998a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            EngineInterceptor engineInterceptor = this.f2999b;
            C9924e c9924e = this.f3000c;
            Object obj2 = this.f3001d;
            C9932m c9932m = this.f3002e;
            AbstractC5303b abstractC5303b = this.f3003f;
            this.f2998a = 1;
            objM2805h = engineInterceptor.m2805h(c9924e, obj2, c9932m, abstractC5303b, this);
            if (objM2805h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM2805h = obj;
        }
        EngineInterceptor.C5334b c5334b = (EngineInterceptor.C5334b) objM2805h;
        this.f2999b.f2948b.mo2920a();
        boolean zM15812h = this.f2999b.f2950d.m15812h(this.f3004g, this.f3000c, c5334b);
        InterfaceC8239j interfaceC8239jM2811e = c5334b.m2811e();
        C9924e c9924e2 = this.f3000c;
        DataSource dataSourceM2809c = c5334b.m2809c();
        InterfaceC9595d.b bVar = this.f3004g;
        if (!zM15812h) {
            bVar = null;
        }
        return new C9936q(interfaceC8239jM2811e, c9924e2, dataSourceM2809c, bVar, c5334b.m2810d(), c5334b.m2812f(), AbstractC5348c.m2938o(this.f3005h));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
