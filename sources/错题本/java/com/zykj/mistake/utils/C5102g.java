package com.zykj.mistake.utils;

import android.content.Intent;
import android.view.result.ActivityResultCaller;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import androidx.camera.core.impl.C0362d;
import com.zykj.message.client.MessageClient;
import kotlin.AbstractC5774b;
import kotlin.Result;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.utils.g */
/* loaded from: classes3.dex */
public final class C5102g {

    /* renamed from: a */
    public final Object f8040a;

    /* renamed from: b */
    public InterfaceC6469a f8041b;

    /* renamed from: c */
    public InterfaceC6471c f8042c;

    /* renamed from: d */
    public final ActivityResultLauncher f8043d;

    public C5102g(ActivityResultCaller activityResultCaller) {
        this.f8040a = activityResultCaller;
        this.f8043d = activityResultCaller.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C0362d(this, 12));
    }

    /* renamed from: a */
    public final void m4465a(InterfaceC6469a interfaceC6469a, InterfaceC6471c interfaceC6471c) {
        Object objM13956constructorimpl;
        this.f8041b = interfaceC6469a;
        this.f8042c = interfaceC6471c;
        try {
            ActivityResultLauncher activityResultLauncher = this.f8043d;
            Intent intent = new Intent();
            intent.setClassName(MessageClient.serverPackageName, "com.zykj.gallery.ui.share.ShareActivity");
            intent.putExtra("KEY_ENABLE_CAMERA", true);
            activityResultLauncher.launch(intent);
            objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
            interfaceC6469a.invoke();
            this.f8041b = null;
            this.f8042c = null;
        }
    }
}
