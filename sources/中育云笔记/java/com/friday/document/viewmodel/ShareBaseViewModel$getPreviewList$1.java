package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel", m26211f = "ShareBaseViewModel.kt", m26212l = {138}, m26213m = "getPreviewList")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$getPreviewList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8260c;

    /* renamed from: d */
    public /* synthetic */ Object f8261d;

    /* renamed from: e */
    public final /* synthetic */ ShareBaseViewModel f8262e;

    /* renamed from: f */
    public int f8263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$getPreviewList$1(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8262e = shareBaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8261d = obj;
        this.f8263f |= Integer.MIN_VALUE;
        return this.f8262e.m6367D(null, this);
    }
}
