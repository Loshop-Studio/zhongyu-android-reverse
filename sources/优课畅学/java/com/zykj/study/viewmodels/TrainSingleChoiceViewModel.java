package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TrainSingleChoiceViewModel extends TrainMultipleChoiceViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainSingleChoiceViewModel(ExerciseRepository repository) {
        super(repository);
        AbstractC9133u.m16133g(repository, "repository");
    }
}
