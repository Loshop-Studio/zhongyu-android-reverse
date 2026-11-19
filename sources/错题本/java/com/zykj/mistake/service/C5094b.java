package com.zykj.mistake.service;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.ComposerKt;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.ThrowableHandler$ResponeThrowable;
import kotlin.jvm.internal.AbstractC5830k;
import p007a6.AbstractC0018a;
import p073h4.AbstractC5625a;

/* renamed from: com.zykj.mistake.service.b */
/* loaded from: classes3.dex */
public final class C5094b extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ UploadIntentService f7999b;

    /* renamed from: c */
    public final /* synthetic */ Messenger f8000c;

    /* renamed from: d */
    public final /* synthetic */ String f8001d;

    /* renamed from: e */
    public final /* synthetic */ String f8002e;

    public C5094b(UploadIntentService uploadIntentService, Messenger messenger, String str, String str2) {
        this.f7999b = uploadIntentService;
        this.f8000c = messenger;
        this.f8001d = str;
        this.f8002e = str2;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("UPLOAD_SUCCESS_URL", this.f8001d);
        int iHashCode = hashCode();
        String name = Thread.currentThread().getName();
        StringBuilder sb = new StringBuilder("start2:");
        sb.append(iHashCode);
        sb.append(" tag--->> ");
        String str = this.f8002e;
        sb.append(str);
        sb.append(", name: ");
        sb.append(name);
        Log.i("uploadImage", sb.toString());
        bundle.putString("UPLOAD_DATA", str);
        UploadIntentService.m4441b(103, bundle, this.f8000c);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) throws RemoteException {
        AbstractC5830k.m5330g(e, "e");
        ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowableM4951k = AbstractC5625a.m4951k(e);
        Log.e(this.f7999b.f7995a, "throwable.message--->" + throwableHandler$ResponeThrowableM4951k.getMessage());
        UploadIntentService.m4441b(ComposerKt.compositionLocalMapKey, null, this.f8000c);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        ApiResp resp = (ApiResp) obj;
        AbstractC5830k.m5330g(resp, "resp");
        boolean success = resp.getSuccess();
        UploadIntentService uploadIntentService = this.f7999b;
        if (success) {
            Log.e(uploadIntentService.f7995a, "resp ---> success");
            return;
        }
        Log.e(uploadIntentService.f7995a, "resp.errorMessage--->" + resp.getErrorMessage());
    }
}
