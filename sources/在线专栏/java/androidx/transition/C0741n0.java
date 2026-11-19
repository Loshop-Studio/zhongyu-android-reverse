package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.n0 */
/* loaded from: classes.dex */
class C0741n0 implements InterfaceC0743o0 {

    /* renamed from: a */
    private final WindowId f4445a;

    C0741n0(View view) {
        this.f4445a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0741n0) && ((C0741n0) obj).f4445a.equals(this.f4445a);
    }

    public int hashCode() {
        return this.f4445a.hashCode();
    }
}
