package com.friday.document.service;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.service.FileManager$downloadOffice$2", m26211f = "FileManager.kt", m26212l = {355, 356, 362, 371, 372}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileManager$downloadOffice$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6797c;

    /* renamed from: d */
    public Object f6798d;

    /* renamed from: e */
    public Object f6799e;

    /* renamed from: f */
    public boolean f6800f;

    /* renamed from: g */
    public int f6801g;

    /* renamed from: h */
    public final /* synthetic */ FileEntity f6802h;

    /* renamed from: i */
    public final /* synthetic */ FileManager f6803i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$downloadOffice$2(FileEntity fileEntity, FileManager fileManager, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6802h = fileEntity;
        this.f6803i = fileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileManager$downloadOffice$2(this.f6802h, this.f6803i, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x013a, code lost:
    
        if (r5.mo4931b0(r7, true, r14) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b5, code lost:
    
        if (r5.mo4931b0(r7, true, r14) != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a A[PHI: r1 r2 r3
      0x011a: PHI (r1v8 boolean) = (r1v7 boolean), (r1v14 boolean) binds: [B:25:0x0116, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:25:0x0116, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r3v9 java.lang.String) = (r3v8 java.lang.String), (r3v16 java.lang.String) binds: [B:25:0x0116, B:14:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager$downloadOffice$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager$downloadOffice$2.smali:140
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileManager$downloadOffice$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
