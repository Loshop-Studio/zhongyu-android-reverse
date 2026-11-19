package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseViewerViewModel", m17801f = "ExerciseViewerViewModel.kt", m17802l = {83}, m17803m = "microList")
/* loaded from: classes5.dex */
public final class ExerciseViewerViewModel$microList$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14175a;

    /* renamed from: b */
    public Object f14176b;

    /* renamed from: c */
    public /* synthetic */ Object f14177c;

    /* renamed from: d */
    public final /* synthetic */ ExerciseViewerViewModel f14178d;

    /* renamed from: e */
    public int f14179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerViewModel$microList$1(ExerciseViewerViewModel exerciseViewerViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14178d = exerciseViewerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14177c = obj;
        this.f14179e |= Integer.MIN_VALUE;
        return this.f14178d.m12173x(0, null, this);
    }
}
