package p000a.p031h.p043j.p044a0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: a.h.j.a0.a */
/* loaded from: classes.dex */
public final class C0244a extends ClickableSpan {

    /* renamed from: b */
    public final int f1559b;

    /* renamed from: c */
    public final C0245b f1560c;

    /* renamed from: d */
    public final int f1561d;

    public C0244a(int i, C0245b c0245b, int i2) {
        this.f1559b = i;
        this.f1560c = c0245b;
        this.f1561d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1559b);
        C0245b c0245b = this.f1560c;
        c0245b.f1563a.performAction(this.f1561d, bundle);
    }
}
