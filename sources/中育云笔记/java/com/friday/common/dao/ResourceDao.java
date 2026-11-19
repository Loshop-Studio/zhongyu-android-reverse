package com.friday.common.dao;

import com.friday.common.entity.ResourceEntity;
import com.friday.common.helper.C5962b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface ResourceDao {
    /* renamed from: F */
    static /* synthetic */ Object m5068F(ResourceDao resourceDao, List list, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteResourceByOssUrlEmpty");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5093L(list, j10, interfaceC11588c);
    }

    /* renamed from: G */
    static /* synthetic */ Object m5069G(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPageIndex");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5097T(str, j10, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        if (r14.mo5102Z(r8, r5) == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x015b -> B:39:0x015e). Please report as a decompilation issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5070J(com.friday.common.dao.ResourceDao r16, java.lang.String r17, java.lang.String r18, long r19, vc.InterfaceC11588c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.ResourceDao.m5070J(com.friday.common.dao.ResourceDao, java.lang.String, java.lang.String, long, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/ResourceDao.smali:137
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5071K(com.friday.common.dao.ResourceDao r18, java.lang.String r19, java.util.Map r20, long r21, vc.InterfaceC11588c r23) throws java.lang.Throwable {
        /*
            r0 = r23
            boolean r1 = r0 instanceof com.friday.common.dao.ResourceDao$updatePageOrder$1
            if (r1 == 0) goto L17
            r1 = r0
            com.friday.common.dao.ResourceDao$updatePageOrder$1 r1 = (com.friday.common.dao.ResourceDao$updatePageOrder$1) r1
            int r2 = r1.f5892p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f5892p = r2
            r2 = r18
            goto L1e
        L17:
            com.friday.common.dao.ResourceDao$updatePageOrder$1 r1 = new com.friday.common.dao.ResourceDao$updatePageOrder$1
            r2 = r18
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f5890n
            java.lang.Object r3 = p393wc.AbstractC11725a.m25952f()
            int r4 = r1.f5892p
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            if (r4 != r6) goto L59
            int r2 = r1.f5887k
            long r7 = r1.f5886j
            java.lang.Object r4 = r1.f5885i
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r1.f5884h
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r1.f5883g
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r9 = r1.f5882f
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r1.f5881e
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r1.f5880d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.f5879c
            com.friday.common.dao.ResourceDao r12 = (com.friday.common.dao.ResourceDao) r12
            kotlin.AbstractC9924b.m20071b(r0)
            r13 = r1
            r1 = r9
            r0 = r10
            r16 = r7
            r8 = r11
            r7 = r12
            r11 = r16
            goto L77
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L61:
            kotlin.AbstractC9924b.m20071b(r0)
            java.util.Set r0 = r20.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = r19
            r11 = r21
            r4 = r0
            r13 = r1
            r7 = r2
            r2 = r5
            r0 = r20
            r1 = r0
        L77:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto Lc4
            java.lang.Object r9 = r4.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r9.getValue()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r13.f5879c = r7
            r13.f5880d = r8
            java.lang.Object r15 = p409xc.AbstractC11833h.m26224a(r0)
            r13.f5881e = r15
            java.lang.Object r15 = p409xc.AbstractC11833h.m26224a(r1)
            r13.f5882f = r15
            r13.f5883g = r4
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r9)
            r13.f5884h = r9
            java.lang.Object r9 = p409xc.AbstractC11833h.m26224a(r10)
            r13.f5885i = r9
            r13.f5886j = r11
            r13.f5887k = r2
            r13.f5888l = r5
            r13.f5889m = r14
            r13.f5892p = r6
            r9 = r10
            r10 = r14
            java.lang.Object r9 = r7.mo5112m(r8, r9, r10, r11, r13)
            if (r9 != r3) goto L77
            return r3
        Lc4:
            qc.q r0 = p309qc.C10786q.f26013a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.ResourceDao.m5071K(com.friday.common.dao.ResourceDao, java.lang.String, java.util.Map, long, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/ResourceDao.smali:891
    }

    /* renamed from: M */
    static /* synthetic */ Object m5072M(ResourceDao resourceDao, String str, int i10, long j10, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findResourcesByFileIdAndIndex");
        }
        if ((i11 & 4) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5105d(str, i10, j10, interfaceC11588c);
    }

    /* renamed from: N */
    static /* synthetic */ Object m5073N(ResourceDao resourceDao, List list, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: softDeleteResourceByOssUrlNotEmpty");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5104b(list, j10, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5074P(com.friday.common.dao.ResourceDao r9, java.util.List r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof com.friday.common.dao.ResourceDao$deleteResourceList$1
            if (r0 == 0) goto L13
            r0 = r11
            com.friday.common.dao.ResourceDao$deleteResourceList$1 r0 = (com.friday.common.dao.ResourceDao$deleteResourceList$1) r0
            int r1 = r0.f5866m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5866m = r1
            goto L18
        L13:
            com.friday.common.dao.ResourceDao$deleteResourceList$1 r0 = new com.friday.common.dao.ResourceDao$deleteResourceList$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f5864k
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f5866m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 != r4) goto L45
            int r9 = r0.f5862i
            java.lang.Object r10 = r0.f5861h
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f5859f
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f5858e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r5 = r0.f5857d
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f5856c
            com.friday.common.dao.ResourceDao r6 = (com.friday.common.dao.ResourceDao) r6
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
            java.lang.String r7 = (java.lang.String) r7
            r0.f5856c = r9
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r11)
            r0.f5857d = r8
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f5858e = r8
            r0.f5859f = r2
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f5860g = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f5861h = r6
            r0.f5862i = r10
            r0.f5863j = r3
            r0.f5866m = r4
            java.lang.Object r6 = r9.mo5102Z(r7, r0)
            if (r6 != r1) goto L5a
            return r1
        L90:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.ResourceDao.m5074P(com.friday.common.dao.ResourceDao, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/ResourceDao.smali:1462
    }

    /* renamed from: Q */
    static /* synthetic */ Object m5075Q(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAllResourceByFileId");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5118v(str, j10, interfaceC11588c);
    }

    /* renamed from: U */
    static /* synthetic */ Object m5076U(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteResourceByFileId");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5095R(str, j10, interfaceC11588c);
    }

    /* renamed from: c */
    static /* synthetic */ Object m5077c(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findResourcesByFileId");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5098V(str, j10, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[LOOP:0: B:28:0x00a1->B:30:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5078g(com.friday.common.dao.ResourceDao r10, java.util.List r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.ResourceDao.m5078g(com.friday.common.dao.ResourceDao, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/ResourceDao.smali:1977
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r5.mo5119x(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object m5079h(com.friday.common.dao.ResourceDao r5, java.lang.String r6, java.util.List r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.friday.common.dao.ResourceDao$syncResourceList$1
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.common.dao.ResourceDao$syncResourceList$1 r0 = (com.friday.common.dao.ResourceDao$syncResourceList$1) r0
            int r1 = r0.f5878h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5878h = r1
            goto L18
        L13:
            com.friday.common.dao.ResourceDao$syncResourceList$1 r0 = new com.friday.common.dao.ResourceDao$syncResourceList$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5876f
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f5878h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.f5875e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.f5874d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f5873c
            com.friday.common.dao.ResourceDao r5 = (com.friday.common.dao.ResourceDao) r5
            kotlin.AbstractC9924b.m20071b(r8)
            goto L83
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            java.lang.Object r5 = r0.f5875e
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r0.f5874d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f5873c
            com.friday.common.dao.ResourceDao r5 = (com.friday.common.dao.ResourceDao) r5
            kotlin.AbstractC9924b.m20071b(r8)
            goto L68
        L52:
            kotlin.AbstractC9924b.m20071b(r8)
            r0.f5873c = r5
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f5874d = r8
            r0.f5875e = r7
            r0.f5878h = r4
            java.lang.Object r8 = r5.mo5088C(r6, r0)
            if (r8 != r1) goto L68
            goto L82
        L68:
            java.lang.Object r8 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f5873c = r8
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r6)
            r0.f5874d = r6
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r7)
            r0.f5875e = r6
            r0.f5878h = r3
            java.lang.Object r5 = r5.mo5119x(r7, r0)
            if (r5 != r1) goto L83
        L82:
            return r1
        L83:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.dao.ResourceDao.m5079h(com.friday.common.dao.ResourceDao, java.lang.String, java.util.List, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/dao/ResourceDao.smali:2437
    }

    /* renamed from: n */
    static /* synthetic */ Object m5080n(ResourceDao resourceDao, String str, String str2, String str3, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectPicture");
        }
        if ((i10 & 8) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5111l(str, str2, str3, j10, interfaceC11588c);
    }

    /* renamed from: t */
    static /* synthetic */ Object m5081t(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findResourceByName");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5100X(str, j10, interfaceC11588c);
    }

    /* renamed from: u */
    static /* synthetic */ Object m5082u(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findResource");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5092I(str, j10, interfaceC11588c);
    }

    /* renamed from: w */
    static /* synthetic */ Object m5083w(ResourceDao resourceDao, List list, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getResourceByOssUrlNotEmpty");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5101Y(list, j10, interfaceC11588c);
    }

    /* renamed from: y */
    static /* synthetic */ Object m5084y(ResourceDao resourceDao, String str, long j10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findFailedResources");
        }
        if ((i10 & 2) != 0) {
            j10 = C5962b.f6082a.m5299a().m5292t();
        }
        return resourceDao.mo5106e(str, j10, interfaceC11588c);
    }

    /* renamed from: z */
    static /* synthetic */ Object m5085z(ResourceDao resourceDao, String str, String str2, String str3, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateResMD5AndUpdateTimeStamp");
        }
        if ((i10 & 4) != 0) {
            str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
            AbstractC9979u.m20293f(str3, "format(...)");
        }
        return resourceDao.mo5109j(str, str2, str3, interfaceC11588c);
    }

    /* renamed from: A */
    default Object mo5086A(String str, String str2, long j10, InterfaceC11588c interfaceC11588c) {
        return m5070J(this, str, str2, j10, interfaceC11588c);
    }

    /* renamed from: B */
    Object mo5087B(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: C */
    Object mo5088C(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: D */
    Object mo5089D(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: E */
    Object mo5090E(ResourceEntity resourceEntity, InterfaceC11588c interfaceC11588c);

    /* renamed from: H */
    Object mo5091H(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: I */
    Object mo5092I(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: L */
    Object mo5093L(List list, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: O */
    default Object mo5094O(List list, InterfaceC11588c interfaceC11588c) {
        return m5074P(this, list, interfaceC11588c);
    }

    /* renamed from: R */
    Object mo5095R(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: S */
    Object mo5096S(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: T */
    Object mo5097T(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: V */
    Object mo5098V(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: W */
    Object mo5099W(String str, int i10, InterfaceC11588c interfaceC11588c);

    /* renamed from: X */
    Object mo5100X(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: Y */
    Object mo5101Y(List list, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: Z */
    Object mo5102Z(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: a */
    Object mo5103a(String str, String str2, InterfaceC11588c interfaceC11588c);

    /* renamed from: b */
    Object mo5104b(List list, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: d */
    Object mo5105d(String str, int i10, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: e */
    Object mo5106e(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: f */
    Object mo5107f(String str, String str2, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: i */
    default Object mo5108i(List list, InterfaceC11588c interfaceC11588c) {
        return m5078g(this, list, interfaceC11588c);
    }

    /* renamed from: j */
    Object mo5109j(String str, String str2, String str3, InterfaceC11588c interfaceC11588c);

    /* renamed from: k */
    Object mo5110k(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: l */
    Object mo5111l(String str, String str2, String str3, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: m */
    Object mo5112m(String str, String str2, int i10, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: o */
    default Object mo5113o(String str, Map map, long j10, InterfaceC11588c interfaceC11588c) {
        return m5071K(this, str, map, j10, interfaceC11588c);
    }

    /* renamed from: p */
    Object mo5114p(String str, int i10, InterfaceC11588c interfaceC11588c);

    /* renamed from: q */
    Object mo5115q(String str, InterfaceC11588c interfaceC11588c);

    /* renamed from: r */
    Object mo5116r(String str, String str2, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: s */
    default Object mo5117s(String str, List list, InterfaceC11588c interfaceC11588c) {
        return m5079h(this, str, list, interfaceC11588c);
    }

    /* renamed from: v */
    Object mo5118v(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: x */
    Object mo5119x(List list, InterfaceC11588c interfaceC11588c);
}
