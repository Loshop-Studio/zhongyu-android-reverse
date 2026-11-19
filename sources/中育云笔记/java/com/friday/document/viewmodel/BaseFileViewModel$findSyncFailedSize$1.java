package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {557}, m26213m = "findSyncFailedSize")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$findSyncFailedSize$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f7902c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7903d;

    /* renamed from: e */
    public int f7904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$findSyncFailedSize$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7903d = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7902c = obj;
        this.f7904e |= Integer.MIN_VALUE;
        return this.f7903d.m6219C(this);
    }
}
