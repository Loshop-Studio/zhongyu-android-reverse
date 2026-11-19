package com.zykj.lib.ota.viewmodel;

import com.zykj.lib.ota.bean.AppType;
import com.zykj.lib.ota.bean.VersionInfo;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p274v3.AbstractC10241a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.ota.viewmodel.VersionViewModel$getVersionInfo$1", m17801f = "VersionViewModel.kt", m17802l = {36}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class VersionViewModel$getVersionInfo$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10315a;

    /* renamed from: b */
    public final /* synthetic */ VersionViewModel f10316b;

    /* renamed from: c */
    public final /* synthetic */ String f10317c;

    /* renamed from: d */
    public final /* synthetic */ int f10318d;

    /* renamed from: e */
    public final /* synthetic */ AppType f10319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionViewModel$getVersionInfo$1(VersionViewModel versionViewModel, String str, int i10, AppType appType, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10316b = versionViewModel;
        this.f10317c = str;
        this.f10318d = i10;
        this.f10319e = appType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new VersionViewModel$getVersionInfo$1(this.f10316b, this.f10317c, this.f10318d, this.f10319e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((VersionViewModel$getVersionInfo$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f10315a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            AbstractC10241a abstractC10241aM9496h = this.f10316b.m9496h();
            String str = this.f10317c;
            int i11 = this.f10318d;
            AppType appType = this.f10319e;
            this.f10315a = 1;
            obj = abstractC10241aM9496h.mo10323a(str, i11, appType, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f10316b.m9497i().postValue((VersionInfo) obj);
        return C8736p.f16368a;
    }
}
