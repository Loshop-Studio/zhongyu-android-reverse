package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {97, 99}, m26213m = "getRealLevel")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$getRealLevel$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7914c;

    /* renamed from: d */
    public Object f7915d;

    /* renamed from: e */
    public /* synthetic */ Object f7916e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7917f;

    /* renamed from: g */
    public int f7918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$getRealLevel$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7917f = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7916e = obj;
        this.f7918g |= Integer.MIN_VALUE;
        return this.f7917f.m6235S(this);
    }
}
