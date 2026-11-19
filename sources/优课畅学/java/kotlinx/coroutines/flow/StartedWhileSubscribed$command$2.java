package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m17801f = "SharingStarted.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17960a;

    /* renamed from: b */
    public /* synthetic */ Object f17961b;

    public StartedWhileSubscribed$command$2(InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(SharingCommand sharingCommand, InterfaceC9324c interfaceC9324c) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(interfaceC9324c);
        startedWhileSubscribed$command$2.f17961b = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f17960a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return AbstractC9536a.m17796a(((SharingCommand) this.f17961b) != SharingCommand.f17941a);
    }
}
