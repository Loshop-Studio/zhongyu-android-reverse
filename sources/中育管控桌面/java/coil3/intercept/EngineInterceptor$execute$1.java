package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor", m7918f = "EngineInterceptor.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, m7920l = {126, 130, 148}, m7921m = "execute", m7922n = {"request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "executeResult"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1725a;

    /* renamed from: b */
    public Object f1726b;

    /* renamed from: c */
    public Object f1727c;

    /* renamed from: d */
    public Object f1728d;

    /* renamed from: e */
    public Object f1729e;

    /* renamed from: f */
    public Object f1730f;

    /* renamed from: g */
    public Object f1731g;

    /* renamed from: h */
    public Object f1732h;

    /* renamed from: i */
    public /* synthetic */ Object f1733i;

    /* renamed from: j */
    public final /* synthetic */ EngineInterceptor f1734j;

    /* renamed from: k */
    public int f1735k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f1734j = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1733i = obj;
        this.f1735k |= Integer.MIN_VALUE;
        return this.f1734j.m1911h(null, null, null, null, this);
    }
}
