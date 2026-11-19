package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel", m26211f = "BaseFileViewModel.kt", m26212l = {375}, m26213m = "getPreviewNewNoteList")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$getPreviewNewNoteList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f7909c;

    /* renamed from: d */
    public Object f7910d;

    /* renamed from: e */
    public /* synthetic */ Object f7911e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7912f;

    /* renamed from: g */
    public int f7913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$getPreviewNewNoteList$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f7912f = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7911e = obj;
        this.f7913g |= Integer.MIN_VALUE;
        return this.f7912f.m6234R(null, this);
    }
}
