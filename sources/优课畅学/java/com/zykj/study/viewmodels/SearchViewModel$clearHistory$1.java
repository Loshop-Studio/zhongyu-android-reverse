package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel$clearHistory$1", m17801f = "SearchViewModel.kt", m17802l = {69, 70}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SearchViewModel$clearHistory$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14354a;

    /* renamed from: b */
    public int f14355b;

    /* renamed from: c */
    public int f14356c;

    /* renamed from: d */
    public final /* synthetic */ SearchViewModel f14357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$clearHistory$1(SearchViewModel searchViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14357d = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SearchViewModel$clearHistory$1(this.f14357d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SearchViewModel$clearHistory$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r1.m10389b(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.f14356c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.f14354a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L4c
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            kotlin.AbstractC9079b.m15926b(r5)
            goto L30
        L22:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.study.viewmodels.SearchViewModel r5 = r4.f14357d
            r4.f14356c = r3
            java.lang.Object r5 = com.zykj.study.viewmodels.SearchViewModel.m12243a(r5, r4)
            if (r5 != r0) goto L30
            goto L4b
        L30:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L4c
            com.zykj.study.viewmodels.SearchViewModel r1 = r4.f14357d
            com.zykj.study.repository.SearchHistoryRepository r1 = r1.m12247d()
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r5)
            r4.f14354a = r3
            r3 = 0
            r4.f14355b = r3
            r4.f14356c = r2
            java.lang.Object r5 = r1.m10389b(r5, r4)
            if (r5 != r0) goto L4c
        L4b:
            return r0
        L4c:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.SearchViewModel$clearHistory$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/SearchViewModel$clearHistory$1.smali:123
    }
}
