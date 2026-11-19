package com.friday.common.dao;

import androidx.paging.PagingSource;
import com.friday.common.entity.FileEntity;
import com.friday.common.entity.RestoreResponse;
import java.util.Iterator;
import java.util.List;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface FileDao {
    /* renamed from: G */
    static /* synthetic */ Object m4896G(FileDao fileDao, String str, int i10, boolean z10, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSync");
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return fileDao.mo4935l(str, i10, z10, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m4897d(com.friday.common.dao.FileDao r9, java.util.List r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof com.friday.common.dao.FileDao$markCacheStateAsFalse$1
            if (r0 == 0) goto L13
            r0 = r11
            com.friday.common.dao.FileDao$markCacheStateAsFalse$1 r0 = (com.friday.common.dao.FileDao$markCacheStateAsFalse$1) r0
            int r1 = r0.f5798m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5798m = r1
            goto L18
        L13:
            com.friday.common.dao.FileDao$markCacheStateAsFalse$1 r0 = new com.friday.common.dao.FileDao$markCacheStateAsFalse$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f5796k
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f5798m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            int r9 = r0.f5794i
            java.lang.Object r10 = r0.f5793h
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f5791f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f5790e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r5 = r0.f5789d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f5788c
            com.friday.common.dao.FileDao r6 = (com.friday.common.dao.FileDao) r6
            kotlin.AbstractC9924b.m20071b(r11)
            r11 = r5
            r5 = r2
            r2 = r10
            r10 = r9
            r9 = r6
            goto L5a
        L45:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4d:
            kotlin.AbstractC9924b.m20071b(r11)
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r2 = r11.iterator()
            r5 = r11
            r11 = r10
            r10 = r4
        L5a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L90
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r0.f5788c = r9
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r11)
            r0.f5789d = r8
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f5790e = r8
            r0.f5791f = r2
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f5792g = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f5793h = r6
            r0.f5794i = r10
            r0.f5795j = r4
            r0.f5798m = r3
            java.lang.Object r6 = r9.mo4931b0(r7, r4, r0)
            if (r6 != r1) goto L5a
            return r1
        L90:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.FileDao.m4897d(com.friday.common.dao.FileDao, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/FileDao.smali:55
    }

    /* renamed from: g */
    static /* synthetic */ Object m4898g(FileDao fileDao, String str, int i10, boolean z10, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateVersionAndSync");
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return fileDao.mo4906D(str, i10, z10, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m4899h(com.friday.common.dao.FileDao r9, java.util.List r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof com.friday.common.dao.FileDao$insertFileList$1
            if (r0 == 0) goto L13
            r0 = r11
            com.friday.common.dao.FileDao$insertFileList$1 r0 = (com.friday.common.dao.FileDao$insertFileList$1) r0
            int r1 = r0.f5787m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5787m = r1
            goto L18
        L13:
            com.friday.common.dao.FileDao$insertFileList$1 r0 = new com.friday.common.dao.FileDao$insertFileList$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f5785k
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f5787m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 != r4) goto L45
            int r9 = r0.f5783i
            java.lang.Object r10 = r0.f5782h
            com.friday.common.entity.FileEntity r10 = (com.friday.common.entity.FileEntity) r10
            java.lang.Object r10 = r0.f5780f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f5779e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r5 = r0.f5778d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f5777c
            com.friday.common.dao.FileDao r6 = (com.friday.common.dao.FileDao) r6
            kotlin.AbstractC9924b.m20071b(r11)
            r11 = r5
            r5 = r2
            r2 = r10
            r10 = r9
            r9 = r6
            goto L5a
        L45:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4d:
            kotlin.AbstractC9924b.m20071b(r11)
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r2 = r11.iterator()
            r5 = r11
            r11 = r10
            r10 = r3
        L5a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L90
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.friday.common.entity.FileEntity r7 = (com.friday.common.entity.FileEntity) r7
            r0.f5777c = r9
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r11)
            r0.f5778d = r8
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f5779e = r8
            r0.f5780f = r2
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f5781g = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f5782h = r6
            r0.f5783i = r10
            r0.f5784j = r3
            r0.f5787m = r4
            java.lang.Object r6 = r9.mo4910I(r7, r0)
            if (r6 != r1) goto L5a
            return r1
        L90:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.FileDao.m4899h(com.friday.common.dao.FileDao, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/FileDao.smali:423
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:20:0x0076). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m4900i(com.friday.common.dao.FileDao r6, java.lang.String r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.friday.common.dao.FileDao$getAllParentIdById$1
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.common.dao.FileDao$getAllParentIdById$1 r0 = (com.friday.common.dao.FileDao$getAllParentIdById$1) r0
            int r1 = r0.f5776i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5776i = r1
            goto L18
        L13:
            com.friday.common.dao.FileDao$getAllParentIdById$1 r0 = new com.friday.common.dao.FileDao$getAllParentIdById$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f5774g
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f5776i
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f5773f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f5772e
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f5771d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.f5770c
            com.friday.common.dao.FileDao r2 = (com.friday.common.dao.FileDao) r2
            kotlin.AbstractC9924b.m20071b(r8)
            r5 = r0
            r0 = r7
            r7 = r2
            r2 = r5
            goto L76
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.AbstractC9924b.m20071b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2 = r0
            r0 = r7
            r7 = r6
            r6 = r8
            r8 = r0
        L52:
            java.lang.String r4 = "0"
            boolean r4 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r4)
            if (r4 != 0) goto L80
            r6.add(r8)
            r2.f5770c = r7
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r0)
            r2.f5771d = r4
            r2.f5772e = r6
            java.lang.Object r4 = p409xc.AbstractC11833h.m26224a(r8)
            r2.f5773f = r4
            r2.f5776i = r3
            java.lang.Object r8 = r7.mo4941r(r8, r2)
            if (r8 != r1) goto L76
            return r1
        L76:
            com.friday.common.entity.FileEntity r8 = (com.friday.common.entity.FileEntity) r8
            if (r8 != 0) goto L7b
            return r6
        L7b:
            java.lang.String r8 = r8.getParentId()
            goto L52
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.FileDao.m4900i(com.friday.common.dao.FileDao, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/FileDao.smali:743
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ee -> B:31:0x00f2). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m4901j(com.friday.common.dao.FileDao r32, java.lang.String r33, java.lang.String r34, vc.InterfaceC11588c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.FileDao.m4901j(com.friday.common.dao.FileDao, java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/FileDao.smali:1027
    }

    /* renamed from: k */
    static /* synthetic */ Object m4902k(FileDao fileDao, List list, InterfaceC11588c interfaceC11588c) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RestoreResponse restoreResponse = (RestoreResponse) it.next();
            fileDao.mo4922U(restoreResponse.getFileId(), restoreResponse.getParentId(), restoreResponse.isRecycleBin(), restoreResponse.getExpirationTimeStamp(), restoreResponse.getUpdateTime(), restoreResponse.getVersion());
        }
        return C10786q.f26013a;
    }

    /* renamed from: A */
    Object mo4903A(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: B */
    Object mo4904B(String str, String str2, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: C */
    PagingSource mo4905C(String str, long j10);

    /* renamed from: D */
    Object mo4906D(String str, int i10, boolean z10, InterfaceC11588c interfaceC11588c);

    /* renamed from: E */
    default Object mo4907E(String str, InterfaceC11588c interfaceC11588c) {
        return m4900i(this, str, interfaceC11588c);
    }

    /* renamed from: F */
    PagingSource mo4908F(String str, long j10);

    /* renamed from: H */
    default Object mo4909H(List list, InterfaceC11588c interfaceC11588c) {
        return m4902k(this, list, interfaceC11588c);
    }

    /* renamed from: I */
    Object mo4910I(FileEntity fileEntity, InterfaceC11588c interfaceC11588c);

    /* renamed from: J */
    Object mo4911J(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: K */
    Object mo4912K(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: L */
    Object mo4913L(String str, String str2, int i10, String str3, InterfaceC11588c interfaceC11588c);

    /* renamed from: M */
    Object mo4914M(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: N */
    default Object mo4915N(List list, InterfaceC11588c interfaceC11588c) {
        return m4899h(this, list, interfaceC11588c);
    }

    /* renamed from: O */
    PagingSource mo4916O();

    /* renamed from: P */
    Object mo4917P(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: Q */
    PagingSource mo4918Q(String str, long j10);

    /* renamed from: R */
    List mo4919R(long j10);

    /* renamed from: S */
    Object mo4920S(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: T */
    List mo4921T(String str, long j10);

    /* renamed from: U */
    void mo4922U(String str, String str2, boolean z10, long j10, String str3, int i10);

    /* renamed from: V */
    Object mo4923V(List list, InterfaceC11588c interfaceC11588c);

    /* renamed from: W */
    Object mo4924W(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: X */
    Object mo4925X(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: Y */
    Object mo4926Y(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: Z */
    Object mo4927Z(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: a */
    Object mo4928a(String str, String str2, InterfaceC11588c interfaceC11588c);

    /* renamed from: a0 */
    Object mo4929a0(String str, String str2, int i10, String str3, InterfaceC11588c interfaceC11588c);

    /* renamed from: b */
    Object mo4930b(String str, String str2, int i10, String str3, boolean z10, InterfaceC11588c interfaceC11588c);

    /* renamed from: b0 */
    Object mo4931b0(String str, boolean z10, InterfaceC11588c interfaceC11588c);

    /* renamed from: c */
    Object mo4932c(String str, String str2, InterfaceC11588c interfaceC11588c);

    /* renamed from: e */
    Object mo4933e(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: f */
    Object mo4934f(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: l */
    Object mo4935l(String str, int i10, boolean z10, InterfaceC11588c interfaceC11588c);

    /* renamed from: m */
    Object mo4936m(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: n */
    Object mo4937n(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: o */
    PagingSource mo4938o(long j10);

    /* renamed from: p */
    default Object mo4939p(String str, String str2, InterfaceC11588c interfaceC11588c) {
        return m4901j(this, str, str2, interfaceC11588c);
    }

    /* renamed from: q */
    Object mo4940q(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: r */
    Object mo4941r(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: s */
    Object mo4942s(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: t */
    Object mo4943t(String str, String str2, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: u */
    Object mo4944u(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: v */
    Object mo4945v(String str, String str2, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: w */
    PagingSource mo4946w(String str, long j10);

    /* renamed from: x */
    Object mo4947x(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: y */
    Object mo4948y(String str, List list, int i10, String str2, InterfaceC11588c interfaceC11588c);

    /* renamed from: z */
    default Object mo4949z(List list, InterfaceC11588c interfaceC11588c) {
        return m4897d(this, list, interfaceC11588c);
    }
}
