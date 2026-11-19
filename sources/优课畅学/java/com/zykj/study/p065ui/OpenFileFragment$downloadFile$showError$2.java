package com.zykj.study.p065ui;

import android.content.DialogInterface;
import androidx.work.WorkInfo;
import com.zykj.base.utils.XToastUtils;
import com.zykj.download.OssUtils;
import com.zykj.lib.error.code.ErrorCodeHandler;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.OpenFileFragment$downloadFile$showError$2", m17801f = "OpenFileFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class OpenFileFragment$downloadFile$showError$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11697a;

    /* renamed from: b */
    public final /* synthetic */ WorkInfo f11698b;

    /* renamed from: c */
    public final /* synthetic */ DialogInterface f11699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFileFragment$downloadFile$showError$2(WorkInfo workInfo, DialogInterface dialogInterface, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11698b = workInfo;
        this.f11699c = dialogInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new OpenFileFragment$downloadFile$showError$2(this.f11698b, this.f11699c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((OpenFileFragment$downloadFile$showError$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11697a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        Integer messageResId = ErrorCodeHandler.INSTANCE.getErrorCode(this.f11698b.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessageResId();
        if (messageResId != null) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
        }
        this.f11699c.dismiss();
        return C8736p.f16368a;
    }
}
