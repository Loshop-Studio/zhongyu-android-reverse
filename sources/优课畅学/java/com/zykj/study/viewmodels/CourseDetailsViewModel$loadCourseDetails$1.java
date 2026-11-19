package com.zykj.study.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseDetailsViewModel$loadCourseDetails$1", m17801f = "CourseDetailsViewModel.kt", m17802l = {49}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseDetailsViewModel$loadCourseDetails$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13924a;

    /* renamed from: b */
    public int f13925b;

    /* renamed from: c */
    public final /* synthetic */ CourseDetailsViewModel f13926c;

    /* renamed from: d */
    public final /* synthetic */ int f13927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDetailsViewModel$loadCourseDetails$1(CourseDetailsViewModel courseDetailsViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13926c = courseDetailsViewModel;
        this.f13927d = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseDetailsViewModel$loadCourseDetails$1(this.f13926c, this.f13927d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseDetailsViewModel$loadCourseDetails$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13925b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM12036b = this.f13926c.m12036b();
            CourseRepository courseRepositoryM12039e = this.f13926c.m12039e();
            int i11 = this.f13927d;
            this.f13924a = mutableLiveDataM12036b;
            this.f13925b = 1;
            Object objM10329l = CourseRepository.m10329l(courseRepositoryM12039e, i11, false, this, 2, null);
            if (objM10329l == objM17291f) {
                return objM17291f;
            }
            mutableLiveData = mutableLiveDataM12036b;
            obj = objM10329l;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f13924a;
            AbstractC9079b.m15926b(obj);
        }
        mutableLiveData.postValue(obj);
        return C8736p.f16368a;
    }
}
