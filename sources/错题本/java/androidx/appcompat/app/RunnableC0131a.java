package androidx.appcompat.app;

import android.content.Context;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0131a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f178a;

    /* renamed from: b */
    public final /* synthetic */ Context f179b;

    public /* synthetic */ RunnableC0131a(Context context, int i) {
        this.f178a = i;
        this.f179b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f178a) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.f179b);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.f179b);
                break;
        }
    }
}
