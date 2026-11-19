package coil3.intercept;

import coil3.AbstractC5168b;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5200a;
import coil3.util.AbstractC5213c;
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
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;
import p290y.C9886e;
import p290y.C9892k;
import p290y.C9896o;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/o;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/o;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor$intercept$2", m13596f = "EngineInterceptor.kt", m13597i = {}, m13598l = {77}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C9896o>, Object> {

    /* renamed from: a */
    public int f3084a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f3085b;

    /* renamed from: c */
    public final /* synthetic */ C9886e f3086c;

    /* renamed from: d */
    public final /* synthetic */ Object f3087d;

    /* renamed from: e */
    public final /* synthetic */ C9892k f3088e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC5168b f3089f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9363d.b f3090g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC5200a.a f3091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, C9886e c9886e, Object obj, C9892k c9892k, AbstractC5168b abstractC5168b, InterfaceC9363d.b bVar, InterfaceC5200a.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f3085b = engineInterceptor;
        this.f3086c = c9886e;
        this.f3087d = obj;
        this.f3088e = c9892k;
        this.f3089f = abstractC5168b;
        this.f3090g = bVar;
        this.f3091h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.f3085b, this.f3086c, this.f3087d, this.f3088e, this.f3089f, this.f3090g, this.f3091h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super C9896o> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3085h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f3084a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            EngineInterceptor engineInterceptor = this.f3085b;
            C9886e c9886e = this.f3086c;
            Object obj2 = this.f3087d;
            C9892k c9892k = this.f3088e;
            AbstractC5168b abstractC5168b = this.f3089f;
            this.f3084a = 1;
            objM3085h = engineInterceptor.m3085h(c9886e, obj2, c9892k, abstractC5168b, this);
            if (objM3085h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM3085h = obj;
        }
        EngineInterceptor.C5199b c5199b = (EngineInterceptor.C5199b) objM3085h;
        this.f3085b.f3022b.mo2717a();
        boolean zM15640h = this.f3085b.f3024d.m15640h(this.f3090g, this.f3086c, c5199b);
        InterfaceC7838j interfaceC7838jM3091e = c5199b.m3091e();
        C9886e c9886e2 = this.f3086c;
        DataSource dataSourceM3089c = c5199b.m3089c();
        InterfaceC9363d.b bVar = this.f3090g;
        if (!zM15640h) {
            bVar = null;
        }
        return new C9896o(interfaceC7838jM3091e, c9886e2, dataSourceM3089c, bVar, c5199b.m3090d(), c5199b.m3092f(), AbstractC5213c.m3221o(this.f3091h));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
