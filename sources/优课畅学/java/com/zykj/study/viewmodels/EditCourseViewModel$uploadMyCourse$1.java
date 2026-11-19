package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.EditCourseViewModel", m17801f = "EditCourseViewModel.kt", m17802l = {64, 80}, m17803m = "uploadMyCourse")
/* loaded from: classes5.dex */
public final class EditCourseViewModel$uploadMyCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14008a;

    /* renamed from: b */
    public Object f14009b;

    /* renamed from: c */
    public /* synthetic */ Object f14010c;

    /* renamed from: d */
    public final /* synthetic */ EditCourseViewModel f14011d;

    /* renamed from: e */
    public int f14012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCourseViewModel$uploadMyCourse$1(EditCourseViewModel editCourseViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14011d = editCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14010c = obj;
        this.f14012e |= Integer.MIN_VALUE;
        return this.f14011d.m12098p(this);
    }
}
