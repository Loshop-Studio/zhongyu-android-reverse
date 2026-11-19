package com.zykj.view.board.simple;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1", m26211f = "SimpleViewModel.kt", m26212l = {130, PatchStatus.CODE_LOAD_LIB_INJECT, 141}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$updateConfigAboutPen$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f20464c;

    /* renamed from: d */
    public int f20465d;

    /* renamed from: e */
    public final /* synthetic */ SimpleViewModel f20466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateConfigAboutPen$1(SimpleViewModel simpleViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20466e = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$updateConfigAboutPen$1(this.f20466e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r9.emit(r3, r8) != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r8.f20465d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r8.f20464c
            com.zykj.view.board.simple.e r0 = (com.zykj.view.board.simple.C8887e) r0
            kotlin.AbstractC9924b.m20071b(r9)
            goto La8
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f20464c
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C8887e) r1
            kotlin.AbstractC9924b.m20071b(r9)
            goto L86
        L2a:
            java.lang.Object r1 = r8.f20464c
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C8887e) r1
            kotlin.AbstractC9924b.m20071b(r9)
            goto L68
        L32:
            kotlin.AbstractC9924b.m20071b(r9)
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f20466e
            vd.l r9 = com.zykj.view.board.simple.SimpleViewModel.m17290b(r9)
            java.lang.Object r9 = r9.getValue()
            com.zykj.view.board.simple.e r9 = (com.zykj.view.board.simple.C8887e) r9
            com.zykj.view.board.simple.SimpleViewModel r1 = r8.f20466e
            vd.k r1 = com.zykj.view.board.simple.SimpleViewModel.m17289a(r1)
            com.zykj.view.board.simple.b$f r5 = new com.zykj.view.board.simple.b$f
            com.zykj.view.board.simple.d r6 = r9.m17328i()
            int r6 = r6.m17317a()
            com.zykj.view.board.simple.d r7 = r9.m17328i()
            boolean r7 = r7.m17319c()
            r5.<init>(r6, r7)
            r8.f20464c = r9
            r8.f20465d = r4
            java.lang.Object r1 = r1.emit(r5, r8)
            if (r1 != r0) goto L67
            goto La7
        L67:
            r1 = r9
        L68:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f20466e
            vd.k r9 = com.zykj.view.board.simple.SimpleViewModel.m17289a(r9)
            com.zykj.view.board.simple.b$g r4 = new com.zykj.view.board.simple.b$g
            com.zykj.view.board.simple.c r5 = r1.m17327h()
            float r5 = r5.m17316b()
            r4.<init>(r5)
            r8.f20464c = r1
            r8.f20465d = r3
            java.lang.Object r9 = r9.emit(r4, r8)
            if (r9 != r0) goto L86
            goto La7
        L86:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f20466e
            vd.k r9 = com.zykj.view.board.simple.SimpleViewModel.m17289a(r9)
            com.zykj.view.board.simple.b$e r3 = new com.zykj.view.board.simple.b$e
            com.zykj.view.board.board.s r4 = r1.m17326g()
            int r4 = r4.m17015a()
            r3.<init>(r4)
            java.lang.Object r1 = p409xc.AbstractC11833h.m26224a(r1)
            r8.f20464c = r1
            r8.f20465d = r2
            java.lang.Object r9 = r9.emit(r3, r8)
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1.smali:122
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SimpleViewModel$updateConfigAboutPen$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
