package com.zykj.study.viewmodels;

import com.zykj.study.bean.exercise.QuestionGroupBean;
import com.zykj.study.bean.exercise.RoundBean;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseViewerViewModel$initExerciseResult$1", m17801f = "ExerciseViewerViewModel.kt", m17802l = {43}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerViewModel$initExerciseResult$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14172a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerViewModel f14173b;

    /* renamed from: c */
    public final /* synthetic */ int f14174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerViewModel$initExerciseResult$1(ExerciseViewerViewModel exerciseViewerViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14173b = exerciseViewerViewModel;
        this.f14174c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerViewModel$initExerciseResult$1(this.f14173b, this.f14174c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerViewModel$initExerciseResult$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RoundBean roundBean;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14172a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12168s = this.f14173b.m12168s();
            int i11 = this.f14174c;
            this.f14172a = 1;
            obj = exerciseRepositoryM12168s.m10371g(i11, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseViewerViewModel exerciseViewerViewModel = this.f14173b;
        QuestionGroupBean questionGroupBean = (QuestionGroupBean) obj;
        exerciseViewerViewModel.m12169t().postValue(questionGroupBean.getTitle());
        if (!questionGroupBean.getRounds().isEmpty() && (roundBean = (RoundBean) AbstractC8778f0.m14568n0(questionGroupBean.getRounds())) != null) {
            exerciseViewerViewModel.m12010h().postValue(roundBean.getQuestions());
            exerciseViewerViewModel.m12012j().postValue(AbstractC9536a.m17798c(roundBean.getQuestionCount()));
        }
        return C8736p.f16368a;
    }
}
