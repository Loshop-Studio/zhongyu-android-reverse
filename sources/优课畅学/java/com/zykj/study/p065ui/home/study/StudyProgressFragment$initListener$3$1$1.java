package com.zykj.study.p065ui.home.study;

import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.viewmodels.StudyViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyProgressFragment$initListener$3$1$1", m17801f = "StudyProgressFragment.kt", m17802l = {181}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyProgressFragment$initListener$3$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13686a;

    /* renamed from: b */
    public final /* synthetic */ StudyProgressFragment f13687b;

    /* renamed from: c */
    public final /* synthetic */ CourseStudyEntity f13688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyProgressFragment$initListener$3$1$1(StudyProgressFragment studyProgressFragment, CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13687b = studyProgressFragment;
        this.f13688c = courseStudyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudyProgressFragment$initListener$3$1$1(this.f13687b, this.f13688c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudyProgressFragment$initListener$3$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13686a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            StudyViewModel studyViewModelM11851s = this.f13687b.m11851s();
            int id = this.f13688c.getId();
            this.f13686a = 1;
            if (studyViewModelM11851s.m12282d(id, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
