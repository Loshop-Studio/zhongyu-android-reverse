package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor", m13596f = "EngineInterceptor.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {75}, m13599m = "intercept", m13600n = {"chain", "request", "data", "size", "eventListener", "options", "scale", "mappedData", "cacheKey", "cacheValue"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3071a;

    /* renamed from: b */
    public Object f3072b;

    /* renamed from: c */
    public Object f3073c;

    /* renamed from: d */
    public Object f3074d;

    /* renamed from: e */
    public Object f3075e;

    /* renamed from: f */
    public Object f3076f;

    /* renamed from: g */
    public Object f3077g;

    /* renamed from: h */
    public Object f3078h;

    /* renamed from: i */
    public Object f3079i;

    /* renamed from: j */
    public Object f3080j;

    /* renamed from: k */
    public /* synthetic */ Object f3081k;

    /* renamed from: l */
    public final /* synthetic */ EngineInterceptor f3082l;

    /* renamed from: m */
    public int f3083m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f3082l = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3081k = obj;
        this.f3083m |= Integer.MIN_VALUE;
        return this.f3082l.mo3083a(null, this);
    }
}
