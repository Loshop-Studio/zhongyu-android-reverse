package com.zykj.study.p065ui.home.exercise;

import com.zykj.study.adapter.MicroAdapter;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseHistoryFragment$initView$6$6", m17801f = "ExerciseHistoryFragment.kt", m17802l = {163}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseHistoryFragment$initView$6$6 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11819a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseHistoryFragment f11820b;

    /* renamed from: c */
    public final /* synthetic */ QuestionBean f11821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseHistoryFragment$initView$6$6(ExerciseHistoryFragment exerciseHistoryFragment, QuestionBean questionBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11820b = exerciseHistoryFragment;
        this.f11821c = questionBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseHistoryFragment$initView$6$6(this.f11820b, this.f11821c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseHistoryFragment$initView$6$6) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11819a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseHistoryViewModel exerciseHistoryViewModelM10572x = this.f11820b.m10572x();
            int iM10578c = this.f11820b.m10571w().m10578c();
            String id = this.f11821c.getId();
            this.f11819a = 1;
            obj = exerciseHistoryViewModelM10572x.m12104w(iM10578c, id, this);
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
        MicroAdapter microAdapter = this.f11820b.f11795i;
        if (microAdapter == null) {
            AbstractC9133u.m16151y("microAdapter");
            microAdapter = null;
        }
        microAdapter.m10028h(list);
        return C8736p.f16368a;
    }
}
