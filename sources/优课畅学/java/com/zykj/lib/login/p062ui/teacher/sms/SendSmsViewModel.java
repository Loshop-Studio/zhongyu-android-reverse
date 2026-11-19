package com.zykj.lib.login.p062ui.teacher.sms;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9275l;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SendSmsViewModel extends BaseViewModel {

    /* renamed from: a */
    public final InterfaceC9643a f10124a;

    /* renamed from: b */
    public final MutableLiveData f10125b;

    /* renamed from: c */
    public final MutableLiveData f10126c;

    /* renamed from: d */
    public final MutableLiveData f10127d;

    /* renamed from: e */
    public final MutableLiveData f10128e;

    /* renamed from: f */
    public InterfaceC9212n f10129f;

    /* renamed from: g */
    public final InterfaceC9270g f10130g;

    /* renamed from: h */
    public final InterfaceC9275l f10131h;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$1", m17801f = "SendSmsViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$1 */
    public static final class C73581 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10132a;

        public C73581(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return SendSmsViewModel.this.new C73581(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73581) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f10132a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            String strMo10312a = SendSmsViewModel.this.m9406f().mo10312a();
            SendSmsViewModel sendSmsViewModel = SendSmsViewModel.this;
            if (strMo10312a.length() == 11) {
                AbstractC8661c0.m13952C0(strMo10312a, 3, 7, "****").toString();
                sendSmsViewModel.m9405e().postValue(strMo10312a);
            } else {
                sendSmsViewModel.m9405e().postValue("未知号码");
            }
            return C8736p.f16368a;
        }
    }

    public SendSmsViewModel(InterfaceC9643a repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f10124a = repository;
        this.f10125b = new MutableLiveData("");
        this.f10126c = new MutableLiveData("");
        this.f10127d = new MutableLiveData(Boolean.FALSE);
        this.f10128e = new MutableLiveData(60);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f10130g = interfaceC9270gM17044b;
        this.f10131h = AbstractC9268e.m17011a(interfaceC9270gM17044b);
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new C73581(null), 3, null);
    }

    /* renamed from: b */
    public final MutableLiveData m9402b() {
        return this.f10128e;
    }

    /* renamed from: c */
    public final InterfaceC9212n m9403c() {
        return this.f10129f;
    }

    /* renamed from: d */
    public final InterfaceC9275l m9404d() {
        return this.f10131h;
    }

    /* renamed from: e */
    public final MutableLiveData m9405e() {
        return this.f10125b;
    }

    /* renamed from: f */
    public final InterfaceC9643a m9406f() {
        return this.f10124a;
    }

    /* renamed from: g */
    public final MutableLiveData m9407g() {
        return this.f10126c;
    }

    /* renamed from: h */
    public final MutableLiveData m9408h() {
        return this.f10127d;
    }

    /* renamed from: i */
    public final void m9409i() {
        launchData(getToastLiveData(), isDialogVisible(), new SendSmsViewModel$sendSms$1(this, null));
    }

    /* renamed from: j */
    public final void m9410j(InterfaceC9212n interfaceC9212n) {
        this.f10129f = interfaceC9212n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m9411k() {
        String str = (String) this.f10126c.getValue();
        if (str == null || str.length() == 0) {
            return;
        }
        launchData(getToastLiveData(), isDialogVisible(), new SendSmsViewModel$verifyCode$1(this, str, null));
    }
}
