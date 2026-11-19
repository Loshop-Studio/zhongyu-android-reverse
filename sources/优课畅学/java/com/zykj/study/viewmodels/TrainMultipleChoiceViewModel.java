package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.repository.ExerciseRepository;
import com.zykj.study.utils.ChoiceList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class TrainMultipleChoiceViewModel extends BaseTrainViewModel {

    /* renamed from: e */
    public final ExerciseRepository f14494e;

    public TrainMultipleChoiceViewModel(ExerciseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14494e = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m12308m(com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$1
            if (r0 == 0) goto L14
            r0 = r9
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$1 r0 = (com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$1) r0
            int r1 = r0.f14498d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14498d = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$1 r0 = new com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$1
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.f14496b
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14498d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r5.f14495a
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel r8 = (com.zykj.study.viewmodels.TrainMultipleChoiceViewModel) r8
            kotlin.AbstractC9079b.m15926b(r9)
            goto L54
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.AbstractC9079b.m15926b(r9)
            com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$2 r4 = new com.zykj.study.viewmodels.TrainMultipleChoiceViewModel$microList$2
            r9 = 0
            r4.<init>(r8, r9)
            java.lang.Object r9 = p201o7.AbstractC9543h.m17814a(r8)
            r5.f14495a = r9
            r5.f14498d = r2
            r2 = 0
            r3 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            java.lang.Object r9 = com.zykj.base.BaseViewModel.launchAsyncData$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L54
            return r0
        L54:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L5d
            java.util.List r8 = p134i7.AbstractC8809v.m14771n()
            return r8
        L5d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.TrainMultipleChoiceViewModel.m12308m(com.zykj.study.viewmodels.TrainMultipleChoiceViewModel, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/TrainMultipleChoiceViewModel.smali:48
    }

    /* renamed from: i */
    public final boolean m12309i(ChoiceList answerList) {
        AbstractC9133u.m16133g(answerList, "answerList");
        boolean zM12311k = m12311k(answerList, m12023c().getStandardAnswerList());
        m12313n(zM12311k, answerList.toString());
        return zM12311k;
    }

    /* renamed from: j */
    public final ExerciseRepository m12310j() {
        return this.f14494e;
    }

    /* renamed from: k */
    public final boolean m12311k(List list, List list2) {
        return AbstractC8778f0.m14527D0(list, list2).isEmpty() && AbstractC8778f0.m14527D0(list2, list).isEmpty();
    }

    /* renamed from: l */
    public Object m12312l(InterfaceC9324c interfaceC9324c) {
        return m12308m(this, interfaceC9324c);
    }

    /* renamed from: n */
    public final void m12313n(boolean z10, String str) {
        if (m12023c().getStatus() == QuestionStatus.UN_ANSWERED || z10) {
            BaseViewModel.launch$default(this, getToastLiveData(), null, new TrainMultipleChoiceViewModel$uploadAnswer$1(this, z10, str, null), 2, null);
        }
    }
}
