package com.zykj.study.viewmodels;

import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$unSubscribe$1$1", m17801f = "StudyViewModel.kt", m17802l = {115}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$unSubscribe$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14468a;

    /* renamed from: b */
    public final /* synthetic */ StudyViewModel f14469b;

    /* renamed from: c */
    public final /* synthetic */ CourseStudyEntity f14470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$unSubscribe$1$1(StudyViewModel studyViewModel, CourseStudyEntity courseStudyEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14469b = studyViewModel;
        this.f14470c = courseStudyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudyViewModel$unSubscribe$1$1(this.f14469b, this.f14470c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudyViewModel$unSubscribe$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14468a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CourseRepository courseRepositoryM12287j = this.f14469b.m12287j();
            int id = this.f14470c.getId();
            this.f14468a = 1;
            if (courseRepositoryM12287j.m10351y(id, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14469b.m12283f().postValue(null);
        this.f14469b.m12289l().postValue(null);
        return C8736p.f16368a;
    }
}
