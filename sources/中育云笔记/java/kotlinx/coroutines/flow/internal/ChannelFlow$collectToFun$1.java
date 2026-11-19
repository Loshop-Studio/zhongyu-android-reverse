package kotlinx.coroutines.flow.internal;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m26211f = "ChannelFlow.kt", m26212l = {Opcodes.FSTORE}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23908c;

    /* renamed from: d */
    public /* synthetic */ Object f23909d;

    /* renamed from: e */
    public final /* synthetic */ ChannelFlow f23910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow channelFlow, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23910e = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f23910e, interfaceC11588c);
        channelFlow$collectToFun$1.f23909d = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23908c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.f23909d;
            ChannelFlow channelFlow = this.f23910e;
            this.f23908c = 1;
            if (channelFlow.mo20757h(interfaceC11395j, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        return ((ChannelFlow$collectToFun$1) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
