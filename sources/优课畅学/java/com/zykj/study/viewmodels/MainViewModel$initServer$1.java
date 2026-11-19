package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.lib.login.proto.ServerBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.C8356e;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MainViewModel$initServer$1", m17801f = "MainViewModel.kt", m17802l = {47}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MainViewModel$initServer$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14202a;

    /* renamed from: b */
    public final /* synthetic */ MainViewModel f14203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$initServer$1(MainViewModel mainViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14203b = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MainViewModel$initServer$1(this.f14203b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MainViewModel$initServer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14202a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c data = this.f14203b.f14196b.getData();
            this.f14202a = 1;
            obj = AbstractC9268e.m17036z(data, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ServerBean serverBean = (ServerBean) obj;
        if (serverBean == null) {
            return C8736p.f16368a;
        }
        String schoolCode = serverBean.getSchoolCode();
        String serverUrl = serverBean.getServerUrl();
        C8356e c8356e = C8356e.f15876a;
        AbstractC9133u.m16130d(schoolCode);
        c8356e.m13623e(schoolCode);
        if (AbstractC9133u.m16128b(schoolCode, "dev")) {
            str = "http://ykcx-pad-dev.xxg.zyyx.cc:8010/";
        } else {
            AbstractC9133u.m16130d(serverUrl);
            str = AbstractC8687z.m14105M(serverUrl, "https", false, 2, null) ? "https://ykcx-pad.zyai.cc/" : "http://ykcx-pad.school.zykj.org/";
        }
        c8356e.m13624f(str);
        return C8736p.f16368a;
    }
}
