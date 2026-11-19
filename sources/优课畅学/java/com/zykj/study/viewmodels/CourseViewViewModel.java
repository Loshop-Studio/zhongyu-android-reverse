package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9271h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class CourseViewViewModel extends BaseViewModel {

    /* renamed from: a */
    public final TeachCourseRepository f13973a;

    /* renamed from: b */
    public final InterfaceC9271h f13974b;

    /* renamed from: c */
    public final MutableLiveData f13975c;

    /* renamed from: d */
    public final MutableLiveData f13976d;

    /* renamed from: e */
    public final MutableLiveData f13977e;

    /* renamed from: f */
    public final MutableLiveData f13978f;

    /* renamed from: g */
    public final MutableLiveData f13979g;

    public CourseViewViewModel(TeachCourseRepository repository, InterfaceC9271h headerBeanFlow) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        this.f13973a = repository;
        this.f13974b = headerBeanFlow;
        this.f13975c = new MutableLiveData();
        this.f13976d = new MutableLiveData();
        this.f13977e = new MutableLiveData();
        this.f13978f = new MutableLiveData();
        this.f13979g = new MutableLiveData();
    }

    /* renamed from: a */
    public final MutableLiveData m12061a() {
        return this.f13978f;
    }

    /* renamed from: b */
    public final MutableLiveData m12062b() {
        return this.f13976d;
    }

    /* renamed from: c */
    public final MutableLiveData m12063c() {
        return this.f13979g;
    }

    /* renamed from: d */
    public final InterfaceC9271h m12064d() {
        return this.f13974b;
    }

    /* renamed from: e */
    public final TeachCourseRepository m12065e() {
        return this.f13973a;
    }

    /* renamed from: f */
    public final MutableLiveData m12066f() {
        return this.f13977e;
    }

    /* renamed from: g */
    public final MutableLiveData m12067g() {
        return this.f13975c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m12068h(int i10) {
        CourseBean courseBean = (CourseBean) this.f13976d.getValue();
        if (courseBean != null) {
            launchData(getToastLiveData(), isDialogVisible(), new CourseViewViewModel$updateCatalogProgress$1$1(this, courseBean.getId(), i10, null));
        }
    }
}
