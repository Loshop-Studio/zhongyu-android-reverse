package com.zykj.study.viewmodels;

import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyTeachCourseViewModel$deleteTeachCourse$2", m17801f = "MyTeachCourseViewModel.kt", m17802l = {27}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyTeachCourseViewModel$deleteTeachCourse$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14307a;

    /* renamed from: b */
    public final /* synthetic */ MyTeachCourseViewModel f14308b;

    /* renamed from: c */
    public final /* synthetic */ CourseDetailsBean f14309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTeachCourseViewModel$deleteTeachCourse$2(MyTeachCourseViewModel myTeachCourseViewModel, CourseDetailsBean courseDetailsBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14308b = myTeachCourseViewModel;
        this.f14309c = courseDetailsBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyTeachCourseViewModel$deleteTeachCourse$2(this.f14308b, this.f14309c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyTeachCourseViewModel$deleteTeachCourse$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14307a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        TeachCourseRepository teachCourseRepositoryM12233c = this.f14308b.m12233c();
        int superviseId = this.f14309c.getSuperviseId();
        this.f14307a = 1;
        Object objM10417n = teachCourseRepositoryM12233c.m10417n(superviseId, this);
        return objM10417n == objM17291f ? objM17291f : objM10417n;
    }
}
