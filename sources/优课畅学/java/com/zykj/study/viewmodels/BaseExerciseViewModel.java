package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionStatus;
import com.zykj.study.bean.teach.ChoiceChartData;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.flow.InterfaceC9198a;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public abstract class BaseExerciseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final MutableLiveData f13884a;

    /* renamed from: b */
    public final MutableLiveData f13885b;

    /* renamed from: c */
    public final MutableLiveData f13886c;

    /* renamed from: d */
    public final MutableLiveData f13887d;

    /* renamed from: e */
    public final InterfaceC9266c f13888e;

    /* renamed from: f */
    public final InterfaceC9271h f13889f;

    /* renamed from: g */
    public final InterfaceC9280q f13890g;

    /* renamed from: h */
    public final InterfaceC9270g f13891h;

    /* renamed from: i */
    public final InterfaceC9275l f13892i;

    /* renamed from: j */
    public final InterfaceC9280q f13893j;

    public BaseExerciseViewModel() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f13884a = mutableLiveData;
        this.f13885b = new MutableLiveData(0);
        this.f13886c = new MutableLiveData();
        this.f13887d = new MutableLiveData(0);
        InterfaceC9266c interfaceC9266cAsFlow = FlowLiveDataConversions.asFlow(mutableLiveData);
        this.f13888e = interfaceC9266cAsFlow;
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(null);
        this.f13889f = interfaceC9271hM17054a;
        this.f13890g = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f13891h = interfaceC9270gM17044b;
        this.f13892i = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        this.f13893j = AbstractC9268e.m17006R(AbstractC9268e.m17021k(interfaceC9266cAsFlow, interfaceC9271hM17054a, new BaseExerciseViewModel$chartDataFlow$1(null)), ViewModelKt.getViewModelScope(this), InterfaceC9198a.f17984a.m16693c(), AbstractC8809v.m14771n());
    }

    /* renamed from: b */
    public final void m12004b(ChoiceChartData clickedItem) {
        AbstractC9133u.m16133g(clickedItem, "clickedItem");
        ChoiceChartData choiceChartData = (ChoiceChartData) this.f13889f.getValue();
        if (AbstractC9133u.m16128b(choiceChartData != null ? choiceChartData.getName() : null, clickedItem.getName())) {
            m12005c(null);
        } else {
            m12005c(clickedItem);
        }
    }

    /* renamed from: c */
    public final void m12005c(ChoiceChartData choiceChartData) {
        this.f13889f.setValue(choiceChartData);
    }

    /* renamed from: d */
    public final InterfaceC9280q m12006d() {
        return this.f13893j;
    }

    /* renamed from: e */
    public final MutableLiveData m12007e() {
        return this.f13885b;
    }

    /* renamed from: f */
    public final MutableLiveData m12008f() {
        return this.f13884a;
    }

    /* renamed from: g */
    public final InterfaceC9275l m12009g() {
        return this.f13892i;
    }

    /* renamed from: h */
    public final MutableLiveData m12010h() {
        return this.f13886c;
    }

    /* renamed from: i */
    public final InterfaceC9280q m12011i() {
        return this.f13890g;
    }

    /* renamed from: j */
    public final MutableLiveData m12012j() {
        return this.f13887d;
    }

    /* renamed from: k */
    public final void m12013k() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BaseExerciseViewModel$goNextQuestion$1(this, null), 3, null);
    }

    /* renamed from: l */
    public final void m12014l() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new BaseExerciseViewModel$goPrevQuestion$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public void m12015m() {
        QuestionBean questionBean;
        List list;
        Object next;
        Object objPrevious;
        List list2 = (List) this.f13886c.getValue();
        if (list2 != null) {
            ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((QuestionBean) objPrevious).getStatus() == QuestionStatus.TO_BE_REVISED) {
                        break;
                    }
                }
            }
            questionBean = (QuestionBean) objPrevious;
        } else {
            questionBean = null;
        }
        if (questionBean == null) {
            List list3 = (List) this.f13886c.getValue();
            if (list3 != null) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((QuestionBean) next).getStatus() == QuestionStatus.UN_ANSWERED) {
                            break;
                        }
                    }
                }
                QuestionBean questionBean2 = (QuestionBean) next;
                if (questionBean2 != null) {
                    this.f13884a.setValue(questionBean2);
                }
            }
        } else {
            this.f13884a.setValue(questionBean);
        }
        if (this.f13884a.getValue() == 0) {
            MutableLiveData mutableLiveData = this.f13884a;
            List list4 = (List) this.f13886c.getValue();
            mutableLiveData.setValue(list4 != null ? (QuestionBean) AbstractC8778f0.m14579y0(list4) : null);
        }
        QuestionBean questionBean3 = (QuestionBean) this.f13884a.getValue();
        if (questionBean3 != null && (list = (List) this.f13886c.getValue()) != null) {
            this.f13885b.setValue(Integer.valueOf(list.indexOf(questionBean3)));
        }
        MutableLiveData mutableLiveData2 = this.f13887d;
        List list5 = (List) this.f13886c.getValue();
        mutableLiveData2.setValue(list5 != null ? Integer.valueOf(list5.size()) : null);
    }

    /* renamed from: n */
    public final boolean m12016n() {
        List list = (List) this.f13886c.getValue();
        if (list != null) {
            return AbstractC9133u.m16128b(AbstractC8778f0.m14566l0(list), this.f13884a.getValue());
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m12017o() {
        List list = (List) this.f13886c.getValue();
        if (list != null) {
            return AbstractC9133u.m16128b(AbstractC8778f0.m14578x0(list), this.f13884a.getValue());
        }
        return false;
    }

    /* renamed from: p */
    public abstract void mo12018p();

    /* renamed from: q */
    public abstract void mo12019q();
}
