package p016c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C1048a extends ClickableSpan {

    /* renamed from: a */
    private final int f6183a;

    /* renamed from: b */
    private final C1050c f6184b;

    /* renamed from: c */
    private final int f6185c;

    public C1048a(int i4, C1050c c1050c, int i5) {
        this.f6183a = i4;
        this.f6184b = c1050c;
        this.f6185c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6183a);
        this.f6184b.m4867R(this.f6185c, bundle);
    }
}
