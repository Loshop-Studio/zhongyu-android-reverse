package com.zykj.study.viewmodels;

import com.zykj.study.bean.CourseContentDetailBean;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.repository.ExerciseRepository;
import java.util.Iterator;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseViewModel$getCourseContentDetailBean$1", m17801f = "ExerciseViewModel.kt", m17802l = {25}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewModel$getCourseContentDetailBean$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14146a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewModel f14147b;

    /* renamed from: c */
    public final /* synthetic */ int f14148c;

    /* renamed from: d */
    public final /* synthetic */ int f14149d;

    /* renamed from: e */
    public final /* synthetic */ int f14150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewModel$getCourseContentDetailBean$1(ExerciseViewModel exerciseViewModel, int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14147b = exerciseViewModel;
        this.f14148c = i10;
        this.f14149d = i11;
        this.f14150e = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewModel$getCourseContentDetailBean$1(this.f14147b, this.f14148c, this.f14149d, this.f14150e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewModel$getCourseContentDetailBean$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14146a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12165c = this.f14147b.m12165c();
            int i11 = this.f14148c;
            int i12 = this.f14149d;
            this.f14146a = 1;
            obj = exerciseRepositoryM12165c.m10369e(i11, i12, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseViewModel exerciseViewModel = this.f14147b;
        int i13 = this.f14150e;
        CourseContentDetailBean courseContentDetailBean = (CourseContentDetailBean) obj;
        Object obj2 = null;
        if (courseContentDetailBean.getExerciseList() == null || courseContentDetailBean.getExerciseList().isEmpty()) {
            exerciseViewModel.m12164b().postValue(null);
        } else {
            Iterator<T> it = courseContentDetailBean.getExerciseList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ExerciseBean) next).getGroupId() == i13) {
                    obj2 = next;
                    break;
                }
            }
            exerciseViewModel.m12164b().postValue((ExerciseBean) obj2);
        }
        return C8736p.f16368a;
    }
}
