package com.zykj.study.p065ui.home.exercise;

import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.databinding.FragmentExerciseTrainBinding;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.view.MultipleStatusView;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initData$3$1", m17801f = "ExerciseTrainFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainFragment$initData$3$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11895a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainFragment f11896b;

    /* renamed from: c */
    public final /* synthetic */ ToastMessage f11897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainFragment$initData$3$1(ExerciseTrainFragment exerciseTrainFragment, ToastMessage toastMessage, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11896b = exerciseTrainFragment;
        this.f11897c = toastMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainFragment$initData$3$1(this.f11896b, this.f11897c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainFragment$initData$3$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11895a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ExerciseTrainFragment exerciseTrainFragment = this.f11896b;
        MultipleStatusView multipleStatusView = ((FragmentExerciseTrainBinding) exerciseTrainFragment.getMBindView()).multipleStatusView;
        ToastMessage toastMessage = this.f11897c;
        AbstractC9133u.m16130d(toastMessage);
        BaseFragmentExtKt.m11864b(exerciseTrainFragment, multipleStatusView, toastMessage);
        return C8736p.f16368a;
    }
}
