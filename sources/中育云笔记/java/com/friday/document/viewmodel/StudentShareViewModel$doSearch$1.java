package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel", m26211f = "StudentShareViewModel.kt", m26212l = {470, 472, 474, 478}, m26213m = "doSearch")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$doSearch$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8349c;

    /* renamed from: d */
    public Object f8350d;

    /* renamed from: e */
    public /* synthetic */ Object f8351e;

    /* renamed from: f */
    public final /* synthetic */ StudentShareViewModel f8352f;

    /* renamed from: g */
    public int f8353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$doSearch$1(StudentShareViewModel studentShareViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8352f = studentShareViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8351e = obj;
        this.f8353g |= Integer.MIN_VALUE;
        return this.f8352f.m6456o(null, this);
    }
}
