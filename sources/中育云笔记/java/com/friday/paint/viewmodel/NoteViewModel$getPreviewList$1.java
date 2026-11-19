package com.friday.paint.viewmodel;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel", m26211f = "NoteViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS, 143}, m26213m = "getPreviewList")
/* loaded from: classes4.dex */
public final class NoteViewModel$getPreviewList$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f10489c;

    /* renamed from: d */
    public Object f10490d;

    /* renamed from: e */
    public Object f10491e;

    /* renamed from: f */
    public /* synthetic */ Object f10492f;

    /* renamed from: g */
    public final /* synthetic */ NoteViewModel f10493g;

    /* renamed from: h */
    public int f10494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$getPreviewList$1(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f10493g = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10492f = obj;
        this.f10494h |= Integer.MIN_VALUE;
        return this.f10493g.m7718H(null, this);
    }
}
