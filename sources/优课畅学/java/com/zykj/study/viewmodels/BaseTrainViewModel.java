package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.exercise.QuestionBean;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public abstract class BaseTrainViewModel extends BaseViewModel {

    /* renamed from: a */
    public long f13901a;

    /* renamed from: b */
    public int f13902b;

    /* renamed from: c */
    public QuestionBean f13903c;

    /* renamed from: d */
    public boolean f13904d;

    /* renamed from: a */
    public final long m12021a() {
        return this.f13901a;
    }

    /* renamed from: b */
    public final int m12022b() {
        return this.f13902b;
    }

    /* renamed from: c */
    public final QuestionBean m12023c() {
        QuestionBean questionBean = this.f13903c;
        if (questionBean != null) {
            return questionBean;
        }
        AbstractC9133u.m16151y("questionBean");
        return null;
    }

    /* renamed from: d */
    public final boolean m12024d() {
        return this.f13904d;
    }

    /* renamed from: e */
    public final void m12025e(long j10) {
        this.f13901a = j10;
    }

    /* renamed from: f */
    public final void m12026f(int i10) {
        this.f13902b = i10;
    }

    /* renamed from: g */
    public final void m12027g(boolean z10) {
        this.f13904d = z10;
    }

    /* renamed from: h */
    public final void m12028h(QuestionBean questionBean) {
        AbstractC9133u.m16133g(questionBean, "<set-?>");
        this.f13903c = questionBean;
    }
}
