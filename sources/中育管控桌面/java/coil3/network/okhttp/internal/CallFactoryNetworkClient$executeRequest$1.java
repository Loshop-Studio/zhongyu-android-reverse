package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m7918f = "utils.kt", m7919i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, m7920l = {24, 24, 25}, m7921m = "executeRequest-impl", m7922n = {"arg0", "request", "block", "arg0", "request", "block", "arg0", "request", "block", "response", "$i$a$-use-CallFactoryNetworkClient$executeRequest$2"}, m7923s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "I$0"})
/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f1879a;

    /* renamed from: b */
    public Object f1880b;

    /* renamed from: c */
    public Object f1881c;

    /* renamed from: d */
    public Object f1882d;

    /* renamed from: e */
    public Object f1883e;

    /* renamed from: f */
    public int f1884f;

    /* renamed from: g */
    public /* synthetic */ Object f1885g;

    /* renamed from: h */
    public int f1886h;

    public CallFactoryNetworkClient$executeRequest$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1885g = obj;
        this.f1886h |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m1990e(null, null, null, this);
    }
}
