package com.zykj.study.viewmodels;

import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionGroupBean;
import com.zykj.study.bean.exercise.RoundBean;
import com.zykj.study.repository.ExerciseRepository;
import java.util.List;
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

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$loadGroupDetails$1", m17801f = "ExerciseStudentHistoryViewModel.kt", m17802l = {32}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStudentHistoryViewModel$loadGroupDetails$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14097a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseStudentHistoryViewModel f14098b;

    /* renamed from: c */
    public final /* synthetic */ int f14099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStudentHistoryViewModel$loadGroupDetails$1(ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14098b = exerciseStudentHistoryViewModel;
        this.f14099c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStudentHistoryViewModel$loadGroupDetails$1(this.f14098b, this.f14099c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStudentHistoryViewModel$loadGroupDetails$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<QuestionBean> questions;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14097a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12139t = this.f14098b.m12139t();
            int i11 = this.f14099c;
            this.f14097a = 1;
            obj = exerciseRepositoryM12139t.m10371g(i11, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel = this.f14098b;
        QuestionGroupBean questionGroupBean = (QuestionGroupBean) obj;
        exerciseStudentHistoryViewModel.m12138s().postValue(questionGroupBean);
        RoundBean roundBean = (RoundBean) AbstractC8778f0.m14568n0(questionGroupBean.getRounds());
        if (roundBean != null && (questions = roundBean.getQuestions()) != null) {
            exerciseStudentHistoryViewModel.m12010h().postValue(questions);
            exerciseStudentHistoryViewModel.m12012j().postValue(AbstractC9536a.m17798c(questions.size()));
        }
        return C8736p.f16368a;
    }
}
