package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel", m26211f = "FolderViewModel.kt", m26212l = {127}, m26213m = "getCurrentFolderId")
/* loaded from: classes3.dex */
public final class FolderViewModel$getCurrentFolderId$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8028c;

    /* renamed from: d */
    public /* synthetic */ Object f8029d;

    /* renamed from: e */
    public final /* synthetic */ FolderViewModel f8030e;

    /* renamed from: f */
    public int f8031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$getCurrentFolderId$1(FolderViewModel folderViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8030e = folderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8029d = obj;
        this.f8031f |= Integer.MIN_VALUE;
        return this.f8030e.m6290J0(this);
    }
}
