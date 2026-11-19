package com.friday.paint.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$saveThumbnail$1", m26211f = "NoteViewModel.kt", m26212l = {Opcodes.GOTO, 171, 172}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$saveThumbnail$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10535c;

    /* renamed from: d */
    public Object f10536d;

    /* renamed from: e */
    public int f10537e;

    /* renamed from: f */
    public final /* synthetic */ File f10538f;

    /* renamed from: g */
    public final /* synthetic */ NoteViewModel f10539g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$saveThumbnail$1(File file, NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10538f = file;
        this.f10539g = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$saveThumbnail$1(this.f10538f, this.f10539g, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (com.friday.common.dao.ResourceDao.m5085z(r5, r6, r7, null, r9, 4, null) != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r13.f10537e
            r2 = 3
            r3 = 2
            java.lang.String r4 = "getAbsolutePath(...)"
            r5 = 1
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L37
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r0 = r13.f10536d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r13.f10535c
            com.friday.common.entity.ResourceEntity r0 = (com.friday.common.entity.ResourceEntity) r0
            kotlin.AbstractC9924b.m20071b(r14)
            goto Ld3
        L20:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L28:
            java.lang.Object r1 = r13.f10536d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r13.f10535c
            com.friday.common.entity.ResourceEntity r3 = (com.friday.common.entity.ResourceEntity) r3
            kotlin.AbstractC9924b.m20071b(r14)
            r9 = r13
        L34:
            r7 = r1
            goto La9
        L37:
            kotlin.AbstractC9924b.m20071b(r14)
            r9 = r13
            goto L73
        L3c:
            kotlin.AbstractC9924b.m20071b(r14)
            java.io.File r14 = r13.f10538f
            boolean r14 = r14.exists()
            if (r14 == 0) goto Ld3
            java.io.File r14 = r13.f10538f
            java.lang.String r14 = r14.getName()
            java.lang.String r1 = "thumbnail.jpg"
            boolean r14 = p310qd.AbstractC10819z.m23230C(r1, r14, r5)
            if (r14 == 0) goto Ld3
            com.friday.paint.viewmodel.NoteViewModel r14 = r13.f10539g
            com.friday.common.dao.ResourceDao r6 = com.friday.paint.viewmodel.NoteViewModel.m7704h(r14)
            java.io.File r14 = r13.f10538f
            java.lang.String r7 = r14.getAbsolutePath()
            kotlin.jvm.internal.AbstractC9979u.m20293f(r7, r4)
            r13.f10537e = r5
            r8 = 0
            r11 = 2
            r12 = 0
            r10 = r13
            java.lang.Object r14 = com.friday.common.dao.ResourceDao.m5082u(r6, r7, r8, r10, r11, r12)
            r9 = r10
            if (r14 != r0) goto L73
            goto Ld2
        L73:
            com.friday.common.entity.ResourceEntity r14 = (com.friday.common.entity.ResourceEntity) r14
            java.io.File r1 = r9.f10538f
            java.lang.String r1 = com.blankj.utilcode.util.FileUtils.getFileMD5ToString(r1)
            if (r14 == 0) goto Ld3
            java.lang.String r5 = r14.getMd5()
            boolean r5 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r5)
            if (r5 != 0) goto Ld3
            com.friday.paint.viewmodel.NoteViewModel r5 = r9.f10539g
            com.friday.common.dao.ResourceDao r5 = com.friday.paint.viewmodel.NoteViewModel.m7704h(r5)
            java.io.File r6 = r9.f10538f
            java.lang.String r6 = r6.getAbsolutePath()
            kotlin.jvm.internal.AbstractC9979u.m20293f(r6, r4)
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r14)
            r9.f10535c = r7
            r9.f10536d = r1
            r9.f10537e = r3
            java.lang.Object r3 = r5.mo5089D(r6, r13)
            if (r3 != r0) goto La7
            goto Ld2
        La7:
            r3 = r14
            goto L34
        La9:
            com.friday.paint.viewmodel.NoteViewModel r14 = r9.f10539g
            com.friday.common.dao.ResourceDao r5 = com.friday.paint.viewmodel.NoteViewModel.m7704h(r14)
            java.io.File r14 = r9.f10538f
            java.lang.String r6 = r14.getAbsolutePath()
            kotlin.jvm.internal.AbstractC9979u.m20293f(r6, r4)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r7)
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r3)
            r9.f10535c = r14
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r7)
            r9.f10536d = r14
            r9.f10537e = r2
            r8 = 0
            r10 = 4
            r11 = 0
            java.lang.Object r14 = com.friday.common.dao.ResourceDao.m5085z(r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r0) goto Ld3
        Ld2:
            return r0
        Ld3:
            qc.q r14 = p309qc.C10786q.f26013a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NoteViewModel$saveThumbnail$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1.smali:134
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$saveThumbnail$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
