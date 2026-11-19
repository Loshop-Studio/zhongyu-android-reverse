package androidx.core.widget;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2542a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1070a;

    /* renamed from: b */
    public final /* synthetic */ ContentLoadingProgressBar f1071b;

    public /* synthetic */ RunnableC2542a(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f1070a = i;
        this.f1071b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1070a) {
            case 0:
                this.f1071b.lambda$new$0();
                break;
            case 1:
                this.f1071b.lambda$new$1();
                break;
            case 2:
                this.f1071b.showOnUiThread();
                break;
            default:
                this.f1071b.hideOnUiThread();
                break;
        }
    }
}
