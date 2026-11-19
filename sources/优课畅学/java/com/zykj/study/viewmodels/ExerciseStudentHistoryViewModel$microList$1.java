package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel", m17801f = "ExerciseStudentHistoryViewModel.kt", m17802l = {64}, m17803m = "microList")
/* loaded from: classes5.dex */
public final class ExerciseStudentHistoryViewModel$microList$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14100a;

    /* renamed from: b */
    public Object f14101b;

    /* renamed from: c */
    public /* synthetic */ Object f14102c;

    /* renamed from: d */
    public final /* synthetic */ ExerciseStudentHistoryViewModel f14103d;

    /* renamed from: e */
    public int f14104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStudentHistoryViewModel$microList$1(ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14103d = exerciseStudentHistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14102c = obj;
        this.f14104e |= Integer.MIN_VALUE;
        return this.f14103d.m12143x(0, null, this);
    }
}
