package coil3.intercept;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.intercept.EngineInterceptor", m7918f = "EngineInterceptor.kt", m7919i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m7920l = {ComposerKt.providerValuesKey}, m7921m = "decode", m7922n = {"fetchResult", "components", "request", "mappedData", "options", "eventListener", "pair", "decoder", "searchIndex"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1713a;

    /* renamed from: b */
    public Object f1714b;

    /* renamed from: c */
    public Object f1715c;

    /* renamed from: d */
    public Object f1716d;

    /* renamed from: e */
    public Object f1717e;

    /* renamed from: f */
    public Object f1718f;

    /* renamed from: g */
    public Object f1719g;

    /* renamed from: h */
    public Object f1720h;

    /* renamed from: i */
    public int f1721i;

    /* renamed from: j */
    public /* synthetic */ Object f1722j;

    /* renamed from: k */
    public final /* synthetic */ EngineInterceptor f1723k;

    /* renamed from: l */
    public int f1724l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f1723k = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1722j = obj;
        this.f1724l |= Integer.MIN_VALUE;
        return this.f1723k.m1910g(null, null, null, null, null, null, this);
    }
}
