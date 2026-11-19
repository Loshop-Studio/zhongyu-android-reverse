package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.a0 */
/* loaded from: classes.dex */
class C0715a0 implements InterfaceC0717b0 {

    /* renamed from: a */
    private final ViewGroupOverlay f4391a;

    C0715a0(ViewGroup viewGroup) {
        this.f4391a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC0723e0
    public void add(Drawable drawable) {
        this.f4391a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC0723e0
    public void remove(Drawable drawable) {
        this.f4391a.remove(drawable);
    }

    @Override // androidx.transition.InterfaceC0717b0
    public void add(View view) {
        this.f4391a.add(view);
    }

    @Override // androidx.transition.InterfaceC0717b0
    public void remove(View view) {
        this.f4391a.remove(view);
    }
}
