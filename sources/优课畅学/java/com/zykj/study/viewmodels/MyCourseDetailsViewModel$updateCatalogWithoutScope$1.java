package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {110}, m17803m = "updateCatalogWithoutScope")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$updateCatalogWithoutScope$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f14282a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsViewModel f14283b;

    /* renamed from: c */
    public int f14284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$updateCatalogWithoutScope$1(MyCourseDetailsViewModel myCourseDetailsViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14283b = myCourseDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14282a = obj;
        this.f14284c |= Integer.MIN_VALUE;
        return this.f14283b.m12221s(this);
    }
}
