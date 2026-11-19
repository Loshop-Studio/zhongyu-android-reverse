package com.zykj.lib.login.p062ui.teacher.pwd;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePsdViewModel$sendEffect$1", m17801f = "ChangePsdViewModel.kt", m17802l = {134}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChangePsdViewModel$sendEffect$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10021a;

    /* renamed from: b */
    public final /* synthetic */ ChangePsdViewModel f10022b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7355b f10023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePsdViewModel$sendEffect$1(ChangePsdViewModel changePsdViewModel, AbstractC7355b abstractC7355b, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10022b = changePsdViewModel;
        this.f10023c = abstractC7355b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ChangePsdViewModel$sendEffect$1(this.f10022b, this.f10023c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChangePsdViewModel$sendEffect$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f10021a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g interfaceC9270g = this.f10022b.f10016f;
            AbstractC7355b abstractC7355b = this.f10023c;
            this.f10021a = 1;
            if (interfaceC9270g.emit(abstractC7355b, this) == objM17291f) {
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
