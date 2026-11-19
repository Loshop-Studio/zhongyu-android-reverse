package com.friday.paint.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel", m26211f = "NewNoteViewModel.kt", m26212l = {308}, m26213m = "wasDeleted")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$wasDeleted$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10424c;

    /* renamed from: d */
    public /* synthetic */ Object f10425d;

    /* renamed from: e */
    public final /* synthetic */ NewNoteViewModel f10426e;

    /* renamed from: f */
    public int f10427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$wasDeleted$1(NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10426e = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10425d = obj;
        this.f10427f |= Integer.MIN_VALUE;
        return this.f10426e.m7689f0(null, this);
    }
}
