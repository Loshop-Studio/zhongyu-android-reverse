package com.friday.paint.viewmodel;

import com.friday.paint.R$string;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$createNewNote$2", m26211f = "NoteViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$createNewNote$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10459c;

    public NoteViewModel$createNewNote$2(InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$createNewNote$2(interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$createNewNote$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10459c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        AbstractC11958b.m26587h(R$string.save_error);
        return C10786q.f26013a;
    }
}
