package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.zykj.base.BaseViewModel;
import com.zykj.study.data.GradeEntity;
import com.zykj.study.data.PeriodEntity;
import com.zykj.study.data.SubjectEntity;
import com.zykj.study.repository.DictRepository;
import com.zykj.study.viewmodels.DictViewModel;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class DictViewModel extends BaseViewModel {

    /* renamed from: a */
    public final DictRepository f13985a;

    /* renamed from: b */
    public List f13986b;

    /* renamed from: c */
    public List f13987c;

    /* renamed from: d */
    public List f13988d;

    /* renamed from: com.zykj.study.viewmodels.DictViewModel$a */
    public static final class C8143a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13989a;

        public C8143a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13989a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13989a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13989a.invoke(obj);
        }
    }

    public DictViewModel(DictRepository dictRepository) {
        AbstractC9133u.m16133g(dictRepository, "dictRepository");
        this.f13985a = dictRepository;
        dictRepository.m10362g().observeForever(new C8143a(new InterfaceC10570l() { // from class: g5.y
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return DictViewModel.m12072d(this.f16185a, (List) obj);
            }
        }));
        dictRepository.m10361f().observeForever(new C8143a(new InterfaceC10570l() { // from class: g5.z
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return DictViewModel.m12073e(this.f16188a, (List) obj);
            }
        }));
        dictRepository.m10363h().observeForever(new C8143a(new InterfaceC10570l() { // from class: g5.a0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return DictViewModel.m12074f(this.f16109a, (List) obj);
            }
        }));
    }

    /* renamed from: d */
    public static final C8736p m12072d(DictViewModel dictViewModel, List list) {
        dictViewModel.f13987c = list;
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public static final C8736p m12073e(DictViewModel dictViewModel, List list) {
        dictViewModel.f13988d = list;
        return C8736p.f16368a;
    }

    /* renamed from: f */
    public static final C8736p m12074f(DictViewModel dictViewModel, List list) {
        dictViewModel.f13986b = list;
        return C8736p.f16368a;
    }

    /* renamed from: h */
    public final List m12076h() {
        return this.f13988d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final String m12077i(int i10, int i11) {
        GradeEntity gradeEntity;
        String name;
        Object objPrevious;
        List list = this.f13988d;
        PeriodEntity periodEntity = null;
        if (list != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((GradeEntity) objPrevious).getId() == i11) {
                    break;
                }
            }
            gradeEntity = (GradeEntity) objPrevious;
        } else {
            gradeEntity = null;
        }
        if (gradeEntity != null) {
            return gradeEntity.getName();
        }
        List list2 = this.f13987c;
        if (list2 != null) {
            ListIterator listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                Object objPrevious2 = listIterator2.previous();
                if (((PeriodEntity) objPrevious2).getId() == i10) {
                    periodEntity = objPrevious2;
                    break;
                }
            }
            periodEntity = periodEntity;
        }
        return (periodEntity == null || (name = periodEntity.getName()) == null) ? "" : name;
    }

    /* renamed from: j */
    public final List m12078j() {
        return this.f13987c;
    }

    /* renamed from: k */
    public final String m12079k(int i10, int i11, int i12) {
        return AbstractC8661c0.m13982W0(m12077i(i10, i11) + "  " + m12081m(i12)).toString();
    }

    /* renamed from: l */
    public final List m12080l() {
        return this.f13986b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final String m12081m(int i10) {
        String name;
        List list = this.f13986b;
        SubjectEntity subjectEntity = null;
        if (list != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((SubjectEntity) objPrevious).getId() == i10) {
                    subjectEntity = objPrevious;
                    break;
                }
            }
            subjectEntity = subjectEntity;
        }
        return (subjectEntity == null || (name = subjectEntity.getName()) == null) ? "" : name;
    }

    /* renamed from: n */
    public final void m12082n() {
        BaseViewModel.launchData$default(this, null, null, new DictViewModel$initDict$1(this, null), 3, null);
    }
}
