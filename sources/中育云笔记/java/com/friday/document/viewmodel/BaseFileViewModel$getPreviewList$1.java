package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {379}, m26213m = "getPreviewList")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$getPreviewList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7905c;

    /* renamed from: d */
    public /* synthetic */ Object f7906d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7907e;

    /* renamed from: f */
    public int f7908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$getPreviewList$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7907e = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7906d = obj;
        this.f7908f |= Integer.MIN_VALUE;
        return this.f7907e.m6233Q(null, this);
    }
}
