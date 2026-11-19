package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseContentViewModel", m17801f = "CourseContentViewModel.kt", m17802l = {23}, m17803m = "getUserId")
/* loaded from: classes5.dex */
public final class CourseContentViewModel$getUserId$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f13914a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentViewModel f13915b;

    /* renamed from: c */
    public int f13916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentViewModel$getUserId$1(CourseContentViewModel courseContentViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f13915b = courseContentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13914a = obj;
        this.f13916c |= Integer.MIN_VALUE;
        return this.f13915b.m12034c(this);
    }
}
