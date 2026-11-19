package com.friday.main.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel", m26211f = "FolderMoveViewModel.kt", m26212l = {210, 212}, m26213m = "folderList")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$folderList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f9527c;

    /* renamed from: d */
    public Object f9528d;

    /* renamed from: e */
    public Object f9529e;

    /* renamed from: f */
    public /* synthetic */ Object f9530f;

    /* renamed from: g */
    public final /* synthetic */ FolderMoveViewModel f9531g;

    /* renamed from: h */
    public int f9532h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$folderList$1(FolderMoveViewModel folderMoveViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f9531g = folderMoveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9530f = obj;
        this.f9532h |= Integer.MIN_VALUE;
        return this.f9531g.m7221t(null, null, this);
    }
}
