package com.friday.main.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel", m26211f = "SearchViewModel.kt", m26212l = {179}, m26213m = "doesOfficeAndMicroClassFileExits")
/* loaded from: classes4.dex */
public final class SearchViewModel$doesOfficeAndMicroClassFileExits$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f9690c;

    /* renamed from: d */
    public /* synthetic */ Object f9691d;

    /* renamed from: e */
    public final /* synthetic */ SearchViewModel f9692e;

    /* renamed from: f */
    public int f9693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$doesOfficeAndMicroClassFileExits$1(SearchViewModel searchViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f9692e = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9691d = obj;
        this.f9693f |= Integer.MIN_VALUE;
        return this.f9692e.m7280k(null, this);
    }
}
