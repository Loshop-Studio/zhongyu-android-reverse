package coil3.network;

import coil3.decode.DataSource;
import coil3.network.internal.UtilsKt;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p172n.InterfaceC8603r;
import p194p.C8800p;
import p249u.C9526l;
import p249u.InterfaceC9527m;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lu/l;", "response", "Lp/p;", "<anonymous>", "(Lu/l;)Lp/p;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher$fetch$2", m13596f = "NetworkFetcher.kt", m13597i = {0}, m13598l = {104}, m13599m = "invokeSuspend", m13600n = {"response"}, m13601s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$2 extends SuspendLambda implements Function2<C9526l, Continuation<? super C8800p>, Object> {

    /* renamed from: a */
    public int f3149a;

    /* renamed from: b */
    public /* synthetic */ Object f3150b;

    /* renamed from: c */
    public final /* synthetic */ NetworkFetcher f3151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(NetworkFetcher networkFetcher, Continuation continuation) {
        super(2, continuation);
        this.f3151c = networkFetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9526l c9526l, Continuation continuation) {
        return ((NetworkFetcher$fetch$2) create(c9526l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.f3151c, continuation);
        networkFetcher$fetch$2.f3150b = obj;
        return networkFetcher$fetch$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C9526l c9526l = (C9526l) this.f3150b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f3149a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            NetworkFetcher networkFetcher = this.f3151c;
            InterfaceC9527m interfaceC9527mM3160f = UtilsKt.m3160f(c9526l);
            this.f3150b = c9526l;
            this.f3149a = 1;
            obj = networkFetcher.m3124n(interfaceC9527mM3160f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkFetcher networkFetcher2 = this.f3151c;
        return new C8800p((InterfaceC8603r) obj, networkFetcher2.m3121k(networkFetcher2.f3128a, c9526l.m15893e().m3149c(HttpHeaders.CONTENT_TYPE)), DataSource.f2938d);
    }
}
