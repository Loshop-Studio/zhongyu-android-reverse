package p000a.p063q;

import android.view.View;
import android.view.WindowId;

/* renamed from: a.q.b0 */
/* loaded from: classes.dex */
public class C0410b0 implements InterfaceC0412c0 {

    /* renamed from: a */
    public final WindowId f2395a;

    public C0410b0(View view) {
        this.f2395a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0410b0) && ((C0410b0) obj).f2395a.equals(this.f2395a);
    }

    public int hashCode() {
        return this.f2395a.hashCode();
    }
}
