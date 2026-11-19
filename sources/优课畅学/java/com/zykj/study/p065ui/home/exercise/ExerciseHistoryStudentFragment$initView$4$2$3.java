package com.zykj.study.p065ui.home.exercise;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryStudentFragment$initView$4$2$3", m17801f = "ExerciseHistoryStudentFragment.kt", m17802l = {TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseHistoryStudentFragment$initView$4$2$3 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11858a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseHistoryStudentFragment f11859b;

    /* renamed from: c */
    public final /* synthetic */ QuestionBean f11860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseHistoryStudentFragment$initView$4$2$3(ExerciseHistoryStudentFragment exerciseHistoryStudentFragment, QuestionBean questionBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11859b = exerciseHistoryStudentFragment;
        this.f11860c = questionBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseHistoryStudentFragment$initView$4$2$3(this.f11859b, this.f11860c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseHistoryStudentFragment$initView$4$2$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11858a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModelM10602u = this.f11859b.m10602u();
            int iM10605b = this.f11859b.m10601t().m10605b();
            String id = this.f11860c.getId();
            this.f11858a = 1;
            obj = exerciseStudentHistoryViewModelM10602u.m12143x(iM10605b, id, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        List list = (List) obj;
        if (list != null) {
            MicroAdapter microAdapter = this.f11859b.f11835i;
            if (microAdapter == null) {
                AbstractC9133u.m16151y("microAdapter");
                microAdapter = null;
            }
            microAdapter.m10028h(list);
        }
        return C8736p.f16368a;
    }
}
