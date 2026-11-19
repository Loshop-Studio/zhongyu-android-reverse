package com.zykj.study.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.zykj.study.bean.exercise.QuestionBean;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.BaseExerciseViewModel$goNextQuestion$1", m17801f = "BaseExerciseViewModel.kt", m17802l = {183}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BaseExerciseViewModel$goNextQuestion$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13897a;

    /* renamed from: b */
    public final /* synthetic */ BaseExerciseViewModel f13898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseExerciseViewModel$goNextQuestion$1(BaseExerciseViewModel baseExerciseViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13898b = baseExerciseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BaseExerciseViewModel$goNextQuestion$1(this.f13898b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BaseExerciseViewModel$goNextQuestion$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13897a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g interfaceC9270g = this.f13898b.f13891h;
            C8736p c8736p = C8736p.f16368a;
            this.f13897a = 1;
            if (interfaceC9270g.emit(c8736p, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        List list = (List) this.f13898b.m12010h().getValue();
        if (list != null) {
            BaseExerciseViewModel baseExerciseViewModel = this.f13898b;
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (AbstractC9133u.m16128b((QuestionBean) it.next(), baseExerciseViewModel.m12008f().getValue())) {
                    break;
                }
                i11++;
            }
            BaseExerciseViewModel baseExerciseViewModel2 = this.f13898b;
            baseExerciseViewModel2.mo12018p();
            MutableLiveData mutableLiveDataM12008f = baseExerciseViewModel2.m12008f();
            List list2 = (List) baseExerciseViewModel2.m12010h().getValue();
            mutableLiveDataM12008f.setValue(list2 != null ? (QuestionBean) list2.get(i11 + 1) : null);
            baseExerciseViewModel2.m12007e().setValue(AbstractC9536a.m17798c(i11 + 1));
        }
        return C8736p.f16368a;
    }
}
