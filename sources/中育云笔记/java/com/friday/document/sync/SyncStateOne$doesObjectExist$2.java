package com.friday.document.sync;

import java.util.concurrent.TimeUnit;
import je.C9742v;
import je.C9743w;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.sync.SyncStateOne$doesObjectExist$2", m26211f = "SyncStateOne.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SyncStateOne$doesObjectExist$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6935c;

    /* renamed from: d */
    public /* synthetic */ Object f6936d;

    /* renamed from: e */
    public final /* synthetic */ String f6937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncStateOne$doesObjectExist$2(String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6937e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        SyncStateOne$doesObjectExist$2 syncStateOne$doesObjectExist$2 = new SyncStateOne$doesObjectExist$2(this.f6937e, interfaceC11588c);
        syncStateOne$doesObjectExist$2.f6936d = obj;
        return syncStateOne$doesObjectExist$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        AbstractC11725a.m25952f();
        if (this.f6935c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        String str = this.f6937e;
        try {
            Result.C9921a c9921a = Result.f23263d;
            C9742v.a aVar = new C9742v.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            objM20054c = Result.m20054c(AbstractC11826a.m26206a(aVar.m19559e(5L, timeUnit).m19551O(5L, timeUnit).m19557c().mo19319b(new C9743w.a().m19608p(str).m19599g().m19595b()).execute().m19632j() == 200));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        return Result.m20058g(objM20054c) ? AbstractC11826a.m26206a(false) : objM20054c;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SyncStateOne$doesObjectExist$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
