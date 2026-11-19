package p070b.p146d.p147a;

import com.zykj.message.UnInstallActivity;

/* renamed from: b.d.a.a */
/* loaded from: classes.dex */
public final class RunnableC0879a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ UnInstallActivity f4684b;

    public RunnableC0879a(UnInstallActivity unInstallActivity) {
        this.f4684b = unInstallActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4684b.isFinishing()) {
            return;
        }
        this.f4684b.finish();
    }
}
