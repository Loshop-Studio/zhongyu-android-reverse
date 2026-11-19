package p029c5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import androidx.core.content.FileProvider;
import com.zykj.mistake.R;
import com.zykj.mistake.update.view.PercentCircleView;
import com.zykj.sketch.utils.LogUtils;
import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import p052e5.DialogC5456a;
import p073h4.AbstractC5626b;
import p115m4.InterfaceC6106d;

/* renamed from: c5.b */
/* loaded from: classes3.dex */
public final class C3227b implements InterfaceC6106d {

    /* renamed from: a */
    public final /* synthetic */ DialogC5456a f1791a;

    /* renamed from: b */
    public final /* synthetic */ Context f1792b;

    public C3227b(DialogC5456a dialogC5456a, Context context) {
        this.f1791a = dialogC5456a;
        this.f1792b = context;
    }

    @Override // p115m4.InterfaceC6106d
    /* renamed from: c */
    public final void mo2171c(File file) {
        AbstractC5830k.m5330g(file, "file");
        AbstractC3228c.f1793a = false;
        LogUtils.Companion companion = LogUtils.INSTANCE;
        companion.m4520d("UpdateDebug", "文件是否存在: " + file.exists());
        companion.m4520d("UpdateDebug", "APK绝对路径: " + file.getAbsolutePath());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri uriForFile = FileProvider.getUriForFile(AbstractC5626b.f8757a, "com.zykj.mistake.fileProvider", file);
        AbstractC5830k.m5329f(uriForFile, "getUriForFile(...)");
        AbstractC5830k.m5327d(intent.addFlags(1));
        intent.addFlags(268435456);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        this.f1792b.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // p115m4.InterfaceC6106d
    /* renamed from: d */
    public final void mo2172d() {
        AbstractC3228c.f1793a = false;
    }

    @Override // p115m4.InterfaceC6106d
    public final void update(int i) {
        ((PercentCircleView) this.f1791a.findViewById(R.id.pcv_update_process)).setTargetPercent(i / 100);
    }
}
