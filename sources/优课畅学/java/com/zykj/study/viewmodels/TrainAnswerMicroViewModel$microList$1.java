package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TrainAnswerMicroViewModel", m17801f = "TrainAnswerMicroViewModel.kt", m17802l = {21}, m17803m = "microList")
/* loaded from: classes5.dex */
public final class TrainAnswerMicroViewModel$microList$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f14482a;

    /* renamed from: b */
    public final /* synthetic */ TrainAnswerMicroViewModel f14483b;

    /* renamed from: c */
    public int f14484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainAnswerMicroViewModel$microList$1(TrainAnswerMicroViewModel trainAnswerMicroViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14483b = trainAnswerMicroViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14482a = obj;
        this.f14484c |= Integer.MIN_VALUE;
        return this.f14483b.m12306j(this);
    }
}
