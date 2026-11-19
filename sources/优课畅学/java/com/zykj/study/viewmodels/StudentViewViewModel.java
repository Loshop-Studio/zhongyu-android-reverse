package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.TeachCourseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class StudentViewViewModel extends BaseViewModel {

    /* renamed from: a */
    public final TeachCourseRepository f14392a;

    /* renamed from: b */
    public MutableLiveData f14393b;

    /* renamed from: c */
    public MutableLiveData f14394c;

    /* renamed from: d */
    public MutableLiveData f14395d;

    /* renamed from: e */
    public MutableLiveData f14396e;

    /* renamed from: f */
    public final MutableLiveData f14397f;

    /* renamed from: g */
    public final MutableLiveData f14398g;

    public StudentViewViewModel(TeachCourseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14392a = repository;
        this.f14393b = new MutableLiveData();
        this.f14394c = new MutableLiveData();
        this.f14395d = new MutableLiveData("");
        this.f14396e = new MutableLiveData();
        this.f14397f = new MutableLiveData();
        this.f14398g = new MutableLiveData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Object m12266a(int i10, InterfaceC9324c interfaceC9324c) {
        Integer num = (Integer) this.f14393b.getValue();
        if (num == null) {
            return AbstractC9536a.m17796a(false);
        }
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new StudentViewViewModel$addSuperviseGroup$2$1(this, i10, num.intValue(), null), interfaceC9324c);
    }

    /* renamed from: b */
    public final MutableLiveData m12267b() {
        return this.f14394c;
    }

    /* renamed from: c */
    public final MutableLiveData m12268c() {
        return this.f14398g;
    }

    /* renamed from: d */
    public final MutableLiveData m12269d() {
        return this.f14396e;
    }

    /* renamed from: e */
    public final TeachCourseRepository m12270e() {
        return this.f14392a;
    }

    /* renamed from: f */
    public final MutableLiveData m12271f() {
        return this.f14395d;
    }

    /* renamed from: g */
    public final MutableLiveData m12272g() {
        return this.f14397f;
    }

    /* renamed from: h */
    public final MutableLiveData m12273h() {
        return this.f14393b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m12274i() {
        Integer num = (Integer) this.f14393b.getValue();
        if (num != null) {
            launchData(getToastLiveData(), isDialogVisible(), new StudentViewViewModel$initCourseBindList$1$1(this, num.intValue(), null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m12275j() {
        Integer num = (Integer) this.f14393b.getValue();
        if (num != null) {
            launchData(getToastLiveData(), isDialogVisible(), new StudentViewViewModel$initSuperviseGroup$1$1(this, num.intValue(), null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final Object m12276k(int i10, InterfaceC9324c interfaceC9324c) {
        Integer num = (Integer) this.f14393b.getValue();
        if (num == null) {
            return AbstractC9536a.m17796a(false);
        }
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new StudentViewViewModel$refreshSuperviseGroupMember$2$1(this, num.intValue(), i10, null), interfaceC9324c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final Object m12277l(int i10, InterfaceC9324c interfaceC9324c) {
        Integer num = (Integer) this.f14393b.getValue();
        if (num == null) {
            return AbstractC9536a.m17796a(false);
        }
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new StudentViewViewModel$removeSuperviseGroup$2$1(this, num.intValue(), i10, null), interfaceC9324c);
    }
}
