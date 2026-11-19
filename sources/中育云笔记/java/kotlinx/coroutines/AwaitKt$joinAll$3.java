package kotlinx.coroutines;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.AwaitKt", m26211f = "Await.kt", m26212l = {Opcodes.ASTORE}, m26213m = "joinAll")
/* loaded from: classes6.dex */
public final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23473c;

    /* renamed from: d */
    public /* synthetic */ Object f23474d;

    /* renamed from: e */
    public int f23475e;

    public AwaitKt$joinAll$3(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23474d = obj;
        this.f23475e |= Integer.MIN_VALUE;
        return AwaitKt.m20371a(null, this);
    }
}
