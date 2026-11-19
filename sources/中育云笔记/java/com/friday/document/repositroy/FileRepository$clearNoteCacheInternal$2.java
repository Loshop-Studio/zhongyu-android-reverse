package com.friday.document.repositroy;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.repositroy.FileRepository$clearNoteCacheInternal$2", m26211f = "FileRepository.kt", m26212l = {32, 41, 43, 47}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileRepository$clearNoteCacheInternal$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6708c;

    /* renamed from: d */
    public Object f6709d;

    /* renamed from: e */
    public Object f6710e;

    /* renamed from: f */
    public int f6711f;

    /* renamed from: g */
    public final /* synthetic */ FileEntity f6712g;

    /* renamed from: h */
    public final /* synthetic */ FileRepository f6713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileRepository$clearNoteCacheInternal$2(FileEntity fileEntity, FileRepository fileRepository, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6712g = fileEntity;
        this.f6713h = fileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileRepository$clearNoteCacheInternal$2(this.f6712g, this.f6713h, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r0.mo5094O(r11, r12) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        r2 = r1;
        r0 = r10;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        if (com.friday.common.dao.ResourceDao.m5076U(r0, r1, 0, r12, 2, null) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        if (r3.mo4949z(r5, r12) != r7) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.repositroy.FileRepository$clearNoteCacheInternal$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2.smali:137
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileRepository$clearNoteCacheInternal$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
