package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.decode.BitmapFactoryDecoder", m7918f = "BitmapFactoryDecoder.kt", m7919i = {0, 0, 1, 1, 1}, m7920l = {212, 40}, m7921m = "decode", m7922n = {"$this$withPermit$iv", "$i$f$withPermit", "$this$withPermit$iv", "$i$f$withPermit", "$i$a$-withPermit-BitmapFactoryDecoder$decode$2"}, m7923s = {"L$0", "I$0", "L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1613a;

    /* renamed from: b */
    public int f1614b;

    /* renamed from: c */
    public int f1615c;

    /* renamed from: d */
    public /* synthetic */ Object f1616d;

    /* renamed from: e */
    public final /* synthetic */ BitmapFactoryDecoder f1617e;

    /* renamed from: f */
    public int f1618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, Continuation continuation) {
        super(continuation);
        this.f1617e = bitmapFactoryDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1616d = obj;
        this.f1618f |= Integer.MIN_VALUE;
        return this.f1617e.mo1791a(this);
    }
}
