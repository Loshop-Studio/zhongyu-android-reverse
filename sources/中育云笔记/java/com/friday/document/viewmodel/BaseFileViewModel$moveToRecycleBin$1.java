package com.friday.document.viewmodel;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$moveToRecycleBin$1", m26211f = "BaseFileViewModel.kt", m26212l = {440, 442, 443, 445, 449}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$moveToRecycleBin$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7919c;

    /* renamed from: d */
    public int f7920d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7921e;

    /* renamed from: f */
    public final /* synthetic */ List f7922f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$moveToRecycleBin$1(BaseFileViewModel baseFileViewModel, List list, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7921e = baseFileViewModel;
        this.f7922f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$moveToRecycleBin$1(this.f7921e, this.f7922f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r10.emit(r4, r9) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (r1.emit(r3, r9) != r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel$moveToRecycleBin$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel$moveToRecycleBin$1.smali:134
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$moveToRecycleBin$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
