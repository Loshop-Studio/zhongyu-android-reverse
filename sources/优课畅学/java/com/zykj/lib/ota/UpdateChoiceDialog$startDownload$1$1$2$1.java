package com.zykj.lib.ota;

import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.error.code.ErrorCodeHandler;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.ota.UpdateChoiceDialog$startDownload$1$1$2$1", m17801f = "UpdateChoiceDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class UpdateChoiceDialog$startDownload$1$1$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10218a;

    /* renamed from: b */
    public final /* synthetic */ int f10219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateChoiceDialog$startDownload$1$1$2$1(int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10219b = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new UpdateChoiceDialog$startDownload$1$1$2$1(this.f10219b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((UpdateChoiceDialog$startDownload$1$1$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f10218a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        Integer messageResId = ErrorCodeHandler.INSTANCE.getErrorCode(this.f10219b).getErrorCodeInfo().getMessageResId();
        if (messageResId != null) {
            XToastUtils.INSTANCE.error(messageResId.intValue());
        }
        return C8736p.f16368a;
    }
}
