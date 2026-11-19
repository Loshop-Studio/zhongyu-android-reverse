package p070b.p074b.p075a.p076a.p096r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.p044a0.C0245b;

/* renamed from: b.b.a.a.r.a */
/* loaded from: classes.dex */
public class C0646a extends C0243a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f3876d;

    public C0646a(CheckableImageButton checkableImageButton) {
        this.f3876d = checkableImageButton;
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: c */
    public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f3876d.isChecked());
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: d */
    public void mo810d(View view, C0245b c0245b) {
        this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
        c0245b.f1563a.setCheckable(this.f3876d.f4958e);
        c0245b.f1563a.setChecked(this.f3876d.isChecked());
    }
}
