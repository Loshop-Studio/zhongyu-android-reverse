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
import p183n.InterfaceC9073r;
import p207p.C9303p;
import p257u.C9654l;
import p257u.InterfaceC9655m;

@Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lu/l;", "response", "Lp/p;", "<anonymous>", "(Lu/l;)Lp/p;"}, m13414k = 3, m13415mv = {2, 1, 0})
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher$fetch$2", m13451f = "NetworkFetcher.kt", m13452i = {0}, m13453l = {104}, m13454m = "invokeSuspend", m13455n = {"response"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$2 extends SuspendLambda implements Function2<C9654l, Continuation<? super C9303p>, Object> {

    /* renamed from: a */
    public int f3049a;

    /* renamed from: b */
    public /* synthetic */ Object f3050b;

    /* renamed from: c */
    public final /* synthetic */ NetworkFetcher f3051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(NetworkFetcher networkFetcher, Continuation continuation) {
        super(2, continuation);
        this.f3051c = networkFetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9654l c9654l, Continuation continuation) {
        return ((NetworkFetcher$fetch$2) create(c9654l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.f3051c, continuation);
        networkFetcher$fetch$2.f3050b = obj;
        return networkFetcher$fetch$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C9654l c9654l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f3049a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            C9654l c9654l2 = (C9654l) this.f3050b;
            NetworkFetcher networkFetcher = this.f3051c;
            InterfaceC9655m interfaceC9655mM2880f = UtilsKt.m2880f(c9654l2);
            this.f3050b = c9654l2;
            this.f3049a = 1;
            Object objM2844n = networkFetcher.m2844n(interfaceC9655mM2880f, this);
            if (objM2844n == coroutine_suspended) {
                return coroutine_suspended;
            }
            c9654l = c9654l2;
            obj = objM2844n;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c9654l = (C9654l) this.f3050b;
            ResultKt.throwOnFailure(obj);
        }
        NetworkFetcher networkFetcher2 = this.f3051c;
        return new C9303p((InterfaceC9073r) obj, networkFetcher2.m2841k(networkFetcher2.f3031a, c9654l.m15996e().m2869c(HttpHeaders.CONTENT_TYPE)), DataSource.f2867d);
    }
}
