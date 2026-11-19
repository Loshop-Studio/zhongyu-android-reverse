package com.zykj.study.p065ui.home.exercise;

import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initView$4$1", m17801f = "ExerciseTrainFragment.kt", m17802l = {143}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainFragment$initView$4$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11905a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainFragment f11906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainFragment$initView$4$1(ExerciseTrainFragment exerciseTrainFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11906b = exerciseTrainFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainFragment$initView$4$1(this.f11906b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainFragment$initView$4$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11905a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseTrainViewModel exerciseTrainViewModelM10644z = this.f11906b.m10644z();
            int iM10647b = this.f11906b.m10643y().m10647b();
            int iM10646a = this.f11906b.m10643y().m10646a();
            int iM10648c = this.f11906b.m10643y().m10648c();
            this.f11905a = 1;
            if (exerciseTrainViewModelM10644z.m12156J(iM10647b, iM10646a, iM10648c, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
