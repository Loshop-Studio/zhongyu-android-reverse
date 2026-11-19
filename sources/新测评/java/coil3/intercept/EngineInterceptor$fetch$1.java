package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor", m13596f = "EngineInterceptor.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {169}, m13599m = "fetch", m13600n = {"components", "request", "mappedData", "options", "eventListener", "pair", "fetcher", "searchIndex"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3060a;

    /* renamed from: b */
    public Object f3061b;

    /* renamed from: c */
    public Object f3062c;

    /* renamed from: d */
    public Object f3063d;

    /* renamed from: e */
    public Object f3064e;

    /* renamed from: f */
    public Object f3065f;

    /* renamed from: g */
    public Object f3066g;

    /* renamed from: h */
    public int f3067h;

    /* renamed from: i */
    public /* synthetic */ Object f3068i;

    /* renamed from: j */
    public final /* synthetic */ EngineInterceptor f3069j;

    /* renamed from: k */
    public int f3070k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f3069j = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3068i = obj;
        this.f3070k |= Integer.MIN_VALUE;
        return this.f3069j.m3086i(null, null, null, null, null, this);
    }
}
