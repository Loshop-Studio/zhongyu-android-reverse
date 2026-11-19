package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.study.bean.DataStoreManager;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.repository.ExerciseRepository;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseTrainViewModel extends BaseExerciseViewModel {

    /* renamed from: k */
    public final ExerciseRepository f14109k;

    /* renamed from: l */
    public final DataStoreManager f14110l;

    /* renamed from: m */
    public final MutableLiveData f14111m;

    /* renamed from: n */
    public String f14112n;

    /* renamed from: o */
    public final MutableLiveData f14113o;

    /* renamed from: p */
    public final UnPeekLiveData f14114p;

    /* renamed from: q */
    public MutableLiveData f14115q;

    /* renamed from: r */
    public MutableLiveData f14116r;

    /* renamed from: s */
    public boolean f14117s;

    public ExerciseTrainViewModel(ExerciseRepository repository, DataStoreManager dataStoreManager) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(dataStoreManager, "dataStoreManager");
        this.f14109k = repository;
        this.f14110l = dataStoreManager;
        this.f14111m = new MutableLiveData();
        this.f14112n = "";
        this.f14113o = new MutableLiveData();
        this.f14114p = new UnPeekLiveData();
        this.f14115q = new MutableLiveData();
        this.f14116r = new MutableLiveData();
        this.f14117s = true;
    }

    /* renamed from: u */
    public static final boolean m12146u(ExerciseTrainViewModel exerciseTrainViewModel, Throwable e10) {
        AbstractC9133u.m16133g(e10, "e");
        boolean z10 = e10 instanceof RemoteCodeException;
        exerciseTrainViewModel.f14117s = (z10 && ((RemoteCodeException) e10).getErrorCodeInfo().getCode() == 1022) ? false : true;
        return (z10 && ((RemoteCodeException) e10).getErrorCodeInfo().getCode() == 1022) ? false : true;
    }

    /* renamed from: A */
    public final MutableLiveData m12147A() {
        return this.f14115q;
    }

    /* renamed from: B */
    public final MutableLiveData m12148B() {
        return this.f14116r;
    }

    /* renamed from: C */
    public final MutableLiveData m12149C() {
        return this.f14111m;
    }

    /* renamed from: D */
    public final boolean m12150D() {
        return this.f14117s;
    }

    /* renamed from: E */
    public final void m12151E(String keyName, boolean z10) {
        AbstractC9133u.m16133g(keyName, "keyName");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new ExerciseTrainViewModel$markExerciseRevised$1(this, keyName, z10, null), 3, null);
    }

    /* renamed from: F */
    public final void m12152F() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new ExerciseTrainViewModel$removeRevisedKey$1(this, null), 3, null);
    }

    /* renamed from: G */
    public final void m12153G(BlackboardEvaluationFragment fragment, int i10, int i11) {
        AbstractC9133u.m16133g(fragment, "fragment");
        launchData(getToastLiveData(), isDialogVisible(), new ExerciseTrainViewModel$saveScreenshot$1(fragment, i10, i11, this, null));
    }

    /* renamed from: H */
    public final void m12154H(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.f14112n = str;
    }

    /* renamed from: I */
    public final void m12155I(boolean z10) {
        this.f14117s = z10;
    }

    /* renamed from: J */
    public final Object m12156J(int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        launchData(this.f14114p, isDialogVisible(), new ExerciseTrainViewModel$startExercise$2(this, i10, i11, i12, null));
        return C8736p.f16368a;
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: p */
    public void mo12018p() {
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: q */
    public void mo12019q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final Object m12157t(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        ExerciseBean exerciseBean = (ExerciseBean) this.f14113o.getValue();
        if (exerciseBean != null) {
            return ViewModelExtKt.m12314a(this, getToastLiveData(), isDialogVisible(), new ExerciseTrainViewModel$completeExercise$2$1(this, i10, i11, exerciseBean, null), new InterfaceC10570l() { // from class: g5.q0
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ExerciseTrainViewModel.m12146u(this.f16162a, (Throwable) obj));
                }
            }, interfaceC9324c);
        }
        return null;
    }

    /* renamed from: v */
    public final String m12158v() {
        return this.f14112n;
    }

    /* renamed from: w */
    public final MutableLiveData m12159w() {
        return this.f14113o;
    }

    /* renamed from: x */
    public final Object m12160x(InterfaceC9324c interfaceC9324c) {
        return AbstractC9268e.m17005Q(this.f14110l.exerciseRevised(this.f14112n), ViewModelKt.getViewModelScope(this), interfaceC9324c);
    }

    /* renamed from: y */
    public final UnPeekLiveData m12161y() {
        return this.f14114p;
    }

    /* renamed from: z */
    public final ExerciseRepository m12162z() {
        return this.f14109k;
    }
}
