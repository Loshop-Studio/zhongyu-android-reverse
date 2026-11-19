package com.friday.paint.view;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$initData$1$onDeleteImagePath$1", m26211f = "TheSketchFragment.kt", m26212l = {PatchStatus.CODE_LOAD_JIT_CLEAR, 79}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TheSketchFragment$initData$1$onDeleteImagePath$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10046c;

    /* renamed from: d */
    public final /* synthetic */ TheSketchFragment f10047d;

    /* renamed from: e */
    public final /* synthetic */ String f10048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheSketchFragment$initData$1$onDeleteImagePath$1(TheSketchFragment theSketchFragment, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10047d = theSketchFragment;
        this.f10048e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TheSketchFragment$initData$1$onDeleteImagePath$1(this.f10047d, this.f10048e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r14.m7735p(r1, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r13.f10046c
            java.lang.String r2 = "/res/"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.AbstractC9924b.m20071b(r14)
            goto L8c
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.AbstractC9924b.m20071b(r14)
            goto L58
        L21:
            kotlin.AbstractC9924b.m20071b(r14)
            com.friday.paint.view.TheSketchFragment r14 = r13.f10047d
            com.friday.paint.viewmodel.NoteViewModel r14 = com.friday.paint.view.TheSketchFragment.m7490M(r14)
            com.friday.paint.view.TheSketchFragment r1 = r13.f10047d
            java.lang.String r1 = com.friday.paint.view.TheSketchFragment.m7489L(r1)
            java.lang.String r5 = r13.f10048e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r2)
            r6.append(r5)
            java.lang.String r7 = r6.toString()
            r11 = 4
            r12 = 0
            java.lang.String r8 = "//"
            java.lang.String r9 = "/"
            r10 = 0
            java.lang.String r1 = p310qd.AbstractC10819z.m23238K(r7, r8, r9, r10, r11, r12)
            r13.f10046c = r4
            java.lang.Object r14 = r14.m7738s(r1, r13)
            if (r14 != r0) goto L58
            goto L8b
        L58:
            com.friday.paint.view.TheSketchFragment r14 = r13.f10047d
            com.friday.paint.viewmodel.NoteViewModel r14 = com.friday.paint.view.TheSketchFragment.m7490M(r14)
            com.friday.paint.view.TheSketchFragment r1 = r13.f10047d
            java.lang.String r1 = com.friday.paint.view.TheSketchFragment.m7489L(r1)
            java.lang.String r4 = r13.f10048e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r6 = r5.toString()
            r10 = 4
            r11 = 0
            java.lang.String r7 = "//"
            java.lang.String r8 = "/"
            r9 = 0
            java.lang.String r1 = p310qd.AbstractC10819z.m23238K(r6, r7, r8, r9, r10, r11)
            r13.f10046c = r3
            java.lang.Object r14 = r14.m7735p(r1, r13)
            if (r14 != r0) goto L8c
        L8b:
            return r0
        L8c:
            qc.q r14 = p309qc.C10786q.f26013a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.TheSketchFragment$initData$1$onDeleteImagePath$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/TheSketchFragment$initData$1$onDeleteImagePath$1.smali:129
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TheSketchFragment$initData$1$onDeleteImagePath$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
