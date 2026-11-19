package p029c5;

import android.content.Context;
import com.zykj.mistake.R;
import com.zykj.mistake.update.network.UpdateResp;
import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import p007a6.AbstractC0018a;
import p052e5.DialogC5456a;
import p185v7.AbstractC6683l;

/* renamed from: c5.a */
/* loaded from: classes3.dex */
public final class C3226a extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ Context f1790b;

    public C3226a(Context context) {
        this.f1790b = context;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) {
        AbstractC5830k.m5330g(e, "e");
        AbstractC3228c.f1793a = false;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        UpdateResp resp = (UpdateResp) obj;
        AbstractC5830k.m5330g(resp, "resp");
        UpdateResp.UpdateInfo result = resp.getResult();
        if (result != null) {
            if (result.getVersionCode() <= 10205) {
                AbstractC3228c.f1793a = false;
                return;
            }
            int i = R.style.AppTheme_Dialog;
            Context context = this.f1790b;
            DialogC5456a dialogC5456a = new DialogC5456a(context, i);
            dialogC5456a.show();
            File file = new File(context.getExternalCacheDir(), "UpdateDownload");
            if (!file.exists()) {
                file.mkdirs();
            }
            String absolutePath = new File(file, "Mistake.apk").getAbsolutePath();
            String fileUrl = result.getFileUrl();
            AbstractC5830k.m5327d(absolutePath);
            AbstractC6683l.m6368h(fileUrl, absolutePath, new C3227b(dialogC5456a, context));
        }
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
    }
}
