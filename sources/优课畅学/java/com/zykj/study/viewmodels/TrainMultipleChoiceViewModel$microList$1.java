package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TrainMultipleChoiceViewModel", m17801f = "TrainMultipleChoiceViewModel.kt", m17802l = {74}, m17803m = "microList$suspendImpl")
/* loaded from: classes5.dex */
public final class TrainMultipleChoiceViewModel$microList$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f14495a;

    /* renamed from: b */
    public /* synthetic */ Object f14496b;

    /* renamed from: c */
    public final /* synthetic */ TrainMultipleChoiceViewModel f14497c;

    /* renamed from: d */
    public int f14498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainMultipleChoiceViewModel$microList$1(TrainMultipleChoiceViewModel trainMultipleChoiceViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14497c = trainMultipleChoiceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14496b = obj;
        this.f14498d |= Integer.MIN_VALUE;
        return TrainMultipleChoiceViewModel.m12308m(this.f14497c, this);
    }
}
