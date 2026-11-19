package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {231}, m26213m = "deleteCacheFile")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$deleteCacheFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7847c;

    /* renamed from: d */
    public Object f7848d;

    /* renamed from: e */
    public /* synthetic */ Object f7849e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7850f;

    /* renamed from: g */
    public int f7851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$deleteCacheFile$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7850f = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7849e = obj;
        this.f7851g |= Integer.MIN_VALUE;
        return this.f7850f.m6263t(null, null, this);
    }
}
