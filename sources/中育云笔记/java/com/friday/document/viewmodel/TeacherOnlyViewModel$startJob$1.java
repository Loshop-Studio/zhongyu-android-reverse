package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1", m26211f = "TeacherOnlyViewModel.kt", m26212l = {35, 36, 38, 42, 44, 45, 50}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TeacherOnlyViewModel$startJob$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8393c;

    /* renamed from: d */
    public Object f8394d;

    /* renamed from: e */
    public Object f8395e;

    /* renamed from: f */
    public int f8396f;

    /* renamed from: g */
    public int f8397g;

    /* renamed from: h */
    public final /* synthetic */ TeacherOnlyViewModel f8398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherOnlyViewModel$startJob$1(TeacherOnlyViewModel teacherOnlyViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8398h = teacherOnlyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TeacherOnlyViewModel$startJob$1(this.f8398h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r9.emit(r2, r8) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        if (sd.AbstractC11109f.m24709g(r9, r5, r8) != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (sd.AbstractC11109f.m24709g(r6, r7, r8) == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[PHI: r9
      0x0085: PHI (r9v20 java.lang.Object) = (r9v19 java.lang.Object), (r9v0 java.lang.Object) binds: [B:21:0x0081, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1.smali:132
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TeacherOnlyViewModel$startJob$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
