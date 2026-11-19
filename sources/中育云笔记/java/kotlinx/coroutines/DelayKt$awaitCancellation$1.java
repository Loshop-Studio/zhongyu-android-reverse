package kotlinx.coroutines;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.DelayKt", m26211f = "Delay.kt", m26212l = {Opcodes.IF_ICMPNE}, m26213m = "awaitCancellation")
/* loaded from: classes6.dex */
public final class DelayKt$awaitCancellation$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23483c;

    /* renamed from: d */
    public int f23484d;

    public DelayKt$awaitCancellation$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23483c = obj;
        this.f23484d |= Integer.MIN_VALUE;
        return DelayKt.m20375a(this);
    }
}
