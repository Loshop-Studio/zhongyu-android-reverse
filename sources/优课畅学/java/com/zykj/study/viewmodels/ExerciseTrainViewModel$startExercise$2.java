package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseTrainViewModel$startExercise$2", m17801f = "ExerciseTrainViewModel.kt", m17802l = {C3721BR.viewModel}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainViewModel$startExercise$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14139a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainViewModel f14140b;

    /* renamed from: c */
    public final /* synthetic */ int f14141c;

    /* renamed from: d */
    public final /* synthetic */ int f14142d;

    /* renamed from: e */
    public final /* synthetic */ int f14143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainViewModel$startExercise$2(ExerciseTrainViewModel exerciseTrainViewModel, int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14140b = exerciseTrainViewModel;
        this.f14141c = i10;
        this.f14142d = i11;
        this.f14143e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainViewModel$startExercise$2(this.f14140b, this.f14141c, this.f14142d, this.f14143e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainViewModel$startExercise$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14139a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12162z = this.f14140b.m12162z();
            int i11 = this.f14141c;
            int i12 = this.f14142d;
            int i13 = this.f14143e;
            this.f14139a = 1;
            obj = exerciseRepositoryM12162z.m10368d(i11, i12, i13, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseTrainViewModel exerciseTrainViewModel = this.f14140b;
        ExerciseBean exerciseBean = (ExerciseBean) obj;
        exerciseTrainViewModel.m12159w().postValue(exerciseBean);
        exerciseTrainViewModel.m12010h().postValue(exerciseBean.getQuestions());
        return C8736p.f16368a;
    }
}
