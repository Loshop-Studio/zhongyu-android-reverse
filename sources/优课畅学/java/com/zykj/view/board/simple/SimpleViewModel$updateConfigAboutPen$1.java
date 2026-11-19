package com.zykj.view.board.simple;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1", m17801f = "SimpleViewModel.kt", m17802l = {130, 136, 141}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateConfigAboutPen$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f15253a;

    /* renamed from: b */
    public int f15254b;

    /* renamed from: c */
    public final /* synthetic */ SimpleViewModel f15255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateConfigAboutPen$1(SimpleViewModel simpleViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15255c = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleViewModel$updateConfigAboutPen$1(this.f15255c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleViewModel$updateConfigAboutPen$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r8.f15254b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r8.f15253a
            com.zykj.view.board.simple.e r0 = (com.zykj.view.board.simple.C8254e) r0
            kotlin.AbstractC9079b.m15926b(r9)
            goto La8
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f15253a
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C8254e) r1
            kotlin.AbstractC9079b.m15926b(r9)
            goto L86
        L2a:
            java.lang.Object r1 = r8.f15253a
            com.zykj.view.board.simple.e r1 = (com.zykj.view.board.simple.C8254e) r1
            kotlin.AbstractC9079b.m15926b(r9)
            goto L68
        L32:
            kotlin.AbstractC9079b.m15926b(r9)
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f15255c
            l8.h r9 = com.zykj.view.board.simple.SimpleViewModel.m13218b(r9)
            java.lang.Object r9 = r9.getValue()
            com.zykj.view.board.simple.e r9 = (com.zykj.view.board.simple.C8254e) r9
            com.zykj.view.board.simple.SimpleViewModel r1 = r8.f15255c
            l8.g r1 = com.zykj.view.board.simple.SimpleViewModel.m13217a(r1)
            com.zykj.view.board.simple.b$f r5 = new com.zykj.view.board.simple.b$f
            com.zykj.view.board.simple.d r6 = r9.m13256i()
            int r6 = r6.m13245a()
            com.zykj.view.board.simple.d r7 = r9.m13256i()
            boolean r7 = r7.m13247c()
            r5.<init>(r6, r7)
            r8.f15253a = r9
            r8.f15254b = r4
            java.lang.Object r1 = r1.emit(r5, r8)
            if (r1 != r0) goto L67
            goto La7
        L67:
            r1 = r9
        L68:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f15255c
            l8.g r9 = com.zykj.view.board.simple.SimpleViewModel.m13217a(r9)
            com.zykj.view.board.simple.b$g r4 = new com.zykj.view.board.simple.b$g
            com.zykj.view.board.simple.c r5 = r1.m13255h()
            float r5 = r5.m13244b()
            r4.<init>(r5)
            r8.f15253a = r1
            r8.f15254b = r3
            java.lang.Object r9 = r9.emit(r4, r8)
            if (r9 != r0) goto L86
            goto La7
        L86:
            com.zykj.view.board.simple.SimpleViewModel r9 = r8.f15255c
            l8.g r9 = com.zykj.view.board.simple.SimpleViewModel.m13217a(r9)
            com.zykj.view.board.simple.b$e r3 = new com.zykj.view.board.simple.b$e
            com.zykj.view.board.board.s r4 = r1.m13254g()
            int r4 = r4.m12899a()
            r3.<init>(r4)
            java.lang.Object r1 = p201o7.AbstractC9543h.m17814a(r1)
            r8.f15253a = r1
            r8.f15254b = r2
            java.lang.Object r9 = r9.emit(r3, r8)
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1.smali:122
    }
}
