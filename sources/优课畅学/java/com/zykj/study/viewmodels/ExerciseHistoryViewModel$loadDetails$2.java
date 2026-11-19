package com.zykj.study.viewmodels;

import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseHistoryViewModel$loadDetails$2", m17801f = "ExerciseHistoryViewModel.kt", m17802l = {44}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseHistoryViewModel$loadDetails$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14030a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseHistoryViewModel f14031b;

    /* renamed from: c */
    public final /* synthetic */ int f14032c;

    /* renamed from: d */
    public final /* synthetic */ int f14033d;

    /* renamed from: e */
    public final /* synthetic */ int f14034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseHistoryViewModel$loadDetails$2(ExerciseHistoryViewModel exerciseHistoryViewModel, int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14031b = exerciseHistoryViewModel;
        this.f14032c = i10;
        this.f14033d = i11;
        this.f14034e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseHistoryViewModel$loadDetails$2(this.f14031b, this.f14032c, this.f14033d, this.f14034e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseHistoryViewModel$loadDetails$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14030a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12100s = this.f14031b.m12100s();
            int i11 = this.f14032c;
            int i12 = this.f14033d;
            int i13 = this.f14034e;
            this.f14030a = 1;
            obj = exerciseRepositoryM12100s.m10375k(i11, i12, i13, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseHistoryViewModel exerciseHistoryViewModel = this.f14031b;
        ExerciseBean exerciseBean = (ExerciseBean) obj;
        exerciseHistoryViewModel.m12099r().postValue(exerciseBean);
        exerciseHistoryViewModel.m12010h().postValue(exerciseBean.getQuestions());
        exerciseHistoryViewModel.m12012j().postValue(AbstractC9536a.m17798c(exerciseBean.getQuestions().size()));
        return C8736p.f16368a;
    }
}
