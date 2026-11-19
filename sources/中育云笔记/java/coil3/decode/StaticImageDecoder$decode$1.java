package coil3.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.decode.StaticImageDecoder", m26211f = "StaticImageDecoder.kt", m26212l = {168}, m26213m = "decode")
/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3623c;

    /* renamed from: d */
    public int f3624d;

    /* renamed from: e */
    public /* synthetic */ Object f3625e;

    /* renamed from: f */
    public final /* synthetic */ StaticImageDecoder f3626f;

    /* renamed from: g */
    public int f3627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f3626f = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3625e = obj;
        this.f3627g |= Integer.MIN_VALUE;
        return this.f3626f.mo3058a(this);
    }
}
