package com.zykj.lib.login.p062ui.teacher;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.lib.login.bean.LoginInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TeacherLoginViewModel extends BaseViewModel {

    /* renamed from: a */
    public final InterfaceC9643a f9983a;

    /* renamed from: b */
    public final DataStore f9984b;

    /* renamed from: c */
    public final DataStore f9985c;

    /* renamed from: d */
    public final MutableLiveData f9986d;

    /* renamed from: e */
    public final MutableLiveData f9987e;

    /* renamed from: f */
    public final MutableLiveData f9988f;

    /* renamed from: g */
    public final MutableLiveData f9989g;

    /* renamed from: h */
    public final InterfaceC9270g f9990h;

    /* renamed from: i */
    public final InterfaceC9275l f9991i;

    /* renamed from: j */
    public final InterfaceC9270g f9992j;

    /* renamed from: k */
    public final InterfaceC9275l f9993k;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$1", m17801f = "TeacherLoginViewModel.kt", m17802l = {49, 52}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$1 */
    public static final class C73401 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9994a;

        public C73401(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return TeacherLoginViewModel.this.new C73401(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73401) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (r5 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.f9994a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r5)
                goto L58
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9079b.m15926b(r5)
                goto L34
            L1e:
                kotlin.AbstractC9079b.m15926b(r5)
                com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r5 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.this
                androidx.datastore.core.DataStore r5 = r5.m9322g()
                l8.c r5 = r5.getData()
                r4.f9994a = r3
                java.lang.Object r5 = p169l8.AbstractC9268e.m17036z(r5, r4)
                if (r5 != r0) goto L34
                goto L57
            L34:
                com.zykj.lib.login.proto.ServerBean r5 = (com.zykj.lib.login.proto.ServerBean) r5
                if (r5 == 0) goto L45
                com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r1 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.this
                androidx.lifecycle.MutableLiveData r1 = r1.m9321f()
                java.lang.String r5 = r5.getSchoolCode()
                r1.postValue(r5)
            L45:
                com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r5 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.this
                androidx.datastore.core.DataStore r5 = r5.m9323h()
                l8.c r5 = r5.getData()
                r4.f9994a = r2
                java.lang.Object r5 = p169l8.AbstractC9268e.m17036z(r5, r4)
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                com.zykj.lib.login.proto.UserBean r5 = (com.zykj.lib.login.proto.UserBean) r5
                if (r5 == 0) goto L69
                com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r0 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.this
                androidx.lifecycle.MutableLiveData r0 = r0.m9324i()
                java.lang.String r5 = r5.getUserName()
                r0.postValue(r5)
            L69:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.C73401.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/TeacherLoginViewModel$1.smali:120
        }
    }

    public TeacherLoginViewModel(InterfaceC9643a accountRepository, DataStore serverDataStore, DataStore userDataStore) {
        AbstractC9133u.m16133g(accountRepository, "accountRepository");
        AbstractC9133u.m16133g(serverDataStore, "serverDataStore");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f9983a = accountRepository;
        this.f9984b = serverDataStore;
        this.f9985c = userDataStore;
        this.f9986d = new MutableLiveData("");
        this.f9987e = new MutableLiveData("");
        this.f9988f = new MutableLiveData("");
        this.f9989g = new MutableLiveData(Boolean.FALSE);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f9990h = interfaceC9270gM17044b;
        this.f9991i = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        InterfaceC9270g interfaceC9270gM17044b2 = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f9992j = interfaceC9270gM17044b2;
        this.f9993k = AbstractC9268e.m17011a(interfaceC9270gM17044b2);
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C73401(null), 3, null);
    }

    /* renamed from: c */
    public final InterfaceC9643a m9318c() {
        return this.f9983a;
    }

    /* renamed from: d */
    public final InterfaceC9275l m9319d() {
        return this.f9993k;
    }

    /* renamed from: e */
    public final MutableLiveData m9320e() {
        return this.f9988f;
    }

    /* renamed from: f */
    public final MutableLiveData m9321f() {
        return this.f9986d;
    }

    /* renamed from: g */
    public final DataStore m9322g() {
        return this.f9984b;
    }

    /* renamed from: h */
    public final DataStore m9323h() {
        return this.f9985c;
    }

    /* renamed from: i */
    public final MutableLiveData m9324i() {
        return this.f9987e;
    }

    /* renamed from: j */
    public final void m9325j(LoginInfo loginInfo) {
        AbstractC9133u.m16133g(loginInfo, "loginInfo");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new TeacherLoginViewModel$handleLoginInfo$1(loginInfo, this, null), 3, null);
    }

    /* renamed from: k */
    public final MutableLiveData m9326k() {
        return this.f9989g;
    }

    /* renamed from: l */
    public final InterfaceC9275l m9327l() {
        return this.f9991i;
    }

    /* renamed from: m */
    public final void m9328m() {
        launchData(getToastLiveData(), isDialogVisible(), new TeacherLoginViewModel$login$1(this, null));
    }
}
