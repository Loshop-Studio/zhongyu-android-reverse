package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$getTitleList$1", m17801f = "ExerciseStatisticsViewModel.kt", m17802l = {TbsListener.ErrorCode.COPY_FAIL}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsViewModel$getTitleList$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14079a;

    /* renamed from: b */
    public int f14080b;

    /* renamed from: c */
    public final /* synthetic */ ExerciseStatisticsViewModel f14081c;

    /* renamed from: d */
    public final /* synthetic */ int f14082d;

    /* renamed from: e */
    public final /* synthetic */ int f14083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStatisticsViewModel$getTitleList$1(ExerciseStatisticsViewModel exerciseStatisticsViewModel, int i10, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14081c = exerciseStatisticsViewModel;
        this.f14082d = i10;
        this.f14083e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStatisticsViewModel$getTitleList$1(this.f14081c, this.f14082d, this.f14083e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStatisticsViewModel$getTitleList$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM10413j;
        GetQuizDetailBean getQuizDetailBean;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14080b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            GetQuizDetailBean getQuizDetailBean2 = new GetQuizDetailBean(0L, 0L, 0, true, null, null, null, 118, null);
            TeachCourseRepository teachCourseRepositoryM12125q = this.f14081c.m12125q();
            int i11 = this.f14082d;
            int i12 = this.f14083e;
            this.f14079a = getQuizDetailBean2;
            this.f14080b = 1;
            objM10413j = teachCourseRepositoryM12125q.m10413j(i11, i12, this);
            if (objM10413j == objM17291f) {
                return objM17291f;
            }
            getQuizDetailBean = getQuizDetailBean2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getQuizDetailBean = (GetQuizDetailBean) this.f14079a;
            AbstractC9079b.m15926b(obj);
            objM10413j = obj;
        }
        List listM14547X0 = AbstractC8778f0.m14547X0((List) objM10413j);
        listM14547X0.add(0, getQuizDetailBean);
        this.f14081c.f14054k.setValue(listM14547X0);
        return C8736p.f16368a;
    }
}
