package com.friday.paint.viewmodel;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$getPreviewNoteList$1", m26211f = "NewNoteViewModel.kt", m26212l = {118, PatchStatus.CODE_LOAD_LIB_LOST}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$getPreviewNoteList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10357c;

    /* renamed from: d */
    public Object f10358d;

    /* renamed from: e */
    public int f10359e;

    /* renamed from: f */
    public final /* synthetic */ NewNoteViewModel f10360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$getPreviewNoteList$1(NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10360f = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewNoteViewModel$getPreviewNoteList$1(this.f10360f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r1.emit(r6, r14) == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel$getPreviewNoteList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1.smali:123
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$getPreviewNoteList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
