package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.data.CourseStudyKeyEntity;
import com.zykj.study.repository.CourseRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public class StudyViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f14419a;

    /* renamed from: b */
    public final DataStore f14420b;

    /* renamed from: c */
    public final InterfaceC9271h f14421c;

    /* renamed from: d */
    public CourseStudyKeyEntity f14422d;

    /* renamed from: e */
    public InterfaceC9266c f14423e;

    /* renamed from: f */
    public final MutableLiveData f14424f;

    /* renamed from: g */
    public int f14425g;

    /* renamed from: h */
    public final MutableLiveData f14426h;

    /* renamed from: i */
    public final InterfaceC9266c f14427i;

    /* renamed from: j */
    public final HashSet f14428j;

    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$1", m17801f = "StudyViewModel.kt", m17802l = {61, 62}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.viewmodels.StudyViewModel$1 */
    public static final class C81511 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f14445a;

        /* renamed from: b */
        public Object f14446b;

        /* renamed from: c */
        public int f14447c;

        /* renamed from: d */
        public int f14448d;

        public C81511(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyViewModel.this.new C81511(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81511) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.f14448d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f14446b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r5.f14445a
                com.zykj.study.viewmodels.StudyViewModel r0 = (com.zykj.study.viewmodels.StudyViewModel) r0
                kotlin.AbstractC9079b.m15926b(r6)
                goto L61
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                kotlin.AbstractC9079b.m15926b(r6)
                goto L3c
            L26:
                kotlin.AbstractC9079b.m15926b(r6)
                com.zykj.study.viewmodels.StudyViewModel r6 = com.zykj.study.viewmodels.StudyViewModel.this
                androidx.datastore.core.DataStore r6 = r6.m12290m()
                l8.c r6 = r6.getData()
                r5.f14448d = r3
                java.lang.Object r6 = p169l8.AbstractC9268e.m17036z(r6, r5)
                if (r6 != r0) goto L3c
                goto L5f
            L3c:
                com.zykj.lib.login.proto.UserBean r6 = (com.zykj.lib.login.proto.UserBean) r6
                if (r6 == 0) goto L83
                java.lang.String r6 = r6.getId()
                if (r6 == 0) goto L83
                com.zykj.study.viewmodels.StudyViewModel r1 = com.zykj.study.viewmodels.StudyViewModel.this
                com.zykj.study.repository.CourseRepository r3 = r1.m12287j()
                r5.f14445a = r1
                java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r6)
                r5.f14446b = r4
                r4 = 0
                r5.f14447c = r4
                r5.f14448d = r2
                java.lang.Object r6 = r3.m10343o(r6, r5)
                if (r6 != r0) goto L60
            L5f:
                return r0
            L60:
                r0 = r1
            L61:
                com.zykj.study.data.CourseStudyKeyEntity r6 = (com.zykj.study.data.CourseStudyKeyEntity) r6
                if (r6 == 0) goto L7b
                r0.m12292o(r6)
                com.zykj.study.repository.CourseRepository r1 = r0.m12287j()
                l8.c r6 = r1.m10345q(r6)
                i8.b0 r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
                l8.c r6 = androidx.paging.CachedPagingDataKt.cachedIn(r6, r1)
                r0.m12293p(r6)
            L7b:
                androidx.lifecycle.MutableLiveData r6 = r0.m12289l()
                r0 = 0
                r6.postValue(r0)
            L83:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.StudyViewModel.C81511.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/StudyViewModel$1.smali:126
        }
    }

    public StudyViewModel(CourseRepository respository, DataStore userDataStore, InterfaceC9271h headerBeanFlow) {
        AbstractC9133u.m16133g(respository, "respository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        this.f14419a = respository;
        this.f14420b = userDataStore;
        this.f14421c = headerBeanFlow;
        MutableLiveData mutableLiveData = new MutableLiveData(null);
        this.f14424f = mutableLiveData;
        this.f14426h = new MutableLiveData();
        BaseViewModel.launch$default(this, null, null, new C81511(null), 3, null);
        this.f14427i = CachedPagingDataKt.cachedIn(AbstractC9268e.m17009U(FlowLiveDataConversions.asFlow(mutableLiveData), new StudyViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this));
        this.f14428j = new HashSet();
    }

    /* renamed from: e */
    public static final boolean m12279e(Throwable e10) {
        AbstractC9133u.m16133g(e10, "e");
        return ((e10 instanceof RemoteCodeException) && ((RemoteCodeException) e10).getErrorCodeInfo().getCode() == 1022) ? false : true;
    }

    /* renamed from: b */
    public final List m12280b(List list) {
        if (list == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogBean catalogBean = (CatalogBean) it.next();
            arrayList.add(new SelectModel(this.f14428j.contains(Integer.valueOf(catalogBean.getId())), catalogBean));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final int m12281c() {
        return this.f14425g;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12282d(int r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$1
            if (r0 == 0) goto L14
            r0 = r11
            com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$1 r0 = (com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$1) r0
            int r1 = r0.f14458d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14458d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$1 r0 = new com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$1
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f14456b
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.f14458d
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L35
            if (r1 != r8) goto L2d
            kotlin.AbstractC9079b.m15926b(r11)
            r1 = r9
            goto L56
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.AbstractC9079b.m15926b(r11)
            com.kunminx.architecture.ui.callback.UnPeekLiveData r2 = r9.getToastLiveData()
            com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r9.isDialogVisible()
            com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$2 r4 = new com.zykj.study.viewmodels.StudyViewModel$getCourseDetails$2
            r4.<init>(r9, r10, r7)
            g5.a3 r5 = new g5.a3
            r5.<init>()
            r6.f14455a = r10
            r6.f14458d = r8
            r1 = r9
            java.lang.Object r11 = com.zykj.study.viewmodels.ViewModelExtKt.m12314a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Boolean r10 = p201o7.AbstractC9536a.m17796a(r8)
            boolean r10 = kotlin.jvm.internal.AbstractC9133u.m16128b(r11, r10)
            if (r10 != 0) goto L67
            androidx.lifecycle.MutableLiveData r10 = r1.f14426h
            r10.postValue(r7)
        L67:
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.StudyViewModel.m12282d(int, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/StudyViewModel.smali:423
    }

    /* renamed from: f */
    public final MutableLiveData m12283f() {
        return this.f14426h;
    }

    /* renamed from: g */
    public final InterfaceC9266c m12284g() {
        return this.f14427i;
    }

    /* renamed from: h */
    public final InterfaceC9271h m12285h() {
        return this.f14421c;
    }

    /* renamed from: i */
    public final InterfaceC9266c m12286i() {
        return this.f14423e;
    }

    /* renamed from: j */
    public final CourseRepository m12287j() {
        return this.f14419a;
    }

    /* renamed from: k */
    public final HashSet m12288k() {
        return this.f14428j;
    }

    /* renamed from: l */
    public final MutableLiveData m12289l() {
        return this.f14424f;
    }

    /* renamed from: m */
    public final DataStore m12290m() {
        return this.f14420b;
    }

    /* renamed from: n */
    public final void m12291n(int i10) {
        this.f14425g = i10;
    }

    /* renamed from: o */
    public final void m12292o(CourseStudyKeyEntity courseStudyKeyEntity) {
        this.f14422d = courseStudyKeyEntity;
    }

    /* renamed from: p */
    public final void m12293p(InterfaceC9266c interfaceC9266c) {
        this.f14423e = interfaceC9266c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final void m12294q() {
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) this.f14424f.getValue();
        if (courseStudyEntity != null) {
            launch(getToastLiveData(), isDialogVisible(), new StudyViewModel$teach$1$1(this, courseStudyEntity, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m12295r() {
        CourseStudyEntity courseStudyEntity = (CourseStudyEntity) this.f14424f.getValue();
        if (courseStudyEntity != null) {
            launch(getToastLiveData(), isDialogVisible(), new StudyViewModel$unSubscribe$1$1(this, courseStudyEntity, null));
        }
    }
}
