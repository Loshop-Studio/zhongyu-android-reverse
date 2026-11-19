package coil3.decode;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.decode.StaticImageDecoder", m7918f = "StaticImageDecoder.kt", m7919i = {0, 0}, m7920l = {168}, m7921m = "decode", m7922n = {"$this$withPermit$iv", "$i$f$withPermit"}, m7923s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1632a;

    /* renamed from: b */
    public int f1633b;

    /* renamed from: c */
    public /* synthetic */ Object f1634c;

    /* renamed from: d */
    public final /* synthetic */ StaticImageDecoder f1635d;

    /* renamed from: e */
    public int f1636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, Continuation continuation) {
        super(continuation);
        this.f1635d = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1634c = obj;
        this.f1636e |= Integer.MIN_VALUE;
        return this.f1635d.mo1791a(this);
    }
}
