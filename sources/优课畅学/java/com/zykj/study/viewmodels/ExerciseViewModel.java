package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final ExerciseRepository f14144a;

    /* renamed from: b */
    public final MutableLiveData f14145b;

    public ExerciseViewModel(ExerciseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14144a = repository;
        this.f14145b = new MutableLiveData();
    }

    /* renamed from: a */
    public final void m12163a(int i10, int i11, int i12) {
        ViewModelExtKt.m12315b(this, getToastLiveData(), isDialogVisible(), new ExerciseViewModel$getCourseContentDetailBean$1(this, i10, i11, i12, null), new ExerciseViewModel$getCourseContentDetailBean$2(null));
    }

    /* renamed from: b */
    public final MutableLiveData m12164b() {
        return this.f14145b;
    }

    /* renamed from: c */
    public final ExerciseRepository m12165c() {
        return this.f14144a;
    }
}
