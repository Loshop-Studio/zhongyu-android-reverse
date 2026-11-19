package android.view;

import android.view.ComponentActivity;

/* renamed from: androidx.activity.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0085e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f143a;

    /* renamed from: b */
    public final /* synthetic */ Object f144b;

    public /* synthetic */ RunnableC0085e(Object obj, int i) {
        this.f143a = i;
        this.f144b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f143a) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl.execute$lambda$0((ComponentActivity.ReportFullyDrawnExecutorImpl) this.f144b);
                break;
            case 1:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.f144b);
                break;
        }
    }
}
