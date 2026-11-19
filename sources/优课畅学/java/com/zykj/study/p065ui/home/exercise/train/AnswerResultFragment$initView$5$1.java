package com.zykj.study.p065ui.home.exercise.train;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$initView$5$1", m17801f = "AnswerResultFragment.kt", m17802l = {115}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AnswerResultFragment$initView$5$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f12230a;

    /* renamed from: b */
    public Object f12231b;

    /* renamed from: c */
    public int f12232c;

    /* renamed from: d */
    public final /* synthetic */ AnswerResultFragment f12233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerResultFragment$initView$5$1(AnswerResultFragment answerResultFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12233d = answerResultFragment;
    }

    /* renamed from: d */
    public static final C8736p m10852d(AnswerResultFragment answerResultFragment) {
        answerResultFragment.m10819A().m12013k();
        FragmentKt.findNavController(answerResultFragment).navigate(AbstractC7917h.f12494a.m10989a());
        return C8736p.f16368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AnswerResultFragment$initView$5$1(this.f12233d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AnswerResultFragment$initView$5$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AnswerResultFragment answerResultFragment;
        String str;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12232c;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            answerResultFragment = this.f12233d;
            String str2 = (String) answerResultFragment.m10819A().m12147A().getValue();
            ExerciseTrainViewModel exerciseTrainViewModelM10819A = this.f12233d.m10819A();
            this.f12230a = answerResultFragment;
            this.f12231b = str2;
            this.f12232c = 1;
            Object objM12160x = exerciseTrainViewModelM10819A.m12160x(this);
            if (objM12160x == objM17291f) {
                return objM17291f;
            }
            str = str2;
            obj = objM12160x;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f12231b;
            answerResultFragment = (AnswerResultFragment) this.f12230a;
            AbstractC9079b.m15926b(obj);
        }
        boolean z10 = !((Boolean) ((InterfaceC9280q) obj).getValue()).booleanValue();
        final AnswerResultFragment answerResultFragment2 = this.f12233d;
        answerResultFragment.m10848L(str, z10, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.exercise.train.c
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AnswerResultFragment$initView$5$1.m10852d(answerResultFragment2);
            }
        });
        return C8736p.f16368a;
    }
}
