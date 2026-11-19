package com.zykj.study.dialog;

import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.ota.R$string;
import java.io.File;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.dialog.UpdateChoiceDialogMain$startDownload$1$1$1$1", m17801f = "UpdateChoiceDialogMain.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UpdateChoiceDialogMain$startDownload$1$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11233a;

    /* renamed from: b */
    public final /* synthetic */ String f11234b;

    /* renamed from: c */
    public final /* synthetic */ UpdateChoiceDialogMain f11235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateChoiceDialogMain$startDownload$1$1$1$1(String str, UpdateChoiceDialogMain updateChoiceDialogMain, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11234b = str;
        this.f11235c = updateChoiceDialogMain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new UpdateChoiceDialogMain$startDownload$1$1$1$1(this.f11234b, this.f11235c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((UpdateChoiceDialogMain$startDownload$1$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f11233a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        XToastUtils.INSTANCE.success(R$string.download_complete);
        if (this.f11234b != null) {
            this.f11235c.m10293n(new File(this.f11234b));
        }
        return C8736p.f16368a;
    }
}
