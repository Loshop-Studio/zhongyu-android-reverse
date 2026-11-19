package p070b.p074b.p075a.p076a.p096r;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: b.b.a.a.r.o */
/* loaded from: classes.dex */
public class C0660o extends ImageButton {

    /* renamed from: b */
    public int f3955b;

    /* renamed from: b */
    public final void m2270b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f3955b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3955b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f3955b = i;
    }
}
