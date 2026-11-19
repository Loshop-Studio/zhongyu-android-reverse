package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2440d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1003a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f1004b;

    /* renamed from: c */
    public final /* synthetic */ Location f1005c;

    public /* synthetic */ RunnableC2440d(Consumer consumer, Location location, int i) {
        this.f1003a = i;
        this.f1004b = consumer;
        this.f1005c = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1003a) {
            case 0:
                this.f1004b.accept(this.f1005c);
                break;
            default:
                this.f1004b.accept(this.f1005c);
                break;
        }
    }
}
