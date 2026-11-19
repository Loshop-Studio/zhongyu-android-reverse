package com.zykj.study.viewmodels;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel$initHistoryList$1", m17801f = "SearchViewModel.kt", m17802l = {48}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SearchViewModel$initHistoryList$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14364a;

    /* renamed from: b */
    public final /* synthetic */ SearchViewModel f14365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$initHistoryList$1(SearchViewModel searchViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14365b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SearchViewModel$initHistoryList$1(this.f14365b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SearchViewModel$initHistoryList$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14364a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            SearchViewModel searchViewModel = this.f14365b;
            this.f14364a = 1;
            obj = searchViewModel.m12244i(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            return this.f14365b.m12247d().m10391d(str);
        }
        return null;
    }
}
