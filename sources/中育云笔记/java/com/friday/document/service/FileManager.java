package com.friday.document.service;

import be.AbstractC5194f;
import be.InterfaceC5189a;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.ResourceDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.network.StudentSession;
import com.friday.common.util.SyncException;
import com.friday.document.model.ShareFile;
import com.friday.document.sync.SyncStateOne;
import com.friday.document.sync.SyncStateThree;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p040c2.InterfaceC5250g2;
import p110d2.InterfaceC8919i;
import p200j2.InterfaceC9664d;
import p200j2.InterfaceC9667g;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FileManager implements InterfaceC9664d {

    /* renamed from: n */
    public static final C5992a f6730n = new C5992a(null);

    /* renamed from: o */
    public static final int f6731o = 8;

    /* renamed from: a */
    public final InterfaceC8919i f6732a;

    /* renamed from: b */
    public final StudentSession f6733b;

    /* renamed from: c */
    public final FileDao f6734c;

    /* renamed from: d */
    public final ResourceDao f6735d;

    /* renamed from: e */
    public final InterfaceC9667g f6736e;

    /* renamed from: f */
    public final SyncStateOne f6737f;

    /* renamed from: g */
    public final SyncStateThree f6738g;

    /* renamed from: h */
    public final InterfaceC5250g2 f6739h;

    /* renamed from: i */
    public final InterfaceC11122i0 f6740i;

    /* renamed from: j */
    public final String f6741j;

    /* renamed from: k */
    public InterfaceC10045g f6742k;

    /* renamed from: l */
    public final InterfaceC5189a f6743l;

    /* renamed from: m */
    public long f6744m;

    /* renamed from: com.friday.document.service.FileManager$a */
    public static final class C5992a {
        public /* synthetic */ C5992a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5992a() {
        }
    }

    public FileManager(InterfaceC8919i service, StudentSession studentSession, FileDao fileDao, ResourceDao resourceDao, InterfaceC9667g noteHelper, SyncStateOne syncStateOne, SyncStateThree syncStateThree, InterfaceC5250g2 shareCacheDao, InterfaceC11122i0 externalScope) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(studentSession, "studentSession");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(resourceDao, "resourceDao");
        AbstractC9979u.m20294g(noteHelper, "noteHelper");
        AbstractC9979u.m20294g(syncStateOne, "syncStateOne");
        AbstractC9979u.m20294g(syncStateThree, "syncStateThree");
        AbstractC9979u.m20294g(shareCacheDao, "shareCacheDao");
        AbstractC9979u.m20294g(externalScope, "externalScope");
        this.f6732a = service;
        this.f6733b = studentSession;
        this.f6734c = fileDao;
        this.f6735d = resourceDao;
        this.f6736e = noteHelper;
        this.f6737f = syncStateOne;
        this.f6738g = syncStateThree;
        this.f6739h = shareCacheDao;
        this.f6740i = externalScope;
        C5962b.a aVar = C5962b.f6082a;
        String strM5286n = aVar.m5299a().m5286n();
        String str = File.separator;
        this.f6741j = strM5286n + str + aVar.m5299a().m5281i() + str;
        this.f6743l = AbstractC5194f.m2745b(false, 1, null);
    }

    /* renamed from: A */
    public final boolean m5596A(String str) {
        return AbstractC10819z.m23228A(str, "jpg", true) || AbstractC10819z.m23228A(str, "png", true) || AbstractC10819z.m23228A(str, "webp", true);
    }

    /* renamed from: B */
    public final boolean m5597B(FileEntity fileEntity) {
        if (AbstractC9979u.m20289b(fileEntity.getParentId(), "0")) {
            return false;
        }
        int state = fileEntity.getState();
        return state == 1 || state == 2 || state == 4 || state == 5 || state == 10;
    }

    /* renamed from: C */
    public final Object m5598C(List list, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$newDownloadOnShare$2(this, list, shareFile, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: D */
    public final Object m5599D(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        int state = fileEntity.getState();
        if (state != 1 && state != 2) {
            if (state != 3) {
                if (state != 4 && state != 5 && state != 10) {
                    if (state != 30) {
                        return C10786q.f26013a;
                    }
                }
            }
            Object objM5656a = this.f6738g.m5656a(fileEntity, interfaceC11588c);
            return objM5656a == AbstractC11725a.m25952f() ? objM5656a : C10786q.f26013a;
        }
        Object objM5641l = this.f6737f.m5641l(fileEntity, interfaceC11588c);
        return objM5641l == AbstractC11725a.m25952f() ? objM5641l : C10786q.f26013a;
    }

    /* renamed from: E */
    public final void m5600E() {
        if (this.f6742k != null) {
            return;
        }
        this.f6742k = AbstractC11117h.m24726d(this.f6740i, null, null, new FileManager$runAsync$1(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r2 == r4) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.friday.document.service.FileManager] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0134 -> B:48:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01b8 -> B:62:0x01bd). Please report as a decompilation issue!!! */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5601F(com.friday.common.entity.FileEntity r18, vc.InterfaceC11588c r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5601F(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:879
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
    
        if (m5603H(r10, r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce A[Catch: SyncException -> 0x0057, PHI: r2 r10
      0x00ce: PHI (r2v9 com.friday.common.entity.FileEntity) = (r2v8 com.friday.common.entity.FileEntity), (r2v13 com.friday.common.entity.FileEntity) binds: [B:45:0x00cb, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r10v7 com.friday.common.entity.FileEntity) = (r10v6 com.friday.common.entity.FileEntity), (r10v15 com.friday.common.entity.FileEntity) binds: [B:45:0x00cb, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {SyncException -> 0x0057, blocks: (B:19:0x0052, B:24:0x0065, B:47:0x00ce, B:44:0x00bd), top: B:62:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.lang.Object] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5602G(com.friday.common.entity.FileEntity r10, vc.InterfaceC11588c r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5602G(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:1901
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (m5605J(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5603H(com.friday.common.entity.FileEntity r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.friday.document.service.FileManager$syncSingleFileWithoutParents$1
            if (r0 == 0) goto L13
            r0 = r7
            com.friday.document.service.FileManager$syncSingleFileWithoutParents$1 r0 = (com.friday.document.service.FileManager$syncSingleFileWithoutParents$1) r0
            int r1 = r0.f6885g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6885g = r1
            goto L18
        L13:
            com.friday.document.service.FileManager$syncSingleFileWithoutParents$1 r0 = new com.friday.document.service.FileManager$syncSingleFileWithoutParents$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6883e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6885g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f6882d
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            java.lang.Object r6 = r0.f6881c
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            kotlin.AbstractC9924b.m20071b(r7)
            goto L7b
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f6881c
            com.friday.common.entity.FileEntity r6 = (com.friday.common.entity.FileEntity) r6
            kotlin.AbstractC9924b.m20071b(r7)
            goto L58
        L44:
            kotlin.AbstractC9924b.m20071b(r7)
            com.friday.common.dao.FileDao r7 = r5.f6734c
            java.lang.String r2 = r6.getFileId()
            r0.f6881c = r6
            r0.f6885g = r4
            java.lang.Object r7 = r7.mo4941r(r2, r0)
            if (r7 != r1) goto L58
            goto L7a
        L58:
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            if (r7 != 0) goto L5d
            r7 = r6
        L5d:
            int r2 = r7.getState()
            if (r2 != 0) goto L66
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L66:
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f6881c = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f6882d = r6
            r0.f6885g = r3
            java.lang.Object r6 = r5.m5605J(r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5603H(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:2505
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5604I(java.lang.String r7, long r8, vc.InterfaceC11588c r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5604I(java.lang.String, long, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:2781
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ec -> B:18:0x0051). Please report as a decompilation issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5605J(com.friday.common.entity.FileEntity r13, vc.InterfaceC11588c r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5605J(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:3356
    }

    /* renamed from: K */
    public final long m5606K() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(r11, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5607L(vc.InterfaceC11588c r15) throws java.lang.Throwable {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.friday.document.service.FileManager$waitForSyncInterval$1
            if (r0 == 0) goto L13
            r0 = r15
            com.friday.document.service.FileManager$waitForSyncInterval$1 r0 = (com.friday.document.service.FileManager$waitForSyncInterval$1) r0
            int r1 = r0.f6907j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6907j = r1
            goto L18
        L13:
            com.friday.document.service.FileManager$waitForSyncInterval$1 r0 = new com.friday.document.service.FileManager$waitForSyncInterval$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f6905h
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6907j
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.f6900c
            be.a r0 = (be.InterfaceC5189a) r0
            kotlin.AbstractC9924b.m20071b(r15)     // Catch: java.lang.Throwable -> L32
            goto L84
        L32:
            r15 = move-exception
            goto L92
        L34:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3c:
            int r2 = r0.f6901d
            java.lang.Object r5 = r0.f6900c
            be.a r5 = (be.InterfaceC5189a) r5
            kotlin.AbstractC9924b.m20071b(r15)
            r15 = r5
            goto L5a
        L47:
            kotlin.AbstractC9924b.m20071b(r15)
            be.a r15 = r14.f6743l
            r0.f6900c = r15
            r0.f6901d = r3
            r0.f6907j = r5
            java.lang.Object r2 = r15.lock(r6, r0)
            if (r2 != r1) goto L59
            goto L7d
        L59:
            r2 = r3
        L5a:
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7e
            long r9 = r14.f6744m     // Catch: java.lang.Throwable -> L7e
            long r9 = r7 - r9
            r11 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 - r9
            r9 = 0
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 <= 0) goto L83
            r0.f6900c = r15     // Catch: java.lang.Throwable -> L7e
            r0.f6901d = r2     // Catch: java.lang.Throwable -> L7e
            r0.f6902e = r3     // Catch: java.lang.Throwable -> L7e
            r0.f6903f = r7     // Catch: java.lang.Throwable -> L7e
            r0.f6904g = r11     // Catch: java.lang.Throwable -> L7e
            r0.f6907j = r4     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.m20376b(r11, r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L83
        L7d:
            return r1
        L7e:
            r0 = move-exception
            r13 = r0
            r0 = r15
            r15 = r13
            goto L92
        L83:
            r0 = r15
        L84:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
            r14.f6744m = r1     // Catch: java.lang.Throwable -> L32
            qc.q r15 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L32
            r0.unlock(r6)
            qc.q r15 = p309qc.C10786q.f26013a
            return r15
        L92:
            r0.unlock(r6)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5607L(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:3948
    }

    @Override // p200j2.InterfaceC9664d
    /* renamed from: a */
    public Object mo5608a(List list, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$newDownload$2(fileEntity, this, list, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    @Override // p200j2.InterfaceC9664d
    /* renamed from: b */
    public Object mo5609b(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$downloadTxt$2(fileEntity, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    @Override // p200j2.InterfaceC9664d
    /* renamed from: c */
    public Object mo5610c(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$downloadFile$2(fileEntity, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r8.mo4931b0(r2, true, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p200j2.InterfaceC9664d
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5611d(com.friday.common.entity.FileEntity r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.friday.document.service.FileManager$downloadMicroClass$1
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.document.service.FileManager$downloadMicroClass$1 r0 = (com.friday.document.service.FileManager$downloadMicroClass$1) r0
            int r1 = r0.f6794f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6794f = r1
            goto L18
        L13:
            com.friday.document.service.FileManager$downloadMicroClass$1 r0 = new com.friday.document.service.FileManager$downloadMicroClass$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6792d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6794f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f6791c
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f6791c
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            kotlin.AbstractC9924b.m20071b(r8)
            goto L58
        L40:
            kotlin.AbstractC9924b.m20071b(r8)
            sd.e0 r8 = sd.C11157r0.m24799b()
            com.friday.document.service.FileManager$downloadMicroClass$2 r2 = new com.friday.document.service.FileManager$downloadMicroClass$2
            r5 = 0
            r2.<init>(r7, r5)
            r0.f6791c = r7
            r0.f6794f = r4
            java.lang.Object r8 = sd.AbstractC11109f.m24709g(r8, r2, r0)
            if (r8 != r1) goto L58
            goto L6c
        L58:
            com.friday.common.dao.FileDao r8 = r6.f6734c
            java.lang.String r2 = r7.getFileId()
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f6791c = r7
            r0.f6794f = r3
            java.lang.Object r7 = r8.mo4931b0(r2, r4, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.mo5611d(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:4457
    }

    @Override // p200j2.InterfaceC9664d
    /* renamed from: e */
    public Object mo5612e(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$downloadOffice$2(fileEntity, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    @Override // p200j2.InterfaceC9664d
    /* renamed from: f */
    public Object mo5613f(FileEntity fileEntity, String str, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$repairMissingImagesByPageDir$2(this, fileEntity, str, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:12:0x0040, B:27:0x00a8, B:28:0x00ae, B:30:0x00b4, B:32:0x00c0, B:33:0x00c8), top: B:43:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:38:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a3 -> B:27:0x00a8). Please report as a decompilation issue!!! */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5614s(java.util.List r13, vc.InterfaceC11588c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5614s(java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:4811
    }

    /* renamed from: t */
    public final void m5615t() {
        InterfaceC10045g interfaceC10045g = this.f6742k;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f6742k = null;
    }

    /* renamed from: u */
    public final Object m5616u(FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$downloadCover$2(fileEntity, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: v */
    public final Object m5617v(ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new FileManager$downloadFileOnShare$2(shareFile, this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:23:0x0083). Please report as a decompilation issue!!! */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5618w(com.friday.common.entity.FileEntity r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5618w(com.friday.common.entity.FileEntity, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:5504
    }

    /* renamed from: x */
    public final List m5619x(List originList) {
        AbstractC9979u.m20294g(originList, "originList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : originList) {
            Integer numValueOf = Integer.valueOf(((ResourceEntity) obj).getPageIndex());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (AbstractC10819z.m23229B(((ResourceEntity) it.next()).getId(), ".mdb", false, 2, null)) {
                        int size = list.size();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list) {
                            ResourceEntity resourceEntity = (ResourceEntity) obj2;
                            if (m5596A(resourceEntity.getId()) || AbstractC10819z.m23228A(resourceEntity.getId(), ".mdb", true) || AbstractC10819z.m23228A(resourceEntity.getId(), "snapshot.bin", true)) {
                                arrayList3.add(obj2);
                            }
                        }
                        arrayList2.addAll(arrayList3);
                        LogUtils.m3888i("页面 FileManager.kt -> getFinalDownloadList，按新笔记规则过滤，第" + iIntValue + "页，原始数量=" + size + "，保留数量=" + arrayList3.size());
                    }
                }
            }
            LogUtils.m3888i("页面 FileManager.kt -> getFinalDownloadList，按旧笔记规则保留，第" + iIntValue + "页，数量=" + list.size());
            arrayList2.addAll(list);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        if (r2.mo4934f(r4, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        if (r2.mo4903A(r3, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5620y(com.friday.common.entity.FileEntity r10, java.lang.Exception r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.service.FileManager.m5620y(com.friday.common.entity.FileEntity, java.lang.Exception, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/service/FileManager.smali:6679
    }

    /* renamed from: z */
    public final boolean m5621z(Exception exc) {
        SyncException syncException = exc instanceof SyncException ? (SyncException) exc : null;
        return (syncException != null && syncException.m5377c()) || SyncException.C5972a.m5379b(SyncException.f6168e, null, exc.getMessage(), 1, null);
    }
}
