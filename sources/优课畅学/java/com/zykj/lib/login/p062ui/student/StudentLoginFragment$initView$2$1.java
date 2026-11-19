package com.zykj.lib.login.p062ui.student;

import android.content.Context;
import com.zykj.message.client.MessageClient;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.student.StudentLoginFragment$initView$2$1", m17801f = "StudentLoginFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StudentLoginFragment$initView$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9954a;

    /* renamed from: b */
    public final /* synthetic */ StudentLoginFragment f9955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentLoginFragment$initView$2$1(StudentLoginFragment studentLoginFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9955b = studentLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentLoginFragment$initView$2$1(this.f9955b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentLoginFragment$initView$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9954a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        MessageClient messageClient = MessageClient.f10416a;
        Context contextRequireContext = this.f9955b.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        messageClient.mo9572d(contextRequireContext, false);
        return C8736p.f16368a;
    }
}
