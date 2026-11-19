package android.view;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2741a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1114a;

    /* renamed from: b */
    public final /* synthetic */ Object f1115b;

    public /* synthetic */ RunnableC2741a(Object obj, int i) {
        this.f1114a = i;
        this.f1115b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1114a) {
            case 0:
                ComputableLiveData.refreshRunnable$lambda$0((ComputableLiveData) this.f1115b);
                break;
            case 1:
                ComputableLiveData.invalidationRunnable$lambda$1((ComputableLiveData) this.f1115b);
                break;
            default:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.f1115b);
                break;
        }
    }
}
