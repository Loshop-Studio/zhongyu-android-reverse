package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.decode.StaticImageDecoder", m13596f = "StaticImageDecoder.kt", m13597i = {0, 0}, m13598l = {168}, m13599m = "decode", m13600n = {"$this$withPermit$iv", "$i$f$withPermit"}, m13601s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2948a;

    /* renamed from: b */
    public int f2949b;

    /* renamed from: c */
    public /* synthetic */ Object f2950c;

    /* renamed from: d */
    public final /* synthetic */ StaticImageDecoder f2951d;

    /* renamed from: e */
    public int f2952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, Continuation continuation) {
        super(continuation);
        this.f2951d = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2950c = obj;
        this.f2952e |= Integer.MIN_VALUE;
        return this.f2951d.mo2964a(this);
    }
}
