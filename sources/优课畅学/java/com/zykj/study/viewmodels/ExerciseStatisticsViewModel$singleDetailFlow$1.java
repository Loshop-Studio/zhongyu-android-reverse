package com.zykj.study.viewmodels;

import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.bean.teach.StuQuizBean;
import java.util.Iterator;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$singleDetailFlow$1", m17801f = "ExerciseStatisticsViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsViewModel$singleDetailFlow$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14091a;

    /* renamed from: b */
    public /* synthetic */ Object f14092b;

    /* renamed from: c */
    public /* synthetic */ int f14093c;

    public ExerciseStatisticsViewModel$singleDetailFlow$1(InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
    }

    /* renamed from: c */
    public final Object m12136c(GetQuizDetailBean getQuizDetailBean, int i10, InterfaceC9324c interfaceC9324c) {
        ExerciseStatisticsViewModel$singleDetailFlow$1 exerciseStatisticsViewModel$singleDetailFlow$1 = new ExerciseStatisticsViewModel$singleDetailFlow$1(interfaceC9324c);
        exerciseStatisticsViewModel$singleDetailFlow$1.f14092b = getQuizDetailBean;
        exerciseStatisticsViewModel$singleDetailFlow$1.f14093c = i10;
        return exerciseStatisticsViewModel$singleDetailFlow$1.invokeSuspend(C8736p.f16368a);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m12136c((GetQuizDetailBean) obj, ((Number) obj2).intValue(), (InterfaceC9324c) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        GetQuizDetailBean getQuizDetailBean = (GetQuizDetailBean) this.f14092b;
        int i10 = this.f14093c;
        AbstractC9434a.m17291f();
        if (this.f14091a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        Object obj2 = null;
        if (getQuizDetailBean == null) {
            return null;
        }
        Iterator<T> it = getQuizDetailBean.getStudentGroups().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((StuQuizBean) next).getGroupId() == i10) {
                obj2 = next;
                break;
            }
        }
        return (StuQuizBean) obj2;
    }
}
