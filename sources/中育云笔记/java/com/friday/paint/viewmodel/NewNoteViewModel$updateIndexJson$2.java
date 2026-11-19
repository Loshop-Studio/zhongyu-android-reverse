package com.friday.paint.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$updateIndexJson$2", m26211f = "NewNoteViewModel.kt", m26212l = {157, Opcodes.IF_ICMPNE, 171, 174, 175, Opcodes.ARETURN}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$updateIndexJson$2 extends SuspendLambda implements InterfaceC9540l {

    /* renamed from: c */
    public Object f10418c;

    /* renamed from: d */
    public Object f10419d;

    /* renamed from: e */
    public Object f10420e;

    /* renamed from: f */
    public int f10421f;

    /* renamed from: g */
    public final /* synthetic */ List f10422g;

    /* renamed from: h */
    public final /* synthetic */ NewNoteViewModel f10423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$updateIndexJson$2(List list, NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(1, interfaceC11588c);
        this.f10422g = list;
        this.f10423h = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
        return new NewNoteViewModel$updateIndexJson$2(this.f10422g, this.f10423h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0100, code lost:
    
        if (r0.m7692u(r4, r9, r19) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0104, code lost:
    
        r0 = r4;
        r2 = r7;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0129, code lost:
    
        if (r0.m7688e0(r1, r2, 1, r4, r19) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e7, code lost:
    
        if (r3.mo5113o(r4, r2, r7, r19) != r6) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155 A[PHI: r0 r1 r2
      0x0155: PHI (r0v20 java.lang.String) = (r0v17 java.lang.String), (r0v22 java.lang.String) binds: [B:31:0x0151, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r1v15 com.friday.common.entity.FileEntity) = (r1v12 com.friday.common.entity.FileEntity), (r1v17 com.friday.common.entity.FileEntity) binds: [B:31:0x0151, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r2v11 java.util.List) = (r2v8 java.util.List), (r2v13 java.util.List) binds: [B:31:0x0151, B:8:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170 A[PHI: r0 r1 r2
      0x0170: PHI (r0v23 java.lang.String) = (r0v20 java.lang.String), (r0v29 java.lang.String) binds: [B:34:0x016c, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r1v18 com.friday.common.entity.FileEntity) = (r1v15 com.friday.common.entity.FileEntity), (r1v22 com.friday.common.entity.FileEntity) binds: [B:34:0x016c, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r2v14 java.util.List) = (r2v11 java.util.List), (r2v17 java.util.List) binds: [B:34:0x016c, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3 A[LOOP:0: B:37:0x019d->B:39:0x01a3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel$updateIndexJson$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2.smali:137
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$updateIndexJson$2) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
