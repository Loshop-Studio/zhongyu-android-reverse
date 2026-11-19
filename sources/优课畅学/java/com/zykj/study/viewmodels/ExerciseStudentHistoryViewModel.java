package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.repository.ExerciseRepository;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseStudentHistoryViewModel extends BaseExerciseViewModel {

    /* renamed from: k */
    public final ExerciseRepository f14094k;

    /* renamed from: l */
    public final MutableLiveData f14095l;

    /* renamed from: m */
    public final MutableLiveData f14096m;

    public ExerciseStudentHistoryViewModel(ExerciseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14094k = repository;
        this.f14095l = new MutableLiveData();
        this.f14096m = new MutableLiveData();
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: p */
    public void mo12018p() {
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: q */
    public void mo12019q() {
    }

    /* renamed from: r */
    public final MutableLiveData m12137r() {
        return this.f14095l;
    }

    /* renamed from: s */
    public final MutableLiveData m12138s() {
        return this.f14096m;
    }

    /* renamed from: t */
    public final ExerciseRepository m12139t() {
        return this.f14094k;
    }

    /* renamed from: u */
    public final void m12140u(int i10) {
        List list = (List) m12010h().getValue();
        QuestionBean questionBean = list != null ? (QuestionBean) list.get(i10) : null;
        if (questionBean != null) {
            m12007e().setValue(Integer.valueOf(i10));
            m12008f().setValue(questionBean);
        } else {
            m12007e().setValue(0);
            MutableLiveData mutableLiveDataM12008f = m12008f();
            List list2 = (List) m12010h().getValue();
            mutableLiveDataM12008f.setValue(list2 != null ? (QuestionBean) AbstractC8778f0.m14568n0(list2) : null);
        }
    }

    /* renamed from: v */
    public final void m12141v(ExerciseBean exerciseBean) {
        AbstractC9133u.m16133g(exerciseBean, "exerciseBean");
        this.f14095l.postValue(exerciseBean);
    }

    /* renamed from: w */
    public final void m12142w(int i10) {
        launchData(getToastLiveData(), isDialogVisible(), new ExerciseStudentHistoryViewModel$loadGroupDetails$1(this, i10, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12143x(int r9, java.lang.String r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$1
            if (r0 == 0) goto L14
            r0 = r11
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$1 r0 = (com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$1) r0
            int r1 = r0.f14104e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14104e = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$1 r0 = new com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f14102c
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14104e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r5.f14101b
            java.lang.String r9 = (java.lang.String) r9
            kotlin.AbstractC9079b.m15926b(r11)
            goto L56
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.AbstractC9079b.m15926b(r11)
            com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$2 r4 = new com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$2
            r11 = 0
            r4.<init>(r8, r9, r10, r11)
            java.lang.Object r10 = p201o7.AbstractC9543h.m17814a(r10)
            r5.f14101b = r10
            r5.f14100a = r9
            r5.f14104e = r2
            r2 = 0
            r3 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            java.lang.Object r11 = com.zykj.base.BaseViewModel.launchAsyncData$default(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L56
            return r0
        L56:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L5f
            java.util.List r9 = p134i7.AbstractC8809v.m14771n()
            return r9
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel.m12143x(int, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ExerciseStudentHistoryViewModel.smali:365
    }
}
