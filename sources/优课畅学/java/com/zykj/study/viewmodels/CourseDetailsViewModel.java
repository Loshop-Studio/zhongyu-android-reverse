package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.repository.CourseRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8811w;
import p169l8.InterfaceC9271h;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseDetailsViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f13917a;

    /* renamed from: b */
    public final DataStore f13918b;

    /* renamed from: c */
    public final InterfaceC9271h f13919c;

    /* renamed from: d */
    public final LiveData f13920d;

    /* renamed from: e */
    public MutableLiveData f13921e;

    /* renamed from: f */
    public MutableLiveData f13922f;

    /* renamed from: g */
    public final HashSet f13923g;

    public CourseDetailsViewModel(CourseRepository repository, DataStore userDataStore, InterfaceC9271h headerBeanFlow) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        this.f13917a = repository;
        this.f13918b = userDataStore;
        this.f13919c = headerBeanFlow;
        this.f13920d = FlowLiveDataConversions.asLiveData$default(userDataStore.getData(), (InterfaceC9100d) null, 0L, 3, (Object) null);
        this.f13921e = new MutableLiveData();
        this.f13922f = new MutableLiveData();
        this.f13923g = new HashSet();
    }

    /* renamed from: a */
    public final List m12035a(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CatalogBean catalogBean = (CatalogBean) it.next();
                arrayList2.add(Boolean.valueOf(arrayList.add(new SelectModel(this.f13923g.contains(Integer.valueOf(catalogBean.getId())), catalogBean))));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final MutableLiveData m12036b() {
        return this.f13921e;
    }

    /* renamed from: c */
    public final MutableLiveData m12037c() {
        return this.f13922f;
    }

    /* renamed from: d */
    public final InterfaceC9271h m12038d() {
        return this.f13919c;
    }

    /* renamed from: e */
    public final CourseRepository m12039e() {
        return this.f13917a;
    }

    /* renamed from: f */
    public final HashSet m12040f() {
        return this.f13923g;
    }

    /* renamed from: g */
    public final LiveData m12041g() {
        return this.f13920d;
    }

    /* renamed from: h */
    public final DataStore m12042h() {
        return this.f13918b;
    }

    /* renamed from: i */
    public final void m12043i(int i10) {
        launch(getToastLiveData(), isDialogVisible(), new CourseDetailsViewModel$loadCourseDetails$1(this, i10, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m12044j() {
        CourseDetailsBean courseDetailsBean = (CourseDetailsBean) this.f13921e.getValue();
        if (courseDetailsBean != null) {
            launch(getToastLiveData(), isDialogVisible(), new CourseDetailsViewModel$subscribe$1$1(this, courseDetailsBean, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m12045k() {
        CourseDetailsBean courseDetailsBean = (CourseDetailsBean) this.f13921e.getValue();
        if (courseDetailsBean != null) {
            launch(getToastLiveData(), isDialogVisible(), new CourseDetailsViewModel$teach$1$1(this, courseDetailsBean, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m12046l() {
        CourseDetailsBean courseDetailsBean = (CourseDetailsBean) this.f13921e.getValue();
        if (courseDetailsBean != null) {
            launch(getToastLiveData(), isDialogVisible(), new CourseDetailsViewModel$unSubscribe$1$1(this, courseDetailsBean, null));
        }
    }
}
