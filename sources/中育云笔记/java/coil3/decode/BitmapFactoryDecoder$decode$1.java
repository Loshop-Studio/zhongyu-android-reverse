package coil3.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.decode.BitmapFactoryDecoder", m26211f = "BitmapFactoryDecoder.kt", m26212l = {212, 40}, m26213m = "decode")
/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3604c;

    /* renamed from: d */
    public int f3605d;

    /* renamed from: e */
    public int f3606e;

    /* renamed from: f */
    public /* synthetic */ Object f3607f;

    /* renamed from: g */
    public final /* synthetic */ BitmapFactoryDecoder f3608g;

    /* renamed from: h */
    public int f3609h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapFactoryDecoder$decode$1(BitmapFactoryDecoder bitmapFactoryDecoder, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3608g = bitmapFactoryDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3607f = obj;
        this.f3609h |= Integer.MIN_VALUE;
        return this.f3608g.mo3058a(this);
    }
}
