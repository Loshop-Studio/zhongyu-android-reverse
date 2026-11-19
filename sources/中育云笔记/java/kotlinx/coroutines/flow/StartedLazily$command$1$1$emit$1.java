package kotlinx.coroutines.flow;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m26211f = "SharingStarted.kt", m26212l = {Opcodes.IFNE}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23863c;

    /* renamed from: d */
    public final /* synthetic */ StartedLazily$command$1.C100371 f23864d;

    /* renamed from: e */
    public int f23865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C100371 c100371, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23864d = c100371;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23863c = obj;
        this.f23865e |= Integer.MIN_VALUE;
        return this.f23864d.m20864b(0, this);
    }
}
