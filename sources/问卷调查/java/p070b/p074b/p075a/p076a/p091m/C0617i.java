package p070b.p074b.p075a.p076a.p091m;

import android.view.View;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.p044a0.C0245b;

/* renamed from: b.b.a.a.m.i */
/* loaded from: classes.dex */
public class C0617i extends C0243a {

    /* renamed from: d */
    public final /* synthetic */ C0615g f3760d;

    public C0617i(C0615g c0615g) {
        this.f3760d = c0615g;
    }

    @Override // p000a.p031h.p043j.C0243a
    /* renamed from: d */
    public void mo810d(View view, C0245b c0245b) {
        C0615g c0615g;
        int i;
        this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
        if (this.f3760d.f3748f0.getVisibility() == 0) {
            c0615g = this.f3760d;
            i = C1088R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            c0615g = this.f3760d;
            i = C1088R.string.mtrl_picker_toggle_to_day_selection;
        }
        c0245b.m826k(c0615g.m1132C(i));
    }
}
