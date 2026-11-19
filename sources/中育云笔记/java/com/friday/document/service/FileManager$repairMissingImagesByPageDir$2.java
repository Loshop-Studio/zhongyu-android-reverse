package com.friday.document.service;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$repairMissingImagesByPageDir$2", m26211f = "FileManager.kt", m26212l = {580, 581}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$repairMissingImagesByPageDir$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6845c;

    /* renamed from: d */
    public int f6846d;

    /* renamed from: e */
    public final /* synthetic */ FileManager f6847e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f6848f;

    /* renamed from: g */
    public final /* synthetic */ String f6849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$repairMissingImagesByPageDir$2(FileManager fileManager, FileEntity fileEntity, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6847e = fileManager;
        this.f6848f = fileEntity;
        this.f6849g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$repairMissingImagesByPageDir$2(this.f6847e, this.f6848f, this.f6849g, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r3.m5574k(r4, r5, r6, r7, r8) == r0) goto L15;
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
            int r1 = r11.f6846d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r11.f6845c
            java.util.List r0 = (java.util.List) r0
            kotlin.AbstractC9924b.m20071b(r12)
            goto L5e
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            kotlin.AbstractC9924b.m20071b(r12)
            r8 = r11
            goto L40
        L23:
            kotlin.AbstractC9924b.m20071b(r12)
            com.friday.document.service.FileManager r12 = r11.f6847e
            com.friday.common.dao.ResourceDao r4 = com.friday.document.service.FileManager.m5588k(r12)
            com.friday.common.entity.FileEntity r12 = r11.f6848f
            java.lang.String r5 = r12.getFileId()
            r11.f6846d = r3
            r6 = 0
            r9 = 2
            r10 = 0
            r8 = r11
            java.lang.Object r12 = com.friday.common.dao.ResourceDao.m5077c(r4, r5, r6, r8, r9, r10)
            if (r12 != r0) goto L40
            goto L5d
        L40:
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            com.friday.document.repair.CommandImageRepairer r3 = com.friday.document.repair.CommandImageRepairer.f6666a
            com.friday.common.entity.FileEntity r4 = r8.f6848f
            java.lang.String r5 = r8.f6849g
            com.friday.document.service.FileManager r12 = r8.f6847e
            com.friday.common.dao.ResourceDao r7 = com.friday.document.service.FileManager.m5588k(r12)
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r6)
            r8.f6845c = r12
            r8.f6846d = r2
            java.lang.Object r12 = r3.m5574k(r4, r5, r6, r7, r8)
            if (r12 != r0) goto L5e
        L5d:
            return r0
        L5e:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$repairMissingImagesByPageDir$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$repairMissingImagesByPageDir$2.smali:141
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$repairMissingImagesByPageDir$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
