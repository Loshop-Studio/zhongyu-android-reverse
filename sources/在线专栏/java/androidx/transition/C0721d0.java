package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.d0 */
/* loaded from: classes.dex */
class C0721d0 implements InterfaceC0723e0 {

    /* renamed from: a */
    private final ViewOverlay f4400a;

    C0721d0(View view) {
        this.f4400a = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC0723e0
    public void add(Drawable drawable) {
        this.f4400a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC0723e0
    public void remove(Drawable drawable) {
        this.f4400a.remove(drawable);
    }
}
