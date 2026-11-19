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
import p110n.InterfaceC7435r;
import p124p.C7587p;
import p159u.C7745l;
import p159u.InterfaceC7746m;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7880d2 = {"Lu/l;", "response", "Lp/p;", "<anonymous>", "(Lu/l;)Lp/p;"}, m7881k = 3, m7882mv = {2, 2, 0})
@DebugMetadata(m7917c = "coil3.network.NetworkFetcher$fetch$2", m7918f = "NetworkFetcher.kt", m7919i = {0}, m7920l = {104}, m7921m = "invokeSuspend", m7922n = {"response"}, m7923s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$2 extends SuspendLambda implements Function2<C7745l, Continuation<? super C7587p>, Object> {

    /* renamed from: a */
    public int f1833a;

    /* renamed from: b */
    public /* synthetic */ Object f1834b;

    /* renamed from: c */
    public final /* synthetic */ NetworkFetcher f1835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(NetworkFetcher networkFetcher, Continuation continuation) {
        super(2, continuation);
        this.f1835c = networkFetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C7745l c7745l, Continuation continuation) {
        return ((NetworkFetcher$fetch$2) create(c7745l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.f1835c, continuation);
        networkFetcher$fetch$2.f1834b = obj;
        return networkFetcher$fetch$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C7745l c7745l = (C7745l) this.f1834b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f1833a;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            NetworkFetcher networkFetcher = this.f1835c;
            InterfaceC7746m interfaceC7746mM1986f = UtilsKt.m1986f(c7745l);
            this.f1834b = c7745l;
            this.f1833a = 1;
            obj = networkFetcher.m1950n(interfaceC7746mM1986f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkFetcher networkFetcher2 = this.f1835c;
        return new C7587p((InterfaceC7435r) obj, networkFetcher2.m1947k(networkFetcher2.f1812a, c7745l.m9243e().m1975c(HttpHeaders.CONTENT_TYPE)), DataSource.f1622d);
    }
}
