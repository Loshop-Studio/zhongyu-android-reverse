package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.channels.ProduceKt", m26211f = "Produce.kt", m26212l = {302}, m26213m = "awaitClose")
/* loaded from: classes6.dex */
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23576c;

    /* renamed from: d */
    public Object f23577d;

    /* renamed from: e */
    public /* synthetic */ Object f23578e;

    /* renamed from: f */
    public int f23579f;

    public ProduceKt$awaitClose$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23578e = obj;
        this.f23579f |= Integer.MIN_VALUE;
        return ProduceKt.m20713a(null, null, this);
    }
}
