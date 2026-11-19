package com.friday.paint.view.six;

import com.blankj.utilcode.util.LogUtils;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1$5$2", m26211f = "NewStudentPaintFragment.kt", m26212l = {395}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewStudentPaintFragment$handleHomework$1$5$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10238c;

    /* renamed from: d */
    public Object f10239d;

    /* renamed from: e */
    public int f10240e;

    /* renamed from: f */
    public int f10241f;

    /* renamed from: g */
    public final /* synthetic */ Ref$ObjectRef f10242g;

    /* renamed from: h */
    public final /* synthetic */ NewStudentPaintFragment f10243h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewStudentPaintFragment$handleHomework$1$5$2(Ref$ObjectRef ref$ObjectRef, NewStudentPaintFragment newStudentPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10242g = ref$ObjectRef;
        this.f10243h = newStudentPaintFragment;
    }

    /* renamed from: m */
    public static final C10786q m7616m(NewStudentPaintFragment newStudentPaintFragment, String str) {
        LogUtils.m3888i("[" + newStudentPaintFragment.getViewModel2().m7665G() + "] 添加图片:答题任务,路径:" + str);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewStudentPaintFragment$handleHomework$1$5$2(this.f10242g, this.f10243h, interfaceC11588c);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:5)(2:6|7))(4:8|(2:10|(1:12)(1:13))|23|24)|25|14|(1:16)(1:19)|20|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r0 = kotlin.Result.f23263d;
        kotlin.Result.m20054c(kotlin.AbstractC9924b.m20070a(r0));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.f10241f
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r11.f10239d
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r1 = r11.f10238c
            com.friday.paint.view.six.NewStudentPaintFragment r1 = (com.friday.paint.view.six.NewStudentPaintFragment) r1
            kotlin.AbstractC9924b.m20071b(r12)
            r4 = r0
            goto L40
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            kotlin.AbstractC9924b.m20071b(r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = r11.f10242g
            java.lang.Object r12 = r12.f23402c
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L69
            com.friday.paint.view.six.NewStudentPaintFragment r1 = r11.f10243h
            r11.f10238c = r1
            r11.f10239d = r12
            r3 = 0
            r11.f10240e = r3
            r11.f10241f = r2
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.m20376b(r2, r11)
            if (r2 != r0) goto L3f
            return r0
        L3f:
            r4 = r12
        L40:
            kotlin.Result$a r12 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L58
            com.zykj.view.board.board.BoardFragment r3 = r1.getCurrentNoteFragment()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L5b
            com.friday.paint.view.six.k r8 = new com.friday.paint.view.six.k     // Catch: java.lang.Throwable -> L58
            r8.<init>()     // Catch: java.lang.Throwable -> L58
            r9 = 6
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            com.zykj.view.board.board.BoardFragment.m16761u0(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L58
            qc.q r12 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r0 = move-exception
            r12 = r0
            goto L60
        L5b:
            r12 = 0
        L5c:
            kotlin.Result.m20054c(r12)     // Catch: java.lang.Throwable -> L58
            goto L69
        L60:
            kotlin.Result$a r0 = kotlin.Result.f23263d
            java.lang.Object r12 = kotlin.AbstractC9924b.m20070a(r12)
            kotlin.Result.m20054c(r12)
        L69:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1$5$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2.smali:230
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewStudentPaintFragment$handleHomework$1$5$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
