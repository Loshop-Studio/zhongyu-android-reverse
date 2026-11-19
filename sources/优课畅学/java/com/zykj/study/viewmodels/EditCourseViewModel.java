package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableBoolean;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.course.CourseType;
import com.zykj.study.repository.CourseRepository;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class EditCourseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f13992a;

    /* renamed from: b */
    public final DataStore f13993b;

    /* renamed from: c */
    public final ObservableBoolean f13994c;

    /* renamed from: d */
    public final MutableLiveData f13995d;

    /* renamed from: e */
    public final MutableLiveData f13996e;

    /* renamed from: f */
    public final MutableLiveData f13997f;

    /* renamed from: g */
    public final MutableLiveData f13998g;

    /* renamed from: h */
    public final MutableLiveData f13999h;

    /* renamed from: i */
    public final MutableLiveData f14000i;

    /* renamed from: j */
    public final MutableLiveData f14001j;

    /* renamed from: k */
    public final MutableLiveData f14002k;

    /* renamed from: l */
    public final MutableLiveData f14003l;

    /* renamed from: m */
    public final MutableLiveData f14004m;

    /* renamed from: n */
    public final MutableLiveData f14005n;

    /* renamed from: o */
    public final MutableLiveData f14006o;

    /* renamed from: p */
    public final MutableLiveData f14007p;

    public EditCourseViewModel(CourseRepository myCourseRepository, DataStore userDataStore) {
        AbstractC9133u.m16133g(myCourseRepository, "myCourseRepository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f13992a = myCourseRepository;
        this.f13993b = userDataStore;
        this.f13994c = new ObservableBoolean(true);
        this.f13995d = new MutableLiveData(0);
        this.f13996e = new MutableLiveData("");
        this.f13997f = new MutableLiveData("");
        this.f13998g = new MutableLiveData("");
        this.f13999h = new MutableLiveData("");
        this.f14000i = new MutableLiveData(0);
        this.f14001j = new MutableLiveData(0);
        this.f14002k = new MutableLiveData(0);
        this.f14003l = new MutableLiveData(0);
        this.f14004m = new MutableLiveData(0);
        this.f14005n = new MutableLiveData(CourseType.UNDERCARRIAGE);
        this.f14006o = new MutableLiveData(Boolean.FALSE);
        this.f14007p = new MutableLiveData(Boolean.TRUE);
    }

    /* renamed from: a */
    public final MutableLiveData m12083a() {
        return this.f13999h;
    }

    /* renamed from: b */
    public final MutableLiveData m12084b() {
        return this.f14001j;
    }

    /* renamed from: c */
    public final MutableLiveData m12085c() {
        return this.f13995d;
    }

    /* renamed from: d */
    public final MutableLiveData m12086d() {
        return this.f14003l;
    }

    /* renamed from: e */
    public final MutableLiveData m12087e() {
        return this.f14004m;
    }

    /* renamed from: f */
    public final MutableLiveData m12088f() {
        return this.f13996e;
    }

    /* renamed from: g */
    public final CourseRepository m12089g() {
        return this.f13992a;
    }

    /* renamed from: h */
    public final MutableLiveData m12090h() {
        return this.f14000i;
    }

    /* renamed from: i */
    public final MutableLiveData m12091i() {
        return this.f14005n;
    }

    /* renamed from: j */
    public final MutableLiveData m12092j() {
        return this.f14002k;
    }

    /* renamed from: k */
    public final MutableLiveData m12093k() {
        return this.f13997f;
    }

    /* renamed from: l */
    public final MutableLiveData m12094l() {
        return this.f13998g;
    }

    /* renamed from: m */
    public final MutableLiveData m12095m() {
        return this.f14007p;
    }

    /* renamed from: n */
    public final MutableLiveData m12096n() {
        return this.f14006o;
    }

    /* renamed from: o */
    public final ObservableBoolean m12097o() {
        return this.f13994c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12098p(p179m7.InterfaceC9324c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.EditCourseViewModel.m12098p(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/EditCourseViewModel.smali:471
    }
}
