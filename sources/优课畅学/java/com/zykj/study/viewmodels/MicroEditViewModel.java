package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MicroEditViewModel extends BaseViewModel {

    /* renamed from: a */
    public final ExerciseRepository f14233a;

    public MicroEditViewModel(ExerciseRepository exerciseRepository) {
        AbstractC9133u.m16133g(exerciseRepository, "exerciseRepository");
        this.f14233a = exerciseRepository;
    }

    /* renamed from: a */
    public final ExerciseRepository m12199a() {
        return this.f14233a;
    }

    /* renamed from: b */
    public final Object m12200b(int i10, String str, String str2, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MicroEditViewModel$uploadMicro$2(this, i10, str, str2, null), interfaceC9324c);
    }
}
