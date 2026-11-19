package android.view;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0087g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f149a;

    /* renamed from: b */
    public final /* synthetic */ ComponentActivity f150b;

    public /* synthetic */ RunnableC0087g(ComponentActivity componentActivity, int i) {
        this.f149a = i;
        this.f150b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f149a) {
            case 0:
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(this.f150b);
                break;
            default:
                this.f150b.invalidateMenu();
                break;
        }
    }
}
