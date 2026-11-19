package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$uploadAnswer$1", m17801f = "TrainMultipleChoiceViewModel.kt", m17802l = {C3721BR.webViewControlViewModel}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TrainMultipleChoiceViewModel$uploadAnswer$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14501a;

    /* renamed from: b */
    public final /* synthetic */ TrainMultipleChoiceViewModel f14502b;

    /* renamed from: c */
    public final /* synthetic */ boolean f14503c;

    /* renamed from: d */
    public final /* synthetic */ String f14504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainMultipleChoiceViewModel$uploadAnswer$1(TrainMultipleChoiceViewModel trainMultipleChoiceViewModel, boolean z10, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14502b = trainMultipleChoiceViewModel;
        this.f14503c = z10;
        this.f14504d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TrainMultipleChoiceViewModel$uploadAnswer$1(this.f14502b, this.f14503c, this.f14504d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TrainMultipleChoiceViewModel$uploadAnswer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TrainMultipleChoiceViewModel$uploadAnswer$1 trainMultipleChoiceViewModel$uploadAnswer$1;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14501a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12310j = this.f14502b.m12310j();
            long jM12021a = this.f14502b.m12021a();
            int iM12022b = this.f14502b.m12022b();
            String id = this.f14502b.m12023c().getId();
            boolean z10 = this.f14503c;
            String str = this.f14504d;
            this.f14501a = 1;
            trainMultipleChoiceViewModel$uploadAnswer$1 = this;
            if (exerciseRepositoryM12310j.m10377m(jM12021a, iM12022b, id, z10, str, trainMultipleChoiceViewModel$uploadAnswer$1) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            trainMultipleChoiceViewModel$uploadAnswer$1 = this;
        }
        trainMultipleChoiceViewModel$uploadAnswer$1.f14502b.m12023c().setStatus(QuestionStatus.ANSWERED);
        return C8736p.f16368a;
    }
}
