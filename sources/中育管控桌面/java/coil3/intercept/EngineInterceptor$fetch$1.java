package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor", m7918f = "EngineInterceptor.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0}, m7920l = {169}, m7921m = "fetch", m7922n = {"components", "request", "mappedData", "options", "eventListener", "pair", "fetcher", "searchIndex"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1744a;

    /* renamed from: b */
    public Object f1745b;

    /* renamed from: c */
    public Object f1746c;

    /* renamed from: d */
    public Object f1747d;

    /* renamed from: e */
    public Object f1748e;

    /* renamed from: f */
    public Object f1749f;

    /* renamed from: g */
    public Object f1750g;

    /* renamed from: h */
    public int f1751h;

    /* renamed from: i */
    public /* synthetic */ Object f1752i;

    /* renamed from: j */
    public final /* synthetic */ EngineInterceptor f1753j;

    /* renamed from: k */
    public int f1754k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f1753j = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1752i = obj;
        this.f1754k |= Integer.MIN_VALUE;
        return this.f1753j.m1912i(null, null, null, null, null, this);
    }
}
