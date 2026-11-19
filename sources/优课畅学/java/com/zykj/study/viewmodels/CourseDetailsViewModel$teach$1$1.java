package com.zykj.study.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseDetailsViewModel$teach$1$1", m17801f = "CourseDetailsViewModel.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN, 80}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseDetailsViewModel$teach$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13933a;

    /* renamed from: b */
    public int f13934b;

    /* renamed from: c */
    public final /* synthetic */ CourseDetailsViewModel f13935c;

    /* renamed from: d */
    public final /* synthetic */ CourseDetailsBean f13936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDetailsViewModel$teach$1$1(CourseDetailsViewModel courseDetailsViewModel, CourseDetailsBean courseDetailsBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13935c = courseDetailsViewModel;
        this.f13936d = courseDetailsBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseDetailsViewModel$teach$1$1(this.f13935c, this.f13936d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseDetailsViewModel$teach$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13934b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CourseRepository courseRepositoryM12039e = this.f13935c.m12039e();
            int id = this.f13936d.getId();
            this.f13934b = 1;
            if (courseRepositoryM12039e.m10350x(id, this) != objM17291f) {
            }
            return objM17291f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f13933a;
            AbstractC9079b.m15926b(obj);
            mutableLiveData.postValue(obj);
            return C8736p.f16368a;
        }
        AbstractC9079b.m15926b(obj);
        MutableLiveData mutableLiveDataM12036b = this.f13935c.m12036b();
        CourseRepository courseRepositoryM12039e2 = this.f13935c.m12039e();
        int id2 = this.f13936d.getId();
        this.f13933a = mutableLiveDataM12036b;
        this.f13934b = 2;
        Object objM10329l = CourseRepository.m10329l(courseRepositoryM12039e2, id2, false, this, 2, null);
        if (objM10329l != objM17291f) {
            mutableLiveData = mutableLiveDataM12036b;
            obj = objM10329l;
            mutableLiveData.postValue(obj);
            return C8736p.f16368a;
        }
        return objM17291f;
    }
}
