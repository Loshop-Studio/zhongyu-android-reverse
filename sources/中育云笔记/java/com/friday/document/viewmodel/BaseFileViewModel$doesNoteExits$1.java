package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {304, 306}, m26213m = "doesNoteExits")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$doesNoteExits$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7861c;

    /* renamed from: d */
    public Object f7862d;

    /* renamed from: e */
    public /* synthetic */ Object f7863e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7864f;

    /* renamed from: g */
    public int f7865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$doesNoteExits$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7864f = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7863e = obj;
        this.f7865g |= Integer.MIN_VALUE;
        return this.f7864f.m6269w(null, this);
    }
}
