package com.zykj.study.viewmodels;

import com.zykj.study.bean.DataStoreManager;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseTrainViewModel$removeRevisedKey$1", m17801f = "ExerciseTrainViewModel.kt", m17802l = {90}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainViewModel$removeRevisedKey$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14127a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainViewModel f14128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainViewModel$removeRevisedKey$1(ExerciseTrainViewModel exerciseTrainViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14128b = exerciseTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainViewModel$removeRevisedKey$1(this.f14128b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainViewModel$removeRevisedKey$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14127a;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DataStoreManager dataStoreManager = this.f14128b.f14110l;
                String strM12158v = this.f14128b.m12158v();
                this.f14127a = 1;
                if (dataStoreManager.removeKey(strM12158v, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
        } catch (Exception unused) {
        }
        return C8736p.f16368a;
    }
}
