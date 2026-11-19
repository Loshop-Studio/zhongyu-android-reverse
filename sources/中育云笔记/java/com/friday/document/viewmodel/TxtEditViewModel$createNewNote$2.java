package com.friday.document.viewmodel;

import com.friday.document.R$string;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TxtEditViewModel$createNewNote$2", m26211f = "TxtEditViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TxtEditViewModel$createNewNote$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8421c;

    /* renamed from: d */
    public final /* synthetic */ TxtEditViewModel f8422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxtEditViewModel$createNewNote$2(TxtEditViewModel txtEditViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8422d = txtEditViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TxtEditViewModel$createNewNote$2(this.f8422d, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((TxtEditViewModel$createNewNote$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8421c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f8422d.m6484k().postValue(null);
        AbstractC11958b.m26587h(R$string.save_error);
        return C10786q.f26013a;
    }
}
