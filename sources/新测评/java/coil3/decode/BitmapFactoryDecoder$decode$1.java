package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.decode.BitmapFactoryDecoder", m13596f = "BitmapFactoryDecoder.kt", m13597i = {0, 0, 1, 1, 1}, m13598l = {212, 40}, m13599m = "decode", m13600n = {"$this$withPermit$iv", "$i$f$withPermit", "$this$withPermit$iv", "$i$f$withPermit", "$i$a$-withPermit-BitmapFactoryDecoder$decode$2"}, m13601s = {"L$0", "I$0", "L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2929a;

    /* renamed from: b */
    public int f2930b;

    /* renamed from: c */
    public int f2931c;

    /* renamed from: d */
    public /* synthetic */ Object f2932d;

    /* renamed from: e */
    public final /* synthetic */ BitmapFactoryDecoder f2933e;

    /* renamed from: f */
    public int f2934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, Continuation continuation) {
        super(continuation);
        this.f2933e = bitmapFactoryDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2932d = obj;
        this.f2934f |= Integer.MIN_VALUE;
        return this.f2933e.mo2964a(this);
    }
}
