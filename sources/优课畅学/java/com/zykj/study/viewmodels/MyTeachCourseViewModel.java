package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyTeachCourseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final TeachCourseRepository f14305a;

    /* renamed from: b */
    public final InterfaceC9266c f14306b;

    public MyTeachCourseViewModel(TeachCourseRepository respository) {
        AbstractC9133u.m16133g(respository, "respository");
        this.f14305a = respository;
        this.f14306b = CachedPagingDataKt.cachedIn(respository.m10409e(), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: a */
    public final Object m12231a(CourseDetailsBean courseDetailsBean, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MyTeachCourseViewModel$deleteTeachCourse$2(this, courseDetailsBean, null), interfaceC9324c);
    }

    /* renamed from: b */
    public final InterfaceC9266c m12232b() {
        return this.f14306b;
    }

    /* renamed from: c */
    public final TeachCourseRepository m12233c() {
        return this.f14305a;
    }
}
