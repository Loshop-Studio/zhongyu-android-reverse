package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.base.BaseViewModel;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyCourseViewModel extends BaseViewModel {

    /* renamed from: a */
    public final CourseRepository f14285a;

    /* renamed from: b */
    public final DataStore f14286b;

    /* renamed from: c */
    public final MutableLiveData f14287c;

    /* renamed from: d */
    public final InterfaceC9266c f14288d;

    /* renamed from: e */
    public final InterfaceC9266c f14289e;

    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseViewModel$1", m17801f = "MyCourseViewModel.kt", m17802l = {36, 35}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.viewmodels.MyCourseViewModel$1 */
    public static final class C81491 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f14298a;

        /* renamed from: b */
        public Object f14299b;

        /* renamed from: c */
        public int f14300c;

        public C81491(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseViewModel.this.new C81491(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81491) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CourseRepository courseRepositoryM12225b;
            MutableLiveData mutableLiveData;
            String id;
            MutableLiveData mutableLiveData2;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f14300c;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                MutableLiveData mutableLiveDataM12224a = MyCourseViewModel.this.m12224a();
                courseRepositoryM12225b = MyCourseViewModel.this.m12225b();
                InterfaceC9266c data = MyCourseViewModel.this.m12228e().getData();
                this.f14298a = mutableLiveDataM12224a;
                this.f14299b = courseRepositoryM12225b;
                this.f14300c = 1;
                Object objM17036z = AbstractC9268e.m17036z(data, this);
                if (objM17036z != objM17291f) {
                    mutableLiveData = mutableLiveDataM12224a;
                    obj = objM17036z;
                }
                return objM17291f;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData2 = (MutableLiveData) this.f14298a;
                AbstractC9079b.m15926b(obj);
                mutableLiveData2.postValue(obj);
                return C8736p.f16368a;
            }
            courseRepositoryM12225b = (CourseRepository) this.f14299b;
            mutableLiveData = (MutableLiveData) this.f14298a;
            AbstractC9079b.m15926b(obj);
            UserBean userBean = (UserBean) obj;
            if (userBean == null || (id = userBean.getId()) == null) {
                id = "";
            }
            this.f14298a = mutableLiveData;
            this.f14299b = null;
            this.f14300c = 2;
            obj = courseRepositoryM12225b.m10344p(id, this);
            if (obj != objM17291f) {
                mutableLiveData2 = mutableLiveData;
                mutableLiveData2.postValue(obj);
                return C8736p.f16368a;
            }
            return objM17291f;
        }
    }

    public MyCourseViewModel(CourseRepository repository, DataStore userDataStore) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f14285a = repository;
        this.f14286b = userDataStore;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f14287c = mutableLiveData;
        BaseViewModel.launch$default(this, null, null, new C81491(null), 3, null);
        this.f14288d = CachedPagingDataKt.cachedIn(AbstractC9268e.m17009U(FlowLiveDataConversions.asFlow(mutableLiveData), new MyCourseViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this));
        this.f14289e = CachedPagingDataKt.cachedIn(AbstractC9268e.m17009U(FlowLiveDataConversions.asFlow(mutableLiveData), new MyCourseViewModel$special$$inlined$flatMapLatest$2(null, this)), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: a */
    public final MutableLiveData m12224a() {
        return this.f14287c;
    }

    /* renamed from: b */
    public final CourseRepository m12225b() {
        return this.f14285a;
    }

    /* renamed from: c */
    public final InterfaceC9266c m12226c() {
        return this.f14288d;
    }

    /* renamed from: d */
    public final InterfaceC9266c m12227d() {
        return this.f14289e;
    }

    /* renamed from: e */
    public final DataStore m12228e() {
        return this.f14286b;
    }

    /* renamed from: f */
    public final void m12229f() {
        MutableLiveData mutableLiveData = this.f14287c;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    /* renamed from: g */
    public final Object m12230g(MyCourseEntity myCourseEntity, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new MyCourseViewModel$teachCourse$2(this, myCourseEntity, null), interfaceC9324c);
    }
}
