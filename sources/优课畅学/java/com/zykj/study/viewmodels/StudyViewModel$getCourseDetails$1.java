package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel", m17801f = "StudyViewModel.kt", m17802l = {87}, m17803m = "getCourseDetails")
/* loaded from: classes5.dex */
public final class StudyViewModel$getCourseDetails$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14455a;

    /* renamed from: b */
    public /* synthetic */ Object f14456b;

    /* renamed from: c */
    public final /* synthetic */ StudyViewModel f14457c;

    /* renamed from: d */
    public int f14458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$getCourseDetails$1(StudyViewModel studyViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14457c = studyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14456b = obj;
        this.f14458d |= Integer.MIN_VALUE;
        return this.f14457c.m12282d(0, this);
    }
}
