package com.friday.paint.view.six;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {463, 470}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewStudentPaintFragment$submitSubjectiveHomework$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10256c;

    /* renamed from: d */
    public Object f10257d;

    /* renamed from: e */
    public int f10258e;

    /* renamed from: f */
    public final /* synthetic */ String f10259f;

    /* renamed from: g */
    public final /* synthetic */ NewStudentPaintFragment f10260g;

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1$1 */
    public static final class C63051 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10261c;

        /* renamed from: d */
        public final /* synthetic */ NewStudentPaintFragment f10262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63051(NewStudentPaintFragment newStudentPaintFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10262d = newStudentPaintFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C63051(this.f10262d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f10261c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11958b.m26588i("文件不存在");
            this.f10262d.isShowLoading(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63051) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewStudentPaintFragment$submitSubjectiveHomework$1$1(String str, NewStudentPaintFragment newStudentPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10259f = str;
        this.f10260g = newStudentPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewStudentPaintFragment$submitSubjectiveHomework$1$1(this.f10259f, this.f10260g, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (sd.AbstractC11109f.m24709g(r1, r2, r14) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewStudentPaintFragment$submitSubjectiveHomework$1$1.smali:133
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewStudentPaintFragment$submitSubjectiveHomework$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
