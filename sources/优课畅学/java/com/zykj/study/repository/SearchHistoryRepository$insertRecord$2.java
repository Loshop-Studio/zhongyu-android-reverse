package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.SearchHistoryRepository$insertRecord$2", m17801f = "SearchHistoryRepository.kt", m17802l = {37, 43}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SearchHistoryRepository$insertRecord$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f11502a;

    /* renamed from: b */
    public Object f11503b;

    /* renamed from: c */
    public int f11504c;

    /* renamed from: d */
    public int f11505d;

    /* renamed from: e */
    public final /* synthetic */ SearchHistoryRepository f11506e;

    /* renamed from: f */
    public final /* synthetic */ String f11507f;

    /* renamed from: g */
    public final /* synthetic */ String f11508g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$insertRecord$2(SearchHistoryRepository searchHistoryRepository, String str, String str2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11506e = searchHistoryRepository;
        this.f11507f = str;
        this.f11508g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SearchHistoryRepository$insertRecord$2(this.f11506e, this.f11507f, this.f11508g, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SearchHistoryRepository$insertRecord$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r3.delete(r11, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r10.f11505d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L30
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r10.f11503b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r10.f11502a
            java.util.List r0 = (java.util.List) r0
            kotlin.AbstractC9079b.m15926b(r11)
            goto Lbb
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            java.lang.Object r1 = r10.f11503b
            com.zykj.study.data.SearchHistoryEntity r1 = (com.zykj.study.data.SearchHistoryEntity) r1
            java.lang.Object r1 = r10.f11502a
            java.util.List r1 = (java.util.List) r1
            kotlin.AbstractC9079b.m15926b(r11)
            goto L8d
        L30:
            kotlin.AbstractC9079b.m15926b(r11)
            com.zykj.study.repository.SearchHistoryRepository r11 = r10.f11506e
            com.zykj.study.data.SearchHistoryEntityDao r11 = com.zykj.study.repository.SearchHistoryRepository.m10388a(r11)
            java.lang.String r1 = r10.f11507f
            java.util.List r1 = r11.getList(r1)
            java.lang.String r11 = r10.f11508g
            java.util.Iterator r5 = r1.iterator()
        L45:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5d
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.zykj.study.data.SearchHistoryEntity r7 = (com.zykj.study.data.SearchHistoryEntity) r7
            java.lang.String r7 = r7.getSearchKey()
            boolean r7 = kotlin.jvm.internal.AbstractC9133u.m16128b(r7, r11)
            if (r7 == 0) goto L45
            goto L5e
        L5d:
            r6 = 0
        L5e:
            com.zykj.study.repository.SearchHistoryRepository r11 = r10.f11506e
            java.lang.String r5 = r10.f11507f
            java.lang.String r7 = r10.f11508g
            com.zykj.study.data.SearchHistoryEntity r6 = (com.zykj.study.data.SearchHistoryEntity) r6
            if (r6 != 0) goto L8d
            com.zykj.study.data.SearchHistoryEntityDao r11 = com.zykj.study.repository.SearchHistoryRepository.m10388a(r11)
            com.zykj.study.data.SearchHistoryEntity r8 = new com.zykj.study.data.SearchHistoryEntity
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            r8.<init>(r4, r5, r7, r9)
            com.zykj.study.data.SearchHistoryEntity[] r5 = new com.zykj.study.data.SearchHistoryEntity[]{r8}
            r10.f11502a = r1
            java.lang.Object r6 = p201o7.AbstractC9543h.m17814a(r6)
            r10.f11503b = r6
            r10.f11504c = r4
            r10.f11505d = r3
            java.lang.Object r11 = r11.insert(r5, r10)
            if (r11 != r0) goto L8d
            goto Lba
        L8d:
            int r11 = r1.size()
            r3 = 10
            if (r11 <= r3) goto Lbb
            int r11 = r1.size()
            int r11 = r11 - r3
            java.util.List r11 = r1.subList(r4, r11)
            com.zykj.study.repository.SearchHistoryRepository r3 = r10.f11506e
            com.zykj.study.data.SearchHistoryEntityDao r3 = com.zykj.study.repository.SearchHistoryRepository.m10388a(r3)
            java.lang.Object r1 = p201o7.AbstractC9543h.m17814a(r1)
            r10.f11502a = r1
            java.lang.Object r1 = p201o7.AbstractC9543h.m17814a(r11)
            r10.f11503b = r1
            r10.f11504c = r4
            r10.f11505d = r2
            java.lang.Object r11 = r3.delete(r11, r10)
            if (r11 != r0) goto Lbb
        Lba:
            return r0
        Lbb:
            h7.p r11 = p123h7.C8736p.f16368a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.SearchHistoryRepository$insertRecord$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/SearchHistoryRepository$insertRecord$2.smali:145
    }
}
