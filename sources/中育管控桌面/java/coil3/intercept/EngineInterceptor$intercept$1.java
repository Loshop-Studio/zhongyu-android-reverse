package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor", m7918f = "EngineInterceptor.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7920l = {75}, m7921m = "intercept", m7922n = {"chain", "request", "data", "size", "eventListener", "options", "scale", "mappedData", "cacheKey", "cacheValue"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1755a;

    /* renamed from: b */
    public Object f1756b;

    /* renamed from: c */
    public Object f1757c;

    /* renamed from: d */
    public Object f1758d;

    /* renamed from: e */
    public Object f1759e;

    /* renamed from: f */
    public Object f1760f;

    /* renamed from: g */
    public Object f1761g;

    /* renamed from: h */
    public Object f1762h;

    /* renamed from: i */
    public Object f1763i;

    /* renamed from: j */
    public Object f1764j;

    /* renamed from: k */
    public /* synthetic */ Object f1765k;

    /* renamed from: l */
    public final /* synthetic */ EngineInterceptor f1766l;

    /* renamed from: m */
    public int f1767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f1766l = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1765k = obj;
        this.f1767m |= Integer.MIN_VALUE;
        return this.f1766l.mo1909a(null, this);
    }
}
