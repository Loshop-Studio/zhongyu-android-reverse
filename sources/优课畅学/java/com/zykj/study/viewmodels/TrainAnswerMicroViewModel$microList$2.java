package com.zykj.study.viewmodels;

import com.zykj.study.repository.ExerciseRepository;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TrainAnswerMicroViewModel$microList$2", m17801f = "TrainAnswerMicroViewModel.kt", m17802l = {22}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TrainAnswerMicroViewModel$microList$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14485a;

    /* renamed from: b */
    public final /* synthetic */ TrainAnswerMicroViewModel f14486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainAnswerMicroViewModel$microList$2(TrainAnswerMicroViewModel trainAnswerMicroViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14486b = trainAnswerMicroViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TrainAnswerMicroViewModel$microList$2(this.f14486b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TrainAnswerMicroViewModel$microList$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14485a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12305i = this.f14486b.m12305i();
            int iM12022b = this.f14486b.m12022b();
            String id = this.f14486b.m12023c().getId();
            this.f14485a = 1;
            obj = exerciseRepositoryM12305i.m10374j(iM12022b, id, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return (List) obj;
    }
}
