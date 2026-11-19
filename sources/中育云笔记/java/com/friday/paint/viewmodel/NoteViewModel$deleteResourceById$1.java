package com.friday.paint.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel", m26211f = "NoteViewModel.kt", m26212l = {213, 218, 221}, m26213m = "deleteResourceById")
/* loaded from: classes4.dex */
public final class NoteViewModel$deleteResourceById$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10478c;

    /* renamed from: d */
    public Object f10479d;

    /* renamed from: e */
    public Object f10480e;

    /* renamed from: f */
    public int f10481f;

    /* renamed from: g */
    public /* synthetic */ Object f10482g;

    /* renamed from: h */
    public final /* synthetic */ NoteViewModel f10483h;

    /* renamed from: i */
    public int f10484i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$deleteResourceById$1(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10483h = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10482g = obj;
        this.f10484i |= Integer.MIN_VALUE;
        return this.f10483h.m7738s(null, this);
    }
}
