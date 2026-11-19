package com.zykj.study.viewmodels;

import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$2", m17801f = "StudyViewModel.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$getCourseDetails$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14459a;

    /* renamed from: b */
    public final /* synthetic */ StudyViewModel f14460b;

    /* renamed from: c */
    public final /* synthetic */ int f14461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$getCourseDetails$2(StudyViewModel studyViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14460b = studyViewModel;
        this.f14461c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudyViewModel$getCourseDetails$2(this.f14460b, this.f14461c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudyViewModel$getCourseDetails$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14459a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CourseRepository courseRepositoryM12287j = this.f14460b.m12287j();
            int i11 = this.f14461c;
            this.f14459a = 1;
            obj = courseRepositoryM12287j.m10341k(i11, true, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14460b.m12283f().postValue((CourseDetailsBean) obj);
        return AbstractC9536a.m17796a(true);
    }
}
