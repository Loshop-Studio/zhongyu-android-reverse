package coil3.intercept;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.intercept.EngineInterceptor", m13596f = "EngineInterceptor.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {ComposerKt.providerValuesKey}, m13599m = "decode", m13600n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "pair", "decoder", "searchIndex"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3029a;

    /* renamed from: b */
    public Object f3030b;

    /* renamed from: c */
    public Object f3031c;

    /* renamed from: d */
    public Object f3032d;

    /* renamed from: e */
    public Object f3033e;

    /* renamed from: f */
    public Object f3034f;

    /* renamed from: g */
    public Object f3035g;

    /* renamed from: h */
    public Object f3036h;

    /* renamed from: i */
    public int f3037i;

    /* renamed from: j */
    public /* synthetic */ Object f3038j;

    /* renamed from: k */
    public final /* synthetic */ EngineInterceptor f3039k;

    /* renamed from: l */
    public int f3040l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f3039k = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3038j = obj;
        this.f3040l |= Integer.MIN_VALUE;
        return this.f3039k.m3084g(null, null, null, null, null, null, this);
    }
}
