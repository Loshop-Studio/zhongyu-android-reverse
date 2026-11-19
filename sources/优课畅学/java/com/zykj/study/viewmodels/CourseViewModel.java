package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.CourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.InterfaceC9266c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f13971a;

    /* renamed from: b */
    public final InterfaceC9266c f13972b;

    public CourseViewModel(CourseRepository respository) {
        AbstractC9133u.m16133g(respository, "respository");
        this.f13971a = respository;
        this.f13972b = CachedPagingDataKt.cachedIn(respository.m10342m(), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: a */
    public final InterfaceC9266c m12060a() {
        return this.f13972b;
    }
}
