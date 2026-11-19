package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudentExercisesViewModel extends BaseViewModel {

    /* renamed from: a */
    public final ExerciseRepository f14373a;

    /* renamed from: b */
    public final MutableLiveData f14374b;

    /* renamed from: c */
    public final MutableLiveData f14375c;

    /* renamed from: d */
    public final MutableLiveData f14376d;

    public StudentExercisesViewModel(ExerciseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14373a = repository;
        this.f14374b = new MutableLiveData();
        this.f14375c = new MutableLiveData();
        this.f14376d = new MutableLiveData(Boolean.FALSE);
    }

    /* renamed from: a */
    public final MutableLiveData m12256a() {
        return this.f14375c;
    }

    /* renamed from: b */
    public final ExerciseRepository m12257b() {
        return this.f14373a;
    }

    /* renamed from: c */
    public final MutableLiveData m12258c() {
        return this.f14374b;
    }

    /* renamed from: d */
    public final void m12259d(int i10, int i11, String userId, int i12, boolean z10) {
        AbstractC9133u.m16133g(userId, "userId");
        launchData(getToastLiveData(), isDialogVisible(), new StudentExercisesViewModel$initUserQuizStatistics$1(z10, this, i12, userId, i10, i11, null));
    }

    /* renamed from: e */
    public final MutableLiveData m12260e() {
        return this.f14376d;
    }
}
