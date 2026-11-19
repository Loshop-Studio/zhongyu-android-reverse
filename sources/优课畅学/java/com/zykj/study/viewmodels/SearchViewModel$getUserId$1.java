package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel", m17801f = "SearchViewModel.kt", m17802l = {76}, m17803m = "getUserId")
/* loaded from: classes5.dex */
public final class SearchViewModel$getUserId$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f14361a;

    /* renamed from: b */
    public final /* synthetic */ SearchViewModel f14362b;

    /* renamed from: c */
    public int f14363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$getUserId$1(SearchViewModel searchViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14362b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14361a = obj;
        this.f14363c |= Integer.MIN_VALUE;
        return this.f14362b.m12244i(this);
    }
}
