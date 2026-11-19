package p066h;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import cn.com.techvision.launchercore.internal.LauncherService;
import com.blankj.utilcode.util.AbstractC4656l;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h.b */
/* loaded from: classes3.dex */
public final class C6429b {

    /* renamed from: a */
    public static final C6429b f8106a = new C6429b();

    /* renamed from: a */
    public final void m7036a(Application ctx, InterfaceC6430c listener) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(listener, "listener");
        LauncherService.INSTANCE.m1629b(ctx, listener);
    }

    /* renamed from: b */
    public final boolean m7037b(Context ctx, String filePath) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            StringBuilder sb = new StringBuilder();
            File filesDir = ctx.getFilesDir();
            Intrinsics.checkNotNull(filesDir);
            sb.append(filesDir.getAbsolutePath());
            sb.append("/launcher_core_sdk/temp.apk");
            String string = sb.toString();
            AbstractC4656l.m2234l(string);
            AbstractC4656l.m2224b(filePath, string);
            Uri uriForFile = FileProvider.getUriForFile(ctx, "cn.com.techvision.launcher.core.FileProvider", new File(string));
            ctx.grantUriPermission("cn.com.techvision.launcherplaceholder", uriForFile, 1);
            Objects.toString(uriForFile);
            Intent intent = new Intent();
            intent.setAction("techvision.intent.action.INSTALL");
            intent.setPackage("cn.com.techvision.launcherplaceholder");
            intent.setComponent(new ComponentName("cn.com.techvision.launcherplaceholder", "cn.com.techvision.launcherplaceholder.MainActivity"));
            intent.setFlags(268435457);
            intent.putExtra("filePath", uriForFile.toString());
            intent.putExtra("packageName", ctx.getPackageName());
            ctx.startActivity(intent);
            return true;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }
}
