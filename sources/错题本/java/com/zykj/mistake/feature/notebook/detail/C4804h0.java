package com.zykj.mistake.feature.notebook.detail;

import android.content.Intent;
import android.net.Uri;
import android.os.Messenger;
import com.blankj.utilcode.util.AbstractC3382c;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.service.UploadIntentService;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p191w4.InterfaceC6718c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.h0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4804h0 implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f7009a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6718c f7010b;

    /* renamed from: c */
    public final /* synthetic */ MainActivity f7011c;

    /* renamed from: d */
    public final /* synthetic */ Messenger f7012d;

    public /* synthetic */ C4804h0(InterfaceC6718c interfaceC6718c, MainActivity mainActivity, Messenger messenger, int i) {
        this.f7009a = i;
        this.f7010b = interfaceC6718c;
        this.f7011c = mainActivity;
        this.f7012d = messenger;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f7009a) {
            case 0:
                if (uri != null) {
                    ((MainActivity) this.f7010b).m3909d(false);
                    String absolutePath = AbstractC3382c.m2317r(uri).getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
                    MainActivity mainActivity = this.f7011c;
                    Intent intent = new Intent(mainActivity, (Class<?>) UploadIntentService.class);
                    intent.putExtra("UPLOAD_TYPE", 1);
                    intent.putExtra("UPLOAD_PATH", absolutePath);
                    intent.putExtra("UPLOAD_MESSENGER", this.f7012d);
                    mainActivity.startService(intent);
                }
                break;
            default:
                if (uri != null) {
                    ((MainActivity) this.f7010b).m3909d(false);
                    String absolutePath2 = AbstractC3382c.m2317r(uri).getAbsolutePath();
                    AbstractC5830k.m5329f(absolutePath2, "getAbsolutePath(...)");
                    MainActivity mainActivity2 = this.f7011c;
                    Intent intent2 = new Intent(mainActivity2, (Class<?>) UploadIntentService.class);
                    intent2.putExtra("UPLOAD_TYPE", 1);
                    intent2.putExtra("UPLOAD_PATH", absolutePath2);
                    intent2.putExtra("UPLOAD_MESSENGER", this.f7012d);
                    mainActivity2.startService(intent2);
                }
                break;
        }
        return C5443s.f8405a;
    }
}
