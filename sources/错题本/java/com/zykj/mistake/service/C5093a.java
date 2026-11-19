package com.zykj.mistake.service;

import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import androidx.compose.runtime.ComposerKt;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.ThrowableHandler$ResponeThrowable;
import kotlin.jvm.internal.AbstractC5830k;
import p007a6.AbstractC0018a;
import p073h4.AbstractC5625a;

/* renamed from: com.zykj.mistake.service.a */
/* loaded from: classes3.dex */
public final class C5093a extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ UploadFolderIntentService f7996b;

    /* renamed from: c */
    public final /* synthetic */ Messenger f7997c;

    /* renamed from: d */
    public final /* synthetic */ String f7998d;

    public C5093a(UploadFolderIntentService uploadFolderIntentService, Messenger messenger, String str) {
        this.f7996b = uploadFolderIntentService;
        this.f7997c = messenger;
        this.f7998d = str;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
        Bundle bundle = new Bundle();
        bundle.putString("UPLOAD_SUCCESS_URL", this.f7998d);
        UploadFolderIntentService.m4439b(103, bundle, this.f7997c);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) {
        AbstractC5830k.m5330g(e, "e");
        ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowableM4951k = AbstractC5625a.m4951k(e);
        Log.e(this.f7996b.f7994a, "throwable.message--->" + throwableHandler$ResponeThrowableM4951k.getMessage());
        UploadFolderIntentService.m4439b(ComposerKt.compositionLocalMapKey, null, this.f7997c);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        ApiResp resp = (ApiResp) obj;
        AbstractC5830k.m5330g(resp, "resp");
        boolean success = resp.getSuccess();
        UploadFolderIntentService uploadFolderIntentService = this.f7996b;
        if (success) {
            Log.e(uploadFolderIntentService.f7994a, "resp ---> success");
            return;
        }
        Log.e(uploadFolderIntentService.f7994a, "resp.errorMessage--->" + resp.getErrorMessage());
    }
}
