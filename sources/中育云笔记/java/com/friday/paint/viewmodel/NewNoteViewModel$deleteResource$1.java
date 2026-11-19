package com.friday.paint.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel", m26211f = "NewNoteViewModel.kt", m26212l = {190}, m26213m = "deleteResource")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$deleteResource$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10350c;

    /* renamed from: d */
    public Object f10351d;

    /* renamed from: e */
    public Object f10352e;

    /* renamed from: f */
    public boolean f10353f;

    /* renamed from: g */
    public /* synthetic */ Object f10354g;

    /* renamed from: h */
    public final /* synthetic */ NewNoteViewModel f10355h;

    /* renamed from: i */
    public int f10356i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$deleteResource$1(NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10355h = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10354g = obj;
        this.f10356i |= Integer.MIN_VALUE;
        return this.f10355h.m7694w(null, null, this);
    }
}
