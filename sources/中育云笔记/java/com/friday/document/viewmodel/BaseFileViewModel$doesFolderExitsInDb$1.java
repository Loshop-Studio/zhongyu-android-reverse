package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {547}, m26213m = "doesFolderExitsInDb")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$doesFolderExitsInDb$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7856c;

    /* renamed from: d */
    public Object f7857d;

    /* renamed from: e */
    public /* synthetic */ Object f7858e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7859f;

    /* renamed from: g */
    public int f7860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$doesFolderExitsInDb$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7859f = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7858e = obj;
        this.f7860g |= Integer.MIN_VALUE;
        return this.f7859f.m6267v(this);
    }
}
