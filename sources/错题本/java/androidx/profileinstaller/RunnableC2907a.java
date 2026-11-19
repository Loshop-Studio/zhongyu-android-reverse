package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2907a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1353a;

    /* renamed from: b */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f1354b;

    /* renamed from: c */
    public final /* synthetic */ int f1355c;

    /* renamed from: d */
    public final /* synthetic */ Object f1356d;

    public /* synthetic */ RunnableC2907a(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i8) {
        this.f1353a = i8;
        this.f1354b = diagnosticsCallback;
        this.f1355c = i;
        this.f1356d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1353a) {
            case 0:
                this.f1354b.onResultReceived(this.f1355c, this.f1356d);
                break;
            default:
                this.f1354b.onDiagnosticReceived(this.f1355c, this.f1356d);
                break;
        }
    }
}
