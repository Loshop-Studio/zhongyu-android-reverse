package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor", m13596f = "EngineInterceptor.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, m13598l = {126, 130, 148}, m13599m = "execute", m13600n = {"request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "request", "mappedData", "options", "eventListener", "options", "components", "fetchResult", "executeResult"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3041a;

    /* renamed from: b */
    public Object f3042b;

    /* renamed from: c */
    public Object f3043c;

    /* renamed from: d */
    public Object f3044d;

    /* renamed from: e */
    public Object f3045e;

    /* renamed from: f */
    public Object f3046f;

    /* renamed from: g */
    public Object f3047g;

    /* renamed from: h */
    public Object f3048h;

    /* renamed from: i */
    public /* synthetic */ Object f3049i;

    /* renamed from: j */
    public final /* synthetic */ EngineInterceptor f3050j;

    /* renamed from: k */
    public int f3051k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f3050j = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3049i = obj;
        this.f3051k |= Integer.MIN_VALUE;
        return this.f3050j.m3085h(null, null, null, null, this);
    }
}
