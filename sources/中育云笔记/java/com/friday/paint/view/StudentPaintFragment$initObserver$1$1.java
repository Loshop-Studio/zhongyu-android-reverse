package com.friday.paint.view;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initObserver$1$1", m26211f = "StudentPaintFragment.kt", m26212l = {446, 480}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StudentPaintFragment$initObserver$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9946c;

    /* renamed from: d */
    public int f9947d;

    /* renamed from: e */
    public int f9948e;

    /* renamed from: f */
    public Object f9949f;

    /* renamed from: g */
    public Object f9950g;

    /* renamed from: h */
    public int f9951h;

    /* renamed from: i */
    public final /* synthetic */ StudentPaintFragment f9952i;

    @InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initObserver$1$1$2", m26211f = "StudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.StudentPaintFragment$initObserver$1$1$2 */
    public static final class C62552 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9955c;

        /* renamed from: d */
        public final /* synthetic */ StudentPaintFragment f9956d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62552(StudentPaintFragment studentPaintFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9956d = studentPaintFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62552(this.f9956d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f9955c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            this.f9956d.isShowLoading(false);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62552) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentPaintFragment$initObserver$1$1(StudentPaintFragment studentPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9952i = studentPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentPaintFragment$initObserver$1$1(this.f9952i, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        if (sd.AbstractC11109f.m24709g(r3, r9, r19) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        if (sd.AbstractC11109f.m24709g(r2, r4, r19) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0147, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.StudentPaintFragment$initObserver$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/StudentPaintFragment$initObserver$1$1.smali:130
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentPaintFragment$initObserver$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
