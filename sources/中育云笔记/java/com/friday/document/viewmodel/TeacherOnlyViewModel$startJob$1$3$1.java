package com.friday.document.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.ToastUtils;
import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1$3$1", m26211f = "TeacherOnlyViewModel.kt", m26212l = {Opcodes.DSTORE, Opcodes.ASTORE, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT, 70, PatchStatus.CODE_LOAD_AES_DECRYPT, PatchStatus.CODE_LOAD_COPY_FILE}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TeacherOnlyViewModel$startJob$1$3$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8400c;

    /* renamed from: d */
    public Object f8401d;

    /* renamed from: e */
    public Object f8402e;

    /* renamed from: f */
    public Object f8403f;

    /* renamed from: g */
    public Object f8404g;

    /* renamed from: h */
    public Object f8405h;

    /* renamed from: i */
    public Object f8406i;

    /* renamed from: j */
    public int f8407j;

    /* renamed from: k */
    public int f8408k;

    /* renamed from: l */
    public int f8409l;

    /* renamed from: m */
    public final /* synthetic */ List f8410m;

    /* renamed from: n */
    public final /* synthetic */ TeacherOnlyViewModel f8411n;

    /* renamed from: o */
    public final /* synthetic */ List f8412o;

    @InterfaceC11829d(m26210c = "com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1$3$1$1", m26211f = "TeacherOnlyViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1$3$1$1 */
    public static final class C61321 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f8413c;

        public C61321(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C61321(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f8413c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            ToastUtils.showLong("请联网后再同步", new Object[0]);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C61321) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherOnlyViewModel$startJob$1$3$1(List list, TeacherOnlyViewModel teacherOnlyViewModel, List list2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8410m = list;
        this.f8411n = teacherOnlyViewModel;
        this.f8412o = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TeacherOnlyViewModel$startJob$1$3$1(this.f8410m, this.f8411n, this.f8412o, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        if (sd.AbstractC11109f.m24709g(r14, r4, r13) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f1, code lost:
    
        if (r5.emit(r6, r13) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0215, code lost:
    
        if (r3.emit(r4, r13) == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0169 -> B:51:0x016e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1.smali:161
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TeacherOnlyViewModel$startJob$1$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
