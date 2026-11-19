package com.friday.lecture.viewmodel.offline;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.friday.lecture.model.ConnectMode;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.viewmodel.offline.LectureDialogViewModel$changeConnectMode$1", m26211f = "LectureDialogViewModel.kt", m26212l = {63, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT, PatchStatus.CODE_LOAD_UNDEFINED}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LectureDialogViewModel$changeConnectMode$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8934c;

    /* renamed from: d */
    public final /* synthetic */ LectureDialogViewModel f8935d;

    /* renamed from: e */
    public final /* synthetic */ ConnectMode f8936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LectureDialogViewModel$changeConnectMode$1(LectureDialogViewModel lectureDialogViewModel, ConnectMode connectMode, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8935d = lectureDialogViewModel;
        this.f8936e = connectMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new LectureDialogViewModel$changeConnectMode$1(this.f8935d, this.f8936e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r8.emit(r1, r7) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[LOOP:0: B:22:0x0076->B:24:0x007c, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.f8934c
            java.lang.String r2 = ""
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.AbstractC9924b.m20071b(r8)
            goto L9c
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L5f
        L24:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L3c
        L28:
            kotlin.AbstractC9924b.m20071b(r8)
            com.friday.lecture.viewmodel.offline.LectureDialogViewModel r8 = r7.f8935d
            vd.l r8 = com.friday.lecture.viewmodel.offline.LectureDialogViewModel.m6831e(r8)
            com.friday.lecture.model.ConnectMode r1 = r7.f8936e
            r7.f8934c = r5
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L3c
            goto L9b
        L3c:
            com.friday.lecture.viewmodel.offline.LectureDialogViewModel r8 = r7.f8935d
            vd.l r8 = com.friday.lecture.viewmodel.offline.LectureDialogViewModel.m6833g(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.friday.lecture.model.ConnectMode r5 = r7.f8936e
            int r5 = r5.getPasswordMaxSize()
            r6 = 0
        L4e:
            if (r6 >= r5) goto L56
            r1.add(r2)
            int r6 = r6 + 1
            goto L4e
        L56:
            r7.f8934c = r4
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L5f
            goto L9b
        L5f:
            com.friday.lecture.viewmodel.offline.LectureDialogViewModel r8 = r7.f8935d
            vd.l r8 = com.friday.lecture.viewmodel.offline.LectureDialogViewModel.m6832f(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.friday.lecture.model.ConnectMode r4 = r7.f8936e
            java.util.List r4 = r4.getKeyboardList()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L76:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.friday.lecture.model.KeyboardData r6 = new com.friday.lecture.model.KeyboardData
            r6.<init>(r5)
            r1.add(r6)
            goto L76
        L8b:
            com.friday.lecture.model.KeyboardData r4 = new com.friday.lecture.model.KeyboardData
            r4.<init>(r2)
            r1.add(r4)
            r7.f8934c = r3
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L9c
        L9b:
            return r0
        L9c:
            com.blankj.utilcode.util.SPUtils r8 = com.blankj.utilcode.util.SPUtils.getInstance()
            com.friday.lecture.model.ConnectMode r0 = r7.f8936e
            int r0 = r0.getPasswordMaxSize()
            java.lang.String r1 = "ConnectMode"
            r8.put(r1, r0)
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.lecture.viewmodel.offline.LectureDialogViewModel$changeConnectMode$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/lecture/viewmodel/offline/LectureDialogViewModel$changeConnectMode$1.smali:130
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((LectureDialogViewModel$changeConnectMode$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
