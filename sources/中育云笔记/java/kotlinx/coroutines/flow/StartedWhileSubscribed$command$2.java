package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m26211f = "SharingStarted.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23872c;

    /* renamed from: d */
    public /* synthetic */ Object f23873d;

    public StartedWhileSubscribed$command$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(interfaceC11588c);
        startedWhileSubscribed$command$2.f23873d = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(SharingCommand sharingCommand, InterfaceC11588c interfaceC11588c) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f23872c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return AbstractC11826a.m26206a(((SharingCommand) this.f23873d) != SharingCommand.f23853c);
    }
}
