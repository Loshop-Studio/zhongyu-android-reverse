package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m13596f = "utils.kt", m13597i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, m13598l = {24, 24, 25}, m13599m = "executeRequest-impl", m13600n = {"arg0", "request", "block", "arg0", "request", "block", "arg0", "request", "block", "response", "$i$a$-use-CallFactoryNetworkClient$executeRequest$2"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "I$0"})
/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f3195a;

    /* renamed from: b */
    public Object f3196b;

    /* renamed from: c */
    public Object f3197c;

    /* renamed from: d */
    public Object f3198d;

    /* renamed from: e */
    public Object f3199e;

    /* renamed from: f */
    public int f3200f;

    /* renamed from: g */
    public /* synthetic */ Object f3201g;

    /* renamed from: h */
    public int f3202h;

    public CallFactoryNetworkClient$executeRequest$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3201g = obj;
        this.f3202h |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m3164e(null, null, null, this);
    }
}
