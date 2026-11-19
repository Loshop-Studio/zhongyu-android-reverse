package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* renamed from: androidx.core.view.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2527k implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f1062a;

    /* renamed from: b */
    public final /* synthetic */ ViewConfiguration f1063b;

    public /* synthetic */ C2527k(ViewConfiguration viewConfiguration, int i) {
        this.f1062a = i;
        this.f1063b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        int scaledMaximumFlingVelocity;
        switch (this.f1062a) {
            case 0:
                scaledMaximumFlingVelocity = this.f1063b.getScaledMaximumFlingVelocity();
                break;
            default:
                scaledMaximumFlingVelocity = this.f1063b.getScaledMinimumFlingVelocity();
                break;
        }
        return Integer.valueOf(scaledMaximumFlingVelocity);
    }
}
