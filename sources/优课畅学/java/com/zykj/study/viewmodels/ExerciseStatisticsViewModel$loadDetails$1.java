package com.zykj.study.viewmodels;

import com.zykj.study.bean.teach.QuizScore;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$loadDetails$1", m17801f = "ExerciseStatisticsViewModel.kt", m17802l = {188}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsViewModel$loadDetails$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14087a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseStatisticsViewModel f14088b;

    /* renamed from: c */
    public final /* synthetic */ int f14089c;

    /* renamed from: d */
    public final /* synthetic */ int f14090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStatisticsViewModel$loadDetails$1(ExerciseStatisticsViewModel exerciseStatisticsViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14088b = exerciseStatisticsViewModel;
        this.f14089c = i10;
        this.f14090d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStatisticsViewModel$loadDetails$1(this.f14088b, this.f14089c, this.f14090d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStatisticsViewModel$loadDetails$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14087a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12125q = this.f14088b.m12125q();
            int i11 = this.f14089c;
            int i12 = this.f14090d;
            this.f14087a = 1;
            obj = teachCourseRepositoryM12125q.m10412i(i11, i12, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14088b.m12124p().postValue((QuizScore) obj);
        return C8736p.f16368a;
    }
}
