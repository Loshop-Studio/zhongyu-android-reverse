package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseHistoryViewModel", m17801f = "ExerciseHistoryViewModel.kt", m17802l = {73}, m17803m = "microList")
/* loaded from: classes5.dex */
public final class ExerciseHistoryViewModel$microList$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14035a;

    /* renamed from: b */
    public Object f14036b;

    /* renamed from: c */
    public /* synthetic */ Object f14037c;

    /* renamed from: d */
    public final /* synthetic */ ExerciseHistoryViewModel f14038d;

    /* renamed from: e */
    public int f14039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseHistoryViewModel$microList$1(ExerciseHistoryViewModel exerciseHistoryViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14038d = exerciseHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14037c = obj;
        this.f14039e |= Integer.MIN_VALUE;
        return this.f14038d.m12104w(0, null, this);
    }
}
