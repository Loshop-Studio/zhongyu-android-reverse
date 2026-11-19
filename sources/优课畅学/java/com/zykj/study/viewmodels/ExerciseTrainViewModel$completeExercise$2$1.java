package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseTrainViewModel$completeExercise$2$1", m17801f = "ExerciseTrainViewModel.kt", m17802l = {TbsListener.ErrorCode.FILE_DELETED}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainViewModel$completeExercise$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14118a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainViewModel f14119b;

    /* renamed from: c */
    public final /* synthetic */ int f14120c;

    /* renamed from: d */
    public final /* synthetic */ int f14121d;

    /* renamed from: e */
    public final /* synthetic */ ExerciseBean f14122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainViewModel$completeExercise$2$1(ExerciseTrainViewModel exerciseTrainViewModel, int i10, int i11, ExerciseBean exerciseBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14119b = exerciseTrainViewModel;
        this.f14120c = i10;
        this.f14121d = i11;
        this.f14122e = exerciseBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainViewModel$completeExercise$2$1(this.f14119b, this.f14120c, this.f14121d, this.f14122e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainViewModel$completeExercise$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14118a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        ExerciseRepository exerciseRepositoryM12162z = this.f14119b.m12162z();
        int i11 = this.f14120c;
        int i12 = this.f14121d;
        int groupId = this.f14122e.getGroupId();
        long exerciseId = this.f14122e.getExerciseId();
        this.f14118a = 1;
        Object objM10366b = exerciseRepositoryM12162z.m10366b(i11, i12, groupId, exerciseId, this);
        return objM10366b == objM17291f ? objM17291f : objM10366b;
    }
}
