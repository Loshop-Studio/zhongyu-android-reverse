package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class StudentViewContentViewModel extends BaseViewModel {

    /* renamed from: a */
    public final DataStore f14384a;

    /* renamed from: b */
    public final TeachCourseRepository f14385b;

    /* renamed from: c */
    public final MutableLiveData f14386c;

    /* renamed from: d */
    public final HashSet f14387d;

    public StudentViewContentViewModel(DataStore userDataStore, TeachCourseRepository repository) {
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(repository, "repository");
        this.f14384a = userDataStore;
        this.f14385b = repository;
        this.f14386c = new MutableLiveData();
        this.f14387d = new HashSet();
    }

    /* renamed from: a */
    public final MutableLiveData m12261a() {
        return this.f14386c;
    }

    /* renamed from: b */
    public final TeachCourseRepository m12262b() {
        return this.f14385b;
    }

    /* renamed from: c */
    public final HashSet m12263c() {
        return this.f14387d;
    }

    /* renamed from: d */
    public final DataStore m12264d() {
        return this.f14384a;
    }

    /* renamed from: e */
    public final void m12265e(int i10, String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        launchData(getToastLiveData(), isDialogVisible(), new StudentViewContentViewModel$initMemberProgress$1(this, i10, userId, null));
    }
}
