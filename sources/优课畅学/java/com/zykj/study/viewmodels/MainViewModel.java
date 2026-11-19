package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.http.bean.HeaderBean;
import com.zykj.lib.login.proto.ServerBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MainViewModel extends BaseViewModel {

    /* renamed from: a */
    public InterfaceC9271h f14195a;

    /* renamed from: b */
    public final DataStore f14196b;

    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MainViewModel$1", m17801f = "MainViewModel.kt", m17802l = {32}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.viewmodels.MainViewModel$1 */
    public static final class C81481 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14197a;

        @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MainViewModel$1$1", m17801f = "MainViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.viewmodels.MainViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14199a;

            /* renamed from: b */
            public /* synthetic */ Object f14200b;

            /* renamed from: c */
            public final /* synthetic */ MainViewModel f14201c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainViewModel mainViewModel, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14201c = mainViewModel;
            }

            @Override // p300x7.InterfaceC10574p
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(serverBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14201c, interfaceC9324c);
                anonymousClass1.f14200b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object value;
                ServerBean serverBean = (ServerBean) this.f14200b;
                AbstractC9434a.m17291f();
                if (this.f14199a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                InterfaceC9271h interfaceC9271h = this.f14201c.f14195a;
                do {
                    value = interfaceC9271h.getValue();
                } while (!interfaceC9271h.mo16686e(value, HeaderBean.copy$default((HeaderBean) value, null, null, serverBean.getServerUrl(), serverBean.getAccessToken(), serverBean.getRefreshToken(), 3, null)));
                return C8736p.f16368a;
            }
        }

        public C81481(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MainViewModel.this.new C81481(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81481) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f14197a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c data = MainViewModel.this.f14196b.getData();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainViewModel.this, null);
                this.f14197a = 1;
                if (AbstractC9268e.m17019i(data, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public MainViewModel(InterfaceC9271h headerBeanFlow, DataStore serverDataStore) {
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        AbstractC9133u.m16133g(serverDataStore, "serverDataStore");
        this.f14195a = headerBeanFlow;
        this.f14196b = serverDataStore;
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C81481(null), 3, null);
    }

    /* renamed from: c */
    public final void m12182c() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$initServer$1(this, null), 3, null);
    }
}
