package com.zykj.study.p065ui.home.p066my;

import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.adapter.MyTeachCourseAdapter;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.viewmodels.MyTeachCourseViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeacherFragment$showDeleteDialog$1$1", m17801f = "TeacherFragment.kt", m17802l = {85}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TeacherFragment$showDeleteDialog$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13506a;

    /* renamed from: b */
    public final /* synthetic */ TeacherFragment f13507b;

    /* renamed from: c */
    public final /* synthetic */ CourseDetailsBean f13508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherFragment$showDeleteDialog$1$1(TeacherFragment teacherFragment, CourseDetailsBean courseDetailsBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13507b = teacherFragment;
        this.f13508c = courseDetailsBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeacherFragment$showDeleteDialog$1$1(this.f13507b, this.f13508c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeacherFragment$showDeleteDialog$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13506a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MyTeachCourseViewModel myTeachCourseViewModelM11736s = this.f13507b.m11736s();
            CourseDetailsBean courseDetailsBean = this.f13508c;
            this.f13506a = 1;
            obj = myTeachCourseViewModelM11736s.m12231a(courseDetailsBean, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (AbstractC9133u.m16128b(obj, AbstractC9536a.m17796a(true))) {
            MyTeachCourseAdapter myTeachCourseAdapter = this.f13507b.f13473i;
            if (myTeachCourseAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myTeachCourseAdapter = null;
            }
            myTeachCourseAdapter.refresh();
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f13507b.getString(R$string.course_remove_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        }
        return C8736p.f16368a;
    }
}
