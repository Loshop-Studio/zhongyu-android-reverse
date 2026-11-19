package com.friday.paint.viewmodel;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$2", m26211f = "NewNoteViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$deleteNote$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10347c;

    /* renamed from: d */
    public /* synthetic */ Object f10348d;

    /* renamed from: e */
    public final /* synthetic */ NewNoteViewModel f10349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$deleteNote$2(NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10349e = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NewNoteViewModel$deleteNote$2 newNoteViewModel$deleteNote$2 = new NewNoteViewModel$deleteNote$2(this.f10349e, interfaceC11588c);
        newNoteViewModel$deleteNote$2.f10348d = obj;
        return newNoteViewModel$deleteNote$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$deleteNote$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f10348d;
        AbstractC11725a.m25952f();
        if (this.f10347c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (th instanceof CancellationException) {
            throw th;
        }
        this.f10349e.f10323s.postValue(AbstractC11826a.m26208c(-1));
        return C10786q.f26013a;
    }
}
