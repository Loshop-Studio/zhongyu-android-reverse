package com.zykj.lib.login.p062ui.teacher.pwd;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.lib.login.p062ui.teacher.pwd.AbstractC7355b;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p208p3.InterfaceC9643a;
import p219q3.C9794n;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePsdViewModel$performSubmit$1", m17801f = "ChangePsdViewModel.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChangePsdViewModel$performSubmit$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10018a;

    /* renamed from: b */
    public final /* synthetic */ ChangePsdViewModel f10019b;

    /* renamed from: c */
    public final /* synthetic */ C9794n f10020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePsdViewModel$performSubmit$1(ChangePsdViewModel changePsdViewModel, C9794n c9794n, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10019b = changePsdViewModel;
        this.f10020c = c9794n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ChangePsdViewModel$performSubmit$1(this.f10019b, this.f10020c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChangePsdViewModel$performSubmit$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f10018a;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9271h interfaceC9271h = this.f10019b.f10014d;
                do {
                    value2 = interfaceC9271h.getValue();
                } while (!interfaceC9271h.mo16686e(value2, C9794n.m18342b((C9794n) value2, null, null, true, false, null, false, null, false, null, 507, null)));
                InterfaceC9643a interfaceC9643a = this.f10019b.f10011a;
                String strM18347f = this.f10020c.m18347f();
                this.f10018a = 1;
                if (interfaceC9643a.mo10316e(strM18347f, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            InterfaceC9271h interfaceC9271h2 = this.f10019b.f10014d;
            do {
                value3 = interfaceC9271h2.getValue();
            } while (!interfaceC9271h2.mo16686e(value3, C9794n.m18342b((C9794n) value3, null, null, false, false, null, false, null, false, null, 507, null)));
            this.f10019b.m9340i(AbstractC7355b.b.f10095a);
        } catch (Exception e10) {
            InterfaceC9271h interfaceC9271h3 = this.f10019b.f10014d;
            do {
                value = interfaceC9271h3.getValue();
            } while (!interfaceC9271h3.mo16686e(value, C9794n.m18342b((C9794n) value, null, null, false, false, null, false, null, false, null, 507, null)));
            ChangePsdViewModel changePsdViewModel = this.f10019b;
            String message = e10.getMessage();
            if (message == null) {
                message = "未知错误";
            }
            changePsdViewModel.m9340i(new AbstractC7355b.a(message));
        }
        return C8736p.f16368a;
    }
}
