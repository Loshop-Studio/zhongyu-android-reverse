package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2909c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1359a;

    /* renamed from: b */
    public final /* synthetic */ Context f1360b;

    public /* synthetic */ RunnableC2909c(Context context, int i) {
        this.f1359a = i;
        this.f1360b = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        switch (this.f1359a) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f1360b);
                break;
            default:
                ProfileInstaller.writeProfile(this.f1360b);
                break;
        }
    }
}
