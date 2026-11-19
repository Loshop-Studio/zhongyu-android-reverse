package com.zykj.study.viewmodels;

import com.zykj.study.bean.teach.CourseBindBean;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentViewViewModel$addSuperviseGroup$2$1", m17801f = "StudentViewViewModel.kt", m17802l = {52}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewViewModel$addSuperviseGroup$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14399a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewViewModel f14400b;

    /* renamed from: c */
    public final /* synthetic */ int f14401c;

    /* renamed from: d */
    public final /* synthetic */ int f14402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewViewModel$addSuperviseGroup$2$1(StudentViewViewModel studentViewViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14400b = studentViewViewModel;
        this.f14401c = i10;
        this.f14402d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewViewModel$addSuperviseGroup$2$1(this.f14400b, this.f14401c, this.f14402d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewViewModel$addSuperviseGroup$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14399a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12270e = this.f14400b.m12270e();
            int i11 = this.f14401c;
            int i12 = this.f14402d;
            this.f14399a = 1;
            if (teachCourseRepositoryM12270e.m10406b(i11, i12, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14400b.m12275j();
        List list = (List) this.f14400b.m12268c().getValue();
        if (list != null) {
            int i13 = this.f14401c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CourseBindBean) next).getId() == i13) {
                    break;
                }
            }
            CourseBindBean courseBindBean = (CourseBindBean) next;
            if (courseBindBean != null) {
                courseBindBean.setBind(true);
            }
        }
        return AbstractC9536a.m17796a(true);
    }
}
