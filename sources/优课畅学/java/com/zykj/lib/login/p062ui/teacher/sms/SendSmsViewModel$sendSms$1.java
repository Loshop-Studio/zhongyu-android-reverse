package com.zykj.lib.login.p062ui.teacher.sms;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$sendSms$1", m17801f = "SendSmsViewModel.kt", m17802l = {C3721BR.userInfo}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SendSmsViewModel$sendSms$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10134a;

    /* renamed from: b */
    public /* synthetic */ Object f10135b;

    /* renamed from: c */
    public final /* synthetic */ SendSmsViewModel f10136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSmsViewModel$sendSms$1(SendSmsViewModel sendSmsViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10136c = sendSmsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        SendSmsViewModel$sendSms$1 sendSmsViewModel$sendSms$1 = new SendSmsViewModel$sendSms$1(this.f10136c, interfaceC9324c);
        sendSmsViewModel$sendSms$1.f10135b = obj;
        return sendSmsViewModel$sendSms$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SendSmsViewModel$sendSms$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f10135b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f10134a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9643a interfaceC9643aM9406f = this.f10136c.m9406f();
            this.f10135b = interfaceC8822b0;
            this.f10134a = 1;
            obj = interfaceC9643aM9406f.mo10318g(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        SendSmsViewModel sendSmsViewModel = this.f10136c;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            InterfaceC9212n interfaceC9212nM9403c = sendSmsViewModel.m9403c();
            if (interfaceC9212nM9403c != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212nM9403c, null, 1, null);
            }
            sendSmsViewModel.m9410j(AbstractC8839h.m14861d(interfaceC8822b0, null, null, new SendSmsViewModel$sendSms$1$1$1(sendSmsViewModel, null), 3, null));
        }
        sendSmsViewModel.m9408h().postValue(AbstractC9536a.m17796a(zBooleanValue));
        return C8736p.f16368a;
    }
}
