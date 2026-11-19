package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TeachDetailsViewModel extends BaseViewModel {

    /* renamed from: a */
    public final TeachCourseRepository f14471a;

    /* renamed from: b */
    public MutableLiveData f14472b;

    /* renamed from: c */
    public MutableLiveData f14473c;

    /* renamed from: d */
    public final MutableLiveData f14474d;

    /* renamed from: e */
    public final MutableLiveData f14475e;

    /* renamed from: f */
    public final MutableLiveData f14476f;

    /* renamed from: g */
    public final MutableLiveData f14477g;

    public TeachDetailsViewModel(TeachCourseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14471a = repository;
        this.f14472b = new MutableLiveData();
        this.f14473c = new MutableLiveData();
        this.f14474d = new MutableLiveData(0);
        this.f14475e = new MutableLiveData(Boolean.FALSE);
        this.f14476f = new MutableLiveData();
        this.f14477g = new MutableLiveData();
    }

    /* renamed from: a */
    public final MutableLiveData m12297a() {
        return this.f14473c;
    }

    /* renamed from: b */
    public final MutableLiveData m12298b() {
        return this.f14476f;
    }

    /* renamed from: c */
    public final MutableLiveData m12299c() {
        return this.f14477g;
    }

    /* renamed from: d */
    public final TeachCourseRepository m12300d() {
        return this.f14471a;
    }

    /* renamed from: e */
    public final MutableLiveData m12301e() {
        return this.f14474d;
    }

    /* renamed from: f */
    public final MutableLiveData m12302f() {
        return this.f14472b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final void m12303g() {
        CourseBean courseBean = (CourseBean) this.f14473c.getValue();
        if (courseBean != null) {
            launchData(getToastLiveData(), isDialogVisible(), new TeachDetailsViewModel$initCourseProgress$1$1(this, courseBean.getId(), null));
        }
    }

    /* renamed from: h */
    public final MutableLiveData m12304h() {
        return this.f14475e;
    }
}
