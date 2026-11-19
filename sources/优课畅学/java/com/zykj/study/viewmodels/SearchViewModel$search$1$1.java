package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel$search$1$1", m17801f = "SearchViewModel.kt", m17802l = {C3721BR.viewModel, C3721BR.webViewControlViewModel}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SearchViewModel$search$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14366a;

    /* renamed from: b */
    public int f14367b;

    /* renamed from: c */
    public int f14368c;

    /* renamed from: d */
    public final /* synthetic */ SearchViewModel f14369d;

    /* renamed from: e */
    public final /* synthetic */ String f14370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$search$1$1(SearchViewModel searchViewModel, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14369d = searchViewModel;
        this.f14370e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SearchViewModel$search$1$1(this.f14369d, this.f14370e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SearchViewModel$search$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1.m10392e(r3, r6, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14368c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r5.f14366a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4e
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L30
        L22:
            kotlin.AbstractC9079b.m15926b(r6)
            com.zykj.study.viewmodels.SearchViewModel r6 = r5.f14369d
            r5.f14368c = r3
            java.lang.Object r6 = com.zykj.study.viewmodels.SearchViewModel.m12243a(r6, r5)
            if (r6 != r0) goto L30
            goto L4d
        L30:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            com.zykj.study.viewmodels.SearchViewModel r1 = r5.f14369d
            java.lang.String r3 = r5.f14370e
            com.zykj.study.repository.SearchHistoryRepository r1 = r1.m12247d()
            java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r6)
            r5.f14366a = r4
            r4 = 0
            r5.f14367b = r4
            r5.f14368c = r2
            java.lang.Object r6 = r1.m10392e(r3, r6, r5)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.SearchViewModel$search$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/SearchViewModel$search$1$1.smali:133
    }
}
