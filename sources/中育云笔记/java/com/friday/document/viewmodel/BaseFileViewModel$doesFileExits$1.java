package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {327}, m26213m = "doesFileExits")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$doesFileExits$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7852c;

    /* renamed from: d */
    public /* synthetic */ Object f7853d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7854e;

    /* renamed from: f */
    public int f7855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$doesFileExits$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7854e = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7853d = obj;
        this.f7855f |= Integer.MIN_VALUE;
        return this.f7854e.m6265u(null, this);
    }
}
