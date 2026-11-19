package com.zykj.study.viewmodels;

import com.zykj.study.data.SearchHistoryEntity;
import com.zykj.study.repository.SearchHistoryRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel$deleteHistory$1", m17801f = "SearchViewModel.kt", m17802l = {80}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SearchViewModel$deleteHistory$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14358a;

    /* renamed from: b */
    public final /* synthetic */ SearchViewModel f14359b;

    /* renamed from: c */
    public final /* synthetic */ SearchHistoryEntity f14360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$deleteHistory$1(SearchViewModel searchViewModel, SearchHistoryEntity searchHistoryEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14359b = searchViewModel;
        this.f14360c = searchHistoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SearchViewModel$deleteHistory$1(this.f14359b, this.f14360c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SearchViewModel$deleteHistory$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14358a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            SearchHistoryRepository searchHistoryRepositoryM12247d = this.f14359b.m12247d();
            SearchHistoryEntity searchHistoryEntity = this.f14360c;
            this.f14358a = 1;
            if (searchHistoryRepositoryM12247d.m10390c(searchHistoryEntity, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
