package com.zykj.lib.login.p062ui.teacher.sms;

import java.util.Iterator;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p077d8.AbstractC8323h;
import p077d8.C8319d;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$sendSms$1$1$1", m17801f = "SendSmsViewModel.kt", m17802l = {63}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SendSmsViewModel$sendSms$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f10137a;

    /* renamed from: b */
    public Object f10138b;

    /* renamed from: c */
    public Object f10139c;

    /* renamed from: d */
    public Object f10140d;

    /* renamed from: e */
    public int f10141e;

    /* renamed from: f */
    public int f10142f;

    /* renamed from: g */
    public int f10143g;

    /* renamed from: h */
    public int f10144h;

    /* renamed from: i */
    public final /* synthetic */ SendSmsViewModel f10145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSmsViewModel$sendSms$1$1$1(SendSmsViewModel sendSmsViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10145i = sendSmsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SendSmsViewModel$sendSms$1$1$1(this.f10145i, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SendSmsViewModel$sendSms$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        Iterable iterable;
        SendSmsViewModel sendSmsViewModel;
        int i10;
        Object objM17291f = AbstractC9434a.m17291f();
        int i11 = this.f10144h;
        if (i11 == 0) {
            AbstractC9079b.m15926b(obj);
            C8319d c8319dM13522q = AbstractC8323h.m13522q(60, 1);
            SendSmsViewModel sendSmsViewModel2 = this.f10145i;
            it = c8319dM13522q.iterator();
            iterable = c8319dM13522q;
            sendSmsViewModel = sendSmsViewModel2;
            i10 = 0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f10141e;
            it = (Iterator) this.f10139c;
            sendSmsViewModel = (SendSmsViewModel) this.f10138b;
            iterable = (Iterable) this.f10137a;
            AbstractC9079b.m15926b(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            int iIntValue = ((Number) next).intValue();
            sendSmsViewModel.m9402b().postValue(AbstractC9536a.m17798c(iIntValue));
            this.f10137a = AbstractC9543h.m17814a(iterable);
            this.f10138b = sendSmsViewModel;
            this.f10139c = it;
            this.f10140d = AbstractC9543h.m17814a(next);
            this.f10141e = i10;
            this.f10142f = iIntValue;
            this.f10143g = 0;
            this.f10144h = 1;
            if (DelayKt.m16227b(1000L, this) == objM17291f) {
                return objM17291f;
            }
        }
        this.f10145i.m9408h().postValue(AbstractC9536a.m17796a(false));
        return C8736p.f16368a;
    }
}
