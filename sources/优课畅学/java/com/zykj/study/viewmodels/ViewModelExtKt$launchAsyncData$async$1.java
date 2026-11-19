package com.zykj.study.viewmodels;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$async$1", m17801f = "ViewModelExt.kt", m17802l = {41}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ViewModelExtKt$launchAsyncData$async$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14513a;

    /* renamed from: b */
    public /* synthetic */ Object f14514b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10574p f14515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$launchAsyncData$async$1(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14515c = interfaceC10574p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ViewModelExtKt$launchAsyncData$async$1 viewModelExtKt$launchAsyncData$async$1 = new ViewModelExtKt$launchAsyncData$async$1(this.f14515c, interfaceC9324c);
        viewModelExtKt$launchAsyncData$async$1.f14514b = obj;
        return viewModelExtKt$launchAsyncData$async$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ViewModelExtKt$launchAsyncData$async$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f14514b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14513a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC10574p interfaceC10574p = this.f14515c;
        this.f14514b = AbstractC9543h.m17814a(interfaceC8822b0);
        this.f14513a = 1;
        Object objInvoke = interfaceC10574p.invoke(interfaceC8822b0, this);
        return objInvoke == objM17291f ? objM17291f : objInvoke;
    }
}
