package coil3.intercept;

import coil3.AbstractC4549b;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC4581a;
import coil3.util.AbstractC4594c;
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
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;
import p187y.C7872e;
import p187y.C7880m;
import p187y.C7884q;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7880d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ly/q;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ly/q;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor$intercept$2", m7918f = "EngineInterceptor.kt", m7919i = {}, m7920l = {77}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C7884q>, Object> {

    /* renamed from: a */
    public int f1768a;

    /* renamed from: b */
    public final /* synthetic */ EngineInterceptor f1769b;

    /* renamed from: c */
    public final /* synthetic */ C7872e f1770c;

    /* renamed from: d */
    public final /* synthetic */ Object f1771d;

    /* renamed from: e */
    public final /* synthetic */ C7880m f1772e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC4549b f1773f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC7708d.b f1774g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC4581a.a f1775h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, C7872e c7872e, Object obj, C7880m c7880m, AbstractC4549b abstractC4549b, InterfaceC7708d.b bVar, InterfaceC4581a.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f1769b = engineInterceptor;
        this.f1770c = c7872e;
        this.f1771d = obj;
        this.f1772e = c7880m;
        this.f1773f = abstractC4549b;
        this.f1774g = bVar;
        this.f1775h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.f1769b, this.f1770c, this.f1771d, this.f1772e, this.f1773f, this.f1774g, this.f1775h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super C7884q> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM1911h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1768a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            EngineInterceptor engineInterceptor = this.f1769b;
            C7872e c7872e = this.f1770c;
            Object obj2 = this.f1771d;
            C7880m c7880m = this.f1772e;
            AbstractC4549b abstractC4549b = this.f1773f;
            this.f1768a = 1;
            objM1911h = engineInterceptor.m1911h(c7872e, obj2, c7880m, abstractC4549b, this);
            if (objM1911h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM1911h = obj;
        }
        EngineInterceptor.C4580b c4580b = (EngineInterceptor.C4580b) objM1911h;
        this.f1769b.f1706b.mo1575a();
        boolean zM9189h = this.f1769b.f1708d.m9189h(this.f1774g, this.f1770c, c4580b);
        InterfaceC6611j interfaceC6611jM1917e = c4580b.m1917e();
        C7872e c7872e2 = this.f1770c;
        DataSource dataSourceM1915c = c4580b.m1915c();
        InterfaceC7708d.b bVar = this.f1774g;
        if (!zM9189h) {
            bVar = null;
        }
        return new C7884q(interfaceC6611jM1917e, c7872e2, dataSourceM1915c, bVar, c4580b.m1916d(), c4580b.m1918f(), AbstractC4594c.m2047o(this.f1775h));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
