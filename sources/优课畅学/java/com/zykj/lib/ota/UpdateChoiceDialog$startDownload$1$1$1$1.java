package com.zykj.lib.ota;

import com.zykj.base.utils.XToastUtils;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.ota.UpdateChoiceDialog$startDownload$1$1$1$1", m17801f = "UpdateChoiceDialog.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class UpdateChoiceDialog$startDownload$1$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f10215a;

    /* renamed from: b */
    public final /* synthetic */ String f10216b;

    /* renamed from: c */
    public final /* synthetic */ UpdateChoiceDialog f10217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateChoiceDialog$startDownload$1$1$1$1(String str, UpdateChoiceDialog updateChoiceDialog, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10216b = str;
        this.f10217c = updateChoiceDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new UpdateChoiceDialog$startDownload$1$1$1$1(this.f10216b, this.f10217c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((UpdateChoiceDialog$startDownload$1$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f10215a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        XToastUtils.INSTANCE.success(R$string.download_complete);
        if (this.f10216b != null) {
            this.f10217c.m9448n(new File(this.f10216b));
        }
        return C8736p.f16368a;
    }
}
