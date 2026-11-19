package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.CourseRepository;
import java.util.HashSet;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f14240a;

    /* renamed from: b */
    public final DataStore f14241b;

    /* renamed from: c */
    public final InterfaceC9271h f14242c;

    /* renamed from: d */
    public final LiveData f14243d;

    /* renamed from: e */
    public final InterfaceC9271h f14244e;

    /* renamed from: f */
    public LiveData f14245f;

    /* renamed from: g */
    public int f14246g;

    /* renamed from: h */
    public final HashSet f14247h;

    public MyCourseDetailsViewModel(CourseRepository repository, DataStore userDataStore, InterfaceC9271h headerBeanFlow) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        this.f14240a = repository;
        this.f14241b = userDataStore;
        this.f14242c = headerBeanFlow;
        this.f14243d = FlowLiveDataConversions.asLiveData$default(userDataStore.getData(), (InterfaceC9100d) null, 0L, 3, (Object) null);
        Result.C9076a c9076a = Result.f17350b;
        this.f14244e = AbstractC9281r.m17054a(Result.m15908a(Result.m15909b(AbstractC8809v.m14771n())));
        this.f14247h = new HashSet();
    }

    /* renamed from: c */
    public final void m12205c(int i10, String title, int i11, boolean z10) {
        AbstractC9133u.m16133g(title, "title");
        launch(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$addCatalog$1(this, i10, title, i11, z10, null));
    }

    /* renamed from: d */
    public final void m12206d(int i10) {
        launch(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$deleteChapter$1(this, i10, null));
    }

    /* renamed from: e */
    public final Object m12207e(int i10, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$deleteCourse$2(this, i10, null), interfaceC9324c);
    }

    /* renamed from: f */
    public final InterfaceC9271h m12208f() {
        return this.f14244e;
    }

    /* renamed from: g */
    public final void m12209g(int i10) {
        ViewModelExtKt.m12316c(this, getToastLiveData(), null, new MyCourseDetailsViewModel$getCatalogList$1(this, i10, null), new MyCourseDetailsViewModel$getCatalogList$2(this, null), 2, null);
    }

    /* renamed from: h */
    public final int m12210h() {
        return this.f14246g;
    }

    /* renamed from: i */
    public final InterfaceC9271h m12211i() {
        return this.f14242c;
    }

    /* renamed from: j */
    public final LiveData m12212j() {
        LiveData liveData = this.f14245f;
        if (liveData != null) {
            return liveData;
        }
        AbstractC9133u.m16151y("myCourseEntity");
        return null;
    }

    /* renamed from: k */
    public final HashSet m12213k() {
        return this.f14247h;
    }

    /* renamed from: l */
    public final LiveData m12214l() {
        return this.f14243d;
    }

    /* renamed from: m */
    public final void m12215m(int i10) {
        launch(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$ground$1(this, i10, null));
    }

    /* renamed from: n */
    public final void m12216n(int i10) {
        this.f14246g = i10;
        if (this.f14245f != null) {
            return;
        }
        m12218p(this.f14240a.m10339i(i10));
        m12209g(i10);
    }

    /* renamed from: o */
    public final void m12217o(List catalogBeanList) {
        AbstractC9133u.m16133g(catalogBeanList, "catalogBeanList");
        ViewModelExtKt.m12315b(this, getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$reorderCatalog$1(this, catalogBeanList, null), new MyCourseDetailsViewModel$reorderCatalog$2(this, null));
    }

    /* renamed from: p */
    public final void m12218p(LiveData liveData) {
        AbstractC9133u.m16133g(liveData, "<set-?>");
        this.f14245f = liveData;
    }

    /* renamed from: q */
    public final void m12219q(int i10) {
        launch(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$undercarriage$1(this, i10, null));
    }

    /* renamed from: r */
    public final void m12220r(int i10, String title) {
        AbstractC9133u.m16133g(title, "title");
        launch(getToastLiveData(), isDialogVisible(), new MyCourseDetailsViewModel$updateCatalog$1(this, i10, title, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12221s(p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.zykj.study.viewmodels.MyCourseDetailsViewModel$updateCatalogWithoutScope$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.viewmodels.MyCourseDetailsViewModel$updateCatalogWithoutScope$1 r0 = (com.zykj.study.viewmodels.MyCourseDetailsViewModel$updateCatalogWithoutScope$1) r0
            int r1 = r0.f14284c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14284c = r1
            goto L18
        L13:
            com.zykj.study.viewmodels.MyCourseDetailsViewModel$updateCatalogWithoutScope$1 r0 = new com.zykj.study.viewmodels.MyCourseDetailsViewModel$updateCatalogWithoutScope$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f14282a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f14284c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            com.zykj.study.repository.CourseRepository r6 = r5.f14240a
            int r2 = r5.f14246g
            r0.f14284c = r3
            java.lang.Object r6 = r6.m10340j(r2, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6
            l8.h r0 = r5.f14244e
            kotlin.Result$a r1 = kotlin.Result.f17350b
            java.util.List r6 = p220q4.AbstractC9801a.m18353a(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p134i7.AbstractC8811w.m14786x(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r6.next()
            com.zykj.study.bean.course.CatalogBean r2 = (com.zykj.study.bean.course.CatalogBean) r2
            java.util.HashSet r3 = r5.f14247h
            int r4 = r2.getId()
            java.lang.Integer r4 = p201o7.AbstractC9536a.m17798c(r4)
            boolean r3 = r3.contains(r4)
            r2.setExpanded(r3)
            r1.add(r2)
            goto L5a
        L7b:
            java.lang.Object r6 = kotlin.Result.m15909b(r1)
            kotlin.Result r6 = kotlin.Result.m15908a(r6)
            r0.setValue(r6)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12221s(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/MyCourseDetailsViewModel.smali:741
    }
}
